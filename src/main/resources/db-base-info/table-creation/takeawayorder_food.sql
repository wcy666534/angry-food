CREATE TABLE `takeawayorder_food`
(
    `takeawayorderId` bigint(10) NOT NULL,
    `foodId`          bigint(10) NOT NULL,
    `foodNumber`      int(11)    NOT NULL,
    `storeId`         bigint(10) NOT NULL,
    PRIMARY KEY (`takeawayorderId`, `foodId`, `storeId`),
    CONSTRAINT `takeawayaorderId` FOREIGN KEY (`takeawayorderId`) REFERENCES `takeawayorder_base_info` (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = latin1;

-- id, order_id, food_id, food_count, food_type (1 - single food, 2 - combo)