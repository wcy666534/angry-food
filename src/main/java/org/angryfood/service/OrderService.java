package org.angryfood.service;

import org.angryfood.domain.OrderBaseInfo;
import org.angryfood.models.ServiceResponse;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Author: 作者
 * @Date: 2022/10/09/11:09
 * @Description: 致敬
 */
public interface OrderService {
    ServiceResponse<Boolean> addOrder( OrderBaseInfo orderBaseInfo);
}
