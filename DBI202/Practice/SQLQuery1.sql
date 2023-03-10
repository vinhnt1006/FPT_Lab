
SELECT empSSN, COUNT (*) AS SLDuAn
From tblWorksOn
Group by empSSN

SELECT e.empSSN, e.empName, e.empSalary, d.depName, r3.SLDuAn
FROM  tblEmployee e, tblDepartment d,
(SELECT *
FROM 
		(SELECT empSSN, COUNT (*) AS SLDuAn
		From tblWorksOn
		Group by empSSN) r2
WHERE SLDuAn = 
						(SELECT MAX(SLDuAn)
						FROM 
								(SELECT empSSN, COUNT (*) AS SLDuAn
								From tblWorksOn
								Group by empSSN) r1))r3
WHERE r3.empSSN = e.empSSN AND e.depNum = d.depNum



SELECT *
FROM tblEmployee , tblDepartment
WHERE tblEmployee.depNum=tblDepartment.depNum
	AND tblDepartment.depName=N'Phòng phần mềm trong nước'
----------------------------------------------------------

SELECT *
FROM tblDependent, tblEmployee 
WHERE tblDependent.empSSN=tblEmployee.empSSN
	AND tblEmployee.empName=N'Mai Duy An'
----------------------------------------------------------

SELECT *
FROM tblDependent d1 , tblEmployee e, tblDepartment d2
WHERE d1.empSSN=e.empSSN AND e.depNum=d2.depNum
	AND d2.depName=N'phòng phần mềm trong nước'
----------------------------------------------------------
	
SELECT *
FROM tblDependent d1 , tblEmployee e, tblDepartment d2
WHERE d1.empSSN=e.empSSN AND e.empSSN=d2.mgrSSN
	AND d2.depname=N'phòng phần mềm trong nước'
----------------------------------------------------------

SELECT *
FROM tblDependent d1, tblEmployee e, tblDepartment d2
WHERE d1.empSSN=e.empSSN AND e.depNum=d2.mgrSSN
	AND d2.depName=N'phòng phần mềm trong nước'
	AND d1.depRelationship = 'Con'
	AND d1.depSex = 'F'
----------------------------------------------------------

SELECT *
FROM tblDependent d1, tblDepartment d2
WHERE d1.empSSN=d2.mgrSSN
	AND d2.depName=N'phòng phần mềm trong nước'
----------------------------------------------------------

SELECT *
FROM tblEmployee e, tblWorksOn w, tblProject p, tblDepartment d
WHERE d.depNum = e.depNum
AND e.empSSN = w.empSSN
AND w.proNum = p.proNum
AND d.depName=N'phòng phần mềm trong nước'
AND p.proName = N'ProjectA'
----------------------------------------------------------

SELECT *
FROM tblEmployee e, tblDepartment d, tblProject p
WHERE d.depnum=e.depNum
	AND d.depNum=p.proNum
	AND d.depName=N'phòng phần mềm trong nước'
	AND p.proname=N'ProjectA'

SELECT tblEmployee.*
FROM tblEmployee
WHERE depNum = 
								(SELECT depNum
								FROM tblDepartment
								WHERE depName=N'phòng phần mềm trong nước')
								
SELECT *
FROM tblDependent
WHERE empSSN = 
								(SELECT empSSN
								FROM tblEmployee
								WHERE empName=N'Mai Duy An')
								
								
								
SELECT *
FROM tblDependent
WHERE empSSN IN
								(SELECT empSSN
								FROM tblEmployee
								WHERE depNum IN
																(SELECT depNum
																FROM tblDepartment
																WHERE depName=N'phòng phần mềm trong nước'))


SELECT *
FROM tblEmployee
WHERE empSalary >= ALL
												(SELECT empSalary
												FROM tblEmployee)
												
SELECT *
FROM tblEmployee
WHERE empSalary <= ALL
												(SELECT empSalary
												FROM tblEmployee)
												
SELECT *
FROM tblEmployee e
EXCEPT
				(SELECT *
				FROM tblEmployee e2
				WHERE e2.empSalary <= ALL
															(SELECT empSalary
															FROM tblEmployee))
															
															
SELECT DISTINCT e1.*
FROM tblEmployee e1, tblEmployee e2
WHERE e1.empSalary > e2.empSalary



SELECT *
FROM tblEmployee e2
WHERE e2.empSalary > ANY
											(SELECT empSalary
											FROM tblEmployee)
											
											
									
SELECT tblEmployee.*
FROM tblEmployee ,
						(SELECT depNum
						FROM tblDepartment
						WHERE depName=N'phòng phần mềm trong nước') r1
WHERE tblEmployee.depNum = r1.depNum

USE FUH_COMPANY
SELECT *
FROM tblEmployee e JOIN tblDepartment d
	ON e.depNum=d.depNum
WHERE d.depName=N'Phòng phần mềm trong nước'

SELECT e.*
FROM tblEmployee e JOIN 
						(SELECT depNum
						FROM tblDepartment
						WHERE depName=N'phòng phần mềm trong nước') r1
ON e.depNum = r1.depNum

SELECT tblEmployee.*
FROM tblEmployee , 
	(SELECT depNum
	FROM tblDepartment
	WHERE depName=N'Phòng phần mềm trong nước') r1
WHERE tblEmployee.depNum=r1.depNum

SELECT e.*
FROM tblEmployee e JOIN 
	(SELECT depNum
	FROM tblDepartment
	WHERE depName=N'Phòng phần mềm trong nước') r1
ON e.depNum=r1.depNum
/*1*/
SELECT *
FROM	tblEmployee
WHERE	empSalary > 50000;

----------------------------------------------------------
/*2*/
SELECT	empName, empSalary
FROM	tblEmployee
WHERE	empSalary > 50000;

SELECT	*
FROM	tblEmployee

SELECT	TOP 5 *
FROM	tblEmployee

SELECT	*
FROM	tblEmployee

SELECT	TOP 5 PERCENT *
FROM	tblEmployee

SELECT DISTINCT *
FROM	tblEmployee

SELECT	DISTINCT empAddress, empSex
FROM	tblEmployee

SELECT	DISTINCT empAddress
FROM	tblEmployee

----------------------------------------------------------
/*3*/
SELECT	empName AS 'H? và Tên', empSalary AS 'L??ng'
FROM	tblEmployee
WHERE	empSalary > 50000;

----------------------------------------------------------
/*4*/
SELECT 	empName AS 'H? và tên', empSex  AS 'Gi? tính' , YEAR(GETDATE()) - YEAR(empBirthdate) AS 'Tu?i'
FROM 	tblEmployee
WHERE 	(empSex='F' AND (YEAR(GETDATE()) - YEAR(empBirthdate)) < 40)
	OR
		(empSex='M' AND (YEAR(GETDATE()) - YEAR(empBirthdate)) < 50);

----------------------------------------------------------
/*5.1*/
SELECT 	*
FROM 	tblEmployee
WHERE 	empName = N'Võ Vi?t Anh';

----------------------------------------------------------
/*5.2*/
SELECT 	*
FROM 	tblEmployee
WHERE 	empName LIKE N'%Anh';

SELECT 	*
FROM 	tblEmployee
WHERE 	empName LIKE N'Nguy?n%';

----------------------------------------------------------
/*5.3 chu?i có ch?a d?u %*/
SELECT 	empName AS 'H? và tên', empSex  AS 'Gi? tính' , YEAR(GETDATE()) - YEAR(empBirthdate) AS 'Tu?i'
FROM 	tblEmployee
WHERE 	empName LIKE '%@%%' ESCAPE '@';

SELECT 	empName AS 'H? và tên', empSex  AS 'Gi? tính' , YEAR(GETDATE()) - YEAR(empBirthdate) AS 'Tu?i'
FROM 	tblEmployee
WHERE 	empName LIKE '%!%%' ESCAPE '!';

/*5.4 chu?i b?t ??u và k?t thúc v?i d?u % */
SELECT 	empName AS 'H? và tên', empSex  AS 'Gi? tính' , YEAR(GETDATE()) - YEAR(empBirthdate) AS 'Tu?i'
FROM 	tblEmployee
WHERE 	empName LIKE 'x%%x%' ESCAPE 'x';

----------------------------------------------------------
/* Trong SQL Server, không ch? ??nh t? khóa DATE cho chu?i giá tr? h?ng ngày, mà ch? ??n thu?n là chu?i 'yyyy-mm-dd' d?ng ngày */
SELECT 	empName,empBirthdate, YEAR(GETDATE()) - YEAR(empBirthdate) AS 'Tu?i'
FROM 	tblEmployee
WHERE	empBirthdate='1968-02-17';

----------------------------------------------------------
/*6*/
SELECT 	*
FROM 	tblEmployee
ORDER BY depNum ASC, empSalary DESC;

----------------------------------------------------------
/*7*/
SELECT 	*
FROM 	tblEmployee, tblDepartment
WHERE	tblEmployee.depNum=tblDepartment.depNum AND tblDepartment.depName LIKE N'Phòng ph?n m?m trong n??c';


SELECT 	*
FROM 	tblEmployee e, tblDepartment d
WHERE	e.depNum=d.depNum AND d.depName LIKE N'Phòng ph?n m?m trong n??c';

----------------------------------------------------------
/*9*/
SELECT 	DISTINCT w1.proNum AS 'Project Number'
FROM 	tblWorksOn  w1, tblWorksOn  w2
WHERE	w1.proNum=w2.proNum AND w1.empSSN<>w2.empSSN

SELECT 	e1.empName AS 'Employee Name', e2.empName AS 'Supervisor Name', e1.supervisorSSN, e2.empSSN
FROM 	tblEmployee e1, tblEmployee e2
WHERE	e1.empName=N'Mai Duy An' AND e1.supervisorSSN=e2.empSSN

----------------------------------------------------------
/*10.1*/
SELECT 	* FROM tblEmployee WHERE empName LIKE 'H%'
UNION
SELECT 	* FROM tblEmployee WHERE empSalary > 80000

SELECT *
FROM tblEmployee
WHERE empName LIKE 'H%'
OR empSalary > 80000
----------------------------------------------------------
/*10.2*/

SELECT empSSN FROM tblEmployee
EXCEPT
SELECT supervisorSSN FROM tblEmployee


SELECT empSSN
FROM tblEmployee
WHERE empSSN NOT IN
								(SELECT supervisorSSN 
								FROM tblEmployee
								WHERE supervisorSSN IS NOT NULL)


SELECT empSSN, empSalary, empName
FROM tblEmployee
WHERE empSSN IN
									(SELECT 	empSSN FROM tblEmployee
									EXCEPT
									SELECT 	supervisorSSN FROM tblEmployee)


SELECT e.empSSN, e.empSalary, e.empName
FROM tblEmployee e,
					(SELECT empSSN FROM tblEmployee
					EXCEPT
					SELECT supervisorSSN FROM tblEmployee) r1
WHERE e.empSSN = r1.empSSN
									
									
									
SELECT empSSN, empSalary, empName
FROM tblEmployee
WHERE empSSN IN
							(SELECT supervisorSSN FROM tblEmployee)
							
							

----------------------------------------------------------
--T1: mọi nhân viên thuộc phòng phòng phần mềm trong nước
SELECT e.*
FROM tblEmployee e, tblDepartment d
WHERE d.depnum=e.depNum
	AND d.depName=N'phòng phần mềm trong nước'
--T2: mọi nhân viên tham gia dự án có tên là ProjectA
INTERSECT
SELECT e.*
FROM tblEmployee e, tblWorksOn w, tblProject p
WHERE e.empSSN=w.empSSN 
	AND w.proNum=p.proNum 
	AND p.proname=N'ProjectA'

/*10.3*/
SELECT 	empSSN 
FROM 	tblWorksOn w, tblProject p
WHERE 	w.proNum=p.proNum AND p.proName='ProjectB'
INTERSECT
SELECT 	empSSN 
FROM 	tblWorksOn w, tblProject p
WHERE 	w.proNum=p.proNum AND p.proName='ProjectC'


SELECT *
FROM tblWorksOn w1, tblProject p1,
			tblWorksOn w2, tblProject p2
WHERE w1.proNum = p1.proNum AND w2.proNum = p2.proNum
				AND p1.proName='ProjectB' AND p2.proName='ProjectC'
				AND w1.empSSN = w2.empSSN
----------------------------------------------------------
/*11*/
SELECT 	*
FROM 	tblEmployee e, tblDepartment d
WHERE	e.depNum=d.depNum AND d.depName LIKE N'Phòng ph?n m?m trong n??c';
--
SELECT 	*
FROM 	tblEmployee
WHERE 	depNum = (SELECT depNum 
					FROM tblDepartment 
					WHERE depName=N'Phòng ph?n m?m trong n??c');
SELECT 	*
FROM 	tblEmployee
WHERE 	depNum = ANY (SELECT depNum 
					FROM tblDepartment 
					WHERE depName=N'Phòng ph?n m?m trong n??c');
SELECT 	*
FROM 	tblEmployee
WHERE 	depNum IN (SELECT depNum 
					FROM tblDepartment 
					WHERE depName=N'Phòng ph?n m?m trong n??c');

USE FUH_COMPANY
--Nhân viên l??ng cao nh?t/th?p nh?t
SELECT 	*
FROM 	tblEmployee
WHERE 	empSalary>=ALL (SELECT  empSalary
					FROM  tblEmployee);

SELECT 	*
FROM 	tblEmployee
WHERE 	empSalary<=ALL (SELECT  empSalary
					FROM  tblEmployee);
----------------------------------------------------------
/*12*/
SELECT *
FROM 	tblProject 
WHERE 	locNum = (SELECT locNum
				FROM tblProject 
				WHERE proName='ProjectA');

----------------------------------------------------------
/*13*/
SELECT 	*
FROM 	tblEmployee
WHERE 	depNum = (SELECT depNum 
					FROM tblDepartment 
					WHERE depName=N'Phòng ph?n m?m trong n??c');
--cùng k?t qu?
SELECT 	*
FROM 	tblEmployee e, (SELECT depNum 
					FROM tblDepartment 
					WHERE depName=N'Phòng ph?n m?m trong n??c') d
WHERE 	e.depNum=d.depNum

----------------------------------------------------------
/*15.1 theta join with equation condition */
SELECT *
FROM tblDepartment d JOIN tblEmployee e ON d.depNum=e.depNum

SELECT *
FROM	tblDependent d JOIN tblEmployee e ON d.empSSN=e.empSSN

----------------------------------------------------------
/*15.2 theta join with other condition */
SELECT *
FROM	tblDependent d JOIN tblEmployee e ON d.empSSN<>e.empSSN

SELECT *
FROM	tblDependent d JOIN tblEmployee e ON d.empSSN>e.empSSN

----------------------------------------------------------
/*15.3 cross join */
SELECT *
FROM	tblDependent CROSS JOIN tblEmployee

----------------------------------------------------------
/*17.1*/
SELECT l.locNum, l.locName, p.proNum, p.proName
FROM tblLocation l LEFT OUTER JOIN tblProject p ON l.locNum=p.locNum

SELECT *
FROM	tblEmployee e LEFT OUTER JOIN tblDependent d ON e.empSSN=d.empSSN

SELECT *
FROM	tblDependent d RIGHT OUTER JOIN tblEmployee e ON e.empSSN=d.empSSN

----------------------------------------------------------
/*17.2*/
SELECT d.depName, p.proName
FROM tblDepartment d LEFT OUTER JOIN tblProject p ON d.depNum=p.depNum

----------------------------------------------------------
/*17.3*/
SELECT l.locNum, l.locName
FROM tblLocation l JOIN tblProject p ON l.locNum=p.locNum

SELECT l.locNum, l.locName
FROM tblLocation l JOIN tblProject p ON l.locNum=p.locNum

----------------------------------------------------------
/*18.1*/
SELECT AVG(empSalary) AS Average_Of_Salary
FROM tblEmployee

----------------------------------------------------------
/*18.2*/
SELECT COUNT(*) AS Count_Of_Employees
FROM tblEmployee

SELECT AVG(empSalary)
FROM tblEmployee
GROUP BY depNum

SELECT depNum, AVG(empSalary) AS TBLuong
FROM tblEmployee
GROUP BY depNum

SELECT depNum, COUNT(*) AS SLNV
FROM tblEmployee
GROUP BY depNum

SELECT depNum, AVG(empSalary) AS TBLuong
FROM tblEmployee
WHERE empSex = 'M'
GROUP BY depNum

SELECT d.depNum, d.depName, AVG(e.empSalary) AS TBLuong
FROM tblEmployee e , tblDepartment d
WHERE e.depNum=d.depNum
	AND e.empSex='M'
GROUP BY d.depNum, d.depName

SELECT d.depNum, MIN(d.depName), AVG(e.empSalary) AS TBLuong
FROM tblEmployee e , tblDepartment d
WHERE e.depNum=d.depNum
	AND e.empSex='M'
GROUP BY d.depNum

SELECT d.depNum, d.depName, r1.TBLuong
FROM tblDepartment d, 
								(SELECT depNum, AVG(e.empSalary) AS TBLuong
								FROM tblEmployee e
								WHERE e.empSex='M'
								GROUP BY depNum) r1
WHERE r1.depNum = d.depNum

SELECT *
FROM
	(SELECT depNum, AVG(empSalary) AS TBLuong
	FROM tblEmployee
	WHERE empSex='M'
	GROUP BY depNum) r1
WHERE r1.TBLuong > 90000

SELECT depNum, AVG(empSalary) AS TBLuong
FROM tblEmployee
WHERE empSex='M'
GROUP BY depNum
HAVING AVG(empSalary) > 90000
----------------------------------------------------------
/*19.1, 19.2*/
SELECT *
FROM tblEmployee
ORDER BY depNum

SELECT depNum, COUNT(empSSN) AS Num_Of_Employees
FROM 	tblEmployee
GROUP BY depNum
ORDER BY COUNT(*) ASC

SELECT depNum, COUNT(*) AS Num_Of_Employees
FROM 	tblEmployee
GROUP BY depNum
ORDER BY COUNT(*) ASC

----------------------------------------------------------
/*20*/
SELECT proNum, COUNT(empSSN) AS Number_Of_Employees, SUM(workHours) AS Total_OfworkHours
FROM  tblWorksOn 
GROUP BY proNum

----------------------------------------------------------
/*21*/
SELECT depNum, AVG(empSalary)  AS Average_Of_Salary
FROM  tblEmployee
GROUP BY depNum
HAVING AVG(empSalary) > 80000

SELECT proNum, COUNT(empSSN) AS Number_Of_Employees, SUM(workHours) AS Total_OfworkHours
FROM  tblWorksOn 
GROUP BY proNum
HAVING COUNT(empSSN)>4

SELECT proNum, COUNT(empSSN) AS Number_Of_Employees, SUM(workHours) AS Total_OfworkHours
FROM  tblWorksOn 
GROUP BY proNum
HAVING AVG(workHours)>20

SELECT proNum, COUNT(empSSN) AS Number_Of_Employees, SUM(workHours) AS Total_OfworkHours
FROM  tblWorksOn 
GROUP BY proNum
HAVING proNum=4

----------------------------------------------------------
/*22*/
SELECT	* 
FROM	tblDepartment

INSERT INTO tblDepartment(depNum,depName)
VALUES(6, N'Phòng K? Toán');

SELECT	* 
FROM	tblDepartment

INSERT INTO tblDepartment
VALUES(7, N'Phòng Nhân S?', NULL, NULL);

SELECT	* 
FROM	tblDepartment

----------------------------------------------------------
/*23*/
DELETE 
FROM	tblDepartment
WHERE	depName=N'Phòng K? Toán'

DELETE 
FROM	tblDepartment
WHERE	depNum=7

SELECT	* 
FROM	tblDepartment

----------------------------------------------------------
/*24*/
SELECT	*
FROM	tblEmployee
WHERE	empName=N'Mai Duy An'

UPDATE	tblEmployee
SET		empSalary=empSalary+5000, depNum=2
WHERE	empName=N'Mai Duy An'

----------------------------------------------------------
/*25*/
SELECT	empName, empSalary
FROM	tblEmployee
WHERE	depNum IN
				(SELECT	depNum
				FROM	tblDepartment
				WHERE	depName=N'Phòng Ph?n m?m trong n??c')

UPDATE	tblEmployee
SET	empSalary=empSalary*1.1
WHERE	depNum IN
				(SELECT	depNum
				FROM	tblDepartment
				WHERE	depName=N'Phòng Ph?n m?m trong n??c')


