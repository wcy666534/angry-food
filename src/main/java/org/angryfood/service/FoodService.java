package org.angryfood.service;

import org.angryfood.domain.FoodBaseInfo;
import org.angryfood.models.Id;
import org.angryfood.models.ServiceResponse;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;

/**
 * @Author: 作者
 * @Date: 2022/10/09/11:08
 * @Description: 致敬
 */
public interface FoodService {
    ServiceResponse<Boolean> addFood(FoodBaseInfo foodBaseInfo);
    ServiceResponse<ArrayList<FoodBaseInfo>> getAllFoodByStoreId( Id id);
}
