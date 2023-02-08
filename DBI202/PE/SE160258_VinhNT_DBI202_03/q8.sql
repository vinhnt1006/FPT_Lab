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
