
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