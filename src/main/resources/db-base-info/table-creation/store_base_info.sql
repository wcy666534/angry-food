CREATE TABLE `store_base_info`
(
    `id` bigint(10) AUTO_INCREMENT NOT NULL,
    `name` varchar(255) NOT NULL,
    `type` varchar(255) NOT NULL,
    `address` varchar(255) NOT NULL,
    `start_opening_hour`  timestamp ,
    `end_opening_hour`  timestamp ,
    PRIMARY KEY (`id`)
) ENGINE = INNODB
  DEFAULT CHARSET = utf8mb4
  COLLATE utf8mb4_bin
    COMMENT 'Tracing of file uploading tasks.';
-- id, name, type, address, start_opening_hour, end_opening_hour