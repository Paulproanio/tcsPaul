INSERT INTO PT_TIPO_CUENTA (ID_TIPO_CUENTA, NOMBRE_TIPO_CUENTA) VALUES (1, 'Ahorros');
INSERT INTO PT_TIPO_CUENTA (ID_TIPO_CUENTA, NOMBRE_TIPO_CUENTA) VALUES (2, 'Corriente');
INSERT INTO PT_TIPO_CUENTA (ID_TIPO_CUENTA, NOMBRE_TIPO_CUENTA) VALUES (3, 'Ahorro Futuro');

INSERT INTO PT_ESTADO_CUENTA (ID_ESTADO_CUENTA, NOMBRE_ESTADO_CUENTA) VALUES ( 1, 'Activa');
INSERT INTO PT_ESTADO_CUENTA (ID_ESTADO_CUENTA, NOMBRE_ESTADO_CUENTA) VALUES ( 2, 'Cancelada');

INSERT INTO PT_ESTADO_CLIENTE (ID_ESTADO_CLIENTE, NOMBRE_ESTADO_CLIENTE) VALUES ( 1, 'Activo');
INSERT INTO PT_ESTADO_CLIENTE (ID_ESTADO_CLIENTE, NOMBRE_ESTADO_CLIENTE) VALUES ( 2, 'Inactivo');


INSERT INTO PT_TIPO_MOVIMIENTOS (ID_TIPO_MOVIMIENTO, NOMBRE_TIPO_MOVIMIENTO) VALUES ( 1, 'Deposito');
INSERT INTO PT_TIPO_MOVIMIENTOS (ID_TIPO_MOVIMIENTO, NOMBRE_TIPO_MOVIMIENTO) VALUES ( 2, 'Retiro');

INSERT INTO PT_CLIENTE ( DIRECCION, EDAD , GENERO, IDENTIFICACION, NOMBRE, TELEFONO , CONTRASENIA_CLIENTE, ESTADO_CLIENTE   ) VALUES ('sucre y cuba', 25, 'masculino', '1002712857', 'VICTOR PROAÑO', '0987456782', '123',1);

INSERT INTO PT_CLIENTE ( DIRECCION, EDAD , GENERO, IDENTIFICACION, NOMBRE, TELEFONO , CONTRASENIA_CLIENTE, ESTADO_CLIENTE   ) VALUES ('Ascazubi i vivar', 20, 'femenino', '2002712858', 'MARIA PROAÑO', '0983333782', '456',1);

INSERT INTO PT_CUENTA (NUMERO_CUENTA, SALDO_INICIAL,IDENTIFICACION,ID_ESTADO_CUENTA,ID_TIPO_CUENTA) VALUES (100,1500,'1002712857', 1, 1);
INSERT INTO PT_CUENTA (NUMERO_CUENTA, SALDO_INICIAL,IDENTIFICACION,ID_ESTADO_CUENTA,ID_TIPO_CUENTA) VALUES (200, 850,'1002712857', 1, 2);
INSERT INTO PT_CUENTA (NUMERO_CUENTA, SALDO_INICIAL,IDENTIFICACION,ID_ESTADO_CUENTA,ID_TIPO_CUENTA) VALUES (300,1100,'2002712858', 1, 3);

--INSERT INTO PT_MOVIMIENTOS  (ID_MOVIMIENTO, FECHA_MOVIMIENTO, ID_TIPO_MOVIMIENTO, SALDO_MOVIMIENTO, VALOR_MOVIMIENTO, NUMERO_CUENTA ) VALUES (1, '2024-08-01', 1, 150, 10,100);
--INSERT INTO PT_MOVIMIENTOS  (ID_MOVIMIENTO, FECHA_MOVIMIENTO, ID_TIPO_MOVIMIENTO, SALDO_MOVIMIENTO, VALOR_MOVIMIENTO, NUMERO_CUENTA ) VALUES (2, '2024-08-02', 2, 150, 10,100);
--INSERT INTO PT_MOVIMIENTOS  (ID_MOVIMIENTO, FECHA_MOVIMIENTO, ID_TIPO_MOVIMIENTO, SALDO_MOVIMIENTO, VALOR_MOVIMIENTO, NUMERO_CUENTA ) VALUES (3, '2024-08-03', 1, 150, 10,100);
--INSERT INTO PT_MOVIMIENTOS  (ID_MOVIMIENTO, FECHA_MOVIMIENTO, ID_TIPO_MOVIMIENTO, SALDO_MOVIMIENTO, VALOR_MOVIMIENTO, NUMERO_CUENTA ) VALUES (4, '2024-08-04', 2, 150, 10,100);
--INSERT INTO PT_MOVIMIENTOS  (ID_MOVIMIENTO, FECHA_MOVIMIENTO, ID_TIPO_MOVIMIENTO, SALDO_MOVIMIENTO, VALOR_MOVIMIENTO, NUMERO_CUENTA ) VALUES (5, '2024-08-05', 2, 150, 10,100);
--INSERT INTO PT_MOVIMIENTOS  (ID_MOVIMIENTO, FECHA_MOVIMIENTO, ID_TIPO_MOVIMIENTO, SALDO_MOVIMIENTO, VALOR_MOVIMIENTO, NUMERO_CUENTA ) VALUES (6, '2024-08-06', 1, 150, 10,100);
--INSERT INTO PT_MOVIMIENTOS  (ID_MOVIMIENTO, FECHA_MOVIMIENTO, ID_TIPO_MOVIMIENTO, SALDO_MOVIMIENTO, VALOR_MOVIMIENTO, NUMERO_CUENTA ) VALUES (7, '2024-08-07', 1, 150, 10,100);

--SELECT PT_MOVIMIENTOS.FECHA_MOVIMIENTO AS fecha, PT_CLIENTE.NOMBRE , PT_CUENTA.NUMERO_CUENTA, PT_TIPO_CUENTA.NOMBRE_TIPO_CUENTA , PT_CUENTA.SALDO_INICIAL, PT_ESTADO_CUENTA.NOMBRE_ESTADO_CUENTA, PT_MOVIMIENTOS.VALOR_MOVIMIENTO, PT_MOVIMIENTOS.SALDO_MOVIMIENTO
--FROM PT_CUENTA INNER JOIN PT_MOVIMIENTOS 
--ON PT_MOVIMIENTOS.NUMERO_CUENTA = PT_CUENTA.NUMERO_CUENTA INNER JOIN PT_CLIENTE 
--ON PT_CLIENTE.IDENTIFICACION = PT_CUENTA.IDENTIFICACION INNER JOIN PT_TIPO_CUENTA 
--ON PT_TIPO_CUENTA.ID_TIPO_CUENTA = PT_CUENTA.ID_TIPO_CUENTA INNER JOIN PT_ESTADO_CUENTA 
--ON PT_ESTADO_CUENTA.ID_ESTADO_CUENTA = PT_CUENTA.ID_ESTADO_CUENTA
--WHERE PT_CUENTA.IDENTIFICACION = '1002712857' AND FECHA_MOVIMIENTO BETWEEN '2024-08-08' AND '2024-08-08'






