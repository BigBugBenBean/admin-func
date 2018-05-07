
 CREATE TABLE     "UM_FUNC"
   (	"FUNC_ID" VARCHAR2(4 BYTE),
	"FUNC_DESC" VARCHAR2(2000 BYTE),
	"DEST_URL" VARCHAR2(256 BYTE),
	"DISPLAY_POS" VARCHAR2(3 BYTE),
	"FUNC_TYPE" NUMBER DEFAULT 0,
	"ENABLE" VARCHAR2(1 BYTE),
	PRIMARY KEY (FUNC_ID)
   );


INSERT INTO UM_FUNC (FUNC_ID,FUNC_DESC,DEST_URL,DISPLAY_POS,FUNC_TYPE,ENABLE) VALUES ('EC01','Access Control','/e-Services-2/maintenance/accessControl.do','','1','Y');
INSERT INTO UM_FUNC (FUNC_ID,FUNC_DESC,DEST_URL,DISPLAY_POS,FUNC_TYPE,ENABLE) VALUES ('EC05','Create Function Group','../admin/UserMaintenanceCreateGroup01.do','','2','Y');
INSERT INTO UM_FUNC (FUNC_ID,FUNC_DESC,DEST_URL,DISPLAY_POS,FUNC_TYPE,ENABLE) VALUES ('EC06','Delete Function Group','../admin/UserMaintenanceDeleteGroup01.do','','2','Y');
INSERT INTO UM_FUNC (FUNC_ID,FUNC_DESC,DEST_URL,DISPLAY_POS,FUNC_TYPE,ENABLE) VALUES ('EC09','Update Function Group','../admin/UserMaintenanceUpdateGroup01.do','','2','Y');
INSERT INTO UM_FUNC (FUNC_ID,FUNC_DESC,DEST_URL,DISPLAY_POS,FUNC_TYPE,ENABLE) VALUES ('SM02','Delete Appointment','/SMARTICS-2/maintenance/deleteAppointment.do','','1','Y');
INSERT INTO UM_FUNC (FUNC_ID,FUNC_DESC,DEST_URL,DISPLAY_POS,FUNC_TYPE,ENABLE) VALUES ('SM03','Enquiry Code Information','/SMARTICS-2/enquiry/enquiryCodeInformation.do','','4','Y');
INSERT INTO UM_FUNC (FUNC_ID,FUNC_DESC,DEST_URL,DISPLAY_POS,FUNC_TYPE,ENABLE) VALUES ('SM01','Appointment Booking Enquiry','/SMARTICS-2/enquiry/appointmentBookingEnquiry.do','','4','Y');
INSERT INTO UM_FUNC (FUNC_ID,FUNC_DESC,DEST_URL,DISPLAY_POS,FUNC_TYPE,ENABLE) VALUES ('EC10','System Holiday and Non-working Date View','/e-Services-2/enquiry/systemHoliday.do','','4','Y');
INSERT INTO UM_FUNC (FUNC_ID,FUNC_DESC,DEST_URL,DISPLAY_POS,FUNC_TYPE,ENABLE) VALUES ('EC02','Application Fee Enquiry','/e-Services-2/enquiry/applicationFeeEnquiry.do','','4','N');
INSERT INTO UM_FUNC (FUNC_ID,FUNC_DESC,DEST_URL,DISPLAY_POS,FUNC_TYPE,ENABLE) VALUES ('RM01','Online Submission Enquiry','../admin/EnquiryApplicationStatus01.do','','4','Y');
INSERT INTO UM_FUNC (FUNC_ID,FUNC_DESC,DEST_URL,DISPLAY_POS,FUNC_TYPE,ENABLE) VALUES ('EC07','Important Announcement','/e-Services-2/maintenance/importantAnnouncement.do','','1','Y');



