CREATE TABLE `merchant_base_info`
(
    `id` BIGINT AUTO_INCREMENT COMMENT 'ID.',
    `name` VARCHAR(200) CHARSET utf8mb4 COLLATE utf8mb4_bin NOT NULL ,
    `encrypted_password` VARCHAR(200) CHARSET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
    `nickname` VARCHAR(200) CHARSET utf8mb4 COLLATE utf8mb4_bin NOT NULL ,
    `email_address` VARCHAR(200) CHARSET utf8mb4 COLLATE utf8mb4_bin ,
    `phone_number` VARCHAR(20) CHARSET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
    PRIMARY KEY (`id`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE utf8mb4_bin
    COMMENT 'Tracing of file uploading tasks.';