package org.angryfood.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.angryfood.dao.OrderBaseInfoMapper;
import org.angryfood.domain.OrderBaseInfo;
import org.angryfood.models.ServiceResponse;
import org.angryfood.service.ComboService;
import org.angryfood.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: 作者
 * @Date: 2022/10/09/11:12
 * @Description: 致敬
 */

@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private OrderBaseInfoMapper orderBaseInfoMapper;
    public ServiceResponse<Boolean> addOrder(OrderBaseInfo orderBaseInfo) {

        try {
            int insertSuccessCount = orderBaseInfoMapper.addOrder(orderBaseInfo);

            if (insertSuccessCount > 0) {
                return ServiceResponse.buildSuccessResponse(true);
            } else {
                return ServiceResponse.buildErrorResponse(1, "Error when orderBaseInfo registration.");
            }
        } catch (Exception e) {
            log.error("Error when executing SQL: ", e);
            return ServiceResponse.buildErrorResponse(2, "Error when orderBaseInfo registration.");
        }
    }
}
