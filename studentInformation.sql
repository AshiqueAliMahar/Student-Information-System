/*
SQLyog Ultimate v8.61 
MySQL - 5.5.5-10.1.21-MariaDB : Database - studentinformation
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`studentinformation` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `studentinformation`;

/*Table structure for table `courses` */

DROP TABLE IF EXISTS `courses`;

CREATE TABLE `courses` (
  `Course ID` int(11) NOT NULL AUTO_INCREMENT,
  `Course Name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Course ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

/*Data for the table `courses` */

insert  into `courses`(`Course ID`,`Course Name`) values (1,'JavaSE'),(2,'.Net'),(4,'Python'),(6,'Php');

/*Table structure for table `status` */

DROP TABLE IF EXISTS `status`;

CREATE TABLE `status` (
  `id` int(11) NOT NULL,
  `Status` varchar(50) DEFAULT NULL,
  `loginId` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `status` */

insert  into `status`(`id`,`Status`,`loginId`) values (1,'Admin',1);

/*Table structure for table `studentinformation` */

DROP TABLE IF EXISTS `studentinformation`;

CREATE TABLE `studentinformation` (
  `Student ID` int(11) NOT NULL AUTO_INCREMENT,
  `First Name` varchar(50) DEFAULT NULL,
  `Middle Name` varchar(50) DEFAULT NULL,
  `Last Name` varchar(50) DEFAULT NULL,
  `Father's Name` varchar(50) DEFAULT NULL,
  `Surname` varchar(50) DEFAULT NULL,
  `Date Of Birth` varchar(20) DEFAULT NULL,
  `Gender` varchar(15) DEFAULT NULL,
  `Mail` varchar(50) DEFAULT NULL,
  `ContactNumber` varchar(50) NOT NULL,
  `Address` varchar(50) DEFAULT NULL,
  `Cousrse ID` int(11) DEFAULT NULL,
  `photo_Name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Student ID`,`ContactNumber`),
  UNIQUE KEY `Student ID` (`Student ID`),
  KEY `FK_studentinformation` (`Cousrse ID`),
  CONSTRAINT `FK_studentinformation` FOREIGN KEY (`Cousrse ID`) REFERENCES `courses` (`Course ID`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

/*Data for the table `studentinformation` */

insert  into `studentinformation`(`Student ID`,`First Name`,`Middle Name`,`Last Name`,`Father's Name`,`Surname`,`Date Of Birth`,`Gender`,`Mail`,`ContactNumber`,`Address`,`Cousrse ID`,`photo_Name`) values (1,'Ashique','Ali','---','Hakim Ali Mahar','Mahar','01/01/1998','Male','nisarmahar8157@gmail.com','03073670189','jamshoro',1,'DSC_4132.JPG'),(5,'Nisar','Ahmed','-----','Muhammad Taghial','Mahar','01/01/1995','Male','nisarmahar81578@gmail.com','03058027701','Jamshoro',4,'hidayatullahPic.jpg'),(6,'Fareed','Ahmed','---','Hameed Ali','Mahar','01/01/1998','Male','N/A','03060342843','Pir jo Goth',1,'fared.jpg');

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Division` varchar(50) DEFAULT NULL,
  `UserName` varchar(50) DEFAULT NULL,
  `Password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

/*Data for the table `users` */

insert  into `users`(`ID`,`Division`,`UserName`,`Password`) values (1,'Admin','ashiqueali2015','h@kim2015'),(10,'user','Ashiq','Ashiq'),(11,'Mahar','Habibullah','habib');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
