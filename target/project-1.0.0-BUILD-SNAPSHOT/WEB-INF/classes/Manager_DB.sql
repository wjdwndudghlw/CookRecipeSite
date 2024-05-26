----------------------------------------
--관리자 테이블
create table Login_Manager(
m_name   varchar2(30) not null primary key,
m_password  varchar2(30) not null 
);

----------------------------------------
--관리자 작성 테이블
create table Write_Manager(
m_no number(3) primary key,
m_name   varchar2(30) not null,
m_title  varchar2(50) not null ,
m_contents  varchar2(300) not null ,
m_date   varchar2(30) not null ,
m_view number(3) not null ,
constraint Write_Manager  foreign key(m_name)
references Login_Manager(m_name)
on delete cascade
);

create sequence Write_Manager_seq;



insert into Write_Manager values(Write_Manager_seq.nextval,'asdasd','2022년 새해가 밝았습니다','즐거운 계묘년 보내시길 바랍니다',to_char(sysdate,'yyyy.mm.dd hh24:mi'),0)


insert into Login_Manager values('asdasd','123123');

select * from Login_Manager;
select * from Write_Manager;

---------------------------------------
drop table Login_Manager cascade constraint purge;
drop table Write_Manager cascade constraint purge;
----------------------------------------
truncate table Login_Manager;
truncate table Write_Manager;
----------------------------------------
drop sequence Login_Manager;
drop sequence  Write_Manager_seq;
----------------------------------------

