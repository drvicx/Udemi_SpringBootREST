# Udemi_SpringBootREST
Java Spring Boot REST webApp from UDEMI course <br>
[Spring & Hibernate for Beginners (includes Spring Boot)](https://www.udemy.com/course/spring-hibernate-tutorial/) <br>
by Chad Darby<br>
<br>

**=INFO**
- environment:<br>
  Java 1.8.0 <br>
  Maven 3.6.3 <br>

- dependencies:<br>
  Spring Boot 2.4.5 <br>
  Spring Boot Starter Web <br>
  Spring Boot Starter Data JPA <br>
  Spring Boot Starter Actuator <br>
  Spring Boot Starter Security (disabled) <br>
  JDBC MySQL Connector 8.0.23 <br>

- app endpoints:<br>
  http://localhost:7070/api <br>
  http://localhost:7070/api/test <br>
  http://localhost:7070/api/employees <br>
  http://localhost:7070/api/employees/1 <br>

- endpoints authorization (disabled):<br>
  username: admin<br>
  password: 1234@admin<br>
  <br>

**=CHANGE LOG**<br>
*new at the beginning

**20210528_1245:** _(C)reate, (U)pdate, (D)elete records from MySQL DB_
[">commits"](https://github.com/drvicx/Udemi_SpringBootREST/pull/6/commits)
<pre>
-- 462 - Spring Boot - Additional CRUD Methods for DAO (create, update, delete record);
-- Spring Security is disabled due authorization problems on rest crud operations;
</pre>

**20210528_1125:** _Add Hibernate and JPA + Connect to MySQL DB + (R)ead records from DB_
[">commits"](https://github.com/drvicx/Udemi_SpringBootREST/pull/4/commits)
<pre>
-- 456 - Spring Boot - REST CRUD Real-Time Project Overview and Database Set Up;
-- 457 - Spring Boot - Create Project with Spring Initializr;
-- 458 - Spring Boot - Integrating Hibernate and JPA;
-- 459 - Spring Boot - Configuring the Spring Boot Data Source;
-- 460 - Spring Boot - Developing the DAO Interface and Implementation;
-- 461 - Spring Boot - Creating REST Controller Methods;
-- 462 - Spring Boot - Additional CRUD Methods for DAO (get/read records, get record by Id);
</pre>

**20210524_1130:** _Create & Explore SpringBoot Project_
[">commits"](https://github.com/drvicx/Udemi_SpringBootREST/pull/3/commits)
<pre>
-- 441 - Spring Boot - What is Spring Boot;
-- 442 - Spring Boot - Creating a Project with Spring Boot Initializr;
-- 443 - Spring Boot - Developing a REST API Controller with Spring Boot;
-- 444 - Spring Boot - Exploring the Spring Boot Project Structure - Part 1;
-- 445 - Spring Boot - Exploring the Spring Boot Project Structure - Part 2;
-- 446 - Spring Boot - Spring Boot Starters - A Curated List of Dependencies;
-- 447 - Spring Boot - Parents for Spring Boot Starters;
-- 448 - Spring Boot - Dev Tools;
-- 449 - Spring Boot - Spring Boot Actuator - Overview;
-- 450 - Spring Boot - Spring Boot Actuator - Accessing Actuator Endpoints;
-- 451 - Spring Boot - Spring Boot Actuator - Applying Security to Actuator Endpoints;
-- 452 - Spring Boot - Running Spring Boot Apps from the Command Line - Overview;
-- 453 - Spring Boot - Running Spring Boot Apps from the Command Line - Coding;
-- 454 - Spring Boot - Injecting Custom Application Properties;
-- 455 - Spring Boot - Configuring the Spring Boot Server;
</pre>
<br>
