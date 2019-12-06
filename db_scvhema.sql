drop database emp_db;
create database emp_db;
use emp_db;
	
show tables;
select * from edureka_users;
describe assets;

select * from user_role;
select * from user;

insert into user(user_id, active, username, password)
    values (1, 1, "kiran", "$2a$10$ZD78OGqASz7iB39A/IkAxeWRgSmRbn6BZyU7IHUTDyhaRbbOvpmGO");
    
insert into user(user_id, active, username, password)
    values (2, 1, "vinay", "$2a$10$RxyfzbHl5atTh5SdMRU.CebQgPAkVg/j9kvAHDMUK.Ow7MSfMFXU2");    

select * from user;;

insert into role(id, role) values (1, "USER");
insert into role(id, role) values (2, "ADMIN");

insert into user_role(user_id, id) values (1, 1);
insert into user_role(user_id, id) values (2, 2);

