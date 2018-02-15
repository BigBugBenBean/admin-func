create table UM_ACCESS_CONTROL_BLACK_LIST (
	AC_ID NUMBER not null,
	AC_IP varchar2(15 char),
	AC_LIST varchar2(20 char),
	AC_NAME varchar2(50 char),
	CHANNEL varchar2(10 char),
	EFFECT_DATE_FROM timestamp,
	EFFECT_DATE_TO timestamp,
	primary key (AC_ID)
)


 