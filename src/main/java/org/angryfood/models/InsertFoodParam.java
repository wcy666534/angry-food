package org.angryfood.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class InsertFoodParam
{
    private long storeId;
    private long id;
    private String foodName;
    private Integer price;
    private Integer count;
}
