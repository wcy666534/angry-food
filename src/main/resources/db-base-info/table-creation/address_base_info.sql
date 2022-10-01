CREATE TABLE `address_base_info` (
                                     `addressId` bigint(10) NOT NULL,
                                     `address` varchar(255) NOT NULL,
                                     `userId` bigint(10) NOT NULL,
                                     PRIMARY KEY (`addressId`,`userId`),
                                     KEY `userId` (`userId`),
                                     CONSTRAINT `userId` FOREIGN KEY (`userId`) REFERENCES `user_base_info` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

