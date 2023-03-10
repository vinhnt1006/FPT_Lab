USE [master]
GO
/****** Object:  Database [FUH_COMPANY]    Script Date: 07/25/2022 09:26:09 ******/
CREATE DATABASE [FUH_COMPANY] ON  PRIMARY 
( NAME = N'I2DBCOMPANY', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL10_50.VINH\MSSQL\DATA\FUH_COMPANY.mdf' , SIZE = 2048KB , MAXSIZE = UNLIMITED, FILEGROWTH = 1024KB )
 LOG ON 
( NAME = N'I2DBCOMPANY_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL10_50.VINH\MSSQL\DATA\FUH_COMPANY_1.ldf' , SIZE = 3456KB , MAXSIZE = 2048GB , FILEGROWTH = 10%)
GO
ALTER DATABASE [FUH_COMPANY] SET COMPATIBILITY_LEVEL = 90
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [FUH_COMPANY].[dbo].[sp_fulltext_database] @action = 'disable'
end
GO
ALTER DATABASE [FUH_COMPANY] SET ANSI_NULL_DEFAULT OFF
GO
ALTER DATABASE [FUH_COMPANY] SET ANSI_NULLS OFF
GO
ALTER DATABASE [FUH_COMPANY] SET ANSI_PADDING OFF
GO
ALTER DATABASE [FUH_COMPANY] SET ANSI_WARNINGS OFF
GO
ALTER DATABASE [FUH_COMPANY] SET ARITHABORT OFF
GO
ALTER DATABASE [FUH_COMPANY] SET AUTO_CLOSE ON
GO
ALTER DATABASE [FUH_COMPANY] SET AUTO_CREATE_STATISTICS ON
GO
ALTER DATABASE [FUH_COMPANY] SET AUTO_SHRINK OFF
GO
ALTER DATABASE [FUH_COMPANY] SET AUTO_UPDATE_STATISTICS ON
GO
ALTER DATABASE [FUH_COMPANY] SET CURSOR_CLOSE_ON_COMMIT OFF
GO
ALTER DATABASE [FUH_COMPANY] SET CURSOR_DEFAULT  GLOBAL
GO
ALTER DATABASE [FUH_COMPANY] SET CONCAT_NULL_YIELDS_NULL OFF
GO
ALTER DATABASE [FUH_COMPANY] SET NUMERIC_ROUNDABORT OFF
GO
ALTER DATABASE [FUH_COMPANY] SET QUOTED_IDENTIFIER OFF
GO
ALTER DATABASE [FUH_COMPANY] SET RECURSIVE_TRIGGERS OFF
GO
ALTER DATABASE [FUH_COMPANY] SET  DISABLE_BROKER
GO
ALTER DATABASE [FUH_COMPANY] SET AUTO_UPDATE_STATISTICS_ASYNC OFF
GO
ALTER DATABASE [FUH_COMPANY] SET DATE_CORRELATION_OPTIMIZATION OFF
GO
ALTER DATABASE [FUH_COMPANY] SET TRUSTWORTHY OFF
GO
ALTER DATABASE [FUH_COMPANY] SET ALLOW_SNAPSHOT_ISOLATION OFF
GO
ALTER DATABASE [FUH_COMPANY] SET PARAMETERIZATION SIMPLE
GO
ALTER DATABASE [FUH_COMPANY] SET READ_COMMITTED_SNAPSHOT OFF
GO
ALTER DATABASE [FUH_COMPANY] SET HONOR_BROKER_PRIORITY OFF
GO
ALTER DATABASE [FUH_COMPANY] SET  READ_WRITE
GO
ALTER DATABASE [FUH_COMPANY] SET RECOVERY FULL
GO
ALTER DATABASE [FUH_COMPANY] SET  MULTI_USER
GO
ALTER DATABASE [FUH_COMPANY] SET PAGE_VERIFY CHECKSUM
GO
ALTER DATABASE [FUH_COMPANY] SET DB_CHAINING OFF
GO
USE [FUH_COMPANY]
GO
/****** Object:  Table [dbo].[tblDependent]    Script Date: 07/25/2022 09:26:10 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[tblDependent](
	[depName] [nvarchar](50) NOT NULL,
	[empSSN] [decimal](18, 0) NOT NULL,
	[depSex] [char](1) NULL,
	[depBirthdate] [datetime] NULL,
	[depRelationship] [nvarchar](50) NULL,
 CONSTRAINT [PK_tblDependent] PRIMARY KEY CLUSTERED 
(
	[depName] ASC,
	[empSSN] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[tblEmployee]    Script Date: 07/25/2022 09:26:10 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[tblEmployee](
	[empSSN] [decimal](18, 0) NOT NULL,
	[empName] [nvarchar](50) NULL,
	[empAddress] [nvarchar](50) NULL,
	[empSalary] [decimal](18, 0) NULL,
	[empSex] [char](1) NULL,
	[empBirthdate] [datetime] NULL,
	[depNum] [int] NULL,
	[supervisorSSN] [decimal](18, 0) NULL,
	[empStartdate] [datetime] NULL,
 CONSTRAINT [PK_tblEmployee] PRIMARY KEY CLUSTERED 
(
	[empSSN] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[tblDepartment]    Script Date: 07/25/2022 09:26:10 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblDepartment](
	[depNum] [int] NOT NULL,
	[depName] [nvarchar](50) NULL,
	[mgrSSN] [decimal](18, 0) NULL,
	[mgrAssDate] [datetime] NULL,
 CONSTRAINT [PK_tblDepartment] PRIMARY KEY CLUSTERED 
(
	[depNum] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY],
 CONSTRAINT [UK_tblDepartment] UNIQUE NONCLUSTERED 
(
	[depName] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tblWorksOn]    Script Date: 07/25/2022 09:26:10 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblWorksOn](
	[empSSN] [decimal](18, 0) NOT NULL,
	[proNum] [int] NOT NULL,
	[workHours] [int] NULL,
 CONSTRAINT [PK_tblWorksOn] PRIMARY KEY CLUSTERED 
(
	[empSSN] ASC,
	[proNum] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tblProject]    Script Date: 07/25/2022 09:26:10 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblProject](
	[proNum] [int] NOT NULL,
	[proName] [nvarchar](50) NULL,
	[locNum] [int] NULL,
	[depNum] [int] NULL,
 CONSTRAINT [PK_tblProject] PRIMARY KEY CLUSTERED 
(
	[proNum] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tblDepLocation]    Script Date: 07/25/2022 09:26:10 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblDepLocation](
	[depNum] [int] NOT NULL,
	[locNum] [int] NOT NULL,
 CONSTRAINT [PK_tblDepLocation] PRIMARY KEY CLUSTERED 
(
	[depNum] ASC,
	[locNum] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[tblLocation]    Script Date: 07/25/2022 09:26:10 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[tblLocation](
	[locNum] [int] IDENTITY(1,1) NOT NULL,
	[locName] [nvarchar](50) NULL,
 CONSTRAINT [PK_tblLocation] PRIMARY KEY CLUSTERED 
(
	[locNum] ASC
)WITH (PAD_INDEX  = OFF, STATISTICS_NORECOMPUTE  = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS  = ON, ALLOW_PAGE_LOCKS  = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  ForeignKey [FK_tblDependent_tblEmployee]    Script Date: 07/25/2022 09:26:10 ******/
ALTER TABLE [dbo].[tblDependent]  WITH CHECK ADD  CONSTRAINT [FK_tblDependent_tblEmployee] FOREIGN KEY([empSSN])
REFERENCES [dbo].[tblEmployee] ([empSSN])
GO
ALTER TABLE [dbo].[tblDependent] CHECK CONSTRAINT [FK_tblDependent_tblEmployee]
GO
/****** Object:  ForeignKey [FK_tblEmployee_tblDepartment]    Script Date: 07/25/2022 09:26:10 ******/
ALTER TABLE [dbo].[tblEmployee]  WITH CHECK ADD  CONSTRAINT [FK_tblEmployee_tblDepartment] FOREIGN KEY([depNum])
REFERENCES [dbo].[tblDepartment] ([depNum])
GO
ALTER TABLE [dbo].[tblEmployee] CHECK CONSTRAINT [FK_tblEmployee_tblDepartment]
GO
/****** Object:  ForeignKey [FK_tblEmployee_tblEmployee]    Script Date: 07/25/2022 09:26:10 ******/
ALTER TABLE [dbo].[tblEmployee]  WITH CHECK ADD  CONSTRAINT [FK_tblEmployee_tblEmployee] FOREIGN KEY([supervisorSSN])
REFERENCES [dbo].[tblEmployee] ([empSSN])
GO
ALTER TABLE [dbo].[tblEmployee] CHECK CONSTRAINT [FK_tblEmployee_tblEmployee]
GO
/****** Object:  ForeignKey [FK_tblDepartment_tblEmployee]    Script Date: 07/25/2022 09:26:10 ******/
ALTER TABLE [dbo].[tblDepartment]  WITH CHECK ADD  CONSTRAINT [FK_tblDepartment_tblEmployee] FOREIGN KEY([mgrSSN])
REFERENCES [dbo].[tblEmployee] ([empSSN])
GO
ALTER TABLE [dbo].[tblDepartment] CHECK CONSTRAINT [FK_tblDepartment_tblEmployee]
GO
/****** Object:  ForeignKey [FK_tblWorksOn_tblProject]    Script Date: 07/25/2022 09:26:10 ******/
ALTER TABLE [dbo].[tblWorksOn]  WITH CHECK ADD  CONSTRAINT [FK_tblWorksOn_tblProject] FOREIGN KEY([proNum])
REFERENCES [dbo].[tblProject] ([proNum])
GO
ALTER TABLE [dbo].[tblWorksOn] CHECK CONSTRAINT [FK_tblWorksOn_tblProject]
GO
/****** Object:  ForeignKey [FK_tblProject_tblDepartment]    Script Date: 07/25/2022 09:26:10 ******/
ALTER TABLE [dbo].[tblProject]  WITH CHECK ADD  CONSTRAINT [FK_tblProject_tblDepartment] FOREIGN KEY([depNum])
REFERENCES [dbo].[tblDepartment] ([depNum])
GO
ALTER TABLE [dbo].[tblProject] CHECK CONSTRAINT [FK_tblProject_tblDepartment]
GO
/****** Object:  ForeignKey [FK_tblProject_tblLocation]    Script Date: 07/25/2022 09:26:10 ******/
ALTER TABLE [dbo].[tblProject]  WITH CHECK ADD  CONSTRAINT [FK_tblProject_tblLocation] FOREIGN KEY([locNum])
REFERENCES [dbo].[tblLocation] ([locNum])
GO
ALTER TABLE [dbo].[tblProject] CHECK CONSTRAINT [FK_tblProject_tblLocation]
GO
/****** Object:  ForeignKey [FK_tblDepLocation_tblDepartment]    Script Date: 07/25/2022 09:26:10 ******/
ALTER TABLE [dbo].[tblDepLocation]  WITH CHECK ADD  CONSTRAINT [FK_tblDepLocation_tblDepartment] FOREIGN KEY([depNum])
REFERENCES [dbo].[tblDepartment] ([depNum])
GO
ALTER TABLE [dbo].[tblDepLocation] CHECK CONSTRAINT [FK_tblDepLocation_tblDepartment]
GO
/****** Object:  ForeignKey [FK_tblDepLocation_tblLocation]    Script Date: 07/25/2022 09:26:10 ******/
ALTER TABLE [dbo].[tblDepLocation]  WITH CHECK ADD  CONSTRAINT [FK_tblDepLocation_tblLocation] FOREIGN KEY([locNum])
REFERENCES [dbo].[tblLocation] ([locNum])
GO
ALTER TABLE [dbo].[tblDepLocation] CHECK CONSTRAINT [FK_tblDepLocation_tblLocation]
GO
