
  CREATE TABLE "UMAUDIT_ACCESS"
   (	"ACCESS_ID" NUMBER,
	"SESSION_ID" VARCHAR2(100 BYTE),
	"ACTION_TYPE" VARCHAR2(10 BYTE),
	"FUNCID" VARCHAR2(8 BYTE),
	"USERID" VARCHAR2(8 BYTE),
	"LOG_DATETIME" TIMESTAMP (6),
	"OFFICE_CODE" VARCHAR2(10 BYTE)
   );



   COMMENT ON COLUMN "UMAUDIT_ACCESS"."ACCESS_ID" IS 'Primary Key ACCESS_ID';
   COMMENT ON COLUMN "UMAUDIT_ACCESS"."SESSION_ID" IS 'The unique id for a submission/session. ';
   COMMENT ON COLUMN "UMAUDIT_ACCESS"."ACTION_TYPE" IS 'Action Type. E.g. LOGIN, LOGOUT, FUNCTION';
   COMMENT ON COLUMN "UMAUDIT_ACCESS"."FUNCID" IS 'Function ID if ACTION_TYPE is FUNCTION, null otherwise';
   COMMENT ON COLUMN "UMAUDIT_ACCESS"."USERID" IS 'The unique id to identify the user';
   COMMENT ON COLUMN "UMAUDIT_ACCESS"."LOG_DATETIME" IS 'Record the logging time';
   COMMENT ON COLUMN "UMAUDIT_ACCESS"."OFFICE_CODE" IS 'Office Code of Mapping in OFFICE Table';


Insert into UMAUDIT_ACCESS (ACCESS_ID,SESSION_ID,ACTION_TYPE,FUNCID,USERID,LOG_DATETIME,OFFICE_CODE) values (20000,'123451234512345','FAIL',null,'S',to_timestamp('01-MAR-18 10.39.14.000000000','DD-MON-RR HH24.MI.SSXFF'),'DM');
Insert into UMAUDIT_ACCESS (ACCESS_ID,SESSION_ID,ACTION_TYPE,FUNCID,USERID,LOG_DATETIME,OFFICE_CODE) values (20001,'123451234512345','FAIL',null,'S',to_timestamp('01-MAR-18 10.39.18.000000000','DD-MON-RR HH24.MI.SSXFF'),'DM');
Insert into UMAUDIT_ACCESS (ACCESS_ID,SESSION_ID,ACTION_TYPE,FUNCID,USERID,LOG_DATETIME,OFFICE_CODE) values (20002,'123451234512345','FAIL',null,'S',to_timestamp('01-MAR-18 10.39.21.000000000','DD-MON-RR HH24.MI.SSXFF'),'DM');
Insert into UMAUDIT_ACCESS (ACCESS_ID,SESSION_ID,ACTION_TYPE,FUNCID,USERID,LOG_DATETIME,OFFICE_CODE) values (20003,'123451234512345','LOGIN',null,'S',to_timestamp('01-MAR-18 10.39.33.000000000','DD-MON-RR HH24.MI.SSXFF'),'DM');
Insert into UMAUDIT_ACCESS (ACCESS_ID,SESSION_ID,ACTION_TYPE,FUNCID,USERID,LOG_DATETIME,OFFICE_CODE) values (20004,'123451234512345','FUNCTION','AFE001','S',to_timestamp('01-MAR-18 10.40.08.000000000','DD-MON-RR HH24.MI.SSXFF'),'DM');
Insert into UMAUDIT_ACCESS (ACCESS_ID,SESSION_ID,ACTION_TYPE,FUNCID,USERID,LOG_DATETIME,OFFICE_CODE) values (20005,'123451234512345','FUNCTION','AFE001','S',to_timestamp('01-MAR-18 10.40.14.000000000','DD-MON-RR HH24.MI.SSXFF'),'DM');




  CREATE TABLE "UMAUDIT_ACCESS_SEARCH"
   (	"ACCESS_ID" NUMBER NOT NULL ENABLE,
	"SEARCH_TABLE" VARCHAR2(50 BYTE),
	"SEARCH_FIELD_NAME" VARCHAR2(50 BYTE),
	"SEARCH_FIELD_VALUE" VARCHAR2(4000 BYTE),
	"SEARCH_RESULT" VARCHAR2(1 BYTE)
   );



   COMMENT ON COLUMN "UMAUDIT_ACCESS_SEARCH"."ACCESS_ID" IS 'ACCESS_ID of Mapping in UMAUDIT_ACCESS';
   COMMENT ON COLUMN "UMAUDIT_ACCESS_SEARCH"."SEARCH_TABLE" IS 'Searching table';
   COMMENT ON COLUMN "UMAUDIT_ACCESS_SEARCH"."SEARCH_FIELD_NAME" IS 'Searching field';
   COMMENT ON COLUMN "UMAUDIT_ACCESS_SEARCH"."SEARCH_FIELD_VALUE" IS 'Searching value';
   COMMENT ON COLUMN "UMAUDIT_ACCESS_SEARCH"."SEARCH_RESULT" IS 'Y: Hit; N: No hit';



Insert into UMAUDIT_ACCESS_SEARCH (ACCESS_ID,SEARCH_TABLE,SEARCH_FIELD_NAME,SEARCH_FIELD_VALUE,SEARCH_RESULT) values (20005,'ABC','Office Code','ROP-KO','Y');
Insert into UMAUDIT_ACCESS_SEARCH (ACCESS_ID,SEARCH_TABLE,SEARCH_FIELD_NAME,SEARCH_FIELD_VALUE,SEARCH_RESULT) values (20005,'ABC','Office Code','ROP-KO','Y');
Insert into UMAUDIT_ACCESS_SEARCH (ACCESS_ID,SEARCH_TABLE,SEARCH_FIELD_NAME,SEARCH_FIELD_VALUE,SEARCH_RESULT) values (20005,'ABC','Appointment Date','27/04/2017','Y');
Insert into UMAUDIT_ACCESS_SEARCH (ACCESS_ID,SEARCH_TABLE,SEARCH_FIELD_NAME,SEARCH_FIELD_VALUE,SEARCH_RESULT) values (20005,'ABC','Appointment Type','S','Y');



  CREATE TABLE "UMAUDIT_TRANS"
   (	"TRANS_ID" NUMBER,
	"FUNCID" VARCHAR2(8 BYTE),
	"USERID" VARCHAR2(8 BYTE),
	"LOG_DATETIME" TIMESTAMP (6),
	"OFFICE_CODE" VARCHAR2(10 BYTE)
   );



   COMMENT ON COLUMN "UMAUDIT_TRANS"."TRANS_ID" IS 'TRANS_ID of Mapping in UMAUDIT_TRANS';
   COMMENT ON COLUMN "UMAUDIT_TRANS"."FUNCID" IS 'Function ID';
   COMMENT ON COLUMN "UMAUDIT_TRANS"."USERID" IS 'The unique id to identify the applicant/user';
   COMMENT ON COLUMN "UMAUDIT_TRANS"."LOG_DATETIME" IS 'The time when the access record is created';
   COMMENT ON COLUMN "UMAUDIT_TRANS"."OFFICE_CODE" IS 'Office Code of Mapping in OFFICE Table';


Insert into UMAUDIT_TRANS (TRANS_ID,FUNCID,USERID,LOG_DATETIME,OFFICE_CODE) values (10000,'IAM001','S',to_timestamp('01-MAR-18 10.26.24.000000000','DD-MON-RR HH24.MI.SSXFF'),'DM');
Insert into UMAUDIT_TRANS (TRANS_ID,FUNCID,USERID,LOG_DATETIME,OFFICE_CODE) values (10001,'ABC001','S',to_timestamp('01-MAR-18 10.32.52.000000000','DD-MON-RR HH24.MI.SSXFF'),'DM');
Insert into UMAUDIT_TRANS (TRANS_ID,FUNCID,USERID,LOG_DATETIME,OFFICE_CODE) values (10002,'ABC001','S',to_timestamp('01-MAR-18 10.35.18.000000000','DD-MON-RR HH24.MI.SSXFF'),'DM');



  CREATE TABLE "UMAUDIT_TRANS_DETAIL"
   (	"TRANS_ID" NUMBER NOT NULL ENABLE,
	"ACTION_TYPE" VARCHAR2(10 BYTE),
	"TABLE_NAME" VARCHAR2(50 BYTE),
	"KEY_FIELD_NAME" VARCHAR2(50 BYTE),
	"KEY_FIELD_VALUE" VARCHAR2(50 BYTE),
	"DETAIL_FIELD_NAME" VARCHAR2(50 BYTE),
	"DETAIL_FIELD_VALUE_OLD" VARCHAR2(2000 BYTE),
	"DETAIL_FIELD_VALUE_NEW" VARCHAR2(2000 BYTE)
   );



   COMMENT ON COLUMN "UMAUDIT_TRANS_DETAIL"."TRANS_ID" IS 'Primary Key TRANS_ID';
   COMMENT ON COLUMN "UMAUDIT_TRANS_DETAIL"."ACTION_TYPE" IS 'Action Type. INSERT, UPDATE or DELETE';
   COMMENT ON COLUMN "UMAUDIT_TRANS_DETAIL"."TABLE_NAME" IS 'Table name';
   COMMENT ON COLUMN "UMAUDIT_TRANS_DETAIL"."KEY_FIELD_NAME" IS 'The field name for identifying the record';
   COMMENT ON COLUMN "UMAUDIT_TRANS_DETAIL"."KEY_FIELD_VALUE" IS 'The value of the field for identifying the record';
   COMMENT ON COLUMN "UMAUDIT_TRANS_DETAIL"."DETAIL_FIELD_NAME" IS 'The field name of the field under change';
   COMMENT ON COLUMN "UMAUDIT_TRANS_DETAIL"."DETAIL_FIELD_VALUE_OLD" IS 'The old value of the field';
   COMMENT ON COLUMN "UMAUDIT_TRANS_DETAIL"."DETAIL_FIELD_VALUE_NEW" IS 'The new value of the field';



Insert into UMAUDIT_TRANS_DETAIL (TRANS_ID,ACTION_TYPE,TABLE_NAME,KEY_FIELD_NAME,KEY_FIELD_VALUE,DETAIL_FIELD_NAME,DETAIL_FIELD_VALUE_OLD,DETAIL_FIELD_VALUE_NEW) values (10000,'INSERT','AC_WHITE_LIST','seq','40','whiteList',null,'93949413');
Insert into UMAUDIT_TRANS_DETAIL (TRANS_ID,ACTION_TYPE,TABLE_NAME,KEY_FIELD_NAME,KEY_FIELD_VALUE,DETAIL_FIELD_NAME,DETAIL_FIELD_VALUE_OLD,DETAIL_FIELD_VALUE_NEW) values (10000,'INSERT','AC_WHITE_LIST','seq','40','channel',null,'I');
Insert into UMAUDIT_TRANS_DETAIL (TRANS_ID,ACTION_TYPE,TABLE_NAME,KEY_FIELD_NAME,KEY_FIELD_VALUE,DETAIL_FIELD_NAME,DETAIL_FIELD_VALUE_OLD,DETAIL_FIELD_VALUE_NEW) values (10000,'INSERT','AC_WHITE_LIST','seq','40','effStartTime',null,'21/02/2017 00:00:00');
Insert into UMAUDIT_TRANS_DETAIL (TRANS_ID,ACTION_TYPE,TABLE_NAME,KEY_FIELD_NAME,KEY_FIELD_VALUE,DETAIL_FIELD_NAME,DETAIL_FIELD_VALUE_OLD,DETAIL_FIELD_VALUE_NEW) values (10000,'INSERT','AC_WHITE_LIST','seq','40','effEndTime',null,'31/12/2099 00:00:00');
Insert into UMAUDIT_TRANS_DETAIL (TRANS_ID,ACTION_TYPE,TABLE_NAME,KEY_FIELD_NAME,KEY_FIELD_VALUE,DETAIL_FIELD_NAME,DETAIL_FIELD_VALUE_OLD,DETAIL_FIELD_VALUE_NEW) values (10001,'UPDATE','AC_GLOBAL_PARM','parmName','MAX_TRANS','parmValue','1000','10000');
Insert into UMAUDIT_TRANS_DETAIL (TRANS_ID,ACTION_TYPE,TABLE_NAME,KEY_FIELD_NAME,KEY_FIELD_VALUE,DETAIL_FIELD_NAME,DETAIL_FIELD_VALUE_OLD,DETAIL_FIELD_VALUE_NEW) values (10001,'UPDATE','AC_GLOBAL_PARM','parmName','MAX_APM','parmValue','100','1000');
Insert into UMAUDIT_TRANS_DETAIL (TRANS_ID,ACTION_TYPE,TABLE_NAME,KEY_FIELD_NAME,KEY_FIELD_VALUE,DETAIL_FIELD_NAME,DETAIL_FIELD_VALUE_OLD,DETAIL_FIELD_VALUE_NEW) values (10002,'DELETE','AC_WHITE_LIST','seq','40',null,null,null);









/*
// old version
CREATE TABLE "UM_AUDIT_TRAIL_SEARCH" 
(
    "AUDIT_TRAIL_ID" Number, 
    "USER_ID" VARCHAR2(2000 BYTE), 
    "ACTION_TYPE" VARCHAR2(10 BYTE), 
    "FUNC_ID" VARCHAR2(4 BYTE), 
    "OFFICE_CODE" VARCHAR2(4 BYTE), 
    "LOG_DATETIME" TIMESTAMP, 
    "JSESSIONID" VARCHAR2(40 BYTE),
    "IMMD_TOKEN" VARCHAR2(32 BYTE), 
    "SEQ_NO" NUMBER, 
    "SEARCH_TABLE_NAME" VARCHAR2(100 BYTE), 
    "SEARCH_FIELD_NAME" VARCHAR2(100 BYTE), 
    "SEARCH_VALUE" VARCHAR2(4000 BYTE),
    "SEARCH_RESULT" VARCHAR2(1 BYTE)
);


COMMENT ON COLUMN "UM_AUDIT_TRAIL_SEARCH"."AUDIT_TRAIL_ID" IS 'Primary key of UM_AUDIT_TRAIL_SEARCH';
COMMENT ON COLUMN "UM_AUDIT_TRAIL_SEARCH"."USER_ID" IS 'The unique id to identify the applicant/user';
COMMENT ON COLUMN "UM_AUDIT_TRAIL_SEARCH"."ACTION_TYPE" IS 'S = Search Actin, C = Create Action, U = Update Action';
COMMENT ON COLUMN "UM_AUDIT_TRAIL_SEARCH"."OFFICE_CODE" IS 'Office Code of Mapping in OFFICE Table';
COMMENT ON COLUMN "UM_AUDIT_TRAIL_SEARCH"."LOG_DATETIME" IS 'Record the logging time';
COMMENT ON COLUMN "UM_AUDIT_TRAIL_SEARCH"."JSESSIONID" IS 'The unique id for a submission/session. ';COMMENT ON COLUMN "UM_AUDIT_TRAIL_SEARCH"."SEQ_NO" IS 'The sequence number of the searching criteria';
COMMENT ON COLUMN "UM_AUDIT_TRAIL_SEARCH"."SEARCH_TABLE_NAME" IS 'Searching table';
COMMENT ON COLUMN "UM_AUDIT_TRAIL_SEARCH"."SEARCH_FIELD_NAME" IS 'Searching field';
COMMENT ON COLUMN "UM_AUDIT_TRAIL_SEARCH"."SEARCH_VALUE" IS 'Searching value';
COMMENT ON COLUMN "UM_AUDIT_TRAIL_SEARCH"."SEARCH_RESULT" IS 'Y = Hit; N = No Hit';

CREATE TABLE "UM_AUDIT_TRAIL_ACTION" 
(
    "AUDIT_TRAIL_ID" Number, 
    "USER_ID" VARCHAR2(2000 BYTE), 
    "ACTION_TYPE" VARCHAR2(10 BYTE), 
    "FUNC_ID" VARCHAR2(4 BYTE), 
    "OFFICE_CODE" VARCHAR2(4 BYTE), 
    "LOG_DATETIME" TIMESTAMP, 
    "JSESSIONID" VARCHAR2(40 BYTE),
    "IMMD_TOKEN" VARCHAR2(32 BYTE), 
    "SEQ_NO" NUMBER, 
    "TABLE_NAME" VARCHAR2(100 BYTE), 
    "FIELD_NAME" VARCHAR2(100 BYTE), 
    "VALUE_OLD" VARCHAR2(4000 BYTE), 
    "VALUE_NEW" VARCHAR2(4000 BYTE)
);
COMMENT ON COLUMN "UM_AUDIT_TRAIL_ACTION"."AUDIT_TRAIL_ID" IS 'Primary key of UM_AUDIT_TRAIL_ACTION';
COMMENT ON COLUMN "UM_AUDIT_TRAIL_ACTION"."USER_ID" IS 'The unique id to identify the applicant/user';
COMMENT ON COLUMN "UM_AUDIT_TRAIL_ACTION"."ACTION_TYPE" IS 'S = Search Actin, C = Create Action, U = Update Action';
COMMENT ON COLUMN "UM_AUDIT_TRAIL_ACTION"."OFFICE_CODE" IS 'Office Code of Mapping in OFFICE Table';
COMMENT ON COLUMN "UM_AUDIT_TRAIL_ACTION"."LOG_DATETIME" IS 'Record the logging time';
COMMENT ON COLUMN "UM_AUDIT_TRAIL_ACTION"."JSESSIONID" IS 'The unique id for a submission/session. ';
COMMENT ON COLUMN "UM_AUDIT_TRAIL_ACTION"."SEQ_NO" IS 'The sequence number of the update elements';
COMMENT ON COLUMN "UM_AUDIT_TRAIL_ACTION"."TABLE_NAME" IS 'Affect table';
COMMENT ON COLUMN "UM_AUDIT_TRAIL_ACTION"."FIELD_NAME" IS 'Affect field';
COMMENT ON COLUMN "UM_AUDIT_TRAIL_ACTION"."VALUE_OLD" IS 'Old value';
COMMENT ON COLUMN "UM_AUDIT_TRAIL_ACTION"."VALUE_NEW" IS 'New value';
*/


