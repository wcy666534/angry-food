package org.angryfood.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: 作者
 * @Date: 2022/10/10/17:01
 * @Description: 致敬
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UpdateUserParam {
    private long id;
    private String name;
    private String nickname;
    private String emailAddress;
    private String phoneNumber;
}
