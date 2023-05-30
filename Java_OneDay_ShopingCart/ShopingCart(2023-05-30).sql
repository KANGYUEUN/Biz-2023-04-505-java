-- 여기는 shopingcart 사용자 화면

-- 상품정보 table
CREATE TABLE tbl_product (
    pCode	VARCHAR2(13)		PRIMARY KEY,
    pName	nVARCHAR2(50)	    NOT NULL,	
    pItem	VARCHAR2(10)	    NOT NULL,	
    pIPrice	NUMBER,		
    pOPrice	NUMBER		
);

-- 고객정보 table
CREATE TABLE tbl_buyer (
    buId	VARCHAR2(10)		PRIMARY KEY,
    buName	nVARCHAR2(20)	    NOT NULL,	
    buTel	VARCHAR2(10),		
    buAddr	nVARCHAR2(125)		
);

-- 판매내역 table
CREATE TABLE tbl_iolist (
    ioSEQ	NUMBER		    PRIMARY KEY,
    ioDate	VARCHAR2(10),		
    ioTime	VARCHAR2(10),		
    ioBuid	NUMBER	        NOT NULL,	
    ioPCode	VARCHAR2(13)	NOT NULL,	
    ioQuan	NUMBER,		
    ioPrice	NUMBER		
);

-- < tbl_buyer CRUD 구현하기 >
-- 전화번호 문자열 추가 
ALTER TABLE tbl_buyer MODIFY(buTel VARCHAR2(20));

-- 고객 정보 추가
INSERT INTO tbl_buyer(buId, buName, buTel, buAddr)
VALUES('0000000001','홍길동','010-1111-1111','광주광역시 서구 풍암동');

INSERT INTO tbl_buyer(buId, buName, buTel, buAddr)
VALUES('0000000002','성춘향','010-2222-2222','광주광역시 북구 용봉동');

INSERT INTO tbl_buyer(buId, buName, buTel, buAddr)
VALUES('0000000003','이몽룡','010-3333-3333','광주광역시 남구 봉선동');

-- 고객정보 전체 데이터 중에서 고객 이름순으로 정렬하기 
SELECT buId, buName, buTel, buAddr
FROM tbl_buyer
ORDER BY buName;
-- 고객정보 데이터 조회하기
SELECT * FROM tbl_buyer;
-- 전체 칼럼중 고객ID와 주소만 보여주기
SELECT buId, buAddr FROM tbl_buyer;
-- 고객이름으로 정렬하고 전화번호로 한번더 정렬하기
SELECT buId, buName, buTel, buAddr
FROM tbl_buyer
ORDER BY buName, buTel;

-- 고객정보 업데이트 
SELECT * FROM tbl_buyer
WHERE buName = '홍길동';
-- 홍길동 고객의 PK0000000001 확인 후 변경
UPDATE tbl_buyer SET buTel ='010-1234-1234'
WHERE buId = '0000000001';

SELECT * FROM tbl_buyer;
COMMIT;

-- < tbl_product  CRUD 구현하기 >
-- 상품 정보 추가 하기
INSERT INTO tbl_product(pCode, pName, pItem, pIPrice, pOPrice)
VALUES('8801234567890','오징어칩','과자류','1000','1220');

INSERT INTO tbl_product(pCode, pName, pItem, pIPrice, pOPrice)
VALUES('8801224569930','연어스테이크','식품','9000','10980');

INSERT INTO tbl_product(pCode, pName, pItem, pIPrice, pOPrice)
VALUES('8801235568910','버섯모둠','야채','5000','6100');

-- 상품코드 순으로 조회하기
SELECT pCode, pName, pItem, pIPrice, pOPrice
FROM tbl_product
ORDER BY pCode;

-- 상품 수정하기 
SELECT * FROM tbl_product WHERE pName = '오징어칩';
UPDATE tbl_product SET pName = '꼬북이칩'
WHERE pCode = '8801234567890';
-- 수정된 테이블 확인 하기 
SELECT * FROM tbl_product;

COMMIT;

-- < tbl_iolist CRUD 구현하기 >
-- 판매내역 정보 추가하기
INSERT INTO tbl_iolist(ioSEQ, ioDate, ioTime, ioBuid, ioPCode, ioQuan, ioPrice)
VALUES('1','2023-05-30','11:50:23','0000000001','8801234567890','2','1220');

INSERT INTO tbl_iolist(ioSEQ, ioDate, ioTime, ioBuid, ioPCode, ioQuan, ioPrice)
VALUES('2','2023-05-29','12:10:10','0000000002','8801224569930','1','10980');

INSERT INTO tbl_iolist(ioSEQ, ioDate, ioTime, ioBuid, ioPCode, ioQuan, ioPrice)
VALUES('3','2023-05-28','14:30:22','0000000003','8801235568910','3','6100');

-- 판매내역 정보 조회하기
SELECT * FROM tbl_iolist;
-- 판매 시간별 조회
SELECT ioSEQ, ioDate, ioTime, ioBuid, ioPCode, ioQuan, ioPrice
FROM tbl_iolist
ORDER BY ioTime;
-- 판매 수량 수정하기 
SELECT * FROM tbl_iolist WHERE ioSEQ = '3';

UPDATE tbl_iolist SET ioQuan = '2'
WHERE ioSEQ = '2';
-- 수정된 테이블 확인 하기 
SELECT * FROM tbl_iolist;

COMMIT;
