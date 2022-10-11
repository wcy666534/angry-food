package org.angryfood.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;

/**
 * @Author: 作者
 * @Date: 2022/09/08/8:57
 * @Description: 致敬
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class StoreBaseInfo {
    private long id;
    private String name;
    private String address;
    private String type;
    private Time startOpeningHour;
    private Time endOpeningHour;
}
