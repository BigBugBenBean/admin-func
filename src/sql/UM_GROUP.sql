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



Insert into UM_GROUP (GROUP_ID,GROUP_DESC,DISPLAY_POS,LST_UPD_ID,LST_UPD_DT) values ('INV Sup','INV Supervisor',null,'YCWONG1',to_date('11-NOV-08','DD-MON-RR'));
Insert into UM_GROUP (GROUP_ID,GROUP_DESC,DISPLAY_POS,LST_UPD_ID,LST_UPD_DT) values ('Quota_Release','Quota Release Rule',null,'CWCHENG2',to_date('17-FEB-10','DD-MON-RR'));
Insert into UM_GROUP (GROUP_ID,GROUP_DESC,DISPLAY_POS,LST_UPD_ID,LST_UPD_DT) values ('Delete_App','Delete Appointment',null,'YCWONG',to_date('01-SEP-08','DD-MON-RR'));
Insert into UM_GROUP (GROUP_ID,GROUP_DESC,DISPLAY_POS,LST_UPD_ID,LST_UPD_DT) values ('allgroups','test',null,'KENNETH',to_date('11-JUN-08','DD-MON-RR'));
Insert into UM_GROUP (GROUP_ID,GROUP_DESC,DISPLAY_POS,LST_UPD_ID,LST_UPD_DT) values ('PCCW','PCCW Solutions',null,'S',to_date('01-SEP-15','DD-MON-RR'));
Insert into UM_GROUP (GROUP_ID,GROUP_DESC,DISPLAY_POS,LST_UPD_ID,LST_UPD_DT) values ('Quota Transfer','Marriage Quota Transfer',null,'YCWONG',to_date('25-SEP-08','DD-MON-RR'));
Insert into UM_GROUP (GROUP_ID,GROUP_DESC,DISPLAY_POS,LST_UPD_ID,LST_UPD_DT) values ('e-Services','PCCW e-Services team',null,'KENNETH',to_date('05-JAN-10','DD-MON-RR'));
Insert into UM_GROUP (GROUP_ID,GROUP_DESC,DISPLAY_POS,LST_UPD_ID,LST_UPD_DT) values ('ESBooking User','Ordinary User of ES Booking Service',null,'HYHUNG',to_date('04-AUG-09','DD-MON-RR'));
Insert into UM_GROUP (GROUP_ID,GROUP_DESC,DISPLAY_POS,LST_UPD_ID,LST_UPD_DT) values ('ESBooking Sup','Supervisor of ES Booking Service',null,'HYHUNG',to_date('04-AUG-09','DD-MON-RR'));
Insert into UM_GROUP (GROUP_ID,GROUP_DESC,DISPLAY_POS,LST_UPD_ID,LST_UPD_DT) values ('ROA_User','ROA_User',null,'YCWONG',to_date('20-FEB-09','DD-MON-RR'));
Insert into UM_GROUP (GROUP_ID,GROUP_DESC,DISPLAY_POS,LST_UPD_ID,LST_UPD_DT) values ('bbb','aaa-test',null,'YCWONG6',to_date('29-JAN-09','DD-MON-RR'));
Insert into UM_GROUP (GROUP_ID,GROUP_DESC,DISPLAY_POS,LST_UPD_ID,LST_UPD_DT) values ('PMT_User','PMT_User',null,'DANKY',to_date('20-MAR-15','DD-MON-RR'));
Insert into UM_GROUP (GROUP_ID,GROUP_DESC,DISPLAY_POS,LST_UPD_ID,LST_UPD_DT) values ('ESAppln Sup','Supervisor of ES Application Service',null,'HYHUNG',to_date('04-AUG-09','DD-MON-RR'));
Insert into UM_GROUP (GROUP_ID,GROUP_DESC,DISPLAY_POS,LST_UPD_ID,LST_UPD_DT) values ('PMT_Supervisor','PMT_Supervisor',null,'DANKY',to_date('20-MAR-15','DD-MON-RR'));
Insert into UM_GROUP (GROUP_ID,GROUP_DESC,DISPLAY_POS,LST_UPD_ID,LST_UPD_DT) values ('ESAppln User','Ordinary User of ES Application Service',null,'HYHUNG',to_date('04-AUG-09','DD-MON-RR'));
Insert into UM_GROUP (GROUP_ID,GROUP_DESC,DISPLAY_POS,LST_UPD_ID,LST_UPD_DT) values ('Quota Main','Quota Main',null,'CHRIS',to_date('21-MAR-11','DD-MON-RR'));
Insert into UM_GROUP (GROUP_ID,GROUP_DESC,DISPLAY_POS,LST_UPD_ID,LST_UPD_DT) values ('test2','test2',null,'YCWONG',to_date('27-JUN-08','DD-MON-RR'));
Insert into UM_GROUP (GROUP_ID,GROUP_DESC,DISPLAY_POS,LST_UPD_ID,LST_UPD_DT) values ('wingwong','ar wong',null,'SUKI',to_date('21-JUL-08','DD-MON-RR'));
Insert into UM_GROUP (GROUP_ID,GROUP_DESC,DISPLAY_POS,LST_UPD_ID,LST_UPD_DT) values ('Imp_Announcement','Important Announcement',null,'S',to_date('04-JAN-18','DD-MON-RR'));
Insert into UM_GROUP (GROUP_ID,GROUP_DESC,DISPLAY_POS,LST_UPD_ID,LST_UPD_DT) values ('BR Sup','Births Registries Supervisor',null,'S',to_date('27-JUN-12','DD-MON-RR'));
Insert into UM_GROUP (GROUP_ID,GROUP_DESC,DISPLAY_POS,LST_UPD_ID,LST_UPD_DT) values ('BR User','Birth Registries User',null,'HPYU',to_date('22-OCT-08','DD-MON-RR'));
Insert into UM_GROUP (GROUP_ID,GROUP_DESC,DISPLAY_POS,LST_UPD_ID,LST_UPD_DT) values ('INV User','INV User',null,'HPYU',to_date('11-NOV-08','DD-MON-RR'));
Insert into UM_GROUP (GROUP_ID,GROUP_DESC,DISPLAY_POS,LST_UPD_ID,LST_UPD_DT) values ('Email Alert','Email address for receiving the alert',null,'CWCHENG2',to_date('17-MAR-10','DD-MON-RR'));
Insert into UM_GROUP (GROUP_ID,GROUP_DESC,DISPLAY_POS,LST_UPD_ID,LST_UPD_DT) values ('ip block','access control',null,'SUKI',to_date('25-NOV-09','DD-MON-RR'));
Insert into UM_GROUP (GROUP_ID,GROUP_DESC,DISPLAY_POS,LST_UPD_ID,LST_UPD_DT) values ('admin','admin group',null,'DANKY',to_date('13-FEB-15','DD-MON-RR'));
Insert into UM_GROUP (GROUP_ID,GROUP_DESC,DISPLAY_POS,LST_UPD_ID,LST_UPD_DT) values ('Enq_Code','Enquiry Code Information',null,'YCWONG',to_date('05-AUG-08','DD-MON-RR'));
Insert into UM_GROUP (GROUP_ID,GROUP_DESC,DISPLAY_POS,LST_UPD_ID,LST_UPD_DT) values ('Test1','Test1',null,'ITADMIN',to_date('31-JUL-07','DD-MON-RR'));
Insert into UM_GROUP (GROUP_ID,GROUP_DESC,DISPLAY_POS,LST_UPD_ID,LST_UPD_DT) values ('User Main','User Maintenance only',null,'YCWONG',to_date('11-JUL-08','DD-MON-RR'));
Insert into UM_GROUP (GROUP_ID,GROUP_DESC,DISPLAY_POS,LST_UPD_ID,LST_UPD_DT) values ('User','Enquiry',null,'YCWONG',to_date('18-SEP-08','DD-MON-RR'));
Insert into UM_GROUP (GROUP_ID,GROUP_DESC,DISPLAY_POS,LST_UPD_ID,LST_UPD_DT) values ('Quota Maint','Quota Maint',null,'YCWONG',to_date('17-JUN-08','DD-MON-RR'));
Insert into UM_GROUP (GROUP_ID,GROUP_DESC,DISPLAY_POS,LST_UPD_ID,LST_UPD_DT) values ('a','aa',null,'YCWONG1',to_date('14-AUG-08','DD-MON-RR'));
Insert into UM_GROUP (GROUP_ID,GROUP_DESC,DISPLAY_POS,LST_UPD_ID,LST_UPD_DT) values ('ROA_Sup','ROA_Sup',null,'HYHUNG',to_date('19-JUN-09','DD-MON-RR'));
Insert into UM_GROUP (GROUP_ID,GROUP_DESC,DISPLAY_POS,LST_UPD_ID,LST_UPD_DT) values ('testinga','for testing',null,'S',to_date('05-MAY-15','DD-MON-RR'));
Insert into UM_GROUP (GROUP_ID,GROUP_DESC,DISPLAY_POS,LST_UPD_ID,LST_UPD_DT) values ('MARG1','Testing G1',null,'S',to_date('30-JAN-18','DD-MON-RR'));
Insert into UM_GROUP (GROUP_ID,GROUP_DESC,DISPLAY_POS,LST_UPD_ID,LST_UPD_DT) values ('MA001','MA001',null,'S',to_date('04-JAN-18','DD-MON-RR'));
Insert into UM_GROUP (GROUP_ID,GROUP_DESC,DISPLAY_POS,LST_UPD_ID,LST_UPD_DT) values ('CDCM','CDCM',null,'S',to_date('22-JAN-18','DD-MON-RR'));
Insert into UM_GROUP (GROUP_ID,GROUP_DESC,DISPLAY_POS,LST_UPD_ID,LST_UPD_DT) values ('PCCW_TEST','PCCW_TEST',null,'S',to_date('05-MAY-15','DD-MON-RR'));
Insert into UM_GROUP (GROUP_ID,GROUP_DESC,DISPLAY_POS,LST_UPD_ID,LST_UPD_DT) values ('COE Submission','COE Submission',null,'DANKY',to_date('06-MAY-15','DD-MON-RR'));
Insert into UM_GROUP (GROUP_ID,GROUP_DESC,DISPLAY_POS,LST_UPD_ID,LST_UPD_DT) values ('TD Sup_Virtual','TD Supervisor_Virtual quota',null,'DANKY',to_date('11-SEP-15','DD-MON-RR'));
Insert into UM_GROUP (GROUP_ID,GROUP_DESC,DISPLAY_POS,LST_UPD_ID,LST_UPD_DT) values ('PCCW_DEL_USER','Test delete user',null,'S',to_date('17-MAY-16','DD-MON-RR'));