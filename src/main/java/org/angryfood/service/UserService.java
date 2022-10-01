package org.angryfood.service;

import org.angryfood.domain.StoreBaseInfo;
import org.angryfood.domain.UserBaseInfo;
import org.angryfood.models.ServiceResponse;
import org.angryfood.models.UsernamePassword;

import java.util.ArrayList;

public interface UserService
{
    ServiceResponse<Boolean> register(UserBaseInfo userBaseInfo);
    ServiceResponse<Long> login(UsernamePassword usernamePassword);
    ServiceResponse<Boolean> update(UserBaseInfo userBaseInfo);
    ServiceResponse<Boolean> deleteUser(UserBaseInfo userBaseInfo);
    ServiceResponse<ArrayList<String>> selectAllStore();
    ServiceResponse<ArrayList<StoreBaseInfo>> selectStoreByStoreId(long storeId);
    ServiceResponse<Boolean> insertOrder(long userId,long storeId,long comboId);
    ServiceResponse<Boolean> insertComment(long orderId,String comment);
    ServiceResponse<Boolean> insertStore(StoreBaseInfo store);

}
