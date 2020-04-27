-- muudab sellised detailsed ilmikud lihtsaks, millel leidub lihtsaid kasutusnäiteid
update lexeme l
set complexity = 'SIMPLE'
where l.dataset_code = 'sss'
  and l.type = 'PRIMARY'
  and l.complexity like 'DETAIL%'
  and exists(select w.id
             from word w
             where w.id = l.word_id
               and w.lang in ('est', 'rus'))
  and exists(select ff.id
             from freeform ff,
                  lexeme_freeform lff
             where lff.lexeme_id = l.id
               and lff.freeform_id = ff.id
               and ff.type = 'USAGE'
               and ff.complexity in ('SIMPLE', 'SIMPLE1'))