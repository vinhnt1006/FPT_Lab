--Q1
Create table Users(
	Username varchar(30) primary key,
	Password nvarchar(20),
	email nvarchar(200)
)

Create table Roles(
	RoleID int primary key,
	name nvarchar(10),
	Username varchar(30) foreign key references Users(Username)
)

Create table Permissions(
	permissionID int primary key,
	name nvarchar(50),
	RoleID int foreign key references Roles(RoleID)
)

--Q2
Select *
From ProductSubcategory
Where Category = 'Accessories'

--Q3
Select ProductID, LocationID, Quantity
From ProductInventory
Where LocationID = 7 AND Quantity >= 250
order by Quantity desc

--Q4
select p.ProductID, p.Name as ProductName, p.Color, p.Cost, p.Price, l.LocationID, l.Name as LocationName, c.Shelf, c.Bin, c.Quantity
from Product p left join ProductInventory c
on p.ProductID = c.ProductID left join Location l
on c.LocationID=l.LocationID
where p.Cost<400 and p.Color like 'Yellow'

--Q5
select a.ModelID, a.Name as 'ModelName', count(p.Name) as 'NumberOfProducts'
from ProductModel a left join Product p
on a.ModelID=p.ModelID
where a.Name like 'Mountain%' or a.Name like 'ML Mountain%'
group by a.ModelID, a.Name
order by count(p.Name) DESC, a.Name asc

--Q6
Select Top(1) pi.ProductID, p.Name, P1.NumberOfProducts
From ProductInventory pi join Product p
ON pi.ProductID = p.ProductID,
(Select ProductID, SUM(Quantity) AS NumberOfProducts
From ProductInventory PI
Group by ProductID)P1
Where P1.ProductID = PI.ProductID
order by NumberOfProducts desc

--Q7
SELECT proi.LocationID,l.Name as LocationName, pro.ProductID,pro.Name as ProductName, Quantity
FROM Location l,Product pro, ProductInventory proi
WHERE l.LocationID=proi.LocationID and 
      pro.ProductID=proi.ProductID AND
      Quantity = (SELECT MAX(Quantity)
                  FROM Location subl, ProductInventory subproi
                  WHERE subl.LocationID=subproi.LocationID AND subproi.LocationID=proi.LocationID
                 )
                ORDER BY l.Name ASC, pro.Name DESC
--Q8
create procedure proc_product_quantity
@productID int, @totalQuantity int output
as 
begin
	set @totalQuantity = (select SUM(PI.Quantity)
	from ProductInventory PI
	where PI.ProductID = @productID)
end

-- test
declare @x int
exec proc_product_quantity 1, @x output
select @x as totalQuantity


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
	WHERE PM.ModelID = P.ModelID AND PM.Name = 'Tool Crib')
