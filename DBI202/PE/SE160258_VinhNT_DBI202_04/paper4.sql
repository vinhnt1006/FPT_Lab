--Q1
CREATE TABLE Roles
(
	RoleID int primary key,
	name nvarchar(100)
)

CREATE TABLE Users
(
	Username varchar(30) primary key,
   	 Password nvarchar(20),
	Email     nvarchar(200),
	RoleID int,
                foreign key (RoleID) references Roles 
)

CREATE TABLE Permissions
(
	PermissionID int primary key,
	name nvarchar(50)
)

CREATE TABLE hasPermission
(
	PermissionID int not NULL,
	RoleID int not NULL,
	primary key(RoleID,PermissionID),
	foreign key (RoleID) references Roles,
	foreign key (PermissionID) references Permissions 
)

--Q2:
SELECT * FROM Product WHERE Color = 'Blue'
--Q3: 
SELECT p.ProductID as 'ProductID', l.LocationID as 'LocationID', p.Quantity as 'Quantity'
FROM ProductInventory p, Location l
WHERE p.Quantity > 250 
AND p.LocationID = l.LocationID 
AND l.LocationID = 7 AND p.LocationID = 7
ORDER BY p.Quantity DESC
--Q4: 
SELECT td.ProductID, td.Name, td.Color, td.Cost, td.Price, td.LocationID, l.Name, td.Shelf, td.Bin, td.Quantity
FROM Location l RIGHT JOIN
(SELECT p.ProductID, p.Name, p.Color, p.Cost, p.Price, ld.LocationID, ld.Quantity, ld.Shelf, ld.Bin FROM Product p LEFT JOIN
(SELECT prI.LocationID, prI.ProductID, prI.Quantity, prI.Shelf, prI.Bin FROM ProductInventory prI)
as ld ON ld.ProductID = p.ProductID) 
as td ON td.LocationID = l.LocationID
GROUP BY td.Color, td.Cost, td.ProductID, td.Name, td.Bin, td.LocationID, td.Price, td.Quantity, td.Shelf, l.Name
HAVING td.Color = 'Yellow' AND td.Cost <400
--Q5: 
--ModelID , ModelName, NumberOfProducts 
--Name begining with 'Moutain' or 'ML Moutain'
--NumberOfProduct is the count of Distinct product 
--DESCENDING numofproduct
--ASCENDING modelName
SELECT DISTINCT m.ModelID,m.Name,COUNT(p.Name) AS 'NumberOfProducts' 
FROM ProductModel m LEFT JOIN Product p
ON m.ModelID = p.ModelID 
GROUP BY m.ModelID, m.Name 
HAVING m.Name LIKE 'Mountain%' OR m.Name LIKE 'ML Mountain%'
ORDER BY COUNT(p.Name) DESC 
--Q6: 
SELECT TOP 1 MaxPro.ProductID, p.Name , SUM(MaxPro.Quantity) AS 'TotalQuantity' 
FROM
(SELECT i.ProductID, i.Quantity FROM ProductInventory i, Location l
WHERE i.LocationID = l.LocationID
GROUP BY i.ProductID, i.Quantity) AS MaxPro, Product p 
WHERE MaxPro.ProductID = p.ProductID
GROUP BY MaxPro.ProductID, p.Name
ORDER BY SUM(MaxPro.Quantity) DESC

Q7.
SELECT l.LocationID,l.Name, pro.ProductID,pro.Name,Quantity
FROM Location l,Product pro, ProductInventory proi
WHERE l.LocationID=proi.LocationID and 
	  pro.ProductID=proi.ProductID AND
	  Quantity = (SELECT MAX(Quantity)
				  FROM Location subl, ProductInventory subproi
				  WHERE subl.LocationID=subproi.LocationID AND subproi.LocationID=proi.LocationID
				 )
				ORDER BY l.Name ASC, pro.Name DESC
Q.8
CREATE PROCEDURE proc_product_quantity
	@proid int,
	@total int output
	AS
	SELECT @total= SUM(quantity)
	FROM ProductInventory
	WHERE ProductID=@proid

Q.9
CREATE  TRIGGER tr_insert_product on product
AFTER INSERT
AS
	SELECT  ProductID,p.Name,pm.ModelID,pm.Name
	FROM  INSERTED p, ProductModel pm
	WHERE  p.ModelID=pm.ModelID

Q.10
DELETE  ProductInventory
WHERE  ProductID IN (SELECT ProductID
					FROM Product
					WHERE ModelID=33
					)