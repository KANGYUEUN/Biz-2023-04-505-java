-- 관리자로 로그인 한 화면

CREATE TABLESPACE memo
DATAFILE 'C:/app/data.dbf'
SIZE 1M AUTOEXTEND ON NEXT 1K;

ALTER SESSION SET "_ORACLE_SCRIPT" = true;
CREATE USER memo IDENTIFIED BY 12341234
DEFAULT TABLESPACE memo;

GRANT DBA TO memo;
