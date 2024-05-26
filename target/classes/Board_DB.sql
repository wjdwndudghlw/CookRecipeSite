create table notice(
	notice_no number(10) primary key,
	userName varchar2 (20 char) not null,
	title varchar2(300 char) not null,
	contents varchar2(300 char) not null,
	whenPost varchar2(300 char) not null,
	notice_view number(5)not null,
	constraint notice  foreign key(userName)
   references login_User(u_name)
   on delete cascade
);  




create sequence notice_seq;
drop sequence notice_seq;
select * from NOTICE;
drop table notice cascade constraint purge;
drop sequence Notice_seq;

insert into notice values(Notice_seq.nextval,'wjdwndud','wjdwn','qrw','qweqwe',0);
insert into notice values(Notice_seq.nextval,'wjdwndud','wjdwn','qrw','q2weqwe',0);
insert into notice values(Notice_seq.nextval,'wjdwndud','wjdwn','qrw2','qw1eqwe',0);
insert into notice values(Notice_seq.nextval,'wjdwndud','wjdwn','qrw3','qw4eqwe',0);
insert into notice values(Notice_seq.nextval,'wjdwndud','wjdwn','qrw3','qw4eqwe',0);
insert into notice values(Notice_seq.nextval,'wjdwndud','wjdwn','qrw3','qw4eqwe',0);
insert into notice values(Notice_seq.nextval,'wjdwndud','wjdwn','qrw3','qw4eqwe',0);
insert into notice values(Notice_seq.nextval,'wjdwndud','wjdwn','qrw3','qw4eqwe',0);
insert into notice values(Notice_seq.nextval,'wjdwndud','wjdwn','qrw3','qw4eqwe',0);
insert into notice values(Notice_seq.nextval,'wjdwndud','wjdwn','qrw3','qw4eqwe',0);
insert into notice values(Notice_seq.nextval,'wjdwndud','wjdwn','qrw3','qw4eqwe',0);
insert into notice values(Notice_seq.nextval,'wjdwndud','wjdwn','qrw3','qw4eqwe',0);
insert into notice values(Notice_seq.nextval,'wjdwndud','wjdwn','qrw3','qw4eqwe',0);
insert into notice values(Notice_seq.nextval,'wjdwndud','wjdwn','qrw3','qw4eqwe',0);
insert into notice values(Notice_seq.nextval,'wjdwn','wjdwn','qrw3','qw4eqwe',30);
insert into notice values(Notice_seq.nextval,'wjdwn','wjdwn','qrw3','qw4eqwe',30);
insert into notice values(Notice_seq.nextval,'wjdwn','wjdwn','qrw3','qw4eqwe',30);


select * from notice order by notice_no desc;


select rownum num, x.* from(
select a.* from NOTICE a 
order by notice_no desc) x;





