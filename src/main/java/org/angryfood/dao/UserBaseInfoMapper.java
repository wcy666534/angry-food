package org.angryfood.dao;

import org.angryfood.domain.UserBaseInfo;
import org.angryfood.models.UsernamePassword;
import org.springframework.stereotype.Repository;

@Repository
public interface UserBaseInfoMapper
{
    int insertUser(UserBaseInfo userBaseInfo);
    int getUsernamePasswordMatchCount(UsernamePassword usernamePassword);
    Long getIdByUsername(String username);
}