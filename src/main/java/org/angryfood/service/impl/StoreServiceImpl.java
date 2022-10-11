package org.angryfood.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.angryfood.dao.StoreBaseInfoMapper;
import org.angryfood.domain.StoreBaseInfo;
import org.angryfood.models.Id;
import org.angryfood.models.ServiceResponse;
import org.angryfood.service.ComboService;
import org.angryfood.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @Author: 作者
 * @Date: 2022/10/09/11:13
 * @Description: 致敬
 */

@Service
@Slf4j
public class StoreServiceImpl implements StoreService {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private StoreBaseInfoMapper storeBaseInfoMapper;

    public ServiceResponse<Boolean> addStore(StoreBaseInfo storeBaseInfo) {
        try {
            int insertSuccessCount = storeBaseInfoMapper.addStore(storeBaseInfo);

            if (insertSuccessCount > 0) {
                return ServiceResponse.buildSuccessResponse(true);
            } else {
                return ServiceResponse.buildErrorResponse(2, "Error when storeBaseInfo registration.");
            }
        } catch (Exception e) {
            log.error("Error when executing SQL: ", e);
            return ServiceResponse.buildErrorResponse(3, "Error when storeBaseInfo registration.");
        }
    }

    public ServiceResponse<ArrayList<StoreBaseInfo>> getAllStore() {
        try {
            ArrayList<StoreBaseInfo> storeBaseInfoList = storeBaseInfoMapper.getAllStore();
            return ServiceResponse.buildSuccessResponse(storeBaseInfoList);
        } catch (Exception e) {
            return ServiceResponse.buildErrorResponse(5, "Error when getAllStore.");
        }
    }

    public ServiceResponse<StoreBaseInfo> getStoreById(Id id) {
        try {
            StoreBaseInfo storeBaseInfol = storeBaseInfoMapper.getStoreById(id);
            return ServiceResponse.buildSuccessResponse(storeBaseInfol);
        } catch (Exception e) {
            return ServiceResponse.buildErrorResponse(5, "Error when getStoreById.");
        }
    }
}