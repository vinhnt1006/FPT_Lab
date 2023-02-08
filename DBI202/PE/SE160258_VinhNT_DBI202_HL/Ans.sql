--HLSU--
--1
create table Buildings (
BuildingCode varchar(10) primary key,
Name nvarchar(50),
[Address] nvarchar(100)
)

create table Rooms (
DoorNumber int primary key,
[Floor] int,
BuildingCode varchar(10) foreign key references Buildings(BuildingCode)
)

create table Departments (
DepartmentID int primary key,
Name nvarchar(100),
DoorNumber int foreign key references Rooms(DoorNumber),
)

--2 (% (start/end),_ (startwith_endwith), [] or, [^] not like)  
select * from OfficeAssignment
where Location like '%Adams'

--3
select o.CourseID, c.Title, c.Credits, c.DepartmentID, o.URL from OnlineCourse o, Course c
where o.CourseID = c.CourseID
order by DepartmentID asc, Title asc

--4
with t as (
select * from Person where Discriminator = 'Instructor'),
s as (
select p.PersonID, p.LastName, p.FirstName, p.HireDate, p.Discriminator, i.CourseID from t p left join CourseInstructor i
on p.PersonID = i.PersonID)
select s.*, c.Title, c.DepartmentID from s left join Course c
on c.CourseID = s.CourseID
order by DepartmentID desc, Title asc

--5
with t as (
select c.CourseID, c.Title, c.Credits, c.DepartmentID, count(i.CourseID) as 'NumberOfInstructors'from Course c left join CourseInstructor i
on c.CourseID = i.CourseID
group by c.CourseID, c.Title, c.Credits, c.DepartmentID),
s as (
select c.CourseID, count(s.CourseID) as 'NumberOfStudents' from Course c left join StudentGrade s
on c.CourseID = s.CourseID
group by c.CourseID)
select t.*, s.NumberOfStudents from t, s
where t.CourseID = s.CourseID
order by DepartmentID asc, NumberOfStudents desc, Title asc

--6
with t as (
select d.DepartmentID, d.Name, count(d.DepartmentID) as 'NumberOfOnsiteCourses' from Department d, Course c, OnsiteCourse o
where c.CourseID = o.CourseID
and d.DepartmentID = c.DepartmentID
group by d.DepartmentID, d.Name)
select * from t where t.NumberOfOnsiteCourses <= all(select t.NumberOfOnsiteCourses from t)

--7
with t as (
select CourseID, max(Grade) as 'MaxGrade' from StudentGrade
group by CourseID),
a as (
select s.CourseID, p.PersonID, p.LastName, p.FirstName, p.Discriminator, s.Grade from StudentGrade s, Person p, t
where s.StudentID = p.PersonID
and s.CourseID = t.CourseID and s.Grade = t.MaxGrade),
b as (
select c.CourseID, c.Title, c.Credits, d.Name as 'DepartmentName' from Course c, Department d
where c.DepartmentID = d.DepartmentID)
select b.*, a.PersonID, a.LastName, a.FirstName, a.Discriminator, a.Grade from b left join a
on b.CourseID = a.CourseID
order by DepartmentName asc, Title asc, FirstName asc

--8
create proc Proc1
(
@studentID int,
@numberOfOnlineCourses int output
)
as
begin
set @numberOfOnlineCourses = (select count(o.CourseID) from StudentGrade s, OnlineCourse o where StudentID = @studentID and s.CourseID = o.CourseID)
end

declare @x int
execute Proc1 2, @x output
select @x as NumberOfOnlineCourses

--9
create trigger insertCourseIntructor on CourseInstructor for insert
as
begin
select i.CourseID, c.Title, i.PersonID, p.FirstName, p.LastName from inserted i, Course c, Person p
where i.CourseID = c.CourseID and i.PersonID = p.PersonID
end

insert into CourseInstructor(CourseID, PersonID)
values(3141, 27)

--10
insert into Course(CourseID, Title, Credits, DepartmentID) values (1070, 'Mechanics', 3, 1)
insert into OnlineCourse(CourseID, URL) values (1070, 'http://www.fineartschool.net/Mechanics')
