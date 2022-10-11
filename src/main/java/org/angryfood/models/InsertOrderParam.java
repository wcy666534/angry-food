package org.angryfood.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class InsertOrderParam
{
    private long userId;
    private long storeId;
    private long comboId;
    private long comboNumber;
}
