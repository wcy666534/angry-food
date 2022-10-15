package org.angryfood.domain;

import lombok.*;

/**
 * @Author: 作者
 * @Date: 2022/10/01/18:20
 * @Description: 致敬
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class AddressBaseInfo {
    private long id;
    private String address;
    private String addressee;
    private String phoneNumber;
//    -- id, address, addressee, phone_number
}
