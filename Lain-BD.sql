-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: lain
-- ------------------------------------------------------
-- Server version	8.0.19

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `claveadmin`
--

DROP TABLE IF EXISTS `claveadmin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `claveadmin` (
  `Clave` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `claveadmin`
--

LOCK TABLES `claveadmin` WRITE;
/*!40000 ALTER TABLE `claveadmin` DISABLE KEYS */;
INSERT INTO `claveadmin` VALUES ('clave');
/*!40000 ALTER TABLE `claveadmin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medicina`
--

DROP TABLE IF EXISTS `medicina`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `medicina` (
  `Nombre` varchar(45) NOT NULL,
  `Aplicacion` varchar(45) NOT NULL,
  `Descripcion` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medicina`
--

LOCK TABLES `medicina` WRITE;
/*!40000 ALTER TABLE `medicina` DISABLE KEYS */;
INSERT INTO `medicina` VALUES ('licuado de pastillas','Ambos','muchas pastillas'),('Inyeccion curativa','Inyeccion','Activo- cura');
/*!40000 ALTER TABLE `medicina` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medico`
--

DROP TABLE IF EXISTS `medico`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `medico` (
  `IDMedico` bigint NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Clave` varchar(45) NOT NULL,
  PRIMARY KEY (`IDMedico`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medico`
--

LOCK TABLES `medico` WRITE;
/*!40000 ALTER TABLE `medico` DISABLE KEYS */;
INSERT INTO `medico` VALUES (123,'Jona','123');
/*!40000 ALTER TABLE `medico` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `paciente`
--

DROP TABLE IF EXISTS `paciente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `paciente` (
  `IDPaciente` bigint NOT NULL,
  `Nombre` varchar(60) DEFAULT NULL,
  `FechaNacimiento` varchar(45) NOT NULL,
  `Nacionalidad` varchar(45) NOT NULL,
  `EstadoEnfermedad` varchar(45) NOT NULL,
  `Genero` varchar(45) NOT NULL,
  `Correo` varchar(60) DEFAULT NULL,
  `Celular` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`IDPaciente`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paciente`
--

LOCK TABLES `paciente` WRITE;
/*!40000 ALTER TABLE `paciente` DISABLE KEYS */;
INSERT INTO `paciente` VALUES (123456,'Julian Rodriguez','17-Apr-2009','Rusia: Moscú.','Urgencia menor','Hombre','','3187765526'),(1046456,'Juan Manuel Rodriguez','19-Apr-2003','Brasil: Brasilia.','Urgencia menor','Hombre','JuanMa01@gmail.com',''),(10368592,'Pablo Rojas','11-Apr-1953','San Marino: San Marino.','Resucitacion','Hombre','','367678978'),(10687676,'Paola Sanchez','07-Apr-2007','México: Ciudad de México. (*)','Resucitacion','Mujer','SanchesFamily02@yahoo.com','3155898933'),(106582682,'Jonathan Baquero','11-Apr-1998','Portugal: Lisboa.','Resucitacion','Hombre','Jonathan.Baquero.2016@upb.edu.co','3187765526'),(122848956,'Diana Carolina Savedra','13-Apr-1974','Venezuela: Caracas.','Urgencia menor','Mujer','','369569586'),(1075868766,'Juanita Susana','15-Apr-1955','San Cristóbal y Nieves: Basseterre.','Emergencia','Mujer','Juana05@hotmail.com',''),(10456456456,'Carolina Garcia','19-Apr-2003','República Checa: Praga.','Urgencia','Mujer','',''),(10596825256,'Jairo Martines','10-Apr-2015','Angola: Luanda.','Resucitacion','Hombre','Jairo055@hotmail.com','315779986');
/*!40000 ALTER TABLE `paciente` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-04-23 17:15:22
