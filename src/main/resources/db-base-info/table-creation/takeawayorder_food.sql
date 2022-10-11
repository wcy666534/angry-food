CREATE TABLE `takeawayorder_food` (
                                      `id`         bigint(10) AUTO_INCREMENT NOT NULL,
                                      `order_id`   bigint(10) NOT NULL,
                                      `food_id`    bigint(10) NOT NULL,
                                      `food_count` varchar(255) NOT NULL,
                                      `food_type`  varchar(255) NOT NULL,
                                      PRIMARY KEY (`id`)
) ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE utf8mb4_bin
    COMMENT 'Tracing of file uploading tasks.';
-- id, order_id, food_id, food_count, food_type (1 - single food, 2 - combo)