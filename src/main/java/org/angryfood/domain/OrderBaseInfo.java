package org.angryfood.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;

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
    private long addressId;
    private double totalPrice;
    private Time orderTime;
}
