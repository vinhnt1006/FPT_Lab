SELECT Distinct PS.Category, PS.Name as SubCategoryName, P1.NumberOfProducts
From Product P join ProductSubcategory PS
ON P.SubcategoryID = PS.SubcategoryID,
(Select SubcategoryID, COUNT(*) AS NumberOfProducts
From Product P
Where P.SubcategoryID is not null
Group by SubcategoryID)P1
Where P1.SubcategoryID = P.SubcategoryID 
Order By Category asc, NumberOfProducts desc