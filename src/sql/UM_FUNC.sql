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




