package org.angryfood.dao;

import org.angryfood.domain.StoreBaseInfo;
import org.angryfood.models.Id;
import org.angryfood.models.ServiceResponse;

import java.util.ArrayList;

/**
 * @Author: 作者
 * @Date: 2022/10/09/11:03
 * @Description: 致敬
 */
public  interface  StoreBaseInfoMapper {
    int addStore(StoreBaseInfo storeBaseInfo);
    ArrayList<StoreBaseInfo> getAllStore();
    StoreBaseInfo getStoreById(Id id);

}
