package org.angryfood.dao;

import org.angryfood.domain.*;
import org.angryfood.models.ServiceResponse;
import org.angryfood.models.UsernamePassword;
import org.apache.catalina.Store;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Repository
public interface UserBaseInfoMapper
{
    int insertUser(UserBaseInfo userBaseInfo);
    int getUsernamePasswordMatchCount(UsernamePassword usernamePassword);
    Long getIdByUsername(String username);
    int updateUser(HashMap<String,Object>map);
    int deleteUser(long id);
    ArrayList<String> selectAllStore();
    ArrayList<StoreBaseInfo> selectStoreByStoreId(long storeId);
    ArrayList<ComboBaseInfo> selectComboByStoreId(long storeId);
    ArrayList<FoodBaseInfo> selectFoodByStoreId(long storeId);
    int insertOrder(long userId,long storeId,long comboId,long comboNumber);
    int insertComment(long orderId,String comment);
    int insertStore(StoreBaseInfo store);
    int insertFood(long storeId,FoodBaseInfo food);
    int updateCombo(long storeId,ComboBaseInfo combo);
    ArrayList<FoodBaseInfo> selectAllFoodByStoreId(long storeId);
    int insertAddress(AddressBaseInfo address);
    int getPriceByFoodId(long foodId);
    int insertTakeAwayOrder(long id, long userId, long storeId, Double sumPrice, Date date);
    int insertTakeAwayOrder_Food(long takeawayorderId,long foodId,long storeId,int foodNumber);
    int updateFood(long foodId,int foodNumber);

}