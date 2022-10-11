package org.angryfood.dao;

import org.angryfood.domain.*;
import org.angryfood.models.ServiceResponse;
import org.angryfood.models.UpdateUserParam;
import org.angryfood.models.UpdateUserPasswordParam;
import org.angryfood.models.UsernamePassword;
import org.apache.catalina.Store;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Repository
public interface UserBaseInfoMapper
{
    int insertUser(UserBaseInfo userBaseInfo);
    int getUsernamePasswordMatchCount(UsernamePassword usernamePassword);
    Long getIdByUsername(String username);
    int updateUser(UpdateUserParam updateUserParam);
    String getPasswordById(long id);
    int updateUserPassword(UpdateUserPasswordParam updateUserPasswordParam);
    int deleteUser(long id);
}