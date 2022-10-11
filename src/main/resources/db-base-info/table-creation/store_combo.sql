CREATE TABLE `store_combo`  (
                                `id`         bigint(10) AUTO_INCREMENT NOT NULL,
                                `store_id`   bigint(10) NOT NULL,
                                `combo_id`    bigint(10) NOT NULL,
                                PRIMARY KEY (`id`)
) ENGINE = INNODB
  DEFAULT CHARSET = utf8mb4
  COLLATE utf8mb4_bin
    COMMENT 'Tracing of file uploading tasks.';
-- id, store_id, combo_id