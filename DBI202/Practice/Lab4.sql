--1
SELECT DISTINCT d.depNum ,d.depName 
FROM 
				(SELECT dl.locNum,d.depNum 
				FROM tblDepartment d, tblDepLocation dl
				WHERE d.depName=N'Phòng Nghiên cứu và phát triển'
				AND d.depNum = dl.depNum) r,tblDepartment d, tblDepLocation dl 
WHERE dl.locNum = r.locNum AND dl.depNum != r.depNum AND d.depNum = dl.depNum;

--2
SELECT depName, depSex
FROM tblDependent
WHERE empSSN IN 
				(SELECT DISTINCT supervisorSSN
				FROM tblEmployee
				WHERE supervisorSSN IS NOT NULL);

--3
SELECT e.empSSN, e.empName, d.depName
FROM  tblEmployee e, tblDepartment d
WHERE e.empSSN IN 
		(SELECT empSSN 
		FROM tblWorksOn
		GROUP BY empSSN
		HAVING COUNT(*) > 3)
AND e.empSSN = d.mgrSSN;

--4
SELECT e.empSSN, empName, totalOfHours
FROM (
			SELECT empSSN, SUM(workHours) AS totalOfHours
			FROM tblWorksOn
			WHERE empSSN NOT IN 
						(SELECT empSSN 
						FROM tblDependent)
			GROUP BY empSSN) r,
			tblEmployee e
WHERE e.empSSN = r.empSSN;

--5
SELECT empSSN, empName, empSalary 
FROM tblEmployee 
WHERE empSSN IN 
				(SELECT DISTINCT supervisorSSN 
				FROM tblEmployee
				WHERE supervisorSSN IS NOT NULL)
AND empSSN NOT IN 
				(SELECT DISTINCT empSSN 
				FROM tblWorksOn);
