-- begin DEMO_PRODUCT
alter table DEMO_PRODUCT add constraint FK_DEMO_PRODUCT_IMAGE foreign key (IMAGE_ID) references SYS_FILE(ID)^
create index IDX_DEMO_PRODUCT_IMAGE on DEMO_PRODUCT (IMAGE_ID)^
-- end DEMO_PRODUCT
