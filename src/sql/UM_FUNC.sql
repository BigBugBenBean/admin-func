  CREATE TABLE     "UM_FUNC"
   (	"FUNC_ID" VARCHAR2(4 BYTE), 
	"FUNC_DESC" VARCHAR2(2000 BYTE), 
	"DISPLAY_POS" VARCHAR2(3 BYTE), 
	"FUNC_TYPE" NUMBER DEFAULT 0, 
	"ENABLE" VARCHAR2(1 BYTE)
   );
  ALTER TABLE "UM_FUNC" MODIFY ("FUNC_ID" NOT NULL ENABLE);
 
  ALTER TABLE "UM_FUNC" ADD PRIMARY KEY ("FUNC_ID");
  
  
  Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('EC01','Access Control',null,1,'Y');
Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('EC02','Application Fee Enquiry',null,4,'Y');
Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('EC03','Audit Log',null,4,'Y');
Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('EC04','Change Password',null,4,'Y');
Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('EC05','Create Function Group',null,2,'Y');
Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('EC06','Delete Function Group',null,2,'Y');
Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('EC07','Important Announcement',null,1,'Y');
Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('EC08','Surge Control',null,4,'Y');
Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('EC09','Update Function Group',null,2,'Y');
Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('EC10','System Holiday',null,4,'Y');
Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('EC11','Schedule Job Function - Create Job',null,4,'Y');
Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('EC12','Schedule Job Function - Update Job',null,4,'Y');
Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('EC13','Schedule Job Function - Delete Job',null,4,'Y');
Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('EC14','Schedule Job Function - View Job',null,4,'Y');
Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('EC15','Schedule Job Function - View Job History',null,4,'Y');
Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('RM01','Online Submission Enquiry',null,4,'Y');
Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('SM01','Appointment Booking Enquiry',null,4,'Y');
Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('SM02','Delete Appointment',null,1,'Y');
Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('SM03','Enquiry Code Information',null,4,'Y');
Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('SM04','Online Submission Enquiry',null,4,'Y');