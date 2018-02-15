    create table UM_FREE_TEXT_TEMPLATE (
        FTT_ID varchar2(4 char) not null,
        CHS_APP_NAME varchar2(50 char),
        CHT_APP_NAME varchar2(50 char),
        ENG_APP_NAME varchar2(480 char),
        FTT_NAME varchar2(100 char),
        primary key (FTT_ID)
    )
