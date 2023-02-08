Create table Users(
	Username varchar(30) primary key,
	Password nvarchar(20),
	email nvarchar(200)
)

Create table Roles(
	RoleID int primary key,
	name nvarchar(10),
	Username varchar(30) foreign key references Users(Username)
)

Create table Permissions(
	permissionID int primary key,
	name nvarchar(50),
	RoleID int foreign key references Roles(RoleID)
)