--------------------------------------------------------
--  DDL for Table UM_ROLE
--------------------------------------------------------

  CREATE TABLE "UM_ROLE"
   (	"ROLE_ID" VARCHAR2(4 BYTE), 
	"ROLE_DESC" VARCHAR2(128 BYTE), 
	"DELEGATE_PRI" VARCHAR2(1 BYTE), 
	"DISPLAY_POS" VARCHAR2(2 BYTE)
   ) ;

  ALTER TABLE "UM_ROLE" MODIFY ("ROLE_ID" NOT NULL ENABLE);
 
  ALTER TABLE "UM_ROLE" ADD CONSTRAINT "UM_ROLE_PK" PRIMARY KEY ("ROLE_ID");


Insert into UM_ROLE (ROLE_ID,ROLE_DESC,DELEGATE_PRI,DISPLAY_POS) values ('R01','description',null,null);
Insert into UM_ROLE (ROLE_ID,ROLE_DESC,DELEGATE_PRI,DISPLAY_POS) values ('R02','description',null,null);
Insert into UM_ROLE (ROLE_ID,ROLE_DESC,DELEGATE_PRI,DISPLAY_POS) values ('R03','description',null,null);
Insert into UM_ROLE (ROLE_ID,ROLE_DESC,DELEGATE_PRI,DISPLAY_POS) values ('R04','description',null,null);
Insert into UM_ROLE (ROLE_ID,ROLE_DESC,DELEGATE_PRI,DISPLAY_POS) values ('R05','description',null,null);


