package org.angryfood.dao;

import org.angryfood.domain.UserBaseInfo;
import org.angryfood.models.UsernamePassword;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public interface UserBaseInfoMapper
{
    int insertUser(UserBaseInfo userBaseInfo);
    int getUsernamePasswordMatchCount(UsernamePassword usernamePassword);
    Long getIdByUsername(String username);
    int updateUser(HashMap<String,Object>map);
    int deleteUser(long id);
    ArrayList<String> selectAllStore();


}