package org.angryfood.service;

import org.angryfood.domain.UserBaseInfo;
import org.angryfood.models.ServiceResponse;
import org.angryfood.models.UsernamePassword;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;

public interface UserService
{
    ServiceResponse<Boolean> register(UserBaseInfo userBaseInfo);
    ServiceResponse<Long> login(UsernamePassword usernamePassword);
    ServiceResponse<Boolean> update(UserBaseInfo userBaseInfo);
    ServiceResponse<Boolean> deleteUser(UserBaseInfo userBaseInfo);
    ServiceResponse<ArrayList<String>> selectAllStore();
}
