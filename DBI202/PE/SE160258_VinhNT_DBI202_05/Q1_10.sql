--Q1
Create table Departments(
	DeptID varchar(20) primary key,
	name nvarchar(200),
	office nvarchar(100)
)

Create table Employees(
	EmpCode varchar(20) primary key,
	Name nvarchar(50),
	BirthDate date,
	DeptID varchar(20) foreign key references Departments(DeptID)
)

Create table Dependants(
	Number int primary key,
	Name nvarchar(50),
	BirthDate Date,
	Role nvarchar(30),
	EmpCode varchar(20) foreign key references Employees(EmpCode)
)

--Q2
Select *
from ProductSubcategory
where Category = 'Accessories'

--Q3
Select ProductID, Name, Color, Cost, Price, SellEndDate
From Product
Where Cost <=100 AND SellEndDate is not NULL
order by Cost asc

--Q4
select p.ProductID, p.Name as 'ProductName', p.Price ,c.Name as 'ModelName', ps.Name as'SubCategoryName', ps.Category
from Product p left join ProductSubcategory ps
on p.SubcategoryID=ps.SubcategoryID left join ProductModel c
on p.ModelID=c.ModelID
where p.Price<100 and p.Color like 'Black'

--Q5
SELECT Distinct PS.SubcategoryID, PS.Name as SubCategoryName, PS.Category, P1.NumberOfProducts
From Product P join ProductSubcategory PS
ON P.SubcategoryID = PS.SubcategoryID,
(Select SubcategoryID, COUNT(*) AS NumberOfProducts
From Product P
Where P.SubcategoryID is not null
Group by SubcategoryID)P1
Where P1.SubcategoryID = P.SubcategoryID
Order By Category asc, NumberOfProducts desc

select a.SubcategoryID, a.Name as 'SubCategoryName', a.Category,count(p.Name) as 'NumberOfProducts'
from ProductSubcategory a left join Product p
on a.SubcategoryID=p.SubcategoryID
group by a.SubcategoryID, a.Name, a.Category
order by a.Category ASC, count(p.Name) DESC, a.Name ASC

--Q6
SELECT Distinct TOP(1) L.LocationID, L.Name as LocationName, P1.NumberOfProducts
From Location L join ProductInventory PI
ON L.LocationID = PI.LocationID,
(Select LocationID, COUNT(*) AS NumberOfProducts
From ProductInventory PI
Group by LocationID)P1
Where P1.LocationID = PI.LocationID
order by NumberOfProducts asc

--Q7
SELECT Distinct PS.Category, PS.Name as SubCategoryName, P1.NumberOfProducts
From Product P join ProductSubcategory PS
ON P.SubcategoryID = PS.SubcategoryID,
(Select Distinct SubcategoryID, COUNT(*) AS NumberOfProducts
From Product P
Where P.SubcategoryID is not null
Group by SubcategoryID)P1 join 
(Select Distinct Top(1) SubcategoryID, COUNT(*) AS NumberOfProducts
From Product P
Where P.SubcategoryID is not null
Group by SubcategoryID)P2
On P1.NumberOfProducts > P2.NumberOfProducts
Where P1.SubcategoryID = P.SubcategoryID 
Order By Category asc, NumberOfProducts desc

--Q8
create procedure proc_product_model
@modelID int, @numberOfProducts int output
as 
begin
	set @numberOfProducts = (select SUM(PM.ModelID)
	from ProductModel PM
	where PM.ModelID = @modelID)
end

/* test
declare @x int
exec proc_product_model 12, @x output
select @x as numberOfProducts
*/

--Q9
create trigger tr_insert_Product on Product
after insert
as
	raiserror('Insert trigger is awakened',16,1)
go

/*test
insert into Product(ProductID, Name, Cost, Price, ModelID, SellStartDate)
values (1000, 'Product Test', 12.5, 15.5, 1, '2021-10-25')
select P.ProductID, P.Name as ProductName, P.ModelID, PM.Name as ModelName
from Product P join ProductModel PM
on P.ModelID = PM.ModelID
*/

--Q10
DELETE FROM ProductInventory
WHERE ProductID = (
	SELECT P.ProductID
	FROM ProductModel PM, Product P
	WHERE PM.ModelID = P.ModelID AND PM.ModelID = 33)
