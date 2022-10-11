CREATE TABLE `user_base_info`
(
    `id` BIGINT AUTO_INCREMENT COMMENT 'ID.',
    `name` VARCHAR(200) CHARSET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT 'Username for login.',
    `encrypted_password` VARCHAR(200) CHARSET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT 'Password for login.',
    `nickname` VARCHAR(200) CHARSET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT 'Nickname of the user.',
    `email_address` VARCHAR(200) CHARSET utf8mb4 COLLATE utf8mb4_bin COMMENT 'Email address of the user.',
    `phone_number` VARCHAR(20) CHARSET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT 'Phone number of the user.',
    PRIMARY KEY (`id`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE utf8mb4_bin
    COMMENT 'Tracing of file uploading tasks.';

-- 区分商家和客户，新建商家表，或者添加字段进行区分，一般推荐新建商家表