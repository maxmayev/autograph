create table message
(
    id           int auto_increment
        primary key,
    name         varchar(45) null,
    autoNumber      varchar(45) null,
    messText   varchar(255) null
);

create table user
(
    id       int auto_increment
        primary key,
    username varchar(45)  null,
    password varchar(255) null
);
