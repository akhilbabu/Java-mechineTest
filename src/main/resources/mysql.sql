#3
create database javatest;
create table questions(id int,question varchar(500),status varchar(1));
create table answer_options(a_id int, q_id int, ans_option varchar(2));
create table correct_option(c_id int, q_id int, a_id int);
