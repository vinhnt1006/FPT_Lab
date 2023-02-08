select p.ProductID, p.Name as ProductName, p.Color, p.Cost, p.Price, l.LocationID, l.Name as LocationName, c.Shelf, c.Bin, c.Quantity
from Product p left join ProductInventory c
on p.ProductID = c.ProductID left join Location l
on c.LocationID=l.LocationID
where p.Cost<400 and p.Color like 'Yellow'