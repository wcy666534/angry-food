package org.angryfood.dao;

import org.angryfood.domain.AddressBaseInfo;
import org.springframework.stereotype.Repository;

/**
 * @Author: 作者
 * @Date: 2022/10/09/11:05
 * @Description: 致敬
 */
@Repository
public interface AddressBaseInfoMapper {
    int addAddress(AddressBaseInfo addressBaseInfo);
}
