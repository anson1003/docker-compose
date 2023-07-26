drop table if exists product CASCADE;

create table product (product_id varchar(255) not null, description varchar(255), name varchar(255), price float not null, primary key (product_id));

insert into product (description, name, price, product_id) values ('Samsung Galaxy S23 Ultra SmartPhone - 12 GB - 256 GB','Samsung Galaxy S23 Ultra',125000.0,'p1002');
insert into product (description, name, price, product_id) values ('Iphone 14 pro SmartPhone - 12gb- 256gb','Iphone 14 pro',150000.0,'p1003');
insert into product (description, name, price, product_id) values ('Nothing Phone(2) SmartPhone - 12gb- 256gb','Nothing Phone(2)',49999.0,'p1004');
insert into product (description, name, price, product_id) values ('Motorola g72 SmartPhone - 8gb- 128gb','Moto G72',15000.0,'p1005');