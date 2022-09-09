package org.angryfood.dao;

import org.angryfood.domain.ComboBaseInfo;
import org.angryfood.domain.FoodBaseInfo;
import org.angryfood.domain.StoreBaseInfo;
import org.angryfood.domain.UserBaseInfo;
import org.angryfood.models.ServiceResponse;
import org.angryfood.models.UsernamePassword;
import org.apache.catalina.Store;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;

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


}