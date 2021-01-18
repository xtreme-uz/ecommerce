INSERT INTO QUANTITY_UNIT(ID, DESCRIPTION, DIFFERENCE, NAME, BASE_UNIT_ID)
VALUES (1, 'unit of weight grams [g]', 0, 'g', NULL),
       (2, 'unit of weight kilograms [kg]', 1000, 'kg', 1),
       (3, 'unit of weight milligrams [mg]', 0.001, 'mg', 1),
       (4, 'unit', 0, '', NULL),
       (5, 'unit [K]', 1000, 'K', 4),
       (6, 'unit [M]', 1000, 'M', 5),
       (7, 'unit of length meters [m]', 0, 'm', NULL),
       (8, 'unit of weight kilometers [km]', 0, 'km', 7);

INSERT INTO EC_PRODUCT(id, created_by, created_date, last_modified_by, last_modified_date, currency, description, name,
                       price, quantity, quantity_unit_id)
VALUES (1, 'admin', '2021-01-06 18:01:09.000000', null, null, 'UZS', 'very good t-shirt', 't-shirt', 72000.00, 100, 4),
       (2, 'admin', '2021-01-06 18:01:09.000000', null, null, 'UZS', 'very goot sweeter', 'sweater', 102000.00, 1, 5),
       (3, 'admin', '2021-01-06 18:01:09.000000', null, null, 'UZS', 'very goot jaket', 'jaket', 102000.00, 1, 5),
       (4, 'admin', '2021-01-06 18:01:09.000000', null, null, 'UZS', 'very goot sweeter', 'sweater', 102000.00, 1, 5),
       (5, 'admin', '2021-01-06 18:01:09.000000', null, null, 'UZS', 'very goot sweeter', 'sweater', 102000.00, 1, 5);