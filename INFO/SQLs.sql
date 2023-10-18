CREATE DATABASE demo_db;

CREATE TABLE IF NOT EXISTS clients
( id INTEGER NOT NULL AUTO_INCREMENT,
  image VARCHAR(255) NOT NULL,
  first_name VARCHAR(255) NOT NULL,
  last_name VARCHAR(255) NOT NULL,
  comment VARCHAR(255) NOT NULL,
  PRIMARY KEY (id)
);


INSERT INTO
	clients (image, first_name, last_name, comment)
VALUES
	('t1.jpg', 'Michael', 'Paul', 'Sed maximus eros quis leo congue ipsum sagittis.'),
	('t2.jpg', 'Henry', 'Doe', 'Sed maximus eros quis leo congue ipsum sagittis.'),
	('t3.jpg', 'Laura', 'James', 'Sed maximus eros quis leo congue ipsum sagittis.'),
	('t4.jpg', 'Rosy', 'Crisp', 'Sed maximus eros quis leo congue ipsum sagittis.'),
	('t5.jpg', 'Carl', 'Lii', 'Sed maximus eros quis leo congue ipsum sagittis.');


SELECT image, first_name, last_name, comment FROM clients;