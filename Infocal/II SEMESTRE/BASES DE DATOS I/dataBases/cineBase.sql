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


-- Volcando estructura de base de datos para cinebase
CREATE DATABASE IF NOT EXISTS `cinebase` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `cinebase`;

-- Volcando estructura para tabla cinebase.cinema
CREATE TABLE IF NOT EXISTS `cinema` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nameCinema` varchar(40) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla cinebase.costumer
CREATE TABLE IF NOT EXISTS `costumer` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nameCostumer` varchar(20) DEFAULT NULL,
  `lastnameCostumer` varchar(40) DEFAULT NULL,
  `emailCostumer` varchar(100) DEFAULT NULL,
  `numberPhone` int DEFAULT NULL,
  `theater_id` int DEFAULT NULL,
  `employee_id` int DEFAULT NULL,
  `cinema_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `theater_id` (`theater_id`),
  KEY `employee_id` (`employee_id`),
  KEY `cinema_id` (`cinema_id`),
  CONSTRAINT `costumer_ibfk_1` FOREIGN KEY (`theater_id`) REFERENCES `theater` (`id`),
  CONSTRAINT `costumer_ibfk_2` FOREIGN KEY (`employee_id`) REFERENCES `employee` (`id`),
  CONSTRAINT `costumer_ibfk_3` FOREIGN KEY (`cinema_id`) REFERENCES `cinema` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla cinebase.costumer_movie
CREATE TABLE IF NOT EXISTS `costumer_movie` (
  `costumer_id` int DEFAULT NULL,
  `movie_id` int DEFAULT NULL,
  KEY `costumer_id` (`costumer_id`),
  KEY `movie_id` (`movie_id`),
  CONSTRAINT `costumer_movie_ibfk_1` FOREIGN KEY (`costumer_id`) REFERENCES `costumer` (`id`),
  CONSTRAINT `costumer_movie_ibfk_2` FOREIGN KEY (`movie_id`) REFERENCES `movie` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla cinebase.employee
CREATE TABLE IF NOT EXISTS `employee` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nameEmployee` varchar(30) DEFAULT NULL,
  `age` int DEFAULT NULL,
  `cinema_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cinema_id` (`cinema_id`),
  CONSTRAINT `employee_ibfk_1` FOREIGN KEY (`cinema_id`) REFERENCES `cinema` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla cinebase.seat
CREATE TABLE IF NOT EXISTS `seat` (
  `id` int NOT NULL AUTO_INCREMENT,
  `numberSeat` int DEFAULT NULL,
  `theater_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `theater_id` (`theater_id`),
  CONSTRAINT `seat_ibfk_1` FOREIGN KEY (`theater_id`) REFERENCES `theater` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla cinebase.showtime
CREATE TABLE IF NOT EXISTS `showtime` (
  `id` int NOT NULL AUTO_INCREMENT,
  `scheduleMovies` timestamp NULL DEFAULT NULL,
  `cinema_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cinema_id` (`cinema_id`),
  CONSTRAINT `showtime_ibfk_1` FOREIGN KEY (`cinema_id`) REFERENCES `cinema` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla cinebase.theater
CREATE TABLE IF NOT EXISTS `theater` (
  `id` int NOT NULL AUTO_INCREMENT,
  `numberTheater` int DEFAULT NULL,
  `capacity` int DEFAULT NULL,
  `typeTheater` varchar(10) DEFAULT NULL,
  `cinema_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `cinema_id` (`cinema_id`),
  CONSTRAINT `theater_ibfk_1` FOREIGN KEY (`cinema_id`) REFERENCES `cinema` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla cinebase.theater_movie
CREATE TABLE IF NOT EXISTS `theater_movie` (
  `theater_id` int DEFAULT NULL,
  `movie_id` int DEFAULT NULL,
  KEY `theater_id` (`theater_id`),
  KEY `movie_id` (`movie_id`),
  CONSTRAINT `theater_movie_ibfk_1` FOREIGN KEY (`theater_id`) REFERENCES `theater` (`id`),
  CONSTRAINT `theater_movie_ibfk_2` FOREIGN KEY (`movie_id`) REFERENCES `movie` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla cinebase.ticket
CREATE TABLE IF NOT EXISTS `ticket` (
  `id` int NOT NULL AUTO_INCREMENT,
  `employee_id` int DEFAULT NULL,
  `costumer_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `employee_id` (`employee_id`),
  KEY `costumer_id` (`costumer_id`),
  CONSTRAINT `ticket_ibfk_1` FOREIGN KEY (`employee_id`) REFERENCES `employee` (`id`),
  CONSTRAINT `ticket_ibfk_2` FOREIGN KEY (`costumer_id`) REFERENCES `costumer` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla cinebase.ticketdetails
CREATE TABLE IF NOT EXISTS `ticketdetails` (
  `id` int NOT NULL AUTO_INCREMENT,
  `priceTicket` int DEFAULT NULL,
  `theater_id` int DEFAULT NULL,
  `movie_id` int DEFAULT NULL,
  `seat_id` int DEFAULT NULL,
  `ticket_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `theater_id` (`theater_id`),
  KEY `movie_id` (`movie_id`),
  KEY `seat_id` (`seat_id`),
  KEY `ticket_id` (`ticket_id`),
  CONSTRAINT `ticketdetails_ibfk_1` FOREIGN KEY (`theater_id`) REFERENCES `theater` (`id`),
  CONSTRAINT `ticketdetails_ibfk_2` FOREIGN KEY (`movie_id`) REFERENCES `movie` (`id`),
  CONSTRAINT `ticketdetails_ibfk_3` FOREIGN KEY (`seat_id`) REFERENCES `seat` (`id`),
  CONSTRAINT `ticketdetails_ibfk_4` FOREIGN KEY (`ticket_id`) REFERENCES `ticket` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- La exportación de datos fue deseleccionada.

/*!40103 SET TIME_ZONE=IFNULL(@OLD_TIME_ZONE, 'system') */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
