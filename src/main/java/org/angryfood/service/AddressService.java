package org.angryfood.service;

import org.angryfood.domain.AddressBaseInfo;
import org.angryfood.models.ServiceResponse;
import org.springframework.stereotype.Repository;

/**
 * @Author: 作者
 * @Date: 2022/10/09/11:09
 * @Description: 致敬
 */

public interface AddressService {
    ServiceResponse<Boolean> addAddress(AddressBaseInfo addressBaseInfo);
}
