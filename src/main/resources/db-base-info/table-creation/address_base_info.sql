CREATE TABLE `address_base_info` (
                                     `id` BIGINT AUTO_INCREMENT ,
                                     `address` VARCHAR(200)  ,
                                     `addressee` VARCHAR(200) ,
                                     `phone_number` VARCHAR(20) ,
                                     PRIMARY KEY (`id`)
)
    ENGINE = INNODB
    DEFAULT CHARSET = utf8mb4
    COLLATE utf8mb4_bin
    COMMENT 'Tracing of file uploading tasks.';
-- id, address, addressee, phone_number

