
INSERT INTO tb_user(name,email,password) VALUES ('fulano','fulano@gmail.com','$2a$12$Ij9tr25tXHfjhcGiD5WWL.CR8gei0gQS28jbkUfmsd5KmSYTUwASe'); 
INSERT INTO tb_user(name,email,password) VALUES ('Ciclano','ciclano@gmail.com','$2a$12$Ij9tr25tXHfjhcGiD5WWL.CR8gei0gQS28jbkUfmsd5KmSYTUwASe'); 
INSERT INTO tb_user(name,email,password) VALUES ('Beltrano','beltrano@gmail.com','$2a$12$Ij9tr25tXHfjhcGiD5WWL.CR8gei0gQS28jbkUfmsd5KmSYTUwASe');

INSERT INTO tb_role(authority) VALUES ('ROLE_OPERATOR'); 
INSERT INTO tb_role(authority) VALUES ('ROLE_ADMIN'); 
INSERT INTO tb_role(authority) VALUES ('ROLE_SHERMANN'); 

INSERT INTO tb_user_role(user_id, role_id) VALUES (1,1);
INSERT INTO tb_user_role(user_id, role_id) VALUES (2,2);
INSERT INTO tb_user_role(user_id, role_id) VALUES (3,3);
