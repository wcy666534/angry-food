package org.angryfood.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: 作者
 * @Date: 2022/10/01/18:20
 * @Description: 致敬
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AddressBaseInfo {
    private long addressId;
    private long userId;
    private String address;
}
