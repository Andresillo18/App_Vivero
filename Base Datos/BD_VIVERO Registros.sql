--Andrés Villalobos
--27/3/22
USE [BD_VIVERO]
GO

INSERT INTO Planta
           (NOMBRE
           ,DESCRIPCION
           ,PRECIO
           ,CANTIDAD_DISPONIBLE
           ,CANTIDAD_REGADO
           ,TIEMPOLUZ_SOLAR
           ,EXTRAS_CARACTERISTICAS)
     VALUES
           ('Lirio Azul','Planta Hermosa',15000 ,3 ,2 ,1.30,''),
		   ('Bromelia','Color cálido',20000,5,2,0.45,'Preguntar por otros colores'),
		   ('Manzanilla','Medicinal',20000,10,2,0,'Muy requerida'),
		   ('Hierbabuena','También considerada medicinal',5000,1,1,0,''),		   
		   ('Pingo de oro','Tiene espinas',10000,15,2,10,'');
GO


INSERT INTO [dbo].[Categoria]
           ([NOMBRE_CATEGORIA]
           ,[DESCRIPCION])
     VALUES
           ('Interiores'
           ,'Todo tipo de plantas de interior'),	--1	  
		     ('exteriores'
           ,'Todo tipo de plantas de exteriores'),--2
		     ('aromáticas'
           ,'Todo tipo de plantas de aromáticas'),--3
		     ('medicinales'
           ,'Todo tipo de plantas de medicinales'),--4
		     ('frutales'
           ,'Todo tipo de frutales'),--5
		     ('árboles'
           ,'Todo tipo de árboles'),--6
		     ('arbustos'
           ,'Todo tipo de arbustos');--7
GO


INSERT INTO [dbo].[Clasificacion_Planta]
           ([COD_PLANTA]
           ,[COD_CATEGORIA])
     VALUES
           (1,2), (2,1), (3,4), (5,6);
GO


INSERT INTO [dbo].[Herramienta_Producto]
           ([NOMBRE]
           ,[DESCRIPCION]
           ,[PRECIO]
           ,[CANTIDAD_DISPONIBLE]
           ,[MATERIAL]
           ,[FECHA_VENCIMIENTO])
     VALUES
           ('Maceta', 'Colgante, color terracota', 2095, 30, 'Plástico', ''),
		   	('Lana mineral en cubos ', 'Color: Blanco', 16350 , 30, 'Lana', ''),
			('Fertilizante fórmula completa', 'Aporta nutrientes mayores y menores', 4095, 50, '', '2025-11-01'),
			('Maceta san remo', 'marrón de 16 cm', 2450, 15, 'Ceramica', ''),
			('Pala', 'Corta redonda, color Negro', 9295, 18, 'Acero y madera', '');
GO


INSERT INTO [dbo].[Empleado]
           ([ID]
           ,[NOMBRE]
           ,[APELLIDO1]
           ,[TELEFONO]
           ,[VENTAS_REALIZADAS]
           ,[ESTADO]
           ,[BONO])
     VALUES
           (118080627,'Andres','Villalobos',88807673,'','',''),
		   (118888800,'Juan','Vargas',5555555,'1','',''),
		   (245155515,'María','Carranza',22444445,'','',''),
		   (425552222,'Lucas','Carballo',5558888,'','','');
GO


INSERT INTO [dbo].[Cliente]
           ([ID]
           ,[NOMBRE]
           ,[APELLIDO1]
           ,[TELEFONO])
     VALUES
           ('','Pablo','',''),
		   ('22555547','Juliana','','');
GO


INSERT INTO [dbo].[Factura]
           ([COD_EMPLEADO]
           ,[COD_CLIENTE])
     VALUES
           (1,1),
		   (1,2);
GO

--select * from Detalle_Factura
--select * from Herramienta_Producto
--select * from Planta
INSERT INTO [dbo].[Detalle_Factura]
           ([COD_FACTURA]
           ,[COD_HERRAMIENTA_PROD]
           ,[CANTIDAD_HERRAMIENTAS_PROD]
           ,[COD_PLANTA]
           ,[CANTIDAD_PLANTAS]
           ,[TOTAL_PAGAR]
           ,[FECHA]
           ,[OBSERVACIONES])
     VALUES
           (1,1,1,2,1,2000,'2022-3-28',''),
		   (2,3,2,3,1,1500,'2021-12-25','');
GO