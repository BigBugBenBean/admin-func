--------------------------------------------------------
--  DDL for Table UM_GROUP_FUNC
--------------------------------------------------------

  CREATE TABLE "UM_GROUP_FUNC"
   (	"GROUP_ID" VARCHAR2(16 BYTE), 
	"FUNC_ID" VARCHAR2(8 BYTE)
   )  ;

  ALTER TABLE "UM_GROUP_FUNC" MODIFY ("GROUP_ID" NOT NULL ENABLE);
 
  ALTER TABLE "UM_GROUP_FUNC" MODIFY ("FUNC_ID" NOT NULL ENABLE);
 
  ALTER TABLE "UM_GROUP_FUNC" ADD CONSTRAINT "UM_GROUP_FUNC_PK" PRIMARY KEY ("GROUP_ID", "FUNC_ID")
