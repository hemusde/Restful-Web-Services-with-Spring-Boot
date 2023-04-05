insert into user_details(id, birth_date,name)
values(10001,current_date(),'Ramsay');
insert into user_details(id, birth_date,name)
values(10002,current_date(),'Romeo');
insert into user_details(id, birth_date,name)
values(10003,current_date(),'Sam');

insert into post(id, description, user_id)
values(20001,'I Want to Learn AWS',10001);
insert into post(id, description, user_id)
values(20002,'I Want to Learn Devops',10001);
insert into post(id, description, user_id)
values(20003,'I Want to get AWS certificate',10001);
insert into post(id, description, user_id)
values(20004,'I Want to Learn MUlticloud',10002);