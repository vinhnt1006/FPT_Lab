Select Top(1) pi.ProductID, p.Name, P1.NumberOfProducts
From ProductInventory pi join Product p
ON pi.ProductID = p.ProductID,
(Select ProductID, SUM(Quantity) AS NumberOfProducts
From ProductInventory PI
Group by ProductID)P1
Where P1.ProductID = PI.ProductID
order by NumberOfProducts desc

