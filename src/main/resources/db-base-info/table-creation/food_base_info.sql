CREATE TABLE `food_base_info`
(
    `id`       bigint(10)                       NOT NULL AUTO_INCREMENT COMMENT 'ID.',
    `foodName` varchar(255) COLLATE utf8mb4_bin NOT NULL,
    `price`    int(11)                          NOT NULL COMMENT 'price for food.',
    `count`    int(10)                          NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 3
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_bin COMMENT ='Tracing of file uploading tasks.'

-- id, name, type, weight