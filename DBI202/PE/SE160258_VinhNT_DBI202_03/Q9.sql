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