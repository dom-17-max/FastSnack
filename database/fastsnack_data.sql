-- ============================================================
--  FastSnack BD - Datos de prueba
--  Ejecutar DESPUÉS de fastsnack_schema.sql
-- ============================================================

USE FastSnackBD;

-- ------------------------------------------------------------
-- Estados de pedido
-- ------------------------------------------------------------
INSERT INTO EstadoPedido (descripcion) VALUES
    ('Pendiente'),
    ('En preparación'),
    ('Listo'),
    ('Entregado'),
    ('Cancelado');

-- ------------------------------------------------------------
-- Productos del menú
-- ------------------------------------------------------------
INSERT INTO Producto (nombre, precio) VALUES
    ('Hamburguesa',     3.50),
    ('Hot Dog',         2.50),
    ('Nuggets de Pollo',3.00),
    ('Papitas Fritas',  1.75),
    ('Combo Especial',  6.00);

-- ------------------------------------------------------------
-- Personas / Clientes de prueba
-- ------------------------------------------------------------
INSERT INTO Persona (nombres, apellidos, correo, direccion, usuario, contrasena) VALUES
    ('Ana',    'García',    'ana.garcia@mail.com',    'Av. Principal 101', 'ana.garcia@mail.com',    '1234'),
    ('Carlos', 'López',     'carlos.lopez@mail.com',  'Calle 5 de Junio 22', 'carlos.lopez@mail.com', '1234'),
    ('María',  'Rodríguez', 'maria.rodriguez@mail.com','Urb. Las Flores 7',  'maria.rodriguez@mail.com','1234');

INSERT INTO Cliente (id_cliente, direccion) VALUES
    (1, 'Av. Principal 101'),
    (2, 'Calle 5 de Junio 22'),
    (3, 'Urb. Las Flores 7');

-- ------------------------------------------------------------
-- Pedidos de prueba
-- ------------------------------------------------------------
INSERT INTO Pedido (id_cliente, id_estado, fecha) VALUES
    (1, 1, NOW()),
    (2, 2, NOW()),
    (3, 4, NOW());

-- Detalle de pedidos
INSERT INTO PedidoProducto (id_pedido, id_producto, cantidad) VALUES
    (1, 1, 2),   -- Ana: 2 hamburguesas
    (1, 4, 1),   -- Ana: 1 papitas fritas
    (2, 3, 3),   -- Carlos: 3 nuggets
    (2, 2, 2),   -- Carlos: 2 hot dogs
    (3, 5, 1);   -- María: 1 combo especial
