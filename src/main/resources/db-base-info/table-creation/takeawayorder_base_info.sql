CREATE TABLE `takeawayorder_base_info`
(
    `id`          bigint(10) AUTO_INCREMENT NOT NULL,
    `user_id`     bigint(10) NOT NULL,
    `address_id`  bigint(10) NOT NULL,
    `total_price` varchar(255) NOT NULL,
    `order_time`  timestamp DEFAULT NOW() ON UPDATE NOW() NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE utf8mb4_bin
    COMMENT 'Tracing of file uploading tasks.';
-- id, user_id, address_id, total_price, order_time
