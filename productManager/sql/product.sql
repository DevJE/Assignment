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
comment on column product.product_id is '��ǰ�ڵ�';
comment on column product.p_name is '��ǰ�̸�';
comment on column product.price is '��ǰ����';
comment on column product.description is '��ǰ����';

insert into product values ('nb_ss7','�Ｚ��Ʈ��',1570000 ,'�ø��� 7');
insert into product values ('nb_ama4','�ƺϿ���',1200000 ,'xcode 4');
insert into product values ('pc_ibm','ibmPC',750000 ,'windows8');