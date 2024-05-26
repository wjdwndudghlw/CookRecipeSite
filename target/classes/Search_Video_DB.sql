create table Search_Video_main(
m_name varchar2(1000)not null,
m_view number(10)not null,
m_date number(10)not null,
m_url varchar2(800)not null primary key,
m_iframe varchar2(1000)not null ,
m_like  number(7)not null
);
------------------------------------------
create sequence Search_Video_main_seq;


select * from Search_Video_main;

drop table Search_Video_main cascade constraint purge;

select * from Search_Video_main where m_name like '%치킨%' order by m_like desc
