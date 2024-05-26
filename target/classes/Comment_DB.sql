create table c_comment(
	comment_no number(10) primary key,
	comment_bno number(10) not null,
	comment_writer varchar(20 char) not null,
	comment_content varchar(1000 char) not null,
	comment_wdate varchar(30 char) not null
);

ALTER TABLE c_comment
ADD CONSTRAINT fk_comment_bno
FOREIGN KEY (comment_bno)
REFERENCES notice(notice_no)
on delete cascade;


create sequence c_comment_seq;
drop sequence c_comment_seq;
select * from c_comment;
drop table c_comment cascade constraint purge;
