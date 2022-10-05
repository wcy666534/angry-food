package org.angryfood.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.angryfood.dao.UserBaseInfoMapper;
import org.angryfood.domain.*;
import org.angryfood.models.ServiceResponse;
import org.angryfood.models.UsernamePassword;
import org.angryfood.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Autowired
    private UserBaseInfoMapper userBaseInfoMapper;

    public ServiceResponse<Boolean> register(UserBaseInfo userBaseInfo) {
        log.info("userBaseInfo = " + userBaseInfo);

        try {
            int insertSuccessCount = userBaseInfoMapper.insertUser(userBaseInfo);

            if (insertSuccessCount > 0) {
                return ServiceResponse.buildSuccessResponse(true);
            } else {
                return ServiceResponse.buildErrorResponse(1, "Error when registration.");
            }
        } catch (Exception e) {
            log.error("Error when executing SQL: ", e);
            return ServiceResponse.buildErrorResponse(1, "Error when registration.");
        }
    }

    public ServiceResponse<Long> login(UsernamePassword usernamePassword) {
        log.info("usernamePassword = " + usernamePassword);

        try {
            int userCount = userBaseInfoMapper.getUsernamePasswordMatchCount(usernamePassword);

            if (userCount > 0) {
                Long userId = userBaseInfoMapper.getIdByUsername(usernamePassword.getUsername());

                if (userId != null) {
                    return ServiceResponse.buildSuccessResponse(userId);
                } else {
                    return ServiceResponse.buildErrorResponse(2, "No such user");
                }
            } else {
                return ServiceResponse.buildErrorResponse(2, "Username/password not match.");
            }
        } catch (Exception e) {
            log.error("Error when executing SQL: ", e);
            return ServiceResponse.buildErrorResponse(2, "Error when registration.");
        }
    }

    public ServiceResponse<Boolean> update(UserBaseInfo userBaseInfo) {
        // Update by id
        // UPDATE user_base_info SET xxx = #{xxx}, ..., WHERE id = #{id}

        HashMap<String, Object> map = new HashMap<String, Object>();
        long id = userBaseInfoMapper.getIdByUsername(userBaseInfo.getUsername());
        map.put("id", id);
        map.put("username", userBaseInfo.getUsername());
        map.put("encryptedPassword", userBaseInfo.getEncryptedPassword());
        map.put("nickname", userBaseInfo.getNickname());
        map.put("phoneNumber", userBaseInfo.getPhoneNumber());
        map.put("emailAddress", userBaseInfo.getEmailAddress());
        try {
            int updateSuccessCount = userBaseInfoMapper.updateUser(map);

            if (updateSuccessCount > 0) {
                return ServiceResponse.buildSuccessResponse(true);
            } else {
                return ServiceResponse.buildErrorResponse(3, "Error when update.");
            }
        } catch (Exception e) {
            log.error("Error when executing SQL: ", e);
            return ServiceResponse.buildErrorResponse(3, "Error when update.");
        }

    }

    public ServiceResponse<Boolean> deleteUser(UserBaseInfo userBaseInfo) {
        try {
            long id = userBaseInfoMapper.getIdByUsername(userBaseInfo.getUsername());
            long deleteCount = userBaseInfoMapper.deleteUser(id);

            if (deleteCount > 0) {
                return ServiceResponse.buildSuccessResponse(true);
            } else {
                return ServiceResponse.buildErrorResponse(4, "Error when delete.");
            }

        } catch (Exception e) {
            log.error("Error when executing SQL: ", e);

            return ServiceResponse.buildErrorResponse(4, "Error when delete.");
        }
    }

    public ServiceResponse<ArrayList<String>> selectAllStore() {
        try {
            ArrayList<String> storeList = userBaseInfoMapper.selectAllStore();
            return ServiceResponse.buildSuccessResponse(storeList);
        } catch (Exception e) {
            log.error("Error when executing SQL: ", e);

            return ServiceResponse.buildErrorResponse(5, "Error when selectAllStore.");
        }
    }

    public ServiceResponse<ArrayList<StoreBaseInfo>> selectStoreByStoreId(long storeId) {
        ArrayList<StoreBaseInfo> storeList =userBaseInfoMapper.selectStoreByStoreId(1);
        return ServiceResponse.buildSuccessResponse(storeList);
    }
    public ServiceResponse<Boolean> insertOrder(long userId,long storeId,long comboId,long comboNumber){
        Date date=new Date();
        int successCount= userBaseInfoMapper.insertOrder(userId, storeId, comboId,comboNumber, date);
        userBaseInfoMapper.updateComboCount(comboId, (int) comboNumber);
        if (successCount > 0) {
            return ServiceResponse.buildSuccessResponse(true);
        } else {
            return ServiceResponse.buildErrorResponse(6,"Error when insertOrder.");
        }
    }
    public ServiceResponse<Boolean> insertComment(long orderId,String comment){
        Date date=new Date();
        int successCount= userBaseInfoMapper.insertComment(orderId,comment,date);
        if (successCount > 0) {
            return ServiceResponse.buildSuccessResponse(true);
        } else {
            return ServiceResponse.buildErrorResponse(7,"Error when insertComment.");
        }

    }
    public ServiceResponse<Boolean> insertStore(StoreBaseInfo store){
        int successCount= userBaseInfoMapper.insertStore(store);
        if (successCount > 0) {
            return ServiceResponse.buildSuccessResponse(true);
        } else {
            return ServiceResponse.buildErrorResponse(8,"insertStore");
        }
    }
    public ServiceResponse<Boolean> insertFood(long storeId, FoodBaseInfo food){

        int successCount= userBaseInfoMapper.insertFood(food.getFoodName(),food.getPrice(),food.getCount());
        userBaseInfoMapper.insertStore_food(storeId,food.getFoodName());
        if (successCount > 0) {
            return ServiceResponse.buildSuccessResponse(true);
        } else {
            return ServiceResponse.buildErrorResponse(9,"insertFood");
        }
    }
    public ServiceResponse<Boolean> updateCombo(long storeId,ComboBaseInfo combo){
        int successCount= userBaseInfoMapper. updateCombo(combo.getId(),combo.getComboName(),combo.getPrice(),combo.getCount());
        userBaseInfoMapper.deleteCombo_food(combo.getId());
        for(FoodBaseInfo food: combo.getFoodList()){
            userBaseInfoMapper.insertCombo_food(combo.getId(), food.getId());
        }
        if (successCount > 0) {
            return ServiceResponse.buildSuccessResponse(true);
        } else {
            return ServiceResponse.buildErrorResponse(10,"updateCombo");
        }
    }
    public ServiceResponse<ArrayList<FoodBaseInfo>> selectAllFoodByStoreId(long storeId){
        return ServiceResponse.buildSuccessResponse(userBaseInfoMapper.selectAllFoodByStoreId(storeId));
    }
    public ServiceResponse<Boolean> insertAddress(AddressBaseInfo address){
        int successCount= userBaseInfoMapper.insertAddress(address);
        if (successCount > 0) {
            return ServiceResponse.buildSuccessResponse(true);
        } else {
            return ServiceResponse.buildErrorResponse(11,"insertAddress");
        }
    }
    public ServiceResponse<Boolean> insertTakeAwayOrder(long id,long userId, long storeId, HashMap<Long, Integer> foodInformMap){
        int sumPrice=0;
        for (Map.Entry<Long, Integer> entry : foodInformMap.entrySet()) {
            int price=userBaseInfoMapper.getPriceByFoodId(entry.getKey())* entry.getValue();
            sumPrice+=price;
        }
        Date date = new Date();
        int successCount=userBaseInfoMapper.insertTakeAwayOrder(id,userId,storeId,Double.valueOf(sumPrice),date);
        for (Map.Entry<Long, Integer> entry : foodInformMap.entrySet()) {
            userBaseInfoMapper.insertTakeAwayOrder_Food(id,entry.getKey(),storeId,entry.getValue());
        }
        for (Map.Entry<Long, Integer> entry : foodInformMap.entrySet()) {
            userBaseInfoMapper.updateFood(entry.getKey(),entry.getValue());
        }
        if (successCount > 0) {
            return ServiceResponse.buildSuccessResponse(true);
        } else {
            return ServiceResponse.buildErrorResponse(11,"insertAddress");
        }
    }
}
