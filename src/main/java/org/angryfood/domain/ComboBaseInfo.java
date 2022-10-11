package org.angryfood.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author: 作者
 * @Date: 2022/09/08/9:00
 * @Description: 致敬
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ComboBaseInfo {
    private long id;
    private String name;
    private Double price;
    private long storeId;

//    -- id, name, price, store_id
}
