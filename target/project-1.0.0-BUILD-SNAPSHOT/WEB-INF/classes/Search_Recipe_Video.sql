create table Search_Recipe_video(
v_url varchar2(800)primary key,
v_name varchar2(800),
v_img varchar2(800)not null
);

----------------------------------------
--요리 소개
create table Recipe_grade(
g_iframe varchar2(800)not null primary key
);
---------------------------------------
--요리 재료
create table Recipe_time(
t_iframe varchar2(800)not null primary key
);
---------------------------------------






SELECT COUNT(*) FROM Search_Recipe_video;s
SELECT COUNT(*) FROM Recipe_grade;
SELECT COUNT(*) FROM Recipe_time;
----------------------------------------

select * from Search_Recipe_video where m_name like '%고기%';
select * from Search_Recipe_video;
      
select * from Recipe_grade where i_url='/recipe/5002865';
select * from Recipe_grade where i_level ='아무나';
select * from Recipe_grade 


select * from Recipe_time where i_url1='/recipe/5747667';
select * from Recipe_time;


----------------------------------------
drop table Search_Recipe_video cascade constraint purge;
drop table Recipe_grade cascade constraint purge;
drop table Recipe_time cascade constraint purge;
----------------------------------------
truncate table Search_Recipe_video;
truncate table Recipe_grade;
truncate table Recipe_time;

----------------------------------------
drop sequence Search_Recipe_video;
drop sequence Recipe_grade;
drop sequence Recipe_time;
----------------------------------------







