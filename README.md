# Spring-Boot-Rest-JPA-MySQL-CRUD
Introduction
In this tutorial, I am going to show how to write REST APIs using Spring Boot and perform CRUD operations on the MySql Database. Let's start...



# Step 1: Database Design 
I am creating a single table just to demonstrate the CRUD operations. Use the following DB script to create the table structure. 

CREATE  TABLE `crud_example__db`.`project` (

  `id` INT NOT NULL AUTO_INCREMENT ,
  `project_name` VARCHAR(45) NULL ,
  `description` VARCHAR(45) NULL ,
  `start_date` DATE NULL ,
  `end_date` DATE NULL ,
  `status` BINARY NULL ,
  `created_on` DATETIME NULL ,
  `updated_on` DATETIME NULL ,
  PRIMARY KEY (`id`) );
