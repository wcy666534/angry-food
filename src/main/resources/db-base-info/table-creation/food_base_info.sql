CREATE TABLE `food_base_info`
(
    `id`         bigint(10) NOT NULL AUTO_INCREMENT ,
    `name`       varchar(255) NOT NULL,
    `type`       varchar(255) NOT NULL,
    `weight` Double NOT NULL ,
    PRIMARY KEY (`id`)
) ENGINE = INNODB
  DEFAULT CHARSET = utf8mb4
  COLLATE utf8mb4_bin
    COMMENT 'Tracing of file uploading tasks.';
-- id, name, type, weight