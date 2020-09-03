-- creacion BD y Usuario 
CREATE DATABASE db_viajes;
CREATE USER 'bielorrusia'@'localhost' 
IDENTIFIED BY 'bielorrusia';
-- Permisos para el usuario creado
GRANT ALL ON db_viajes.* TO 'bielorrusia'@'localhost';

USE  db_viajes;

CREATE TABLE personas (
nro_documento		INT				NOT NULL,
nombre_pasajero		VARCHAR(150)	NOT NULL,
id_origen			INT				NOT NULL,
id_destino			INT				NOT NULL,
idBus				INT				NOT NULL,
PRIMARY KEY (nro_documento),
CONSTRAINT fk_buses_personas	FOREIGN KEY(idBus)
REFERENCES buses (id_bus), 
CONSTRAINT fk_municipio_origen	FOREIGN KEY(id_origen)
REFERENCES municipios (id_municipio),
CONSTRAINT fk_municipio_destino	FOREIGN KEY(id_destino)
REFERENCES municipios (id_municipio) 
);

CREATE TABLE buses (
id_bus			INT				NOT NULL		AUTO_INCREMENT,
puestos			INT				NOT NULL,
PRIMARY KEY (id_bus)
);

CREATE TABLE municipios (
id_municipio			INT				NOT NULL 		AUTO_INCREMENT,
nombre_municipio		VARCHAR(100)	NOT NULL,
PRIMARY KEY (id_municipio)
);



