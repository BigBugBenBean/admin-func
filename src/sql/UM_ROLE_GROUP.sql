--------------------------------------------------------
--  DDL for Table UM_ROLE_GROUP
--------------------------------------------------------

  CREATE TABLE "UM_ROLE_GROUP"
   (	
    "ROLE_ID" VARCHAR2(10 BYTE), 
	"GROUP_ID" VARCHAR2(4 BYTE)
   );

  ALTER TABLE "UM_ROLE_GROUP" MODIFY ("ROLE_ID" NOT NULL ENABLE);
 
  ALTER TABLE "UM_ROLE_GROUP" MODIFY ("GROUP_ID" NOT NULL ENABLE);
 
  ALTER TABLE "UM_ROLE_GROUP" ADD CONSTRAINT "UM_ROLE_GROUP_PK" PRIMARY KEY ("ROLE_ID", "GROUP_ID");
  