USE QLSV

IF OBJECT_ID('Student', 'P') IS NOT NULL
	DROP PROCEDURE Student_P
GO

CREATE PROCEDURE Student_P
AS
	SELECT * FROM Student;
GO

EXEC Student_P;

IF OBJECT_ID('Student_ChangeName', 'P') IS NOT NULL
	DROP PROCEDURE Student_ChangeName
GO

CREATE PROCEDURE Student_ChangeName
	@StudentID varchar(50),
	@StudentName varchar(50)
AS
	UPDATE Student
	SET [Student name] = @StudentName
	WHERE [Student ID] = @StudentID;
	
GO

SELECT * FROM Student
EXEC Student_ChangeName 'SE161718', 'Nguyen Van B' 
SELECT * FROM Student
EXEC Student_ChangeName @StudentName='Nguyen Van B', @StudentID='SE123456'