--------------------------------------------------------
--  DDL for Table UM_GROUP_FUNC
--------------------------------------------------------

  CREATE TABLE "UM_GROUP_FUNC"
   (	"GROUP_ID" VARCHAR2(16 BYTE), 
	"FUNC_ID" VARCHAR2(8 BYTE)
   )  ;

  ALTER TABLE "UM_GROUP_FUNC" MODIFY ("GROUP_ID" NOT NULL ENABLE);
 
  ALTER TABLE "UM_GROUP_FUNC" MODIFY ("FUNC_ID" NOT NULL ENABLE);
 
  ALTER TABLE "UM_GROUP_FUNC" ADD CONSTRAINT "UM_GROUP_FUNC_PK" PRIMARY KEY ("GROUP_ID", "FUNC_ID");


Insert into UM_GROUP_FUNC (GROUP_ID,FUNC_ID) values ('TestGroup01','EC01');
Insert into UM_GROUP_FUNC (GROUP_ID,FUNC_ID) values ('TestGroup01','EC05');
Insert into UM_GROUP_FUNC (GROUP_ID,FUNC_ID) values ('TestGroup01','EC12');
Insert into UM_GROUP_FUNC (GROUP_ID,FUNC_ID) values ('TestGroup01','EC13');
Insert into UM_GROUP_FUNC (GROUP_ID,FUNC_ID) values ('TestGroup02','EC02');
Insert into UM_GROUP_FUNC (GROUP_ID,FUNC_ID) values ('TestGroup02','RM01');
Insert into UM_GROUP_FUNC (GROUP_ID,FUNC_ID) values ('TestGroup03','EC03');
Insert into UM_GROUP_FUNC (GROUP_ID,FUNC_ID) values ('TestGroup03','EC11');
Insert into UM_GROUP_FUNC (GROUP_ID,FUNC_ID) values ('TestGroup03','SM01');
Insert into UM_GROUP_FUNC (GROUP_ID,FUNC_ID) values ('TestGroup05','EC04');

