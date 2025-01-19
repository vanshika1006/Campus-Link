-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: sms
-- ------------------------------------------------------
-- Server version	8.0.40

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `courses`
--

DROP TABLE IF EXISTS `courses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `courses` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `semester` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `courses`
--

LOCK TABLES `courses` WRITE;
/*!40000 ALTER TABLE `courses` DISABLE KEYS */;
INSERT INTO `courses` VALUES (1,'BET',1),(2,'OOPS',5),(3,'COA',4),(4,'DBMS',5),(5,'SNS',5),(6,'DAA',4),(7,'OS',4),(8,'AEC',3),(9,'DE',3),(10,'MATHS-3',3),(11,'SNS',5);
/*!40000 ALTER TABLE `courses` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `students`
--

DROP TABLE IF EXISTS `students`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `students` (
  `id` bigint NOT NULL,
  `name` varchar(255) NOT NULL,
  `semester` int NOT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `students`
--

LOCK TABLES `students` WRITE;
/*!40000 ALTER TABLE `students` DISABLE KEYS */;
INSERT INTO `students` VALUES (1,'Vanshika',1,'qwerty'),(2,'Parth',4,'parth'),(3,'Paras',4,'paras'),(4,'Yogita',6,'yogita'),(5,'Shubham',6,'shubham'),(6,'Anjali',5,'anjali'),(7,'Neeraj',2,'4567'),(8,'Virat',7,'van'),(9,'Vansh',6,'vansh'),(10,'Vanshik',6,'vanshika'),(11,'Pranjal',5,'pranjal'),(12,'Rohit Sharma',7,'worldcup'),(13,'Anjali',6,'uiop'),(14,'Anjali',5,'asdf'),(15,'Anjali',7,'asdf'),(16,'Anjali',7,'asdf'),(17,'Anjali',2,'asdf'),(18,'Vanshika',2,'asdf'),(19,'Komal',2,'asdf'),(20,'Komal',7,'qwerty'),(21,'Komal',2,'qwerty'),(26,'Parth1',5,'uiop'),(34,'Vanshika',8,'hn'),(67,'Ram',8,'hn'),(68,'Anjali',7,'poiu'),(89,'Vanshika',8,'hn'),(90,'Parth',2,'qwerty'),(101,'Komal',1,'qwerty'),(114,'Vanshika',2,'pass'),(115,'Parth',8,'parth'),(150,'Vanshika',2,'rty');
/*!40000 ALTER TABLE `students` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `syllabus`
--

DROP TABLE IF EXISTS `syllabus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `syllabus` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `pdf_url` varchar(255) NOT NULL,
  `semester` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `syllabus`
--

LOCK TABLES `syllabus` WRITE;
/*!40000 ALTER TABLE `syllabus` DISABLE KEYS */;
INSERT INTO `syllabus` VALUES (1,'https://drive.google.com/file/d/1gLfhKpIkS10ipUWZ5zQVP9WXMBgDWrJi/view?usp=sharing',1),(2,'https://drive.google.com/file/d/1gLfhKpIkS10ipUWZ5zQVP9WXMBgDWrJi/view?usp=sharing',2),(3,'https://drive.google.com/file/d/1j-zR2QAhh9xZNdwDcudavvetbn8O9pph/view?usp=sharing',4),(4,'https://drive.google.com/file/d/1a9ZNbIx4bI6YUJoKTwR9_pAi7GbdXsrU/view?usp=sharing',3);
/*!40000 ALTER TABLE `syllabus` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `password` varchar(255) NOT NULL,
  `role` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'qwerty','STUDENT','Vanshika'),(2,'qwerty','TEACHER','NEELAM'),(3,'4567','STUDENT','Neeraj'),(4,'van','STUDENT','Virat'),(6,'vanshika','STUDENT','Vanshik'),(7,'pranjal','STUDENT','Pranjal'),(8,'yogita','TEACHER','Yogita'),(9,'worldcup','STUDENT','Rohit Sharma'),(10,'teacher','TEACHER','Teacher'),(11,'uiop','STUDENT','Anjali'),(17,'asdf','STUDENT','Komal'),(20,'parth','STUDENT','Parth'),(24,'hn','STUDENT','Ram'),(27,'uiop','STUDENT','Parth1'),(29,'poiu','STUDENT','Anjali'),(30,'qwerty','STUDENT','Parth'),(31,'qwerty','STUDENT','Komal'),(32,'rty','STUDENT','Vanshika');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'sms'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-01-19 10:06:54
