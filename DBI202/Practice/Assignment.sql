USE QLSV

/*1*/
SELECT gr.*
FROM	Student st, Subject sj, Grade gr
WHERE st.[Student ID] = sj.[Student ID] AND sj.[Subject ID] = gr.[Subject ID]
----------------------------------------------------------

/*2*/
SELECT sc.*
FROM	Subject st, Register re, Schedule sc
WHERE st.[Student ID] = re.[Student ID] AND re.Slot = sc.Slot
----------------------------------------------------------

/*3*/
SELECT 	*
FROM 	Grade gr
WHERE 	gr.Grade >=ALL 
					(SELECT  Grade
					FROM  Grade);
----------------------------------------------------------

/*4*/
SELECT *
FROM Schedule, Grade
WHERE Status = 'Attended' AND Grade >= 5.0
----------------------------------------------------------

/*5*/
INSERT INTO Student
VALUES ('SE161718', 'Nguyen Van A', 'DBI202', 'Database');
----------------------------------------------------------

/*6*/
UPDATE Subject
SET [Student ID] = 'SE123456', [Student Name]= 'Tran Van B'
WHERE [Student ID] = 'SE161718';
----------------------------------------------------------

/*7*/
DELETE FROM Student WHERE [Student ID]='SE123456';
----------------------------------------------------------

/*8*/
INSERT INTO Student
VALUES ('SE161616', 'Nguyen Van An', 'DBI202', 'Database');
----------------------------------------------------------

/*9*/
UPDATE Subject
SET [Student ID] = 'SE167890', [Student Name]= 'Tran Van B'
WHERE [Student ID] = 'SE161616';
----------------------------------------------------------

/*10*/
DELETE FROM Student WHERE [Student ID]='SE167890';
----------------------------------------------------------