CREATE TABLE `combo_base_info`
(
    `id`       bigint(10)   NOT NULL AUTO_INCREMENT,
    `name`     varchar(255) NOT NULL,
    `price`    decimal       NOT NULL,
    `store_id` bigint(10)   NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 3
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_bin COMMENT ='Tracing of file uploading tasks.'
-- id, name, price, store_id

-- 任何时候金钱不能用double，只能用十进制的类型
-- 在Java里使用BigDecimal，在MySQL里用decimal