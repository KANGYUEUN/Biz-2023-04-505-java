-- 여기는 memo 사용자 화면

CREATE TABLE tbl_memo (
    m_seq	    NUMBER		    PRIMARY KEY,
    m_writer	nVARCHAR2(20)	NOT NULL,	
    m_date  	VARCHAR2(10),		
    m_subject	nVARCHAR2(20),		
    m_content	nVARCHAR2(400)	
);

INSERT INTO tbl_memo(m_seq, m_writer, m_date, m_subject, m_content)
VALUES('1','강유은','2023-05-26','일상메모','오늘은 SQL에 대해 배웠다.');

INSERT INTO tbl_memo(m_seq, m_writer, m_date, m_subject, m_content)
VALUES('2','강유은','2023-05-26','할일메모','토요일은 리허설 티칭 가야함.');

INSERT INTO tbl_memo(m_seq, m_writer, m_date, m_subject, m_content)
VALUES('3','강유은','2023-05-26','약속메모','일요일은 동명동에서 약속!.');

INSERT INTO tbl_memo(m_seq, m_writer, m_date, m_subject, m_content)
VALUES('4','강유은','2023-05-26','삭제연습','삭제연습 !.');


SELECT * FROM tbl_memo;

SELECT m_seq, m_writer, m_date, m_subject, m_content FROM tbl_memo;

SELECT m_seq, m_writer FROM tbl_memo;
SELECT m_seq, m_writer FROM tbl_memo WHERE m_writer = '강유은';

SELECT m_seq, m_writer, m_date, m_subject, m_content FROM tbl_memo
ORDER BY m_content;
SELECT m_seq, m_writer, m_date, m_subject, m_content FROM tbl_memo
ORDER BY m_subject, m_content;

UPDATE tbl_memo SET m_content ='토요일은 합동연습 티칭'
WHERE m_seq = '2';

-- 삭제연습
SELECT * FROM tbl_memo WHERE m_seq = '4';
DELETE FROM tbl_memo WHERE m_seq = '4';

COMMIT;