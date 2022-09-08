CREATE TABLE `combo_base_info`
(
    `id`        bigint(20)                       NOT NULL AUTO_INCREMENT COMMENT 'ID.',
    `comboName` varchar(255) COLLATE utf8mb4_bin NOT NULL,
    `foods`     varchar(200) COLLATE utf8mb4_bin NOT NULL COMMENT 'food in combo.',
    `price`     int(11)                          NOT NULL COMMENT 'price for combo.',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 2
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_bin COMMENT ='Tracing of file uploading tasks.'