-- MariaDB dump 10.19  Distrib 10.4.24-MariaDB, for Win64 (AMD64)
--
-- Host: localhost    Database: successdb
-- ------------------------------------------------------
-- Server version	10.4.24-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `successdb`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `successdb` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;

USE `successdb`;

--
-- Table structure for table `attndance_table`
--

DROP TABLE IF EXISTS `attndance_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `attndance_table` (
  `Date` date NOT NULL,
  `Subj_Name` varchar(80) NOT NULL,
  `Tchr_Name` varchar(100) NOT NULL,
  `Std_ID` int(11) NOT NULL,
  `Std_Name` varchar(100) NOT NULL,
  `Status` varchar(10) NOT NULL,
  `Spc_Note` varchar(250) DEFAULT NULL,
  `Grade` varchar(10) NOT NULL,
  PRIMARY KEY (`Date`,`Subj_Name`,`Std_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `attndance_table`
--

LOCK TABLES `attndance_table` WRITE;
/*!40000 ALTER TABLE `attndance_table` DISABLE KEYS */;
/*!40000 ALTER TABLE `attndance_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `payment_table`
--

DROP TABLE IF EXISTS `payment_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `payment_table` (
  `payment_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Std_ID` int(11) NOT NULL,
  `Std_Name` varchar(100) NOT NULL,
  `Subj_Names` varchar(80) NOT NULL,
  `Payment_fee` varchar(10) NOT NULL,
  `Grade` varchar(10) NOT NULL,
  `Month` varchar(10) NOT NULL,
  `Date_paid` date NOT NULL,
  `Year` varchar(4) NOT NULL,
  PRIMARY KEY (`payment_ID`,`Std_ID`,`Month`,`Year`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payment_table`
--

LOCK TABLES `payment_table` WRITE;
/*!40000 ALTER TABLE `payment_table` DISABLE KEYS */;
/*!40000 ALTER TABLE `payment_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `std_info_table`
--

DROP TABLE IF EXISTS `std_info_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `std_info_table` (
  `Std_ID` int(11) NOT NULL AUTO_INCREMENT,
  `Std_Name` varchar(100) NOT NULL,
  `Name_with_Initials` varchar(80) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `DOB` date NOT NULL,
  `Subjects` varchar(200) NOT NULL,
  `Grade` varchar(12) NOT NULL,
  `Phone_no` varchar(35) NOT NULL,
  `sex` varchar(7) NOT NULL,
  `Grd_name` varchar(100) NOT NULL,
  `Grd_Phone_no` varchar(35) NOT NULL,
  `ol_yr` varchar(4) NOT NULL,
  PRIMARY KEY (`Std_ID`)
) ENGINE=MyISAM AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `std_info_table`
--

LOCK TABLES `std_info_table` WRITE;
/*!40000 ALTER TABLE `std_info_table` DISABLE KEYS */;
/*!40000 ALTER TABLE `std_info_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tchr_info_table`
--

DROP TABLE IF EXISTS `tchr_info_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tchr_info_table` (
  `Tchr_ID` int(4) NOT NULL AUTO_INCREMENT,
  `Tchr_Name` varchar(100) NOT NULL,
  `Name_with_Initials` varchar(80) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `Phone_no` varchar(35) NOT NULL,
  `sex` varchar(7) NOT NULL,
  `NIC` varchar(15) NOT NULL,
  `Subj_Name` varchar(80) NOT NULL,
  `Payment_Fees` varchar(10) NOT NULL,
  `DOB` date NOT NULL,
  PRIMARY KEY (`Tchr_ID`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tchr_info_table`
--

LOCK TABLES `tchr_info_table` WRITE;
/*!40000 ALTER TABLE `tchr_info_table` DISABLE KEYS */;
/*!40000 ALTER TABLE `tchr_info_table` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'successdb'
--
/*!50106 SET @save_time_zone= @@TIME_ZONE */ ;
/*!50106 DROP EVENT IF EXISTS `cleaning` */;
DELIMITER ;;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;;
/*!50003 SET character_set_client  = utf8mb4 */ ;;
/*!50003 SET character_set_results = utf8mb4 */ ;;
/*!50003 SET collation_connection  = utf8mb4_unicode_ci */ ;;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;;
/*!50003 SET sql_mode              = 'NO_ZERO_IN_DATE,NO_ZERO_DATE,NO_ENGINE_SUBSTITUTION' */ ;;
/*!50003 SET @saved_time_zone      = @@time_zone */ ;;
/*!50003 SET time_zone             = 'SYSTEM' */ ;;
/*!50106 CREATE*/ /*!50117 DEFINER=`root`@`localhost`*/ /*!50106 EVENT `cleaning` ON SCHEDULE EVERY 1 YEAR STARTS '2024-01-01 00:00:00' ON COMPLETION NOT PRESERVE ENABLE DO BEGIN
    DELETE FROM attndance_table
    WHERE Date < CONCAT(YEAR(CURRENT_DATE) - 1, '-01-01 00:00:00');

    DELETE FROM payment_table
    WHERE Date_paid < CONCAT(YEAR(CURRENT_DATE) - 1, '-01-01 00:00:00');
END */ ;;
/*!50003 SET time_zone             = @saved_time_zone */ ;;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;;
/*!50003 SET character_set_client  = @saved_cs_client */ ;;
/*!50003 SET character_set_results = @saved_cs_results */ ;;
/*!50003 SET collation_connection  = @saved_col_connection */ ;;
DELIMITER ;
/*!50106 SET TIME_ZONE= @save_time_zone */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-04-11 12:15:49
