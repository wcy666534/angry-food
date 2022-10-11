package org.angryfood.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.angryfood.dao.MerchantBaseInfoMapper;
import org.angryfood.domain.MerchantBaseInfo;
import org.angryfood.models.ServiceResponse;
import org.angryfood.service.ComboService;
import org.angryfood.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: 作者
 * @Date: 2022/10/09/11:12
 * @Description: 致敬
 */

@Service
@Slf4j
public class MerchantServiceImpl implements MerchantService {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private MerchantBaseInfoMapper merchantBaseInfoMapper;
    public ServiceResponse<Boolean> addMerchant(MerchantBaseInfo merchantBaseInfo){
        try {
            int insertSuccessCount =merchantBaseInfoMapper.addMerchant(merchantBaseInfo);

            if (insertSuccessCount > 0) {
                return ServiceResponse.buildSuccessResponse(true);
            } else {
                return ServiceResponse.buildErrorResponse(1, "Error when merchantBaseInfo registration.");
            }
        } catch (Exception e) {
            return ServiceResponse.buildErrorResponse(1, "Error when merchantBaseInfo registration.");
        }
    }
}
