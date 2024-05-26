create table Guest_Recipe_main(
m_name varchar2(300)not null,
m_img_url varchar2(300)not null,
m_view number(10)not null,
m_url varchar2(300)not null primary key
);

----------------------------------------
--요리 소개
create table Guest_Recipe_introduce(
i_url  varchar2(300) not null,
i_time varchar2(300)not null,
i_servings varchar2(300)not null,
i_level varchar2(300)not null,
constraint Guest_Recipe_introduce  foreign key(i_url)
   references Guest_Recipe_main(m_url)
   on delete cascade
);
create sequence Diet_Recipe_introduce_seq;
---------------------------------------
--요리 재료
create table Guest_Recipe_ingredient(
i_url1  varchar2(100) not null,
i_ingredient varchar2(1000),
i_ingredient_dose varchar2(100),
constraint Guest_Recipe_ingredient  foreign key(i_url1)
   references Guest_Recipe_main(m_url)
   on delete cascade
);

---------------------------------------
--요리 순서(설명,이미지)
create table Guest_Recipe_seqence(
s_no number(5)not null,
s_url varchar2(300) not null,
s_seq varchar2(1500) not null,
s_img varchar2(300) not null,
constraint Guest_Recipe_seqence foreign key(s_url)
   references Guest_Recipe_main(m_url)
   on delete cascade
);
create sequence Guest_Recipe_seqence_seq;
----------------------------------------










SELECT COUNT(*) FROM Guest_Recipe_main;
SELECT COUNT(*) FROM Guest_Recipe_introduce;
SELECT COUNT(*) FROM Guest_Recipe_ingredient;
SELECT COUNT(*) FROM Guest_Recipe_seqence;
----------------------------------------

select * from (
  select  rownum rm ,m_name,m_img_url,m_view,m_url from
    (select * from Guest_Recipe_main order by m_name asc))
      where rm <=10;

select * from Guest_Recipe_main where m_level like '%초급%';
select * from Guest_Recipe_main where m_url='/recipe/6881099';
select * from Guest_Recipe_main;
      
select * from Guest_Recipe_introduce where i_level='중급';
select * from Guest_Recipe_introduce where i_url='/recipe/1802633';


select * from Guest_Recipe_ingredient where i_url1='/recipe/1802633';
select * from Guest_Recipe_ingredient;


select * from Guest_Recipe_seqence where s_url='/recipe/6872033';
select * from Guest_Recipe_seqence;
----------------------------------------
drop table Guest_Recipe_main cascade constraint purge;
drop table Guest_Recipe_introduce cascade constraint purge;
drop table Guest_Recipe_ingredient cascade constraint purge;
drop table Guest_Recipe_seqence cascade constraint purge;
----------------------------------------
truncate table Guest_Recipe_main;
truncate table Guest_Recipe_introduce;
truncate table Guest_Recipe_ingredient;
truncate table Guest_Recipe_seqence;
----------------------------------------
drop sequence Guest_Recipe_main_seq;
drop sequence Guest_Recipe_introduce_seq;
drop sequence Guest_Recipe_ingredient_seq;
drop sequence Guest_Recipe_seqence_seq;
----------------------------------------


alter table Guest_Recipe_main add(m_level varchar2(30));
select m_name,m_url,m_view,NVL(m_level,'중급')  from Guest_Recipe_main;

