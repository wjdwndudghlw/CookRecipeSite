create table Season_Recipe_main(
m_name varchar2(300)not null,
m_img_url varchar2(300)not null,
m_view number(10)not null,
m_url varchar2(300)not null primary key,
season varchar2(10 char) not null
);

create table Season_Recipe_introduce(
i_url  varchar2(300) not null,
i_time varchar2(300),
i_servings varchar2(300),
i_level varchar2(300),
constraint Season_Recipe_introduce  foreign key(i_url)
   references Season_Recipe_main(m_url)
   on delete cascade
);
create sequence Season_Recipe_introduce_seq;
---------------------------------------
--요리 재료
create table Season_Recipe_ingredient(
i_url varchar2(100) not null,
i_ingredient varchar2(1000),
i_ingredient_dose varchar2(100),
constraint Season_Recipe_ingredient  foreign key(i_url)
   references Season_Recipe_main(m_url)
   on delete cascade
);

---------------------------------------
--요리 순서(설명,이미지)
create table Season_Recipe_seqence(
s_no number(5)not null,
s_url varchar2(300) not null,
s_seq varchar2(1500) not null,
s_img varchar2(300) not null,
constraint Season_Recipe_seqence foreign key(s_url)
   references Season_Recipe_main(m_url)
   on delete cascade
);
create sequence Season_Recipe_seqence_seq;


select * from Season_Recipe_main;
select * from Season_Recipe_introduce;
select * from Season_Recipe_ingredient;
select * from Season_Recipe_seqence;

drop table Season_Recipe_main cascade constraint purge;
drop table Season_Recipe_introduce cascade constraint purge;
drop table Season_Recipe_ingredient cascade constraint purge;
drop table Season_Recipe_seqence cascade constraint purge;

select * from (
SELECT *
FROM Season_Recipe_main
INNER JOIN Season_Recipe_introduce
ON Season_Recipe_main.m_url = Season_Recipe_introduce.i_url
where season = '겨울'
order by DBMS_RANDOM.VALUE)
where rownum < 6;


alter table Season_Recipe_main rename column m_weather TO season;

