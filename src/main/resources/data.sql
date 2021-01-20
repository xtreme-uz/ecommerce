INSERT INTO EC_PRODUCT(id, created_by, created_date, last_modified_by, last_modified_date, currency, description, name,
                       price, quantity)
VALUES (1, 'admin', '2021-01-06 18:01:09.000000', null, null, 'UZS', 'very good t-shirt', 't-shirt', 72000.00, 100),
       (2, 'admin', '2021-01-06 18:01:09.000000', null, null, 'UZS', 'very goot sweeter', 'sweater', 102000.00, 10),
       (3, 'admin', '2021-01-06 18:01:09.000000', null, null, 'UZS', 'very goot jaket', 'jaket', 102000.00, 10),
       (4, 'admin', '2021-01-06 18:01:09.000000', null, null, 'UZS', 'very goot sweeter', 'sweater', 102000.00, 10),
       (5, 'admin', '2021-01-06 18:01:09.000000', null, null, 'UZS', 'very goot sweeter', 'sweater', 102000.00, 10);

INSERT INTO EC_USER(id, created_by, created_date, last_modified_by, last_modified_date, username, password,
                    first_name, last_name)
VALUES (1, 'admin', '2021-01-06 18:01:09.000000', null, null, 'alijon', '$2y$12$oyCbYnhL./PzDjLRi6wKT.HWY6Z19KyGFjobJEzlo9tUrW0w/CPaq ', 'Alijon', 'Valiyev'),
       (2, 'admin', '2021-01-06 18:01:09.000000', null, null, 'valijon', '$2y$12$oyCbYnhL./PzDjLRi6wKT.HWY6Z19KyGFjobJEzlo9tUrW0w/CPaq ', 'Valijon', 'Soliyev'),
       (3, 'admin', '2021-01-06 18:01:09.000000', null, null, 'solijon', '$2y$12$oyCbYnhL./PzDjLRi6wKT.HWY6Z19KyGFjobJEzlo9tUrW0w/CPaq ', 'Solijon', 'Omonov'),
       (4, 'admin', '2021-01-06 18:01:09.000000', null, null, 'omonjon', '$2y$12$oyCbYnhL./PzDjLRi6wKT.HWY6Z19KyGFjobJEzlo9tUrW0w/CPaq ', 'Omonjon', 'Toychiyev');

INSERT INTO EC_ORDER(id, created_by, created_date, last_modified_by, last_modified_date, state, customer_id)
VALUES (1, 'alijon', '2021-01-06 18:01:09.000000', null, null, 'NEW', 1),
       (2, 'valijon', '2021-01-06 18:01:09.000000', null, null, 'PAID', 2),
       (3, 'solijon', '2021-01-06 18:01:09.000000', null, null, 'SHIPPED', 3),
       (4, 'omonjon', '2021-01-06 18:01:09.000000', null, null, 'DELIVERED', 4);

INSERT INTO EC_ORDER_ITEM(id, created_by, created_date, last_modified_by, last_modified_date, quantity,
                          order_id, product_id)
VALUES (1, 'alijon', '2021-01-06 18:01:09.000000', null, null, 4, 1, 1),
       (2, 'alijon', '2021-01-06 18:01:09.000000', null, null, 1, 1, 2),
       (3, 'valijon', '2021-01-06 18:01:09.000000', null, null, 1, 2, 4),
       (4, 'solijon', '2021-01-06 18:01:09.000000', null, null, 1, 3, 4),
       (5, 'solijon', '2021-01-06 18:01:09.000000', null, null, 1, 3, 5),
       (6, 'omonjon', '2021-01-06 18:01:09.000000', null, null, 1, 4, 1);

