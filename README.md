# spring-boot-oauth2
spring-boot api with oauth2 <br /> 
database mysql with flyway

# running project
* create database api and user <br />
  - CREATE USER 'user_api'@'localhost' IDENTIFIED BY 'password';
  - GRANT ALL PRIVILEGES ON *.* TO 'user_api'@'localhost' IDENTIFIED BY 'password';
  - CREATE DATABASE API
* mvn clean spring-boot:run

# flyway database
mvn flyway:clean flyway:migrate

# login 
* username : user / admin
* password : password
