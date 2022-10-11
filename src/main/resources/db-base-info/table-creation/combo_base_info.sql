CREATE TABLE `combo_base_info`
(
    `id`       bigint(10)   NOT NULL AUTO_INCREMENT,
    `name`     varchar(255) NOT NULL,
    `price`    double       NOT NULL,
    `store_id` bigint(10)   NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 3
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_bin COMMENT ='Tracing of file uploading tasks.'
-- id, name, price, store_id