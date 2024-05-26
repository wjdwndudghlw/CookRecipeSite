----------------------------------------
--유저 테이블
create table Login_User(
u_name   varchar2(300) not null primary key,
u_password  varchar2(300) not null ,
u_email  varchar2(300)  not null 
);

----------------------------------------
create table User_Favorite(
u_no number(3) not null,
u_name  varchar2(300) not null,
u_m_name  varchar2(300) not null,
u_m_img_url  varchar2(300) not null,
u_m_view  varchar2(300) not null,
u_m_url  varchar2(300) not null primary key,
constraint User_Favorite  foreign key(u_name)
   references login_User(u_name)
   on delete cascade
);

create sequence User_Favorite_seqence;
----------------------------------------
create table User_search_history(
u_no number(3) not null,
u_name  varchar2(300) not null,
u_m_name  varchar2(300) not null,
u_m_img_url  varchar2(300) not null,
u_m_view  varchar2(300) not null,
u_m_url  varchar2(300) not null primary key,
constraint User_search_history  foreign key(u_name)
   references login_User(u_name)
   on delete cascade
);
create sequence User_search_history_seqence;




 select u_name from Login_User where u_password = 'vte1749100@' and u_email = 'wjdwndudghlw@naver.com'

delete from User_Favorite where u_name ='wjdwn';


SELECT COUNT(*) FROM Night_Recipe_main;

----------------------------------------

select * from (
  select  rownum rm ,m_name,m_img_url,m_view,m_url from
    (select * from Diet_Recipe_main order by m_name asc))
      where rm <=10;

select * from Night_Recipe_main where m_level like '%중급%';


select * from login_User;
select * from User_Favorite;
select * from User_search_history;

select * from User_search_history order by u_no;


---------------------------------------
drop table login_User cascade constraint purge;
drop table User_Favorite cascade constraint purge;
drop table User_search_history cascade constraint purge;
----------------------------------------
truncate table login_User;
----------------------------------------
drop sequence User_Favorite_seqence;
drop sequence User_search_history_seqence;
----------------------------------------

alter table Night_Recipe_main  add(m_level varchar2(30));

