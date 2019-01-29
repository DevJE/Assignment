--sql/product.sql
drop table product cascade constraints;

create table product
(
 product_id     varchar2(20),
 p_name         varchar2(20) not null,
 price          number not null,
 description    varchar2(20)
);

alter table product
add primary key (product_id);

select * from product;
desc product;
commit;
comment on column product.product_id is '제품코드';
comment on column product.p_name is '제품이름';
comment on column product.price is '제품가격';
comment on column product.description is '제품버전';

insert into product values ('nb_ss7','삼성노트북',1570000 ,'시리즈 7');
insert into product values ('nb_ama4','맥북에어',1200000 ,'xcode 4');
insert into product values ('pc_ibm','ibmPC',750000 ,'windows8');