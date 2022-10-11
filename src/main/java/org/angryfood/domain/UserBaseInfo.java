package org.angryfood.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserBaseInfo
{
    private long id;
    private String name;
    private String encryptedPassword;
    private String nickname;
    private String emailAddress;
    private String phoneNumber;
//    id,name,encryptedPassword,nickname,emailAddress,phoneNumber
}