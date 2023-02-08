create proc proc_product_model
@modelID int, @numberOfProducts int output
as 
begin
	set @numberOfProducts = (select Distinct COUNT(P.ProductID)
	from Product P
	WHERE P.ProductID = @modelID)
END