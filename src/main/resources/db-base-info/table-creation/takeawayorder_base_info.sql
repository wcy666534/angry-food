CREATE TABLE `takeawayorder_base_info` (
                                           `id` bigint(10) NOT NULL,
                                           `userId` bigint(10) NOT NULL,
                                           `storeId` bigint(10) NOT NULL,
                                           `address` varchar(255) NOT NULL,
                                           `sumPrice` double(10,2) NOT NULL,
  `orderTime` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
