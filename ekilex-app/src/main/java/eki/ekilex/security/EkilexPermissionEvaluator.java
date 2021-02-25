package eki.ekilex.security;

import java.io.Serializable;
import java.security.Principal;
import java.util.List;

import javax.transaction.Transactional;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.PermissionEvaluator;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import eki.common.constant.ActivityEntity;
import eki.common.constant.AuthorityItem;
import eki.common.constant.GlobalConstant;
import eki.common.constant.PermConstant;
import eki.common.constant.ReferenceOwner;
import eki.ekilex.data.DatasetPermission;
import eki.ekilex.data.EkiUser;
import eki.ekilex.data.SourceLink;
import eki.ekilex.data.SourceProperty;
import eki.ekilex.data.api.FreeformOwner;
import eki.ekilex.service.db.PermissionDbService;
import eki.ekilex.service.db.SourceDbService;
import eki.ekilex.service.db.SourceLinkDbService;

@Component("permEval")
public class EkilexPermissionEvaluator implements PermissionEvaluator, PermConstant, GlobalConstant {

	@Autowired
	private PermissionDbService permissionDbService;

	@Autowired
	private SourceDbService sourceDbService;

	@Autowired
	private SourceLinkDbService sourceLinkDbService;

	// page perm

	@Transactional
	public boolean isMutableDataPageAccessPermitted(Authentication authentication) {

		EkiUser user = (EkiUser) authentication.getPrincipal();
		Long userId = user.getId();
		if (!Boolean.TRUE.equals(user.getEnabled())) {
			return false;
		}
		List<DatasetPermission> datasetPermissions = permissionDbService.getDatasetPermissions(userId);
		boolean crudPermExists = datasetPermissions.stream()
				.anyMatch(datasetPermission -> AuthorityItem.DATASET.equals(datasetPermission.getAuthItem())
						&& AUTH_OPS_CRUD.contains(datasetPermission.getAuthOperation().name()));
		return crudPermExists;
	}

	@Transactional
	public boolean isPrivatePageAccessPermitted(Authentication authentication) {

		EkiUser user = (EkiUser) authentication.getPrincipal();
		Long userId = user.getId();
		if (!Boolean.TRUE.equals(user.getEnabled())) {
			return false;
		}
		if (user.isAdmin()) {
			return true;
		}
		if (user.isMaster()) {
			return true;
		}
		List<DatasetPermission> datasetPermissions = permissionDbService.getDatasetPermissions(userId);
		boolean privateAccessPermExists = datasetPermissions.stream()
				.anyMatch(datasetPermission -> AuthorityItem.DATASET.equals(datasetPermission.getAuthItem())
						&& AUTH_OPS_READ.contains(datasetPermission.getAuthOperation().name())
						&& !StringUtils.equals(datasetPermission.getDatasetCode(), DATASET_LIMITED));
		return privateAccessPermExists;
	}

	@Transactional
	public boolean isLimitedPageAccessPermitted(Authentication authentication) {

		EkiUser user = (EkiUser) authentication.getPrincipal();
		Long userId = user.getId();
		if (!Boolean.TRUE.equals(user.getEnabled())) {
			return false;
		}
		if (user.isAdmin()) {
			return true;
		}
		if (user.isMaster()) {
			return true;
		}
		List<DatasetPermission> datasetPermissions = permissionDbService.getDatasetPermissions(userId);
		boolean limitedAccessPermExists = datasetPermissions.stream()
				.anyMatch(datasetPermission -> AuthorityItem.DATASET.equals(datasetPermission.getAuthItem())
						&& AUTH_OPS_READ.contains(datasetPermission.getAuthOperation().name())
						&& StringUtils.equals(datasetPermission.getDatasetCode(), DATASET_LIMITED));
		return limitedAccessPermExists;
	}

	// source crud

	@Transactional
	public boolean isSourceCrudGranted(Authentication authentication, String crudRoleDataset, Long sourceId) {

		EkiUser user = (EkiUser) authentication.getPrincipal();
		Long userId = user.getId();
		DatasetPermission crudRole = getCrudRole(userId, crudRoleDataset);
		if (crudRole == null) {
			return false;
		}
		if (crudRole.isSuperiorPermission()) {
			return true;
		}
		if (crudRole.isSuperiorDataset()) {
			return true;
		}
		boolean isGranted = permissionDbService.isGrantedForSource(userId, crudRole, sourceId, AUTH_ITEM_DATASET, AUTH_OPS_CRUD);
		return isGranted;
	}

	@Transactional
	public boolean isSourcePropertyCrudGranted(Authentication authentication, String crudRoleDataset, Long sourcePropertyId) {

		EkiUser user = (EkiUser) authentication.getPrincipal();
		Long userId = user.getId();
		DatasetPermission crudRole = getCrudRole(userId, crudRoleDataset);
		if (crudRole == null) {
			return false;
		}
		if (crudRole.isSuperiorPermission()) {
			return true;
		}
		if (crudRole.isSuperiorDataset()) {
			return true;
		}
		SourceProperty sourceProperty = sourceDbService.getSourceProperty(sourcePropertyId);
		if (sourceProperty == null) {
			return true;
		}
		Long sourceId = sourceProperty.getSourceId();
		boolean isGranted = permissionDbService.isGrantedForSource(userId, crudRole, sourceId, AUTH_ITEM_DATASET, AUTH_OPS_CRUD);
		return isGranted;
	}

	// source link crud

	@Transactional
	public boolean isSourceLinkCrudGranted(Principal principal, String crudRoleDataset, SourceLink sourceLink) {

		EkiUser user = (EkiUser) principal;
		Long userId = user.getId();
		DatasetPermission crudRole = getCrudRole(userId, crudRoleDataset);
		if (crudRole == null) {
			return false;
		}
		if (crudRole.isSuperiorPermission()) {
			return true;
		}
		ReferenceOwner sourceLinkOwner = sourceLink.getOwner();
		Long ownerId = sourceLink.getOwnerId();
		if (ReferenceOwner.FREEFORM.equals(sourceLinkOwner)) {
			return isFreeformSourceLinkCrudGranted(userId, crudRole, ownerId);
		} else if (ReferenceOwner.DEFINITION.equals(sourceLinkOwner)) {
			return permissionDbService.isGrantedForDefinition(userId, crudRole, ownerId, AUTH_ITEM_DATASET, AUTH_OPS_CRUD);
		} else if (ReferenceOwner.LEXEME.equals(sourceLinkOwner)) {
			return permissionDbService.isGrantedForLexeme(userId, crudRole, ownerId, AUTH_ITEM_DATASET, AUTH_OPS_CRUD);
		}
		return false;
	}

	@Transactional
	public boolean isSourceLinkCrudGranted(
			Principal principal, String crudRoleDataset, ReferenceOwner sourceLinkOwner, Long sourceLinkId) {

		EkiUser user = (EkiUser) principal;
		Long userId = user.getId();
		DatasetPermission crudRole = getCrudRole(userId, crudRoleDataset);
		if (crudRole == null) {
			return false;
		}
		if (crudRole.isSuperiorPermission()) {
			return true;
		}
		if (ReferenceOwner.FREEFORM.equals(sourceLinkOwner)) {
			SourceLink sourceLink = sourceLinkDbService.getFreeformSourceLink(sourceLinkId);
			Long ownerId = sourceLink.getOwnerId();
			return isFreeformSourceLinkCrudGranted(userId, crudRole, ownerId);
		} else if (ReferenceOwner.DEFINITION.equals(sourceLinkOwner)) {
			SourceLink sourceLink = sourceLinkDbService.getDefinitionSourceLink(sourceLinkId);
			Long ownerId = sourceLink.getOwnerId();
			return permissionDbService.isGrantedForDefinition(userId, crudRole, ownerId, AUTH_ITEM_DATASET, AUTH_OPS_CRUD);
		} else if (ReferenceOwner.LEXEME.equals(sourceLinkOwner)) {
			SourceLink sourceLink = sourceLinkDbService.getLexemeSourceLink(sourceLinkId);
			Long ownerId = sourceLink.getOwnerId();
			return permissionDbService.isGrantedForLexeme(userId, crudRole, ownerId, AUTH_ITEM_DATASET, AUTH_OPS_CRUD);
		}
		return false;
	}

	private boolean isFreeformSourceLinkCrudGranted(Long userId, DatasetPermission crudRole, Long ownerId) {
		FreeformOwner freeformOwner = sourceLinkDbService.getFreeformOwner(ownerId);
		ActivityEntity entity = freeformOwner.getEntity();
		Long entityId = freeformOwner.getEntityId();
		if (ActivityEntity.LEXEME.equals(entity)) {
			return permissionDbService.isGrantedForLexeme(userId, crudRole, entityId, AUTH_ITEM_DATASET, AUTH_OPS_CRUD);
		} else if (ActivityEntity.MEANING.equals(entity)) {
			return permissionDbService.isGrantedForMeaning(userId, crudRole, entityId, AUTH_ITEM_DATASET, AUTH_OPS_CRUD);
		} else if (ActivityEntity.DEFINITION.equals(entity)) {
			return permissionDbService.isGrantedForDefinition(userId, crudRole, entityId, AUTH_ITEM_DATASET, AUTH_OPS_CRUD);
		}
		return false;
	}

	private DatasetPermission getCrudRole(Long userId, String crudRoleDataset) {

		List<DatasetPermission> datasetPermissions = permissionDbService.getDatasetPermissions(userId);
		DatasetPermission crudRole = datasetPermissions.stream()
				.filter(datasetPermission -> AuthorityItem.DATASET.equals(datasetPermission.getAuthItem())
						&& AUTH_OPS_CRUD.contains(datasetPermission.getAuthOperation().name())
						&& StringUtils.equals(datasetPermission.getDatasetCode(), crudRoleDataset))
				.findAny()
				.orElse(null);
		return crudRole;
	}

	//not in use currently
	//hasPermission(#foo, 'write')
	@Override
	public boolean hasPermission(Authentication authentication, Object targetDomainObject, Object permission) {

		return false;
	}

	//not in use currently
	//hasPermission(#id, 'USAGE', 'DATASET:CRUD')
	@Transactional
	@Override
	public boolean hasPermission(Authentication authentication, Serializable targetId, String targetType, Object permission) {

		return false;
	}
}
