CREATE TABLE `combo_base_info`
(
    `id`        bigint(20)                       NOT NULL DEFAULT '0' COMMENT 'combo id',
    `comboName` varchar(255) COLLATE utf8mb4_bin NOT NULL,
    `price`     int(11)                          NOT NULL COMMENT 'price for combo.',
    `count`     mediumtext COLLATE utf8mb4_bin COMMENT 'combo count',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_bin COMMENT ='Tracing of file uploading tasks.'

-- id, name, price, store_id