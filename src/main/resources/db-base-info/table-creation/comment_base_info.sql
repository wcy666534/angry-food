CREATE TABLE `comment_base_info`
(
    `id`  bigint(10) NOT NULL AUTO_INCREMENT ,
    `orderId`  bigint(10) NOT NULL COMMENT '''',
    `comment` varchar (255) NOT NULL COMMENT '''',
    `time`   timestamp NOT NULL DEFAULT NOW() COMMENT '''',
    PRIMARY KEY (`id`),
    FOREIGN KEY (`orderId`) REFERENCES `order_base_info` (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 3
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_bin COMMENT ='Tracing of file uploading tasks.'