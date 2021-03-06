drop database if exists lucky_draw;
create database lucky_draw character set utf8mb4;

use lucky_draw;

drop table if exists user;
create table user(
    id int primary key auto_increment,
    username varchar(20) not null unique comment '用户账号',
    password varchar(20) not null comment '密码',
    nickname varchar(20) comment '用户昵称',
    email varchar(50) comment '邮箱',
    age int comment '年龄',
    head varchar(255) comment '头像url',
    create_time timestamp default NOW() comment '创建时间'
) comment '用户表';

drop table if exists setting;
create table setting(
    id int primary key auto_increment,
    user_id int not null comment '用户id',
    batch_number int not null comment '每次抽奖人数',
    create_time timestamp default NOW() comment '创建时间',
    foreign key (user_id) references user(id)
) comment '抽奖设置';

drop table if exists award;
create table award(
    id int primary key auto_increment,
    name varchar(20) not null comment '奖项名称',
    count int not null comment '奖项人数',
    award varchar(20) not null comment '奖品',
    setting_id int not null comment '抽奖设置id',
    create_time timestamp default NOW() comment '创建时间',
    foreign key (setting_id) references setting(id)
) comment '奖项';

drop table if exists member;
create table member(
    id int primary key auto_increment,
    name varchar(20) not null comment '姓名',
    no varchar(20) not null comment '工号',
    user_id int not null  comment '用户id',
    create_time timestamp default NOW() comment '创建时间',
    foreign key (user_id) references user(id)
) comment '抽奖人员';

drop table if exists record;
create table record(
    id int primary key auto_increment,
    member_id int not null,
    award_id int not null,
    create_time timestamp default NOW() comment '创建时间',
    foreign key (member_id) references member(id),
    foreign key (award_id) references award(id)
) comment '中将';



