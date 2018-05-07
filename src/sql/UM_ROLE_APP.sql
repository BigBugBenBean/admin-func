--------------------------------------------------------
--  DDL for Table UM_ROLE_APP
--------------------------------------------------------

  CREATE TABLE "UM_ROLE_APP"
   (	"ROLE_ID" VARCHAR2(10 BYTE), 
	"APP_ID" VARCHAR2(4 BYTE)
   );

  COMMENT ON COLUMN "UM_ROLE_APP"."ROLE_ID" IS 'User Id of Mapping in UM_ROLE table and UM_Applicaton_ID Table';
 
  COMMENT ON COLUMN "UM_ROLE_APP"."APP_ID" IS 'App Id of Mapping in UM_ROLE table and UM_Applicaton_ID Table';
  
  ALTER TABLE "UM_ROLE_APP" MODIFY ("ROLE_ID" NOT NULL ENABLE);
 
  ALTER TABLE "UM_ROLE_APP" MODIFY ("APP_ID" NOT NULL ENABLE);
 
  ALTER TABLE "UM_ROLE_APP" ADD CONSTRAINT "UM_ROLE_APP_PK" PRIMARY KEY ("ROLE_ID", "APP_ID")
