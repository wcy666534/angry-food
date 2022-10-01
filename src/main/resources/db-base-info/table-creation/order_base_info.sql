CREATE TABLE `order_base_info`
(
    `id`      bigint(10) NOT NULL AUTO_INCREMENT COMMENT '' orderId.'',
    `userId`  bigint(10) NOT NULL COMMENT '' userId.'',
    `storeId` bigint(10) NOT NULL COMMENT '' storeId.'',
    `comboId` bigint(10) NOT NULL COMMENT '' comboId.'',
    `price`   int(11) NOT NULL COMMENT '' price '',
    `time`   timestamp NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_bin COMMENT =''Tracing of file uploading tasks.''