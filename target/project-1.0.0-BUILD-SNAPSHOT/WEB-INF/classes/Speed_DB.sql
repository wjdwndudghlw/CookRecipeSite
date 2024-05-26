create table Speed_Recipe_main(
m_name varchar2(300)not null,
m_img_url varchar2(300)not null,
m_view number(10)not null,
m_url varchar2(300)not null primary key
);

----------------------------------------
--요리 소개
create table Speed_Recipe_introduce(
i_url  varchar2(300) not null,
i_time varchar2(300)not null,
i_servings varchar2(300)not null,
i_level varchar2(300)not null,
constraint Speed_Recipe_introduce  foreign key(i_url)
   references Speed_Recipe_main(m_url)
   on delete cascade
);
create sequence Diet_Recipe_introduce_seq;
---------------------------------------
--요리 재료
create table Speed_Recipe_ingredient(
i_url1  varchar2(100) not null,
i_ingredient varchar2(1000)not null,
i_ingredient_dose varchar2(100),
constraint Speed_Recipe_ingredient  foreign key(i_url1)
   references Speed_Recipe_main(m_url)
   on delete cascade
);

---------------------------------------
--요리 순서(설명,이미지)
create table Speed_Recipe_seqence(
s_no number(5)not null,
s_url varchar2(300) not null,
s_seq varchar2(1500) not null,
s_img varchar2(300) not null,
constraint Speed_Recipe_seqence foreign key(s_url)
   references Speed_Recipe_main(m_url)
   on delete cascade
);
create sequence Speed_Recipe_seqence_seq;
----------------------------------------

 update Speed_Recipe_main set m_view =m_view+ 1 where m_url ='/recipe/6942228';


DELETE FROM Speed_Recipe_main WHERE m_url = '/recipe/2753079';




SELECT COUNT(*) FROM Speed_Recipe_main;
SELECT COUNT(*) FROM Speed_Recipe_introduce;
SELECT COUNT(*) FROM Speed_Recipe_ingredient;
SELECT COUNT(*) FROM Speed_Recipe_seqence;
----------------------------------------



select * from Speed_Recipe_main where m_name like '%고기%';
select * from Speed_Recipe_main;
      
select * from Speed_Recipe_introduce where i_url='/recipe/5002865';
select * from Speed_Recipe_introduce where i_level ='아무나';
select * from Speed_Recipe_introduce where i_level ='초급';
select * from Speed_Recipe_introduce 


select * from Speed_Recipe_ingredient where i_url1='/recipe/5747667';
select * from Speed_Recipe_ingredient;


select * from Speed_Recipe_seqence where s_url='/recipe/2753079';
select * from Speed_Recipe_seqence;
----------------------------------------
drop table Speed_Recipe_main cascade constraint purge;
drop table Speed_Recipe_introduce cascade constraint purge;
drop table Speed_Recipe_ingredient cascade constraint purge;
drop table Speed_Recipe_seqence cascade constraint purge;
----------------------------------------
truncate table Speed_Recipe_main;
truncate table Speed_Recipe_introduce;
truncate table Speed_Recipe_ingredient;
truncate table Speed_Recipe_seqence;
----------------------------------------
drop sequence Speed_Recipe_main;
drop sequence Speed_Recipe_introduce;
drop sequence Speed_Recipe_ingredient;
drop sequence Speed_Recipe_seqence_seq;
----------------------------------------

alter table Speed_Recipe_main add(m_level varchar2(30));
select m_name,m_url,m_view,NVL(m_level,'중급')  from Diet_Recipe_main;



----------------이줄 실행해보면 값이 들어가있는거 확인할수있습니다!
select m_level from Speed_Recipe_main;                                        
----------------이줄 실행하면 아무것도 안뜹니다!
select * from Speed_Recipe_main where m_level like '%중급%';                  

-- 왜인지는 모르겠는데 일단 임시방편으로 %넣어서 하니까 되네요
--근데 원래는 = 했을때 떠야 정상인거죠??
-- 네 떠야하는데 컬럼을 추가해서 그런건지 다른 이유가 있는건지는 잘 모르겠네요
--일단 감사합니다 ! 이거땜에 첨부터 다시 만들어야하나 고민되서 
-- 그리고 앞으로는 일단 팀원분들이랑 같이 고민해보시고 말씀해주세요! 넵 알겠습니다!네에~




