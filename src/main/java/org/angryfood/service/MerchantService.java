package org.angryfood.service;

import org.angryfood.domain.MerchantBaseInfo;
import org.angryfood.domain.UserBaseInfo;
import org.angryfood.models.ServiceResponse;

/**
 * @Author: 作者
 * @Date: 2022/10/09/11:08
 * @Description: 致敬
 */
public interface MerchantService {
    ServiceResponse<Boolean> addMerchant(MerchantBaseInfo merchantBaseInfo);
}
