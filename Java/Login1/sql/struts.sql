set names utf8;
set foreign_key_checks=0;
drop database if exists logindb_1;
create database logindb_1;
use logindb_1;

create table user(
id int,
user_name varchar(255),
password varchar(255)
);

insert into user values(1,"test","123");
