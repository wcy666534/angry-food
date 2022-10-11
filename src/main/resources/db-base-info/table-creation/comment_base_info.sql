CREATE TABLE `comment_base_info`
(
    `id`  bigint(10) NOT NULL AUTO_INCREMENT ,
    `order_id`  bigint(10) NOT NULL ,
    `comment` varchar (255) NOT NULL ,
    `time`   timestamp NOT NULL DEFAULT NOW() ON UPDATE NOW() ,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 3
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_bin COMMENT ='Tracing of file uploading tasks.'
--id,order_id,comment,time