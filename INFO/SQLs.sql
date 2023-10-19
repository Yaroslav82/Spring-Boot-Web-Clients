CREATE DATABASE demo_db;

CREATE TABLE IF NOT EXISTS clients
( id INTEGER NOT NULL AUTO_INCREMENT,
  image VARCHAR(255) NOT NULL,
  first_name VARCHAR(255) NOT NULL,
  last_name VARCHAR(255) NOT NULL,
  phone VARCHAR(255) NOT NULL,
  comment VARCHAR(255) NOT NULL,
  PRIMARY KEY (id)
);


INSERT INTO
	clients (image, first_name, last_name, phone, comment)
VALUES
	('t1.jpg', 'Michael', 'Paul', '555-1234567', 'Sed maximus eros quis leo congue ipsum sagittis.'),
	('t2.jpg', 'Henry', 'Doe', '555-3451122', 'Sed maximus eros quis leo congue ipsum sagittis.'),
	('t3.jpg', 'Laura', 'James', '555-3441135', 'Sed maximus eros quis leo congue ipsum sagittis.'),
	('t4.jpg', 'Rosy', 'Crisp', '555-3467432', 'Sed maximus eros quis leo congue ipsum sagittis.'),
	('t5.jpg', 'Carl', 'Lii', '555-3412454', 'Sed maximus eros quis leo congue ipsum sagittis.');


SELECT image, first_name, last_name, phone, comment FROM clients;