DROP DATABASE IF EXISTS productos;
CREATE DATABASE productos;
USE productos;

CREATE TABLE Categoria(
	id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(255) NOT NULL
);

CREATE TABLE Producto(
	cod_barras CHAR(13) PRIMARY KEY,
    marca VARCHAR(255),
    modelo VARCHAR(255),
    precio DECIMAL(16,2),
    cantidad INT,
    categoria_id BIGINT,
    CONSTRAINT fk_producto FOREIGN KEY (categoria_id) REFERENCES Categoria(id)
);

INSERT INTO Categoria (nombre) VALUES 
	('Jardín'), ('Descanso'), ('Cocina'), ('Deportes'), ('Juguetes'),('Alimentación');

INSERT INTO Producto (cod_barras, marca, modelo, precio, cantidad, categoria_id) VALUES
('8430010000011','Gardena','Cortacesped 300',189.99,12,1),
('8430010000012','Bosch','Desbrozadora X45',129.50,8,1),
('8430010000013','Keter','Caseta Jardin StoreIt',459.00,3,1),
('8430010000014','Altuna','Tijera Poda Pro',24.95,25,1),
('8430010000015','Catral','Malla Ocultacion 1x5',19.99,30,1),
('8430010000016','Progarden','Mesa Exterior Roma',89.90,10,1),
('8430010000017','Aktive','Silla Playa Plegable',22.50,40,2),
('8430010000018','Intex','Colchon Hinchable Dura',39.95,15,2),
('8430010000019','Pikolin','Almohada Visco Soft',34.00,20,2),
('8430010000020','Ikea','Manta Polar 150',12.99,35,2),
('8430010000021','Don Descanso','Colchoneta Relax',59.00,9,2),
('8430010000022','AmazonBasics','Sillon Zero Gravity',79.99,11,2),
('8430010000023','Tefal','Sarten Antiad 28',27.90,50,3),
('8430010000024','Magefesa','Olla Express 6L',69.95,18,3),
('8430010000025','Bra','Cazo Inox 16',21.50,22,3),
('8430010000026','Lacor','Cuchillo Chef 20',18.75,30,3),
('8430010000027','Bosch','Batidora MaxoMix',49.99,14,3),
('8430010000028','Philips','Tostador Daily',29.95,17,3),
('8430010000029','Balay','Microondas 20L',119.00,6,3),
('8430010000030','Jata','Cafetera Italiana 6',15.90,27,3),
('8430010000031','Adidas','Balon Futbol T5',24.95,26,4),
('8430010000032','Nike','Mochila Gym Club',39.99,19,4),
('8430010000033','Decathlon','Esterilla Yoga 8mm',14.99,33,4),
('8430010000034','Wilson','Raqueta Tenis Pro',89.00,7,4),
('8430010000035','Spalding','Balon Basket TF',29.95,21,4),
('8430010000036','Bestway','Gafas Natacion Pro',9.99,45,4),
('8430010000037','Joma','Guantes Portero M',19.90,16,4),
('8430010000038','Kettler','Comba Fitness',12.50,28,4),
('8430010000039','Lego','City Policia 602',34.99,24,5),
('8430010000040','Playmobil','Granja 70132',49.95,13,5),
('8430010000041','Hasbro','Monopoly Clasico',29.99,18,5),
('8430010000042','Mattel','Barbie Fashion',19.95,22,5),
('8430010000043','Famosa','Nancy Un Dia',42.00,9,5),
('8430010000044','Ravensburger','Puzzle 1000',15.99,31,5),
('8430010000045','Chicco','Coche Teledirigido',27.50,14,5),
('8430010000046','Molto','Bloques 80 pcs',21.00,20,5),
('8430010000047','Gullon','Galletas Maria 800g',2.35,60,6),
('8430010000048','Campofrio','Chorizo Extra',3.99,40,6),
('8430010000049','Carbonell','Aceite Oliva 1L',8.95,25,6),
('8430010000050','GallinaBlanca','Caldo Pollo 1L',1.85,55,6),
('8430010000051','La Vieja Fabrica','Mermelada Fresa',2.75,38,6),
('8430010000052','Nescafe','Cafe Clasico 200g',6.50,29,6),
('8430010000053','ColaCao','Cacao Soluble 500',4.20,34,6),
('8430010000054','Hero','Tomate Frito 560',1.95,48,6),
('8430010000055','ElPozo','Jamon Cocido 200',2.49,37,6),
('8430010000056','Danone','Yogur Natural 4',1.99,44,6);