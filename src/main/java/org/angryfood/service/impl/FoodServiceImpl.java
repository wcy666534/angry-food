package org.angryfood.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.angryfood.dao.FoodBaseInfoMapper;
import org.angryfood.domain.FoodBaseInfo;
import org.angryfood.models.Id;
import org.angryfood.models.ServiceResponse;
import org.angryfood.service.ComboService;
import org.angryfood.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @Author: 作者
 * @Date: 2022/10/09/11:11
 * @Description: 致敬
 */

@Service
@Slf4j
public class FoodServiceImpl implements FoodService {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private FoodBaseInfoMapper foodBaseInfoMapper;
    public ServiceResponse<Boolean> addFood(FoodBaseInfo foodBaseInfo){
        try {
            int insertSuccessCount =foodBaseInfoMapper.addFood(foodBaseInfo);

            if (insertSuccessCount > 0) {
                return ServiceResponse.buildSuccessResponse(true);
            } else {
                return ServiceResponse.buildErrorResponse(1, "Error when foodBaseInfo registration.");
            }
        } catch (Exception e) {
            log.error("Error when executing SQL: ", e);
            return ServiceResponse.buildErrorResponse(2, "Error when foodBaseInfo registration.");
        }
    }
    public ServiceResponse<ArrayList<FoodBaseInfo>> getAllFoodByStoreId(Id id){
        try {
            ArrayList<FoodBaseInfo> foodBaseInfoList = foodBaseInfoMapper.getAllFoodByStoreId(id);
            return ServiceResponse.buildSuccessResponse(foodBaseInfoList);
        } catch (Exception e) {
            log.error("Error when executing SQL: ", e);
            return ServiceResponse.buildErrorResponse(5, "Error when getAllFoodByStoreId.");
        }
    }
}
