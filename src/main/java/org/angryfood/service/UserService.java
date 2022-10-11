package org.angryfood.service;

import org.angryfood.domain.*;
import org.angryfood.models.ServiceResponse;
import org.angryfood.models.UpdateUserParam;
import org.angryfood.models.UpdateUserPasswordParam;
import org.angryfood.models.UsernamePassword;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.HashMap;

public interface UserService
{
    ServiceResponse<Boolean> register(UserBaseInfo userBaseInfo);
    ServiceResponse<Long> login(UsernamePassword usernamePassword);
    ServiceResponse<Boolean> update(UpdateUserParam updateUserParam);
    ServiceResponse<Boolean> updateUserPassword(UpdateUserPasswordParam updateUserPasswordParam);
    ServiceResponse<Boolean> deleteUser(UserBaseInfo userBaseInfo);

}
