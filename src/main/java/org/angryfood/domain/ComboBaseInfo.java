package org.angryfood.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    private String comboName;
    private String foods;
    private Integer price;
}
