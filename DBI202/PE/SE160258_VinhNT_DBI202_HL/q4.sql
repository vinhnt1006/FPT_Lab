select p.ProductID, p.Name as 'ProductName', p.Price ,c.Name as 'ModelName', ps.Name as'SubCategoryName', ps.Category
from Product p left join ProductSubcategory ps
on p.SubcategoryID=ps.SubcategoryID left join ProductModel c
on p.ModelID=c.ModelID
where p.Price<100 and p.Color like 'Black'