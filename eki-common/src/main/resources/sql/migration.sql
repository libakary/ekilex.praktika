alter table dataset add column is_visible boolean default true;
update dataset set is_visible = false where code = 'mab';

alter table eki_user add column recovery_key varchar(60);

-- 19.6.19
create table word_relation_param
(
  id bigserial primary key,
  word_relation_id bigint references word_relation(id) on delete cascade not null,
  param_name text not null,
  value_float float,
  value_int int,
  value_boolean boolean
);
alter sequence word_relation_param_id_seq restart with 10000;

create index word_relation_param_word_relation_id_idx on word_relation_param(word_relation_id);

alter table word_relation add relation_status varchar(100);

insert into word_rel_type (code, datasets) values ('raw', '{}');
insert into word_rel_type_label (code, value, lang, type) values ('raw', 'vasted', 'est', 'wordweb');
insert into word_rel_type_label (code, value, lang, type) values ('raw', 'vasted', 'est', 'full');