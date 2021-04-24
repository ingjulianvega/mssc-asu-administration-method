DROP DATABASE IF EXISTS administrationmethodservice ;
DROP USER IF EXISTS `administration_method_service`@`%`;
CREATE DATABASE IF NOT EXISTS administrationmethodservice CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
CREATE USER IF NOT EXISTS `administration_method_service`@`%` IDENTIFIED WITH mysql_native_password BY 'password';
GRANT SELECT, INSERT, UPDATE, DELETE, CREATE, DROP, REFERENCES, INDEX, ALTER, EXECUTE, CREATE VIEW, SHOW VIEW,
CREATE ROUTINE, ALTER ROUTINE, EVENT, TRIGGER ON `administrationmethodservice`.* TO `administration_method_service`@`%`;
FLUSH PRIVILEGES;