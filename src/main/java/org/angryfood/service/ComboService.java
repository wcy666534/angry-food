package org.angryfood.service;

import org.angryfood.domain.ComboBaseInfo;
import org.angryfood.models.ServiceResponse;

/**
 * @Author: 作者
 * @Date: 2022/10/09/11:10
 * @Description: 致敬
 */
public interface ComboService {
    ServiceResponse<Boolean> updateCombo(ComboBaseInfo comboBaseInfo);
//    -- id, name, price, store_id
}
