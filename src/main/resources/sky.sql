USE sky;

DROP TABLE sky_user;

CREATE TABLE sky_user (
	id bigint PRIMARY KEY AUTO_INCREMENT,
	`name` varchar(50) NOT NULL,
	`password` varchar(50) NOT NULL,
	height int NOT NULL,
	weight int NOT NULL,
	sex int NOT NULL,
	birthday datetime NOT NULL,
	gmt_created datetime NOT NULL
)