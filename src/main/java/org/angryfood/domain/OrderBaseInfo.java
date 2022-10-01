package org.angryfood.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: 作者
 * @Date: 2022/09/30/19:09
 * @Description: 致敬
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class OrderBaseInfo {
    private long id;
    private long userId;
    private long storeId;
    private long comboId;
    private double price;
    private long  orderTime;
}
