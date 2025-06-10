-- Crear tabla de camareros
CREATE TABLE camareros (
    cod_camarero CHAR(9) PRIMARY KEY,
    nombre VARCHAR(30) NOT NULL,
    apellido VARCHAR(30) NOT NULL,
	puesto VARCHAR(30)
);

-- Crear tabla de mesas
CREATE TABLE mesas (
    cod_mesa CHAR(3) PRIMARY KEY,
    seccion VARCHAR(15)
);


-- Crear tabla de platos
CREATE TYPE categoriaPlatos_enum AS ENUM ('Entrante', 'Principal', 'Postre','Bebida'); 
CREATE TABLE platos (
    cod_plato VARCHAR(4) PRIMARY KEY,
    categoriaPlatos categoriaPlatos_enum,
    nombrePlato VARCHAR(50) NOT NULL,
    precio NUMERIC(5,2) NOT NULL
);

-- Crear tabla de comandas
CREATE TABLE comandas (
    cod_comanda INTEGER PRIMARY KEY,
    cod_mesa CHAR(3),
    cod_camarero CHAR(9),
    fecha_comanda DATE NOT NULL,
    CONSTRAINT mesa_fk FOREIGN KEY (cod_mesa) REFERENCES mesas(cod_mesa) ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT camareroComanda_fk FOREIGN KEY (cod_camarero) REFERENCES camareros(cod_camarero) ON DELETE CASCADE ON UPDATE CASCADE
);

-- Crear tabla de relación platos-comandas
CREATE TABLE platosComandas (
    cod_plato VARCHAR(4),
    cod_comanda INTEGER,
	cantidad SMALLINT,
    PRIMARY KEY (cod_plato, cod_comanda),
    CONSTRAINT platoComanda_fk FOREIGN KEY (cod_plato) REFERENCES platos(cod_plato) ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT comanda2_fk FOREIGN KEY (cod_comanda) REFERENCES comandas(cod_comanda) ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO camareros (cod_camarero, nombre, apellido, puesto) VALUES
('12345678A', 'David', 'Rueda', 'Encargado'),
('12345555B', 'Cristina', 'Martos', 'Camarero'),
('12345666C', 'María', 'López', 'Camarero'),
('12345677D', 'Roberto', 'Gómez', 'Camarero');

INSERT INTO mesas (cod_mesa, seccion) VALUES
('M01', 'Comedor'),
('M02', 'Comedor'),
('M03', 'Comedor'),
('M04', 'Comedor'),
('M05', 'Comedor'),
('T01', 'Terraza'),
('T02', 'Terraza'),
('T03', 'Terraza');

INSERT INTO platos (cod_plato, categoriaplatos, nombreplato, precio) VALUES
('P01', 'Entrante', 'Ensalada marinera', 12.90),
('P02', 'Entrante', 'Ensalada con pollo y nueces', 13.50),
('P03', 'Entrante', 'Calabacín al horno con queso', 12.50),
('P04', 'Entrante', 'Chipirones en su salsa', 10.30),
('P05', 'Entrante', 'Ceviche de pescado', 16.50),
('P06', 'Entrante', 'Langostinos a la plancha', 11.30),
('P07', 'Entrante', 'Patatas bravas', 5.50),
('P08', 'Principal', 'Dorada al horno', 15.90),
('P09', 'Principal', 'Pollo asado con patatas', 10.80),
('P10', 'Principal', 'Costillas al horno', 12.20),
('P11', 'Principal', 'Picanha con yuca frita', 16.70),
('P12', 'Principal', 'Lassaña de carne', 9.50),
('P13', 'Principal', 'Entraña asada con pimientos', 17.20),
('P14', 'Principal', 'Tallarines salteados', 8.20),
('P15', 'Postre', 'Tarta de queso', 6.20),
('P16', 'Postre', 'Mouse de limón', 5.20),
('P17', 'Postre', 'Coulant de chocolate', 5.50),
('P18', 'Bebida', 'Cerveza Mahou', 3.30),
('P19', 'Bebida', 'Copa Rioja', 3.80),
('P20', 'Bebida', 'Copa Verdejo', 3.70),
('P21', 'Bebida', 'Cerveza Mahou Sin Alcohol', 3.10),
('P22', 'Bebida', 'Coca Cola', 2.90),
('P23', 'Bebida', 'Zumo de frutos rojos', 4.50),
('P24', 'Bebida', 'Margarita', 6.90);

INSERT INTO comandas (cod_comanda, cod_mesa, cod_camarero, fecha_comanda) VALUES
(001,'M01','12345555B','2024-05-24'),
(002, 'M02', '12345677D','2024-05-24');