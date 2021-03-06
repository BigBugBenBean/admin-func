
  CREATE TABLE "UM_ROLE_GROUP"
   (	
    "ROLE_ID" VARCHAR2(4 BYTE), 
	"GROUP_ID" VARCHAR2(16 BYTE)
   );

  ALTER TABLE "UM_ROLE_GROUP" MODIFY ("ROLE_ID" NOT NULL ENABLE);
 
  ALTER TABLE "UM_ROLE_GROUP" MODIFY ("GROUP_ID" NOT NULL ENABLE);
 
  ALTER TABLE "UM_ROLE_GROUP" ADD CONSTRAINT "UM_ROLE_GROUP_PK" PRIMARY KEY ("ROLE_ID", "GROUP_ID");

Insert into UM_ROLE_GROUP (ROLE_ID,GROUP_ID) values ('R01','TestGroup01');
Insert into UM_ROLE_GROUP (ROLE_ID,GROUP_ID) values ('R01','TestGroup02');
Insert into UM_ROLE_GROUP (ROLE_ID,GROUP_ID) values ('R01','TestGroup03');
Insert into UM_ROLE_GROUP (ROLE_ID,GROUP_ID) values ('R02','TestGroup02');
Insert into UM_ROLE_GROUP (ROLE_ID,GROUP_ID) values ('R02','TestGroup04');
Insert into UM_ROLE_GROUP (ROLE_ID,GROUP_ID) values ('R03','TestGroup05');