CREATE TABLE `combo_food`
(
    `comboId` bigint(10) NOT NULL AUTO_INCREMENT COMMENT 'combo ID.',
    `foodId`  bigint(20) NOT NULL COMMENT 'food id',
    PRIMARY KEY (`comboId`, `foodId`),
    KEY       `foodId` (`foodId`),
    CONSTRAINT `cid` FOREIGN KEY (`comboId`) REFERENCES `combo_base_info` (`id`),
    CONSTRAINT `combo_food_ibfk_1` FOREIGN KEY (`foodId`) REFERENCES `food_base_info` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='Tracing of file uploading tasks.'