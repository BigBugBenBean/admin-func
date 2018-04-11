CREATE TABLE UM_APPLICATION_ID (
  "APP_ID" VARCHAR2(4 BYTE),
	"CREATE_AT" TIMESTAMP (6) DEFAULT SYSDATE,
	"MODIFY_AT" TIMESTAMP (6) DEFAULT SYSDATE,
	"MODIFY_BY" VARCHAR2(1 BYTE),
	"ENG_APP_NAME" VARCHAR2(480 BYTE),
	"CHT_APP_NAME" VARCHAR2(50),
	"CHS_APP_NAME" VARCHAR2(50),
	"REQUIRE_REMINDER" VARCHAR2(1 BYTE) DEFAULT 'N',
	"REMINDER_DAY" NUMBER(3,0),
	"EFFECTIVE_DATE" DATE,
	"UPDATE_FLAG" VARCHAR2(1 BYTE),
	"ACTION_TYPE" VARCHAR2(10 BYTE),
	primary key (APP_ID)
   );


INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('584','Application for Access to Information with Personal Data');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('568','Application for Search of Record of Birth in Hong Kong');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('567','Appointment Booking for application for Search of Marriage Records, Issue of Certified True Copy of Marriage Certificate and/or application for Certificate of Absence of Marriage Record');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('577','Submission of Information Required for Registration of Marriage');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('524','Payment Status Enquiry / Transaction Status Enquiry');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('525','Appointment Booking for Collecting HKSAR Travel Document');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('526','Repayment (Application via Self-service kiosk)');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('509','Appointment Booking for Collection of HKSAR Passport or Document of Identity for Visa Purposes');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('510','Appointment booking ??Collection of HKSAR Document of Identity for Visa Purposes');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('502','Application for Search of Record of Death in Hong Kong');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('503','Application for a Certified Copy of an Entry in the Deaths Register');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('500','Application for HKSAR Passport (For persons 16 years of age or above applying in Hong Kong)');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('501','Application for HKSAR Passport (For children 11 years to 15 years of age applying in Hong Kong)');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('521','Application for HKSAR Document of Identity for Visa Purposes (Age 16 or above)');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('522','Application for HKSAR Document of Identity for Visa Purposes (Age below 16)');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('1205','Application for HKSAR Re-entry Permit (for persons 16 years of age or above applying in HKSAR)');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('1206','Application for HKSAR Re-entry Permit (For Children under 16 Years of Age) ');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('504','Application Status Enquiry');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('523','Appointment  Details Enquiry');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('527','Application for Access to General Information');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('528','Data Access Request made under Personal Data (Privacy) Ordinance');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('529','Appointment booking - Application for Search of Record of Death in Hong Kong or application for a Certified True Copy of an Entry in the Deaths Registers');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('519','Application for HKSAR Passport (For persons 16 years of age or above applying outside Hong Kong)');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('520','Application for HKSAR Passport (For children 11 years to 15 years of age applying outside Hong Kong)');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('570','Application for Search of Marriage Records in Hong Kong and/or Issue of Certified True Copy of Marriage Certificate');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('579','Appointment Booking for Hong Kong Smart Identity Card');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('578','Appointment Booking for Applying Extension of Stay (at Immigration Branch Offices only)');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('S02','Appointment booking ??Application for HKSAR Document of Identity for Visa Purposes');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('S03','Appointment booking ??Application for HKSAR Re-entry Permit');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('S04','Appointment booking ??Application for Seaman's Identity Book');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('900','Appointment Booking for Giving of Notice of Intended Marriage (with date of intended marriage)Internal use');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('563','Appointment Booking for Giving of Notice of Intended Marriage (for Marriage Ceremony at a Marriage Registry)');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('564','Appointment Booking for Giving of Notice of Intended Marriage only');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('565','Appointment Booking for Birth Registration');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('566','Appointment Booking for application for Search of Record of Birth in Hong Kong and/or application for a Certified True Copy of an Entry in the Births Registers');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('590','Application for Verification of Eligibility for Permanent Identity Card');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('591','Change/Enquiry of Appointment for Document Verification related to Application for Verification of Eligibility for Permanent Identity Card');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('592','Supplementary Document Submission');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('618','Book an appointment to apply for travel documents (Only for Hong Kong born babies within 42 days after the day of birth)');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('596','Application for Extension of Stay');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('597','Appointment Booking for Applying Extension of Stay');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('P01','ES Section');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('P02','QMMR (Mainland Student)');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('P03','QMMR (ASMTP)');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('P04','QMMR (IANG)');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('P05','QMMR (SLS)');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('P06','FDH (Change Of Employee)');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('P07','FDH (Advanced contract renewal)');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('P08','FDH (Contract renewal)');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('P09','FDH (Completion of current contract)');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('P10','FDH (Mutual agreement for one month)');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('P11','FDH (Visitor)(Change Of Employee)');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('P12','FDH (Visitor)(Advanced contract renewal)');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('P13','FDH (Visitor)(Contract renewal)');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('P14','FDH (Visitor)(Completion of current contract)');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('P15','FDH (Visitor)(Mutual agreement for one month)');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('ISIT','Appointment Booking for Giving of Notice of Intended Marriage (for Marriage Ceremony at a Marriage Registry)');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('576','Notification of Premature Termination of Employment Contracts of Foreign Domestic Helpers');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('586','Online Reporting of Immigration Offences');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('569','Application for a Certified Copy of an Entry in the Births Register');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('505','Book an Appointment to Apply for Travel Documents (For all persons except newborn babies within 42 days after the day of birth)');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('619','Submission of Information Required for Registration of Birth');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('622','Pre-arrival Registration for Taiwan Residents');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('623','Enquiry of Pre-arrival Registration for Taiwan Residents');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('S01','Appointment Booking ??Application for HKSAR Passport');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('630','Pre-enrolment for the e-Channel Service');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('634','Application for Entry under the Admission Scheme for the Second Generation of Chinese Hong Kong Permanent Residents');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('P16','ASSG (Admission Scheme for the Second Generation of Chinese Hong Kong Permanent Residents)');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('640','Application for Certificate of Absence of Marriage Record');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('642','Pre-arrival Registration for Indian nationals');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('643','Pre-arrival Registration for Indian nationals');
INSERT INTO UM_APPLICATION_ID (APP_ID,ENG_APP_NAME) VALUES ('644','Pre-arrival Registration for Indian nationals');
