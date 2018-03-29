--------------------------------------------------------
--  DDL for Table UMGROUP
--------------------------------------------------------

  CREATE TABLE "UM_GROUP"
   (	"GROUP_ID" VARCHAR2(16 BYTE), 
	"GROUP_DESC" VARCHAR2(256 BYTE), 
	"DISPLAY_POS" VARCHAR2(3 BYTE), 
	"LST_UPD_ID" VARCHAR2(10 BYTE), 
	"LST_UPD_DT" DATE
   );
  ALTER TABLE "UM_GROUP" MODIFY ("GROUP_ID" NOT NULL ENABLE);
 
  ALTER TABLE "UM_GROUP" ADD CONSTRAINT "UM_GROUP_PK" PRIMARY KEY ("GROUP_ID");


Insert into UM_GROUP (GROUP_ID,GROUP_DESC,DISPLAY_POS,LST_UPD_ID,LST_UPD_DT) values ('TestGroup01','TestGroup01 description',null,'YCWONG1',to_date('11-NOV-08','DD-MON-RR'));
Insert into UM_GROUP (GROUP_ID,GROUP_DESC,DISPLAY_POS,LST_UPD_ID,LST_UPD_DT) values ('TestGroup02','TestGroup02 description',null,'CWCHENG2',to_date('17-FEB-10','DD-MON-RR'));
Insert into UM_GROUP (GROUP_ID,GROUP_DESC,DISPLAY_POS,LST_UPD_ID,LST_UPD_DT) values ('TestGroup03','TestGroup03 description',null,'YCWONG',to_date('01-SEP-08','DD-MON-RR'));
Insert into UM_GROUP (GROUP_ID,GROUP_DESC,DISPLAY_POS,LST_UPD_ID,LST_UPD_DT) values ('TestGroup04','TestGroup04 description',null,'KENNETH',to_date('11-JUN-08','DD-MON-RR'));
Insert into UM_GROUP (GROUP_ID,GROUP_DESC,DISPLAY_POS,LST_UPD_ID,LST_UPD_DT) values ('TestGroup05','TestGroup05 description',null,'S',to_date('01-SEP-15','DD-MON-RR'));
Insert into UM_GROUP (GROUP_ID,GROUP_DESC,DISPLAY_POS,LST_UPD_ID,LST_UPD_DT) values ('PCCW','PCCW Solutions',null,'S',to_date('01-SEP-15','DD-MON-RR'));
Insert into UM_GROUP (GROUP_ID,GROUP_DESC,DISPLAY_POS,LST_UPD_ID,LST_UPD_DT) values ('Quota Transfer','Marriage Quota Transfer',null,'YCWONG',to_date('25-SEP-08','DD-MON-RR'));
Insert into UM_GROUP (GROUP_ID,GROUP_DESC,DISPLAY_POS,LST_UPD_ID,LST_UPD_DT) values ('e-Services','PCCW e-Services team',null,'KENNETH',to_date('05-JAN-10','DD-MON-RR'));
Insert into UM_GROUP (GROUP_ID,GROUP_DESC,DISPLAY_POS,LST_UPD_ID,LST_UPD_DT) values ('ESBooking User','Ordinary User of ES Booking Service',null,'HYHUNG',to_date('04-AUG-09','DD-MON-RR'));





