select distinct PI.LocationID, L.Name as LocationName, P.ProductID, P.Name as ProductName, PI.Quantity
From ProductInventory PI Join Product P
ON PI.ProductID = P.ProductID join Location L
ON PI.LocationID = L.LocationID
Order by LocationName asc, Quantity desc, ProductName desc