  CREATE TABLE "UM_PRICE_BOOK"
   (	"APP_ID" VARCHAR2(3 BYTE) NOT NULL ENABLE,
	"SUB_TYPE" VARCHAR2(10 BYTE) NOT NULL ENABLE,
	"CREATE_AT" TIMESTAMP (6) DEFAULT SYSDATE NOT NULL ENABLE,
	"MODIFY_AT" TIMESTAMP (6) DEFAULT SYSDATE NOT NULL ENABLE,
	"MODIFY_BY" VARCHAR2(1 BYTE) NOT NULL ENABLE,
	"VALID_FROM" DATE NOT NULL ENABLE,
	"VALID_TO" DATE NOT NULL ENABLE,
	"AMOUNT" NUMBER(7,2) NOT NULL ENABLE,
	"ENG_NAME" VARCHAR2(60 BYTE),
	"CHT_NAME" VARCHAR2(50),
	"CHS_NAME" VARCHAR2(50),
	"ARN_APP_CODE" VARCHAR2(2 BYTE),
	"PRICE_TYPE" VARCHAR2(10 BYTE),
	"PAYMENT_CODE" VARCHAR2(3 BYTE)
   );


   COMMENT ON COLUMN "UM_PRICE_BOOK"."APP_ID" IS ''The foreign key of APPLICATION_CODE table.'';

   COMMENT ON COLUMN "UM_PRICE_BOOK"."SUB_TYPE" IS ''The application defined sub type for application with multiple prices.'';

   COMMENT ON COLUMN "UM_PRICE_BOOK"."CREATE_AT" IS ''Create date time of this record'';

   COMMENT ON COLUMN "UM_PRICE_BOOK"."MODIFY_AT" IS ''Last modified date time of this record'';

   COMMENT ON COLUMN "UM_PRICE_BOOK"."MODIFY_BY" IS ''Last modified party of this record:
I - IVRS
W - Web client
O - Others'';

   COMMENT ON COLUMN "UM_PRICE_BOOK"."VALID_FROM" IS ''The valid start date (included the date specified) for the application fee'';

   COMMENT ON COLUMN "UM_PRICE_BOOK"."VALID_TO" IS ''The valid end date (included the date specified) for the application fee'';

   COMMENT ON COLUMN "UM_PRICE_BOOK"."AMOUNT" IS ''The application fee'';

   COMMENT ON COLUMN "UM_PRICE_BOOK"."ENG_NAME" IS ''The English description of the price sub type'';

   COMMENT ON COLUMN "UM_PRICE_BOOK"."CHT_NAME" IS ''The Traditional Chinese description of the price sub type'';

   COMMENT ON COLUMN "UM_PRICE_BOOK"."CHS_NAME" IS ''The Simplified Chinese description of the price sub type'';

   COMMENT ON COLUMN "UM_PRICE_BOOK"."ARN_APP_CODE" IS ''The application code on the ARN that mapping to the price.'';

   COMMENT ON COLUMN "UM_PRICE_BOOK"."PRICE_TYPE" IS ''The price type used on the PDF form.'';


Insert into UM_PRICE_BOOK (APP_ID,SUB_TYPE,CREATE_AT,MODIFY_AT,MODIFY_BY,VALID_FROM,VALID_TO,AMOUNT,ENG_NAME,CHT_NAME,CHS_NAME,ARN_APP_CODE,PRICE_TYPE,PAYMENT_CODE) values ('640','COPY',to_timestamp('01-JUN-16 10.20.00.000000000','DD-MON-RR HH24.MI.SSXFF'),to_timestamp('26-AUG-16 15.54.49.000000000','DD-MON-RR HH24.MI.SSXFF'),'W',to_date('13-OCT-06','DD-MON-RR'),to_date('31-DEC-99','DD-MON-RR'),680,'Fee for a Certificate of Absence of Marriage Record',null,null,'CX','GC','001');
Insert into UM_PRICE_BOOK (APP_ID,SUB_TYPE,CREATE_AT,MODIFY_AT,MODIFY_BY,VALID_FROM,VALID_TO,AMOUNT,ENG_NAME,CHT_NAME,CHS_NAME,ARN_APP_CODE,PRICE_TYPE,PAYMENT_CODE) values ('641','SEARCH',to_timestamp('01-JUN-16 10.20.00.000000000','DD-MON-RR HH24.MI.SSXFF'),to_timestamp('26-AUG-16 15.54.49.000000000','DD-MON-RR HH24.MI.SSXFF'),'W',to_date('13-OCT-06','DD-MON-RR'),to_date('31-DEC-99','DD-MON-RR'),140,'Fee for Search of Marriage Records',null,null,'CX','G','002');

