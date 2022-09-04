package org.angryfood.service;

import org.angryfood.domain.UserBaseInfo;
import org.angryfood.models.ServiceResponse;
import org.angryfood.models.UsernamePassword;
import org.springframework.web.bind.annotation.RequestBody;

public interface UserService
{
    ServiceResponse<Boolean> register(UserBaseInfo userBaseInfo);
    ServiceResponse<Long> login(UsernamePassword usernamePassword);
}
