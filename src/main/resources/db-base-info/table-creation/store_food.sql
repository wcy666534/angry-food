CREATE TABLE `store_food` (
                              `id`         bigint(10) AUTO_INCREMENT NOT NULL,
                              `store_id`   bigint(10) NOT NULL,
                              `food_id`    bigint(10) NOT NULL,
                              `price` varchar(255) NOT NULL,
                              `stock_count` DOUBLE NOT NULL,
                              PRIMARY KEY (`id`)
) ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE utf8mb4_bin
    COMMENT 'Tracing of file uploading tasks.';
-- id, store_id, food_id, price, stock_count