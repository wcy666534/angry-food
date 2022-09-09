CREATE TABLE `store_combo` (
                               `storeId` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'store ID.',
                               `comboId` bigint(20) NOT NULL COMMENT 'combo id',
                               PRIMARY KEY (`storeId`,`comboId`),
                               KEY `foreign` (`comboId`),
                               CONSTRAINT `sid` FOREIGN KEY (`storeId`) REFERENCES `store_base_info` (`id`),
                               CONSTRAINT `foreign` FOREIGN KEY (`comboId`) REFERENCES `combo_base_info` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_bin COMMENT='Tracing of file uploading tasks.'