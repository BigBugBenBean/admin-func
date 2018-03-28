--------------------------------------------------------
--  DDL for Table UM_FUNC
--------------------------------------------------------

  CREATE TABLE     "UM_FUNC"
   (	"FUNC_ID" VARCHAR2(8 BYTE), 
	"FUNC_DESC" VARCHAR2(2000 BYTE), 
	"DEST_URL" VARCHAR2(256 BYTE), 
	"DISPLAY_POS" VARCHAR2(3 BYTE), 
	"FUNC_TYPE" NUMBER DEFAULT 0, 
	"ENABLE" VARCHAR2(1 BYTE)
   );
  ALTER TABLE "UM_FUNC" MODIFY ("FUNC_ID" NOT NULL ENABLE);
 
  ALTER TABLE "UM_FUNC" ADD PRIMARY KEY ("FUNC_ID")


Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DEST_URL,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('ECE0001','Enquiry Code Information','../admin/EnquiryCodeInformation01.do',null,4,'Y');
Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DEST_URL,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('MQM0001','Marriage Quota Transfer','../admin/MarriageQuotaTransfer01.do',null,1,'Y');
Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DEST_URL,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('ADM0001','User Maintenance',null,null,2,'Y');
Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DEST_URL,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('EFN0001','Office Quota Maintenance ','../admin/QuotaMaintenance01.do',null,1,'Y');
Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DEST_URL,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('PFN0002','Payment Manual Reconciliation','../admin/ManualReconciliation01.do',null,1,'Y');
Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DEST_URL,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('PFN0001','Payment Enquiry','../admin/PaymentEnquiry01.do',null,4,'Y');
Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DEST_URL,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('GFN0001','Online Submission Enquiry','../admin/EnquiryApplicationStatus01.do',null,4,'Y');
Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DEST_URL,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('IAM0001','Important Announcement','../admin/ImportantAnnouncement01.do',null,1,'Y');
Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DEST_URL,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('EFN0002','Appointment Booking Enquiry','../admin/EnquiryAppointmentBooking00.do',null,4,'Y');
Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DEST_URL,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('ADM0003','Delete User','../admin/UserMaintenanceDeleteUser01.do',null,2,'N');
Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DEST_URL,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('ADM0007','Update Function Group','../admin/UserMaintenanceUpdateGroup01.do',null,2,'Y');
Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DEST_URL,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('ADM0006','Delete Function Group','../admin/UserMaintenanceDeleteGroup01.do',null,2,'Y');
Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DEST_URL,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('ADM0005','Create Function Group','../admin/UserMaintenanceCreateGroup01.do',null,2,'Y');
Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DEST_URL,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('ADM0004','Update User','../admin/UserMaintenanceUpdateUser01.do',null,2,'Y');
Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DEST_URL,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('ADM0002','Create User','../admin/UserMaintenanceCreateUser01.do',null,2,'Y');
Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DEST_URL,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('RIS0001','Identity Proof Selection','../admin/IdentityProofSelection01.do',null,1,'N');
Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DEST_URL,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('EFN0017','Application Fee Enquiry','../admin/EnquiryPaymentCode.do',null,4,'Y');
Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DEST_URL,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('EFN0010','System Holiday and Non-working Date View','../admin/EnquirySystemHoliday.do',null,4,'Y');
Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DEST_URL,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('EFN0012','Appointment Bookable Period Enquiry','../admin/AppointmentBookablePeriod01.do',null,1,'N');
Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DEST_URL,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('EFN0013','Office Maintenance','../admin/OfficeMaintenance01.do',null,1,'N');
Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DEST_URL,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('EFN0014','Hospital-Office Maintenance','../admin/HospitalMaintenance01.do',null,1,'N');
Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DEST_URL,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('EFN0011','Appointment Reminder','../admin/EnquiryApplicationCode01.do',null,1,'N');
Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DEST_URL,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('EFN0015','Application-Office Maintenance','../admin/ApplicationOffice01.do',null,1,'N');
Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DEST_URL,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('EFN0016','Appointment-Office Maintenance','../admin/AppointmentOffice01.do',null,1,'N');
Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DEST_URL,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('EFN0018','Application Due Day','../admin/ApplicationInformation01.do',null,1,'N');
Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DEST_URL,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('DAM0001','Delete Appointment','../admin/DeleteAppointment01.do',null,1,'Y');
Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DEST_URL,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('ACM0001','Access Control','../admin/AccessControl01.do',null,1,'Y');
Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DEST_URL,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('QRM0001','Quota Release Rule','../admin/QuotaReleaseRule01.do',null,1,'Y');
Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DEST_URL,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('QAM0001','Email Address for Quota Full Alert','../admin/QuotaAlertEmail01.do',null,1,'Y');
Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DEST_URL,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('ROA0001','ROA No Show Case','../admin/EnquiryRoaOverdue01.do	',null,4,'Y');
Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DEST_URL,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('SDS0001','Supplementary Document Submission','../admin/SupplementaryDocumentSubmission01.do	',null,4,'Y');
Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DEST_URL,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('EFN0019','Virtual Appointment Enquiry','../admin/EnquiryVirtualAppointmentBooking00.do',null,4,'Y');
Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DEST_URL,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('VQM0001','Virtual Quota Multiplier Maintenance','../admin/VirtualQuotaMultiplier01.do',null,1,'Y');
Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DEST_URL,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('CCM0001','CDCM Country Maintenance','../admin/CDCMCountryMaintenance01.do',null,1,'Y');
Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DEST_URL,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('CDM0001','CDCM Delivery Maintenance','../admin/CDCMDeliveryMaintenance01.do',null,1,'Y');
Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DEST_URL,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('COM0001','CDCM Office Maintenance','../admin/CDCMOfficeMaintenance01.do',null,1,'Y');
Insert into UM_FUNC (FUNC_ID,FUNC_DESC,DEST_URL,DISPLAY_POS,FUNC_TYPE,ENABLE) values ('CPM0001','CDCM Price Maintenance','../admin/CDCMPriceMaintenance01.do',null,1,'Y');


