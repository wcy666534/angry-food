package org.angryfood.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: 作者
 * @Date: 2022/10/09/16:52
 * @Description: 致敬
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MerchantBaseInfo {
    private long id;
    private String name;
    private String encryptedPassword;
    private String nickname;
    private String emailAddress;
    private String phoneNumber;
}