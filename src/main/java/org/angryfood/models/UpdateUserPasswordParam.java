package org.angryfood.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: 作者
 * @Date: 2022/10/10/17:08
 * @Description: 致敬
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UpdateUserPasswordParam {
    private long id;
    private String oldEncryptedPassword;
    private String newEncryptedPassword;
}
