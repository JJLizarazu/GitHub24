-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         8.0.30 - MySQL Community Server - GPL
-- SO del servidor:              Win64
-- HeidiSQL Versión:             12.1.0.6537
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Volcando estructura de base de datos para db_gestioncursos
CREATE DATABASE IF NOT EXISTS `db_gestioncursos` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `db_gestioncursos`;

-- Volcando estructura para tabla db_gestioncursos.beca
CREATE TABLE IF NOT EXISTS `beca` (
  `id` int NOT NULL AUTO_INCREMENT,
  `tipo` varchar(50) NOT NULL,
  `descuento` int NOT NULL,
  `criterio` text,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla db_gestioncursos.curso
CREATE TABLE IF NOT EXISTS `curso` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `duracion` int NOT NULL,
  `descripcion` text,
  `id_profesor` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_profesor` (`id_profesor`),
  CONSTRAINT `curso_ibfk_1` FOREIGN KEY (`id_profesor`) REFERENCES `profesor` (`id`) ON DELETE SET NULL
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla db_gestioncursos.estudiante
CREATE TABLE IF NOT EXISTS `estudiante` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `edad` int NOT NULL,
  `correo` varchar(100) NOT NULL,
  `id_beca` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `correo` (`correo`),
  KEY `id_beca` (`id_beca`),
  CONSTRAINT `estudiante_ibfk_1` FOREIGN KEY (`id_beca`) REFERENCES `beca` (`id`) ON DELETE SET NULL
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para vista db_gestioncursos.estudiantesbecados
-- Creando tabla temporal para superar errores de dependencia de VIEW
CREATE TABLE `estudiantesbecados` (
	`Id Estudiante` INT(10) NOT NULL,
	`Estudiante` VARCHAR(100) NOT NULL COLLATE 'utf8mb4_0900_ai_ci',
	`correo` VARCHAR(100) NOT NULL COLLATE 'utf8mb4_0900_ai_ci',
	`Beca` VARCHAR(50) NULL COLLATE 'utf8mb4_0900_ai_ci',
	`descuento` INT(10) NULL
) ENGINE=MyISAM;

-- Volcando estructura para vista db_gestioncursos.estudiantesinscritos
-- Creando tabla temporal para superar errores de dependencia de VIEW
CREATE TABLE `estudiantesinscritos` (
	`Id Curso` INT(10) NOT NULL,
	`Curso` VARCHAR(100) NOT NULL COLLATE 'utf8mb4_0900_ai_ci',
	`Total Estudiantes` BIGINT(19) NOT NULL
) ENGINE=MyISAM;

-- Volcando estructura para tabla db_gestioncursos.evaluacion
CREATE TABLE IF NOT EXISTS `evaluacion` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `tipo` varchar(50) NOT NULL,
  `fecha` date NOT NULL,
  `id_curso` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_curso` (`id_curso`),
  CONSTRAINT `evaluacion_ibfk_1` FOREIGN KEY (`id_curso`) REFERENCES `curso` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla db_gestioncursos.inscripcion
CREATE TABLE IF NOT EXISTS `inscripcion` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_estudiante` int NOT NULL,
  `id_curso` int NOT NULL,
  `fecha` date NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_estudiante` (`id_estudiante`),
  KEY `id_curso` (`id_curso`),
  CONSTRAINT `inscripcion_ibfk_1` FOREIGN KEY (`id_estudiante`) REFERENCES `estudiante` (`id`) ON DELETE CASCADE,
  CONSTRAINT `inscripcion_ibfk_2` FOREIGN KEY (`id_curso`) REFERENCES `curso` (`id`) ON DELETE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla db_gestioncursos.profesor
CREATE TABLE IF NOT EXISTS `profesor` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(100) NOT NULL,
  `especialidad` varchar(100) DEFAULT NULL,
  `correo` varchar(100) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `correo` (`correo`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para vista db_gestioncursos.estudiantesbecados
-- Eliminando tabla temporal y crear estructura final de VIEW
DROP TABLE IF EXISTS `estudiantesbecados`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `estudiantesbecados` AS select `e`.`id` AS `Id Estudiante`,`e`.`nombre` AS `Estudiante`,`e`.`correo` AS `correo`,`b`.`tipo` AS `Beca`,`b`.`descuento` AS `descuento` from (`estudiante` `e` left join `beca` `b` on((`e`.`id_beca` = `b`.`id`)));

-- Volcando estructura para vista db_gestioncursos.estudiantesinscritos
-- Eliminando tabla temporal y crear estructura final de VIEW
DROP TABLE IF EXISTS `estudiantesinscritos`;
CREATE ALGORITHM=UNDEFINED SQL SECURITY DEFINER VIEW `estudiantesinscritos` AS select `c`.`id` AS `Id Curso`,`c`.`nombre` AS `Curso`,count(`i`.`id_estudiante`) AS `Total Estudiantes` from (`curso` `c` left join `inscripcion` `i` on((`c`.`id` = `i`.`id_curso`))) group by `c`.`id`;

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
