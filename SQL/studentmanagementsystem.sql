-- MySQL dump 10.13  Distrib 5.1.73, for Win32 (ia32)
--
-- Host: localhost    Database: studentmanagementsystem
-- ------------------------------------------------------
-- Server version	5.1.73-community

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `colorchoice`
--

DROP TABLE IF EXISTS `colorchoice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `colorchoice` (
  `username` varchar(40) DEFAULT NULL,
  `color` varchar(10) DEFAULT NULL,
  KEY `username` (`username`),
  CONSTRAINT `colorchoice_ibfk_1` FOREIGN KEY (`username`) REFERENCES `login` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `colorchoice`
--

LOCK TABLES `colorchoice` WRITE;
/*!40000 ALTER TABLE `colorchoice` DISABLE KEYS */;
INSERT INTO `colorchoice` VALUES ('rohit','blue'),('harsharora','green');
/*!40000 ALTER TABLE `colorchoice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `coral`
--

DROP TABLE IF EXISTS `coral`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `coral` (
  `username` varchar(40) DEFAULT NULL,
  `rollno` int(11) NOT NULL DEFAULT '0',
  `name` varchar(40) DEFAULT NULL,
  `accountancy` int(11) DEFAULT NULL,
  `buisnessstudies` int(11) DEFAULT NULL,
  `economics` int(11) DEFAULT NULL,
  `maths` int(11) DEFAULT NULL,
  `english` int(11) DEFAULT NULL,
  `physical` int(11) DEFAULT NULL,
  `IP` int(11) DEFAULT NULL,
  `IT` int(11) DEFAULT NULL,
  PRIMARY KEY (`rollno`),
  KEY `username` (`username`),
  CONSTRAINT `coral_ibfk_1` FOREIGN KEY (`username`) REFERENCES `login` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `coral`
--

LOCK TABLES `coral` WRITE;
/*!40000 ALTER TABLE `coral` DISABLE KEYS */;
/*!40000 ALTER TABLE `coral` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `diamond`
--

DROP TABLE IF EXISTS `diamond`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `diamond` (
  `username` varchar(40) DEFAULT NULL,
  `rollno` int(11) NOT NULL DEFAULT '0',
  `name` varchar(40) DEFAULT NULL,
  `accountancy` int(11) DEFAULT NULL,
  `buisnessstudies` int(11) DEFAULT NULL,
  `economics` int(11) DEFAULT NULL,
  `maths` int(11) DEFAULT NULL,
  `english` int(11) DEFAULT NULL,
  `physical` int(11) DEFAULT NULL,
  `IP` int(11) DEFAULT NULL,
  `IT` int(11) DEFAULT NULL,
  PRIMARY KEY (`rollno`),
  KEY `username` (`username`),
  CONSTRAINT `diamond_ibfk_1` FOREIGN KEY (`username`) REFERENCES `login` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `diamond`
--

LOCK TABLES `diamond` WRITE;
/*!40000 ALTER TABLE `diamond` DISABLE KEYS */;
/*!40000 ALTER TABLE `diamond` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `emerald`
--

DROP TABLE IF EXISTS `emerald`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `emerald` (
  `username` varchar(40) DEFAULT NULL,
  `rollno` int(11) NOT NULL DEFAULT '0',
  `name` varchar(40) DEFAULT NULL,
  `physics` int(11) DEFAULT NULL,
  `chemistry` int(11) DEFAULT NULL,
  `maths` int(11) DEFAULT NULL,
  `biology` int(11) DEFAULT NULL,
  `english` int(11) DEFAULT NULL,
  `physical` int(11) DEFAULT NULL,
  `IP` int(11) DEFAULT NULL,
  `IT` int(11) DEFAULT NULL,
  PRIMARY KEY (`rollno`),
  KEY `username` (`username`),
  CONSTRAINT `emerald_ibfk_1` FOREIGN KEY (`username`) REFERENCES `login` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `emerald`
--

LOCK TABLES `emerald` WRITE;
/*!40000 ALTER TABLE `emerald` DISABLE KEYS */;
INSERT INTO `emerald` VALUES ('emeraldstu',98,'Emerald student',89,87,10,NULL,68,90,NULL,NULL);
/*!40000 ALTER TABLE `emerald` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `login` (
  `username` varchar(40) NOT NULL,
  `password` varchar(40) DEFAULT NULL,
  `category` char(1) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES ('arunlata','d9e1f250266f9850b56e170348e85b64','T'),('darshana','af63d3f32c07622be553999677b7924c','T'),('deepa','29987ce14a9c7b9137f616843eca049b','T'),('deepti','99cbfc815db6fc6c0a83c97137c7ea40','T'),('emeraldstu','e01adce37d6becba35884242ae1c45ef','S'),('garima','2b882400855082a1b1a97cedf64cb413','T'),('gayatri','34eace700b79730481c17bab7e2657e1','T'),('harsharora','1485c4e7c2d03a4e9430c9afbc9e563d','T'),('harshkalra','6617b815554d329f5efbbc32d1655ee6','T'),('joshi','b3788bcd67c03c198bac32c51290f1cf','T'),('kadian','b57ec6aa54a47d35821c3a09745c623d','T'),('lagan','37452c22edbd426706001911e97eff02','T'),('manisha','247e0a31048554f35902283df30263ab','T'),('manoj','5e81f9859d223ea420aca993c647b839','T'),('meenakshi','d6a63480a2d0ad587dfde678fb52f7e0','T'),('menka','3ffb155e9b83c4291b00abd310717065','T'),('mukul','ba5e3f51a592e97df7ad94b2c1cd68fd','S'),('parijat','5d26d77a5322c29386884c4574013fe6','T'),('pradeepvats','4f6e034da1f433a21052ab08bbd99a1c','T'),('rahul','439ed537979d8e831561964dbbbd7413','T'),('renu','ef88f3f374aa10d1493757bb6a4046a6','T'),('rohit','2d235ace000a3ad85f590e321c89bb99','T'),('sangeeta','53e4b726be6b228f12016784213aaed1','T'),('sarvan','a2fb414f31fa95eb5ffc208d9bc79041','T'),('sheela','d08b6ed126fcfc670168916a9384e0fc','T'),('shweta','4207e1e6e3809688a8b9ed1b2c1b7faa','T'),('test1','5a105e8b9d40e1329780d62ea2265d8a','S'),('testcom','8e11fab3bc24734833e9de1d706d0c45','S'),('testcomm','ed4806b48d3be75b9ddf625ac38708e0','S'),('testemd2','1f4c1ae51fc652b3379e3d7794d57597','S'),('teststudent','5d9b4ef4d109e9641fcc7b6396d07d1a','S'),('testuser','5d9c68c6c50ed3d02a2fcf54f63993b6','T'),('vinod','d2c51c9cde1f15b718296c99ae362fb1','T');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pearl`
--

DROP TABLE IF EXISTS `pearl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pearl` (
  `username` varchar(40) DEFAULT NULL,
  `rollno` int(11) NOT NULL DEFAULT '0',
  `name` varchar(40) DEFAULT NULL,
  `physics` int(11) DEFAULT NULL,
  `chemistry` int(11) DEFAULT NULL,
  `maths` int(11) DEFAULT NULL,
  `biology` int(11) DEFAULT NULL,
  `english` int(11) DEFAULT NULL,
  `physical` int(11) DEFAULT NULL,
  `IP` int(11) DEFAULT NULL,
  `IT` int(11) DEFAULT NULL,
  PRIMARY KEY (`rollno`),
  KEY `username` (`username`),
  CONSTRAINT `pearl_ibfk_1` FOREIGN KEY (`username`) REFERENCES `login` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pearl`
--

LOCK TABLES `pearl` WRITE;
/*!40000 ALTER TABLE `pearl` DISABLE KEYS */;
/*!40000 ALTER TABLE `pearl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ruby`
--

DROP TABLE IF EXISTS `ruby`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ruby` (
  `username` varchar(40) DEFAULT NULL,
  `rollno` int(11) NOT NULL DEFAULT '0',
  `name` varchar(40) DEFAULT NULL,
  `accountancy` int(11) DEFAULT NULL,
  `buisnessstudies` int(11) DEFAULT NULL,
  `economics` int(11) DEFAULT NULL,
  `maths` int(11) DEFAULT NULL,
  `english` int(11) DEFAULT NULL,
  `physical` int(11) DEFAULT NULL,
  `IP` int(11) DEFAULT NULL,
  `IT` int(11) DEFAULT NULL,
  PRIMARY KEY (`rollno`),
  KEY `username` (`username`),
  CONSTRAINT `ruby_ibfk_1` FOREIGN KEY (`username`) REFERENCES `login` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ruby`
--

LOCK TABLES `ruby` WRITE;
/*!40000 ALTER TABLE `ruby` DISABLE KEYS */;
INSERT INTO `ruby` VALUES ('testcom',78,'Test Com',98,87,75,87,53,NULL,NULL,NULL);
/*!40000 ALTER TABLE `ruby` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `saphire`
--

DROP TABLE IF EXISTS `saphire`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `saphire` (
  `username` varchar(40) DEFAULT NULL,
  `rollno` int(11) DEFAULT NULL,
  `name` varchar(40) DEFAULT NULL,
  `economics` int(11) DEFAULT NULL,
  `politicalscience` int(11) DEFAULT NULL,
  `geography` int(11) DEFAULT NULL,
  `history` int(11) DEFAULT NULL,
  `english` int(11) DEFAULT NULL,
  `physical` int(11) DEFAULT NULL,
  `IP` int(11) DEFAULT NULL,
  `IT` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `saphire`
--

LOCK TABLES `saphire` WRITE;
/*!40000 ALTER TABLE `saphire` DISABLE KEYS */;
/*!40000 ALTER TABLE `saphire` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sections_list`
--

DROP TABLE IF EXISTS `sections_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sections_list` (
  `section` varchar(20) NOT NULL,
  `stream` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`section`),
  KEY `stream` (`stream`),
  CONSTRAINT `sections_list_ibfk_1` FOREIGN KEY (`stream`) REFERENCES `stream_list` (`stream`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sections_list`
--

LOCK TABLES `sections_list` WRITE;
/*!40000 ALTER TABLE `sections_list` DISABLE KEYS */;
INSERT INTO `sections_list` VALUES ('Coral','Commerce'),('Diamond','Commerce'),('Ruby','Commerce'),('Saphire','Humanities'),('Emerald','Science'),('Pearl','Science'),('Topaz','Science');
/*!40000 ALTER TABLE `sections_list` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sectionstaught`
--

DROP TABLE IF EXISTS `sectionstaught`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sectionstaught` (
  `username` varchar(40) DEFAULT NULL,
  `section` varchar(40) DEFAULT NULL,
  KEY `username` (`username`),
  KEY `section` (`section`),
  CONSTRAINT `sectionstaught_ibfk_1` FOREIGN KEY (`username`) REFERENCES `login` (`username`),
  CONSTRAINT `sectionstaught_ibfk_2` FOREIGN KEY (`section`) REFERENCES `sections_list` (`section`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sectionstaught`
--

LOCK TABLES `sectionstaught` WRITE;
/*!40000 ALTER TABLE `sectionstaught` DISABLE KEYS */;
INSERT INTO `sectionstaught` VALUES ('manisha','emerald'),('manoj','emerald'),('vinod','emerald'),('deepa','emerald'),('sangeeta','emerald'),('rohit','emerald'),('harsharora','emerald'),('harsharora','topaz'),('rohit','topaz'),('meenakshi','topaz'),('joshi','topaz'),('vinod','topaz'),('kadian','topaz'),('sangeeta','topaz'),('pradeepvats','pearl'),('sheela','pearl'),('joshi','pearl'),('gayatri','pearl'),('rohit','pearl'),('harsharora','pearl'),('darshana','saphire'),('lagan','saphire'),('rahul','saphire'),('harshkalra','ruby'),('garima','ruby'),('arunlata','ruby'),('kadian','ruby'),('renu','ruby'),('rahul','coral'),('harshkalra','coral'),('sarvan','coral'),('deepti','coral'),('shweta','coral'),('parijat','coral'),('harsharora','coral'),('harsharora','ruby'),('rohit','ruby'),('rohit','saphire'),('harsharora','saphire');
/*!40000 ALTER TABLE `sectionstaught` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `stream_list`
--

DROP TABLE IF EXISTS `stream_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `stream_list` (
  `stream` varchar(30) NOT NULL DEFAULT '',
  PRIMARY KEY (`stream`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `stream_list`
--

LOCK TABLES `stream_list` WRITE;
/*!40000 ALTER TABLE `stream_list` DISABLE KEYS */;
INSERT INTO `stream_list` VALUES ('Commerce'),('Humanities'),('Science');
/*!40000 ALTER TABLE `stream_list` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `students_details`
--

DROP TABLE IF EXISTS `students_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `students_details` (
  `username` varchar(30) DEFAULT NULL,
  `Name` varchar(40) DEFAULT NULL,
  `Age` int(11) DEFAULT NULL,
  `Address` varchar(50) DEFAULT NULL,
  `PhoneNumber` varchar(10) DEFAULT NULL,
  `class` varchar(5) DEFAULT NULL,
  `section` varchar(20) DEFAULT NULL,
  `rollno` int(11) DEFAULT NULL,
  KEY `username` (`username`),
  KEY `section` (`section`),
  CONSTRAINT `students_details_ibfk_1` FOREIGN KEY (`username`) REFERENCES `login` (`username`),
  CONSTRAINT `students_details_ibfk_2` FOREIGN KEY (`section`) REFERENCES `sections_list` (`section`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `students_details`
--

LOCK TABLES `students_details` WRITE;
/*!40000 ALTER TABLE `students_details` DISABLE KEYS */;
INSERT INTO `students_details` VALUES ('teststudent','Test Student',16,'Sonipat','9873729993','XII','Pearl',NULL),('mukul','Mukul',17,'Sonipat','8298372948','XII','Topaz',NULL),('test1','Test1',16,'Delhi','8765767896','XII','Topaz',57),('testcomm','Test Commerce',16,'Sonipat','8473609234','XII','Diamond',76),('testcom','Test Com',13,'Sonipat','8372664028','XII','Ruby',78),('emeraldstu','Emerald Student',18,'Sonipat','8849399487','XII','Emerald',98),('testemd2','Test Emerald 2',17,'Sonipat','8837746502','XII','Emerald',90);
/*!40000 ALTER TABLE `students_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subjects_list`
--

DROP TABLE IF EXISTS `subjects_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `subjects_list` (
  `subjects` varchar(30) NOT NULL DEFAULT '',
  PRIMARY KEY (`subjects`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subjects_list`
--

LOCK TABLES `subjects_list` WRITE;
/*!40000 ALTER TABLE `subjects_list` DISABLE KEYS */;
INSERT INTO `subjects_list` VALUES ('Accountancy'),('Biology'),('Buisness Studies'),('Chemistry'),('Economics'),('English'),('Geography'),('History'),('Informatics Practices'),('Information Technology'),('Maths'),('Physical Education'),('Physics'),('Political Science');
/*!40000 ALTER TABLE `subjects_list` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teachers_details`
--

DROP TABLE IF EXISTS `teachers_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `teachers_details` (
  `username` varchar(40) DEFAULT NULL,
  `Name` varchar(30) DEFAULT NULL,
  `Age` int(11) DEFAULT NULL,
  `Address` varchar(50) DEFAULT NULL,
  `PhoneNumber` varchar(10) DEFAULT NULL,
  `Subject` varchar(30) DEFAULT NULL,
  KEY `username` (`username`),
  KEY `Subject` (`Subject`),
  CONSTRAINT `teachers_details_ibfk_1` FOREIGN KEY (`username`) REFERENCES `login` (`username`),
  CONSTRAINT `teachers_details_ibfk_2` FOREIGN KEY (`Subject`) REFERENCES `subjects_list` (`subjects`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teachers_details`
--

LOCK TABLES `teachers_details` WRITE;
/*!40000 ALTER TABLE `teachers_details` DISABLE KEYS */;
INSERT INTO `teachers_details` VALUES ('testuser','Test User',23,'Anything','8990283823','Maths');
/*!40000 ALTER TABLE `teachers_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `topaz`
--

DROP TABLE IF EXISTS `topaz`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `topaz` (
  `username` varchar(40) DEFAULT NULL,
  `rollno` int(11) NOT NULL DEFAULT '0',
  `name` varchar(40) DEFAULT NULL,
  `physics` int(11) DEFAULT NULL,
  `chemistry` int(11) DEFAULT NULL,
  `maths` int(11) DEFAULT NULL,
  `biology` int(11) DEFAULT NULL,
  `english` int(11) DEFAULT NULL,
  `physical` int(11) DEFAULT NULL,
  `IP` int(11) DEFAULT NULL,
  `IT` int(11) DEFAULT NULL,
  PRIMARY KEY (`rollno`),
  KEY `username` (`username`),
  CONSTRAINT `topaz_ibfk_1` FOREIGN KEY (`username`) REFERENCES `login` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `topaz`
--

LOCK TABLES `topaz` WRITE;
/*!40000 ALTER TABLE `topaz` DISABLE KEYS */;
INSERT INTO `topaz` VALUES ('test1',57,'Test5',98,32,12,NULL,43,NULL,43,NULL);
/*!40000 ALTER TABLE `topaz` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-07-07 21:49:16
