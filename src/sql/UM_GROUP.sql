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
