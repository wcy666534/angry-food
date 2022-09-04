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
    private String username;
    private String encryptedPassword;
    private String nickname;
    private String emailAddress;
    private String phoneNumber;
}