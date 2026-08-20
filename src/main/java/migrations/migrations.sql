create table product(
                        id serial primary key,
                        name varchar(100),
                        description text ,
                        unit_price double precision
) ;

create table stock_movement(
                               id serial primary key ,
                               created_at timestamp with time zone,
                               movement_type_id int ,
                               quantity int ,
                               product_id int,
                               constraint fk_movementt_type_id foreign key (movement_type_id) references movement_type(id),
                               constraint fk_product_id foreign key (product_id) references product(id)
);

create table movement_type(
                              id serial primary key ,
                              name varchar(50),
                              status boolean
);

INSERT INTO product (name, description, unit_price) VALUES
                                                        ('MacBook Air M3', '13-inch Apple MacBook Air with M3 chip', 1199.99),
                                                        ('MacBook Pro M3', '14-inch Apple MacBook Pro with M3 chip', 1999.99),
                                                        ('Dell XPS 13', '13-inch premium Dell laptop', 1399.99),
                                                        ('Lenovo ThinkPad E14', 'Business-oriented 14-inch laptop', 899.99),
                                                        ('HP Pavilion 15', '15-inch everyday laptop', 749.99),
                                                        ('ASUS ROG Strix G16', 'Gaming laptop with high-performance hardware', 1699.99),
                                                        ('Logitech MX Master 3S', 'Wireless ergonomic computer mouse', 99.99),
                                                        ('Logitech K380', 'Compact wireless keyboard', 49.99),
                                                        ('Dell UltraSharp 27', '27-inch 4K professional monitor', 499.99),
                                                        ('Samsung Odyssey G5', '27-inch curved gaming monitor', 329.99),
                                                        ('Apple Magic Mouse', 'Wireless mouse designed for Mac', 79.99),
                                                        ('Apple Magic Keyboard', 'Wireless keyboard designed for Mac', 99.99),
                                                        ('Sony WH-1000XM5', 'Wireless noise-cancelling headphones', 399.99),
                                                        ('AirPods Pro 2', 'Wireless Apple earbuds with noise cancellation', 249.99),
                                                        ('JBL Flip 6', 'Portable Bluetooth speaker', 129.99),
                                                        ('Samsung T7 SSD 1TB', 'Portable external 1TB SSD', 109.99),
                                                        ('Kingston 64GB USB', '64GB USB 3.2 flash drive', 14.99),
                                                        ('Anker USB-C Hub', 'Multi-port USB-C connectivity hub', 59.99),
                                                        ('TP-Link Archer AX55', 'Wi-Fi 6 wireless router', 119.99),
                                                        ('Epson EcoTank L3250', 'Wireless multifunction ink tank printer', 229.99);

INSERT INTO stock_movement
(created_at, movement_type_id, product_id, quantity)
VALUES
    ('2026-08-01 09:15:00+03', 1, 1, 20),
    ('2026-08-01 09:30:00+03', 1, 2, 15),
    ('2026-08-01 10:00:00+03', 1, 3, 25),
    ('2026-08-01 10:20:00+03', 1, 4, 30),
    ('2026-08-02 08:45:00+03', 1, 5, 20),

    ('2026-08-02 11:10:00+03', 2, 1, 3),
    ('2026-08-02 13:25:00+03', 2, 3, 5),
    ('2026-08-03 09:40:00+03', 1, 6, 10),
    ('2026-08-03 14:15:00+03', 2, 4, 4),
    ('2026-08-04 10:30:00+03', 1, 7, 50),

    ('2026-08-04 15:45:00+03', 2, 7, 8),
    ('2026-08-05 09:20:00+03', 1, 8, 40),
    ('2026-08-05 12:00:00+03', 2, 8, 6),
    ('2026-08-06 08:50:00+03', 1, 9, 15),
    ('2026-08-06 16:10:00+03', 2, 9, 2),

    ('2026-08-07 10:15:00+03', 1, 10, 20),
    ('2026-08-07 14:30:00+03', 2, 10, 5),
    ('2026-08-08 09:00:00+03', 1, 11, 30),
    ('2026-08-08 13:45:00+03', 2, 11, 7),
    ('2026-08-09 11:30:00+03', 1, 12, 25);

INSERT INTO movement_type ( name, status) VALUES
                                              ( 'IN', true),
                                              ( 'OUT', true);
