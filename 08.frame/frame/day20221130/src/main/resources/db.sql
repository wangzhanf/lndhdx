# 库的操作
drop database if exists ele_se;
create database if not exists ele_se;
use ele_se;

# 初始化环境
# set character set utf8;
# set foreign_key_checks=false; -- 不检查外键约束

# 表操作
drop table if exists orderMap;
drop table if exists food;
drop table if exists business;
drop table if exists info;
drop table if exists admin;


create table if not exists admin(
                                    id integer auto_increment comment '管理员编号',
                                    adminName varchar(20) not null unique comment '管理员名称',
    password varchar(128) not null comment '密码',
    uptime timestamp default current_timestamp on update current_timestamp comment '记录修改时间',
    primary key `admin_pk` (`id`)
    )comment '管理员表';

create table if not exists info(
                                   id integer auto_increment comment '信息编号',
                                   aid integer unique not null  comment '管理员编号',
                                   phone varchar(11) unique comment '手机号码',
    avatar varchar(120) comment '用户头像',
    gender boolean comment '性别',
    uptime timestamp default current_timestamp on update current_timestamp comment '记录修改时间',
    primary key `info_pk` (`id`),
    constraint foreign key `fk_info_aid_to_admin_id` (`aid`) references admin(`id`)
    )comment '详细信息表';

create table if not exists business(
                                       id integer auto_increment comment '商家编号',
                                       password varchar(128) not null comment '密码',
    businessName varchar(40) not null comment '商家名称',
    businessAddress varchar(50) comment '商家地址',
    businessExplain varchar(40) comment '商家介绍',
    starPrice decimal(5,2) default 0.00 comment '起送费',
    deliveryPrice decimal(5,2) default 0.00 comment '配送费',
    aid integer default 1 comment '管理员编号',
    uptime timestamp default current_timestamp on update current_timestamp comment '记录修改时间',
    primary key `business_pk` (`id`),
    constraint foreign key `fk_business_aid_to_admin_id` (`aid`) references admin(`id`)
    ) comment '商家表';

create table if not exists food(
                                   id integer auto_increment comment '食品编号',
                                   foodName varchar(30) not null comment '食品名称',
    foodExplain varchar(30) comment '食品介绍',
    foodPrice decimal(5,2) not null  comment '食品价格',
    bid integer not null comment '所属商家编号',
    uptime timestamp default current_timestamp on update current_timestamp comment '记录修改时间',
    primary key `food_pk` (`id`),
    constraint foreign key `fk_food_bid_to_business_id` (`bid`) references business(`id`)
    )comment '食品表';

create table if not exists orderMap(
                                       id integer auto_increment comment '订单编号',
                                       aid integer not null comment '管理员编号',
                                       fid integer not null comment '食品编号',
                                       uptime timestamp default current_timestamp on update current_timestamp comment '记录修改时间',
                                       primary key `orderMap_pk` (`id`),
    constraint foreign key `fk_orderMap_aid_to_admin_id` (`aid`) references admin(`id`),
    constraint foreign key `fk_orderMap_fid_to_food_id` (`fid`) references food(`id`)
    )comment '订单映射表';

# 数据操作【插入测试数据】
insert into admin (adminName, password) values ('wangzf','123456'),
                                               ('admin','654321')
;
insert into info (aid, phone, avatar, gender) values (1,'13898647536','a.png',true);
insert into business
(password, businessName, businessAddress, businessExplain, aid)
VALUES
    ('123', 'kfc', '博川校区', '开封菜', 2),
    ('123', '杨国福', '博川校区', '麻辣烫', 2),
    ('123', '麻辣香锅', '黄泥川', '非常辣', 1)
;
insert into food
(foodName, foodExplain, foodPrice, bid)
values
    ('甜筒','双色甜筒',3.5,1),
    ('汉堡','牛肉双层',13.5,1),
    ('鱼丸','淀粉丸',3.2,2),
    ('粉丝','土豆粉',3.5,2),
    ('方便面','廉帅博',4.5,2),
    ('海带','当年生海带',1.5,2)
;

insert into orderMap (aid,fid) values (1,1),
                                      (1,2),
                                      (1,6),
                                      (2,1),
                                      (2,6),
                                      (2,3)
;

# 批量插入测试数据  采用存储过程解决【函数】
create procedure benchBusiness(IN rownum integer)
BEGIN
    declare count integer default 1;
    while count<rownum do
            insert into business
            (password, businessName, businessAddress, businessExplain, aid)
            VALUES
                ('123', concat('商家',count), concat('地址',count), concat('介绍',count), 2);
            set count = count + 1;
end while;
end;
# 调用存储过程
call benchBusiness(999);

select count(*) from business;


# 多表联查
# 1 直接相连  - 结果是  笛卡尔 乘积   总记录数  A * B
select  * from admin,info;
# 2 外连接  --  基表选择记录少的  ，如果多表有同名字段，会引发歧义问题
select
    *
from admin
         left join info on id = aid;

# 建议模式
select
    a.id as pid,
    a.adminName as adminName,
    a.password as password,
    a.uptime as puptime,
    i.id as sid,
    i.phone as phone
from admin as a
         left join info as i
                   on a.id = i.aid
where a.id = 2
;

select * from food;
select * from food where id = 1;
select * from food,business;
select * from food,business where id = 1;
select
    f.id as fid,
    f.foodName as foodName,
    f.foodExplain as foodExplain,
    f.foodPrice as foodPrice,
    f.bid as bid,
    f.uptime as fuptime,
    b.businessName as businessName,
    b.businessExplain as businessExplain
from food as f
         left join business as b
                   on f.bid = b.id
where f.id = 1;
-- 课堂实践：  完成登录验证业务

delete from orderMap where fid in (1,2);
delete from food where bid=1;
delete from business where id = 1;
-- 课间休息 ：  14：05

select 1,2;
select id from food where bid=1;
delete from orderMap where fid in (select id from food where bid=1);


