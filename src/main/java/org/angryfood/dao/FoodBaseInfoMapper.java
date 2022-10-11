package org.angryfood.dao;

import org.angryfood.domain.AddressBaseInfo;
import org.angryfood.domain.FoodBaseInfo;
import org.angryfood.models.Id;
import org.angryfood.models.ServiceResponse;

import java.util.ArrayList;

/**
 * @Author: 作者
 * @Date: 2022/10/09/11:04
 * @Description: 致敬
 */
public interface FoodBaseInfoMapper {
    int  addFood(FoodBaseInfo foodBaseInfo);
    ArrayList<FoodBaseInfo> getAllFoodByStoreId(Id id);

}
