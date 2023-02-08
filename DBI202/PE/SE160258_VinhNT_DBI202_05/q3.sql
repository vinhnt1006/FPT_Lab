
Select ProductID, Name, Color, Cost, Price, SellEndDate
From Product
Where Cost <=100 AND SellEndDate is not NULL
order by Cost asc

