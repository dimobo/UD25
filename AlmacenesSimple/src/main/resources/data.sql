CREATE TABLE `almacenes` (
  `id` int NOT NULL PRIMARY KEY,
  `lugar` varchar(255) NOT NULL,
  `capacidad` int NOT NULL
);

CREATE TABLE `cajas` (
  `num_referencia` varchar(255) PRIMARY KEY NOT NULL,
  `contenido` varchar(255) NOT NULL,
  `valor` double NOT NULL,
  `almacen` int NOT NULL,
  CONSTRAINT `cajas_ibfk_1` FOREIGN KEY (`almacen`) REFERENCES `almacenes` (`id`)
);


INSERT INTO almacenes(id,lugar,capacidad) VALUES (1,'Valencia',3),(2,'Barcelona',4),(3,'Bilbao',7),(4,'Los Angeles',2),(5,'San Francisco',8);
INSERT INTO cajas(num_referencia, contenido, valor, almacen) VALUES ('0MN7','Rocks',180,3),('4H8P','Rocks',250,1),('4RT3','Scissors',190,4),('7G3H','Rocks',200,1),('8JN6','Papers',75,1),('8Y6U','Papers',50,3),('9J6F','Papers',175,2),('LL08','Rocks',140,4),('P0H6','Scissors',125,1),('P2T6','Scissors',150,2),('TU55','Papers',90,5);