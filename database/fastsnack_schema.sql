-- ============================================================
--  FastSnack BD - Script de creación de base de datos
--  Base de datos: FastSnackBD
--  Motor: MySQL
-- ============================================================

CREATE DATABASE IF NOT EXISTS FastSnackBD
    CHARACTER SET utf8mb4
    COLLATE utf8mb4_spanish_ci;

USE FastSnackBD;

-- ------------------------------------------------------------
-- Tabla: Persona (base para Cliente y Empleado)
-- ------------------------------------------------------------
CREATE TABLE IF NOT EXISTS Persona (
    id_persona   INT          NOT NULL AUTO_INCREMENT,
    nombres      VARCHAR(100) NOT NULL,
    apellidos    VARCHAR(100) NOT NULL,
    correo       VARCHAR(150) NOT NULL UNIQUE,
    direccion    VARCHAR(255),
    usuario      VARCHAR(150) NOT NULL UNIQUE,
    contrasena   VARCHAR(255) NOT NULL DEFAULT '1234',
    PRIMARY KEY (id_persona)
) ENGINE=InnoDB;

-- ------------------------------------------------------------
-- Tabla: Cliente
-- ------------------------------------------------------------
CREATE TABLE IF NOT EXISTS Cliente (
    id_cliente INT NOT NULL,
    direccion  VARCHAR(255),
    PRIMARY KEY (id_cliente),
    CONSTRAINT fk_cliente_persona
        FOREIGN KEY (id_cliente) REFERENCES Persona(id_persona)
        ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB;

-- ------------------------------------------------------------
-- Tabla: EstadoPedido
-- ------------------------------------------------------------
CREATE TABLE IF NOT EXISTS EstadoPedido (
    id_estado   INT         NOT NULL AUTO_INCREMENT,
    descripcion VARCHAR(50) NOT NULL,
    PRIMARY KEY (id_estado)
) ENGINE=InnoDB;

-- ------------------------------------------------------------
-- Tabla: Producto
-- ------------------------------------------------------------
CREATE TABLE IF NOT EXISTS Producto (
    id_producto INT            NOT NULL AUTO_INCREMENT,
    nombre      VARCHAR(150)   NOT NULL,
    precio      DECIMAL(10, 2) NOT NULL,
    PRIMARY KEY (id_producto)
) ENGINE=InnoDB;

-- ------------------------------------------------------------
-- Tabla: Pedido
-- ------------------------------------------------------------
CREATE TABLE IF NOT EXISTS Pedido (
    id_pedido  INT      NOT NULL AUTO_INCREMENT,
    id_cliente INT      NOT NULL,
    id_estado  INT      NOT NULL DEFAULT 1,
    fecha      DATETIME NOT NULL DEFAULT NOW(),
    PRIMARY KEY (id_pedido),
    CONSTRAINT fk_pedido_cliente
        FOREIGN KEY (id_cliente) REFERENCES Cliente(id_cliente)
        ON DELETE RESTRICT ON UPDATE CASCADE,
    CONSTRAINT fk_pedido_estado
        FOREIGN KEY (id_estado) REFERENCES EstadoPedido(id_estado)
        ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB;

-- ------------------------------------------------------------
-- Tabla: PedidoProducto (detalle del pedido)
-- ------------------------------------------------------------
CREATE TABLE IF NOT EXISTS PedidoProducto (
    id_pedido   INT NOT NULL,
    id_producto INT NOT NULL,
    cantidad    INT NOT NULL DEFAULT 1,
    PRIMARY KEY (id_pedido, id_producto),
    CONSTRAINT fk_pp_pedido
        FOREIGN KEY (id_pedido) REFERENCES Pedido(id_pedido)
        ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT fk_pp_producto
        FOREIGN KEY (id_producto) REFERENCES Producto(id_producto)
        ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB;
