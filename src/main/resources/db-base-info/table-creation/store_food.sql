CREATE TABLE `store_food` (
                              `storeId` bigint(10) NOT NULL,
                              `foodId` bigint(10) NOT NULL,
                              PRIMARY KEY (`storeId`,`foodId`),
                              KEY `foodId` (`foodId`),
                              CONSTRAINT `foodId` FOREIGN KEY (`foodId`) REFERENCES `food_base_info` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
                              CONSTRAINT `storeId` FOREIGN KEY (`storeId`) REFERENCES `store_base_info` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
