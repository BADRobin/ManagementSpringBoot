CREATE DATABASE  IF NOT EXISTS `office_management` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `office_management`;


# /*!40101 SET @OLD_CHARACTER_SET_EMPLOYEES=@@CHARACTER_SET_EMPLOYEES */;
# /*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
# /*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
# /*!40101 SET NAMES utf8 */;
# /*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
# /*!40103 SET TIME_ZONE='+00:00' */;
# /*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
# /*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
# /*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
# /*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `employees`
--

# DROP TABLE IF EXISTS `employees`;
# /*!40101 SET @saved_cs_employees     = @@character_set_employees */;
# /*!40101 SET character_set_employees = utf8 */;
CREATE TABLE `managers` (
                            `id` int(11) NOT NULL AUTO_INCREMENT,
                            `first_name` varchar(45) DEFAULT NULL,
                            `last_name` varchar(45) DEFAULT NULL,
                            `middle_name` varchar(45) DEFAULT NULL,
                            `date_of_birth` date DEFAULT NULL,
                            `date_of_hiring` date DEFAULT NULL,
                            `position` varchar(45) DEFAULT NULL,
                            `the_salary` varchar(45) DEFAULT NULL,
                            PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;
# /*!40101 SET character_set_employees = @saved_cs_employees */;

--
-- Dumping data for table `employees`
--

LOCK TABLES `managers` WRITE;
/*!40000 ALTER TABLE `managers` DISABLE KEYS */;

INSERT INTO `managers` VALUES
                           (1,'Mikel','Sagsagovich','nepobedymich', '1972/05/27', '2020/03/01', 'storekeeper-manager', '24000'),
                           (2,'Viktor','Maister','Kladovich', '1994/10/12', '2020/12/22','head-storekeeper', '24000' ),
                           (3,'Tay','Lung','Combatovihc', '1954/06/06', '1992/11/01', 'security-officer', '24000');


/*!40000 ALTER TABLE `managers` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
# /*!40101 SET CHARACTER_SET_EMPLOYEES=@OLD_CHARACTER_SET_EMPLOYEES */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-09-24 21:50:59
