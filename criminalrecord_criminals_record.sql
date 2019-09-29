CREATE DATABASE  IF NOT EXISTS `criminalrecord` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `criminalrecord`;
-- MySQL dump 10.13  Distrib 8.0.12, for Win64 (x86_64)
--
-- Host: localhost    Database: criminalrecord
-- ------------------------------------------------------
-- Server version	8.0.12

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `criminals_record`
--

DROP TABLE IF EXISTS `criminals_record`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `criminals_record` (
  `criminal_id` varchar(255) NOT NULL,
  `full_name` varchar(255) DEFAULT NULL,
  `mobile` bigint(10) DEFAULT NULL,
  `assigned_work` varchar(255) DEFAULT NULL,
  `blood_group` varchar(4) DEFAULT NULL,
  `crime_type` varchar(255) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `entered_time` time DEFAULT NULL,
  `dna` tinyint(1) DEFAULT NULL,
  `finger_prints` bit(1) DEFAULT NULL,
  `images` bit(1) DEFAULT NULL,
  `retina` bit(1) DEFAULT NULL,
  `health_condition` varchar(255) DEFAULT NULL,
  `jail_name` varchar(255) DEFAULT NULL,
  `cell_no` int(100) DEFAULT NULL,
  `punishment_duration` int(100) DEFAULT NULL,
  `meeting_date` date DEFAULT NULL,
  `meeting_person` varchar(45) DEFAULT NULL,
  `meeting_time` time DEFAULT NULL,
  PRIMARY KEY (`criminal_id`),
  UNIQUE KEY `criminal_id_UNIQUE` (`criminal_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `criminals_record`
--

LOCK TABLES `criminals_record` WRITE;
/*!40000 ALTER TABLE `criminals_record` DISABLE KEYS */;
INSERT INTO `criminals_record` VALUES ('CRM001','kollam',9587481542,'wipping','O+','killing','1992-02-12','11:12:32',23,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `criminals_record` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-09-29 22:02:32
