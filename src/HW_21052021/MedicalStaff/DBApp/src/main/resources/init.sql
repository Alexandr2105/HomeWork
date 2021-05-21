CREATE SCHEMA IF NOT EXISTS test;
USE test;

DROP TABLE IF EXISTS doctors;
CREATE TABLE doctors(id BIGINT PRIMARY KEY AUTO_INCREMENT,name VARCHAR(100),surname VARCHAR(100),patronymic VARCHAR(100),age VARCHAR(100),
    position VARCHAR(100), specialization VARCHAR(100));

INSERT INTO doctors(name,surname,patronymic,age,position,specialization)VALUES('Петр','Петров','Петрович','34','Врач','Педиатр');
INSERT INTO doctors(name,surname,patronymic,age,position,specialization)VALUES('Иванова','Ивана','Ивановна','45','Врач','Гинеколог');
INSERT INTO doctors(name,surname,patronymic,age,position,specialization)VALUES('Сидорова','Галина','Сидоровна','43','Врач','Акушер');
INSERT INTO doctors(name,surname,patronymic,age,position,specialization)VALUES('Алексеев','Алексей','Алексеевич','26','Врач','Андролог');
INSERT INTO doctors(name,surname,patronymic,age,position,specialization)VALUES('Петрова','Петра','Петровна','53','Врач','Вирусолог');