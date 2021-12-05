-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema RENTALSYSTEM
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `RENTALSYSTEM` ;

-- -----------------------------------------------------
-- Schema RENTALSYSTEM
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `RENTALSYSTEM` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `RENTALSYSTEM` ;

-- -----------------------------------------------------
-- Table `RENTALSYSTEM`.`fee`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `RENTALSYSTEM`.`fee` ;

CREATE TABLE IF NOT EXISTS `RENTALSYSTEM`.`fee` (
  `managerID` INT NOT NULL,
  `amount` INT NOT NULL,
  `period` INT NOT NULL,
  PRIMARY KEY (`managerID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `RENTALSYSTEM`.`notifications`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `RENTALSYSTEM`.`notifications` ;

CREATE TABLE IF NOT EXISTS `RENTALSYSTEM`.`notifications` (
  `renterID` INT NOT NULL,
  `type` VARCHAR(45) NULL DEFAULT NULL,
  `bedrooms` INT NULL DEFAULT NULL,
  `bathrooms` INT NULL DEFAULT NULL,
  `furnished` INT NULL DEFAULT NULL,
  `quadrant` VARCHAR(2) NULL DEFAULT NULL,
  PRIMARY KEY (`renterID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `RENTALSYSTEM`.`property`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `RENTALSYSTEM`.`property` ;

CREATE TABLE IF NOT EXISTS `RENTALSYSTEM`.`property` (
  `propertyID` INT NOT NULL,
  `landLordID` INT NULL DEFAULT NULL,
  `address` VARCHAR(300) NULL DEFAULT NULL,
  `type` VARCHAR(45) NULL DEFAULT NULL,
  `bedrooms` INT NULL DEFAULT NULL,
  `bathrooms` INT NULL DEFAULT NULL,
  `furnished` INT NULL DEFAULT NULL,
  `quadrant` VARCHAR(2) NULL DEFAULT NULL,
  `status` VARCHAR(45) NULL DEFAULT NULL,
  `submitted` VARCHAR(45) NULL DEFAULT NULL,
  `expiry` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`propertyID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `RENTALSYSTEM`.`user`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `RENTALSYSTEM`.`user` ;

CREATE TABLE IF NOT EXISTS `RENTALSYSTEM`.`user` (
  `userID` INT NOT NULL,
  `Email` VARCHAR(100) NULL DEFAULT NULL,
  `Password` VARCHAR(45) NULL DEFAULT NULL,
  `FirstName` VARCHAR(45) NULL DEFAULT NULL,
  `LastName` VARCHAR(45) NULL DEFAULT NULL,
  `userType` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`userID`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;