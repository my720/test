set names utf8;
set foreign_key_checks=0;
drop database if exists logindb_2;
create database logindb_2;
use logindb_2;

create table user(
id int,
user_name varchar(255),
password varchar(255)
);

insert into user values
(1,"test","123"),
(2,"mizusawa","123"),
(3,"yuuta","123");