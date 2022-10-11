package org.angryfood.service;

import org.angryfood.domain.StoreBaseInfo;
import org.angryfood.models.Id;
import org.angryfood.models.ServiceResponse;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;

/**
 * @Author: 作者
 * @Date: 2022/10/09/11:09
 * @Description: 致敬
 */
public interface StoreService {
    ServiceResponse<Boolean>  addStore(StoreBaseInfo storeBaseInfo);
    ServiceResponse<ArrayList<StoreBaseInfo>> getAllStore();
    ServiceResponse<StoreBaseInfo> getStoreById(Id id);
}
