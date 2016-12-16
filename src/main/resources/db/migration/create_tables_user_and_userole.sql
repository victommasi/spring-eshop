CREATE TABLE tab_user (
	user_id INT PRIMARY KEY AUTO_INCREMENT,
	user_name VARCHAR(50) NOT NULL,
	user_password VARCHAR(50) NOT NULL,
	user_email VARCHAR(150) NOT NULL,
	user_enabled BOOLEAN NOT NULL,
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE tab_userrole (
	userrole_id INT PRIMARY KEY AUTO_INCREMENT,
	userrole_user VARCHAR(50) NOT NULL,
	userrole_role VARCHAR(50) NOT NULL,
	CONSTRAINT fk_userrole_user FOREIGN KEY (userrole_user) REFERENCES tab_user (user_id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;