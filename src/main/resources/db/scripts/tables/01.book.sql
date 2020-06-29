create table book
(
    id              number(5)   not null auto_increment,
    title           varchar(50) not null,
    author          varchar(20) not null,
    submission_date date,
    primary key (id)
);



create sequence book
    start with 10000 increment by 1000 cache 1000
    minvalue 10000 maxvalue 99999;