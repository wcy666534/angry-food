CREATE TABLE `combo_food`
(
    `id`  bigint(10) NOT NULL AUTO_INCREMENT ,
    `food_id`  bigint(10) NOT NULL ,
    `count` int NOT NULL ,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 3
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_bin COMMENT ='Tracing of file uploading tasks.'
-- id, food_id, count