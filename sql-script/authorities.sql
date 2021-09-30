DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
                         `username` varchar(50) NOT NULL,
                         `password` char(68) NOT NULL,
                         `enabled` tinyint(1) NOT NULL,
                         PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;



INSERT INTO `users` VALUES
                        ('jony','111',1),
                        ('smith','111',1),
                        ('abrams','111',1),
                        ('margo','111',1),
                        ('max','111',1,
                         ('someone','111',1),
                         ('arnold','111',1),
                         ('michael','111',1),
                         ('jackie','111',1),
                         ('mikel','222',1),
                         ('viktor','222',1),
                         ('tay','222',1),
                         ('azm','333',1),
                         ('milla','333',1),;



--
-- Table structure for table `authorities`
--

DROP TABLE IF EXISTS `authorities`;
CREATE TABLE `authorities` (
                               `username` varchar(50) NOT NULL,
                               `authority` varchar(50) NOT NULL,
                               UNIQUE KEY `authorities_idx_1` (`username`,`authority`),
                               CONSTRAINT `authorities_ibfk_1` FOREIGN KEY (`username`) REFERENCES `users` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `authorities`
--

INSERT INTO `authorities`
VALUES
    ('jony','ROLE_EMPLOYEE'),
    ('smith','ROLE_EMPLOYEE'),
    ('abrams','ROLE_EMPLOYEE'),
    ('margo','ROLE_EMPLOYEE'),
    ('max','ROLE_EMPLOYEE'),
    ('someone','ROLE_EMPLOYEE'),
    ('arnold','ROLE_EMPLOYEE'),
    ('michael','ROLE_EMPLOYEE'),
    ('jackie','ROLE_EMPLOYEE'),
    ('mikel','ROLE_MANAGER'),
    ('mikel','ROLE_EMPLOYEE'),
    ('viktor','ROLE_MANAGER'),
    ('viktor','ROLE_EMPLOYEE'),
    ('tay','ROLE_MANAGER'),
    ('azm','ROLE_EMPLOYEE'),
    ('azm','ROLE_ADMIN'),
    ('milla','ROLE_EMPLOYEE'),
    ('milla','ROLE_ADMIN');