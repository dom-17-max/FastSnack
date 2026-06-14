CREATE DATABASE IF NOT EXISTS FastSnackBD;
USE FastSnackBD;

CREATE TABLE IF NOT EXISTS Persona (
    id_persona INT NOT NULL AUTO_INCREMENT,
    nombres VARCHAR(100) NOT NULL,
    apellidos VARCHAR(100) NOT NULL,
    correo VARCHAR(150) NOT NULL UNIQUE,
    direccion VARCHAR(255),
    usuario VARCHAR(150) NOT NULL UNIQUE,
    contrasena VARCHAR(255) NOT NULL DEFAULT '1234',
    PRIMARY KEY (id_persona)
);

CREATE TABLE IF NOT EXISTS Cliente (
    id_cliente INT NOT NULL,
    direccion VARCHAR(255),
    PRIMARY KEY (id_cliente),
    FOREIGN KEY (id_cliente) REFERENCES Persona(id_persona)
);

CREATE TABLE IF NOT EXISTS EstadoPedido (
    id_estado INT NOT NULL AUTO_INCREMENT,
    descripcion VARCHAR(50) NOT NULL,
    PRIMARY KEY (id_estado
    
);

CREATE TABLE IF NOT EXISTS Producto (
    id_producto INT NOT NULL AUTO_INCREMENT,
    nombre VARCHAR(150) NOT NULL,
    precio DECIMAL(10,2) NOT NULL,
    PRIMARY KEY (id_producto)
);

CREATE TABLE IF NOT EXISTS Pedido (
    id_pedido INT NOT NULL AUTO_INCREMENT,
    id_cliente INT NOT NULL,
    id_estado INT NOT NULL DEFAULT 1,
    fecha DATETIME NOT NULL DEFAULT NOW(),
    PRIMARY KEY (id_pedido),
    FOREIGN KEY (id_cliente) REFERENCES Cliente(id_cliente),
    FOREIGN KEY (id_estado) REFERENCES EstadoPedido(id_estado)
);

CREATE TABLE IF NOT EXISTS PedidoProducto (
    id_pedido INT NOT NULL,
    id_producto INT NOT NULL,
    cantidad INT NOT NULL DEFAULT 1,
    PRIMARY KEY (id_pedido, id_producto),
    FOREIGN KEY (id_pedido) REFERENCES Pedido(id_pedido),
    FOREIGN KEY (id_producto) REFERENCES Producto(id_producto)
);

INSERT INTO EstadoPedido (descripcion) VALUES
('Pendiente'),('En preparación'),('Listo'),('Entregado'),('Cancelado');

INSERT INTO Producto (nombre, precio) VALUES
('Hamburguesa', 2.50),
('Hot Dog', 1.50),
('Nuggets de Pollo', 8.00),
('Papitas Fritas', 1.50);
