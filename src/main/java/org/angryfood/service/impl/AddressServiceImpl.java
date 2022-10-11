package org.angryfood.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.angryfood.dao.AddressBaseInfoMapper;
import org.angryfood.domain.AddressBaseInfo;
import org.angryfood.models.ServiceResponse;
import org.angryfood.service.AddressService;
import org.angryfood.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: 作者
 * @Date: 2022/10/09/11:11
 * @Description: 致敬
 */

@Service
@Slf4j
public class AddressServiceImpl implements AddressService {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private AddressBaseInfoMapper addressBaseInfoMapper;
    public ServiceResponse<Boolean> addAddress(AddressBaseInfo addressBaseInfo){
        try {
            int insertSuccessCount =addressBaseInfoMapper.addAddress(addressBaseInfo);

            if (insertSuccessCount > 0) {
                return ServiceResponse.buildSuccessResponse(true);
            } else {
                return ServiceResponse.buildErrorResponse(1, "Error when addAddress.");
            }
        } catch (Exception e) {
            return ServiceResponse.buildErrorResponse(1, "Error when addAddress.");
        }
    }
}
