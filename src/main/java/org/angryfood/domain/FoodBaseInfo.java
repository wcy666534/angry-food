package org.angryfood.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: 作者
 * @Date: 2022/09/08/19:52
 * @Description: 致敬
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class FoodBaseInfo {
    private long id;
    private String foodName;
    private Integer price;
    private Integer count;
}
