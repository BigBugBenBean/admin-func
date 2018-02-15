--------------------------------------------------------
--  DDL for Table UM_OFFICE
--------------------------------------------------------

  CREATE TABLE "UM_OFFICE"
   (    
    "OFFICE_CODE" VARCHAR2(10 BYTE), 
    "SECTION_CODE" VARCHAR2(2 BYTE), 
    "CREATE_AT" TIMESTAMP (6), 
    "MODIFY_AT" TIMESTAMP (6), 
    "MODIFY_BY" VARCHAR2(1 BYTE), 
    "ENG_OFF_NAME" VARCHAR2(100 BYTE), 
    "CHT_OFF_NAME" NVARCHAR2(25), 
    "CHS_OFF_NAME" NVARCHAR2(25), 
    "ENG_ADDR" VARCHAR2(256 BYTE), 
    "CHT_ADDR" NVARCHAR2(256), 
    "CHS_ADDR" NVARCHAR2(256), 
    "TEL_NUM" VARCHAR2(15 BYTE), 
    "FAX_NUM" VARCHAR2(15 BYTE), 
    "OFF_HR_WD_START1" VARCHAR2(4 BYTE), 
    "OFF_HR_WD_END1" VARCHAR2(4 BYTE), 
    "OFF_HR_WD_START2" VARCHAR2(4 BYTE), 
    "OFF_HR_WD_END2" VARCHAR2(4 BYTE), 
    "OFF_HR_SAT_START1" VARCHAR2(4 BYTE), 
    "OFF_HR_SAT_END1" VARCHAR2(4 BYTE), 
    "LOCATION_MAP" VARCHAR2(256 BYTE), 
    "REGION_ID" NUMBER(*,0), 
    "DISTRICT_ID" NUMBER(*,0), 
    "ENG_ADDR_HINT" VARCHAR2(100 BYTE), 
    "CHT_ADDR_HINT" NVARCHAR2(50), 
    "CHS_ADDR_HINT" NVARCHAR2(50), 
    "LOCATION_ID" VARCHAR2(10 BYTE), 
    "FORM_OFFICE_CODE" VARCHAR2(10 BYTE), 
    "OFF_HR_SAT_START2" VARCHAR2(4 BYTE), 
    "OFF_HR_SAT_END2" VARCHAR2(4 BYTE), 
    "OFF_HR_SUN_START1" VARCHAR2(4 BYTE), 
    "OFF_HR_SUN_END1" VARCHAR2(4 BYTE), 
    "OFF_HR_SUN_START2" VARCHAR2(4 BYTE), 
    "OFF_HR_SUN_END2" VARCHAR2(4 BYTE), 
    "ENG_OFF_HR_WD_NOTE" VARCHAR2(100 BYTE), 
    "ENG_OFF_HR_SAT_NOTE" VARCHAR2(100 BYTE), 
    "ENG_OFF_HR_SUN_NOTE" VARCHAR2(100 BYTE), 
    "CHT_OFF_HR_WD_NOTE" NVARCHAR2(100), 
    "CHT_OFF_HR_SAT_NOTE" NVARCHAR2(100), 
    "CHT_OFF_HR_SUN_NOTE" NVARCHAR2(100), 
    "CHS_OFF_HR_WD_NOTE" NVARCHAR2(100), 
    "CHS_OFF_HR_SAT_NOTE" NVARCHAR2(100), 
    "CHS_OFF_HR_SUN_NOTE" NVARCHAR2(100), 
    "CAPACITY" NUMBER(2,0), 
    "WP_CODE" VARCHAR2(3 BYTE), 
    "FILEMN_OFFICE_CODE" VARCHAR2(10 BYTE), 
    "EFFECTIVE_DATE" DATE, 
    "UPDATE_FLAG" VARCHAR2(1 BYTE), 
    "ACTION_TYPE" VARCHAR2(10 BYTE)
   ) ;
 

   COMMENT ON COLUMN "UM_OFFICE"."SECTION_CODE" IS '"Section code on the QUOTA_PLAN.  An unique constraint is required on this field."';
 
   COMMENT ON COLUMN "UM_OFFICE"."CREATE_AT" IS 'Create date time of this record';
 
   COMMENT ON COLUMN "UM_OFFICE"."MODIFY_AT" IS 'Last modified date time of this record';
 
   COMMENT ON COLUMN "UM_OFFICE"."MODIFY_BY" IS '"Last modified party of this record:  I - IVRS W - Web client O - Others"';
 
   COMMENT ON COLUMN "UM_OFFICE"."ENG_OFF_NAME" IS 'Office name in English';
 
   COMMENT ON COLUMN "UM_OFFICE"."CHT_OFF_NAME" IS 'Office name in Traditional Chinese';
 
   COMMENT ON COLUMN "UM_OFFICE"."CHS_OFF_NAME" IS 'Office name in Simplified Chinese';
 
   COMMENT ON COLUMN "UM_OFFICE"."ENG_ADDR" IS 'Address of the office in English';
 
   COMMENT ON COLUMN "UM_OFFICE"."CHT_ADDR" IS 'Address of the office in Traditional Chinese';
 
   COMMENT ON COLUMN "UM_OFFICE"."CHS_ADDR" IS 'Address of the office in Simplified Chinese';
 
   COMMENT ON COLUMN "UM_OFFICE"."TEL_NUM" IS 'Telephone number of the office';
 
   COMMENT ON COLUMN "UM_OFFICE"."FAX_NUM" IS 'Fax number of the office (if any)';
 
   COMMENT ON COLUMN "UM_OFFICE"."OFF_HR_WD_START1" IS 'The office start time for weekday AM in hhmm';
 
   COMMENT ON COLUMN "UM_OFFICE"."OFF_HR_WD_END1" IS 'The office end time for weekday AM in hhmm';
 
   COMMENT ON COLUMN "UM_OFFICE"."OFF_HR_WD_START2" IS 'The office start time for weekday PM in hhmm';
 
   COMMENT ON COLUMN "UM_OFFICE"."OFF_HR_WD_END2" IS 'The office end time for weekday PM in hhmm';
 
   COMMENT ON COLUMN "UM_OFFICE"."OFF_HR_SAT_START1" IS 'The office start time for weekday AM in hhmm';
 
   COMMENT ON COLUMN "UM_OFFICE"."OFF_HR_SAT_END1" IS 'The office end time for weekday AM in hhmm';
 
   COMMENT ON COLUMN "UM_OFFICE"."LOCATION_MAP" IS 'The URL of the location map of the office.';
 
   COMMENT ON COLUMN "UM_OFFICE"."REGION_ID" IS 'Specify the region the office belongs such as Hong Kong Island, Kowloon or New Territories.';
 
   COMMENT ON COLUMN "UM_OFFICE"."DISTRICT_ID" IS 'Specify the district the office belongs such as Wan Chai, Central, Shueng Wan, etc.';
 
   COMMENT ON COLUMN "UM_OFFICE"."ENG_ADDR_HINT" IS 'The hint in English to reach the office';
 
   COMMENT ON COLUMN "UM_OFFICE"."CHT_ADDR_HINT" IS 'The hint in Traditional Chinese to reach the office';
 
   COMMENT ON COLUMN "UM_OFFICE"."CHS_ADDR_HINT" IS 'The hint in Simplified Chinese to reach the office';
 
   COMMENT ON COLUMN "UM_OFFICE"."LOCATION_ID" IS 'The location id sent from e-Passport thru the interface file.';
 
   COMMENT ON COLUMN "UM_OFFICE"."FORM_OFFICE_CODE" IS 'Related Office Code in PDF Form define';
 
   COMMENT ON COLUMN "UM_OFFICE"."OFF_HR_SAT_START2" IS 'The office start time for Sat PM in hhmm';
 
   COMMENT ON COLUMN "UM_OFFICE"."OFF_HR_SAT_END2" IS 'The office end time for Sat PM in hhmm';
 
   COMMENT ON COLUMN "UM_OFFICE"."OFF_HR_SUN_START1" IS 'The office start time for Sun AM in hhmm';
 
   COMMENT ON COLUMN "UM_OFFICE"."OFF_HR_SUN_END1" IS 'The office end time for Sun AM in hhmm';
 
   COMMENT ON COLUMN "UM_OFFICE"."OFF_HR_SUN_START2" IS 'The office start time for Sun PM in hhmm';
 
   COMMENT ON COLUMN "UM_OFFICE"."OFF_HR_SUN_END2" IS 'The office end time for Sun PM in hhmm';
 
   COMMENT ON COLUMN "UM_OFFICE"."ENG_OFF_HR_WD_NOTE" IS 'The english note for working date.';
 
   COMMENT ON COLUMN "UM_OFFICE"."ENG_OFF_HR_SAT_NOTE" IS 'The english note for Sat.';
 
   COMMENT ON COLUMN "UM_OFFICE"."ENG_OFF_HR_SUN_NOTE" IS 'The english note for Sunday';
 
   COMMENT ON COLUMN "UM_OFFICE"."CHT_OFF_HR_WD_NOTE" IS 'The traditional chinese note for working date.';
 
   COMMENT ON COLUMN "UM_OFFICE"."CHT_OFF_HR_SAT_NOTE" IS 'The traditional chinese note for Sat.';
 
   COMMENT ON COLUMN "UM_OFFICE"."CHT_OFF_HR_SUN_NOTE" IS 'The traditional chinese note for Sun.';
 
   COMMENT ON COLUMN "UM_OFFICE"."CHS_OFF_HR_WD_NOTE" IS 'The simple chinese note for working date.';
 
   COMMENT ON COLUMN "UM_OFFICE"."CHS_OFF_HR_SAT_NOTE" IS 'The simple chinese note for Sat.';
 
   COMMENT ON COLUMN "UM_OFFICE"."CHS_OFF_HR_SUN_NOTE" IS 'The simple chinese note for Sun.';
 
   COMMENT ON COLUMN "UM_OFFICE"."CAPACITY" IS 'The capacity of office.';
 
   COMMENT ON COLUMN "UM_OFFICE"."WP_CODE" IS 'wedding place code';
 
   COMMENT ON COLUMN "UM_OFFICE"."FILEMN_OFFICE_CODE" IS 'office code for FILEMN on corresponding wedding place.';
 
   COMMENT ON COLUMN "UM_OFFICE"."EFFECTIVE_DATE" IS 'effective Date for temp table data to real table';
 
   COMMENT ON COLUMN "UM_OFFICE"."UPDATE_FLAG" IS 'check for update ';
 
   COMMENT ON COLUMN "UM_OFFICE"."ACTION_TYPE" IS 'action for temp table to real table -ADD, DELETE, UPDATE';
 
   COMMENT ON TABLE "UM_OFFICE"  IS 'Temporary table of OFFICE table';


  ALTER TABLE "UM_OFFICE" MODIFY ("CREATE_AT" NOT NULL ENABLE);
 
  ALTER TABLE "UM_OFFICE" MODIFY ("MODIFY_AT" NOT NULL ENABLE);
 
  ALTER TABLE "UM_OFFICE" MODIFY ("MODIFY_BY" NOT NULL ENABLE);
 
  ALTER TABLE "UM_OFFICE" MODIFY ("ENG_OFF_NAME" NOT NULL ENABLE);
 
  ALTER TABLE "UM_OFFICE" MODIFY ("CHT_OFF_NAME" NOT NULL ENABLE);
 
  ALTER TABLE "UM_OFFICE" MODIFY ("CHS_OFF_NAME" NOT NULL ENABLE);
 
  ALTER TABLE "UM_OFFICE" MODIFY ("ENG_ADDR" NOT NULL ENABLE);
 
  ALTER TABLE "UM_OFFICE" MODIFY ("CHT_ADDR" NOT NULL ENABLE);
 
  ALTER TABLE "UM_OFFICE" MODIFY ("CHS_ADDR" NOT NULL ENABLE);
 
  ALTER TABLE "UM_OFFICE" MODIFY ("TEL_NUM" NOT NULL ENABLE);
 
  ALTER TABLE "UM_OFFICE" MODIFY ("OFF_HR_WD_START1" NOT NULL ENABLE);
 
  ALTER TABLE "UM_OFFICE" MODIFY ("OFF_HR_WD_END1" NOT NULL ENABLE);
 
  ALTER TABLE "UM_OFFICE" MODIFY ("OFF_HR_SAT_START1" NOT NULL ENABLE);
 
  ALTER TABLE "UM_OFFICE" MODIFY ("OFF_HR_SAT_END1" NOT NULL ENABLE);
 
  ALTER TABLE "UM_OFFICE" MODIFY ("LOCATION_MAP" NOT NULL ENABLE);
 
  ALTER TABLE "UM_OFFICE" MODIFY ("REGION_ID" NOT NULL ENABLE);
 
  ALTER TABLE "UM_OFFICE" MODIFY ("DISTRICT_ID" NOT NULL ENABLE);
 
  ALTER TABLE "UM_OFFICE" MODIFY ("OFFICE_CODE" NOT NULL ENABLE);
  
  ALTER TABLE "UM_OFFICE" ADD CONSTRAINT "UM_OFFICE_PK" PRIMARY KEY ("OFFICE_CODE");