select a.ModelID, a.Name as 'ModelName', count(p.Name) as 'NumberOfProducts'
from ProductModel a left join Product p
on a.ModelID=p.ModelID
where a.Name like 'Mountain%' or a.Name like 'ML Mountain%'
group by a.ModelID, a.Name
order by count(p.Name) DESC, a.Name asc