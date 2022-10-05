CREATE TABLE `store_base_info`
(
    `id`           bigint(20)                       NOT NULL AUTO_INCREMENT COMMENT 'ID.',
    `storeName`    varchar(200) COLLATE utf8mb4_bin NOT NULL COMMENT 'store name.',
    `storeClass`   varchar(200) COLLATE utf8mb4_bin NOT NULL COMMENT 'food type.',
    `storeAddress` varchar(200) COLLATE utf8mb4_bin NOT NULL COMMENT 'address for store.',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 3
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_bin COMMENT ='Tracing of file uploading tasks.'

-- id, name, type, address, start_opening_hour, end_opening_hour