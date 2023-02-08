SELECT Distinct TOP(10) PI.LocationID, L.Name as LocationName, P1.NumberOfProducts
From Location L join ProductInventory PI
ON L.LocationID = PI.LocationID,
(Select Distinct LocationID, COUNT(*) AS NumberOfProducts
From ProductInventory PI
Where PI.LocationID is not null
Group by LocationID)P1
Where P1.LocationID = PI.LocationID
order by NumberOfProducts asc
