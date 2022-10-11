package org.angryfood.controller;

import org.angryfood.domain.FoodBaseInfo;
import org.angryfood.models.Id;
import org.angryfood.models.ServiceResponse;
import org.angryfood.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * @Author: 作者
 * @Date: 2022/10/09/11:00
 * @Description: 致敬
 */
@RestController
@RequestMapping("/food")
public class FoodController {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private FoodService foodService;
    @PostMapping("/addFood")
    public ServiceResponse<Boolean> addFood(@RequestBody FoodBaseInfo foodBaseInfo){
        return foodService.addFood(foodBaseInfo);
    }
    @PostMapping("/getAllFoodByStoreId")
    public ServiceResponse<ArrayList<FoodBaseInfo>> getAllFoodByStoreId(@RequestBody Id id){
        return foodService.getAllFoodByStoreId(id);
    }
}
