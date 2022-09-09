package org.angryfood.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.angryfood.dao.UserBaseInfoMapper;
import org.angryfood.domain.StoreBaseInfo;
import org.angryfood.domain.UserBaseInfo;
import org.angryfood.models.ServiceResponse;
import org.angryfood.models.UsernamePassword;
import org.angryfood.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Autowired
    private UserBaseInfoMapper userBaseInfoMapper;

    public ServiceResponse<Boolean> register(UserBaseInfo userBaseInfo) {
        log.info("userBaseInfo = " + userBaseInfo);

        try {
            int insertSuccessCount = userBaseInfoMapper.insertUser(userBaseInfo);

            if (insertSuccessCount > 0) {
                return ServiceResponse.buildSuccessResponse(true);
            } else {
                return ServiceResponse.buildErrorResponse(1, "Error when registration.");
            }
        } catch (Exception e) {
            log.error("Error when executing SQL: ", e);
            return ServiceResponse.buildErrorResponse(1, "Error when registration.");
        }
    }

    public ServiceResponse<Long> login(UsernamePassword usernamePassword) {
        log.info("usernamePassword = " + usernamePassword);

        try {
            int userCount = userBaseInfoMapper.getUsernamePasswordMatchCount(usernamePassword);

            if (userCount > 0) {
                Long userId = userBaseInfoMapper.getIdByUsername(usernamePassword.getUsername());

                if (userId != null) {
                    return ServiceResponse.buildSuccessResponse(userId);
                } else {
                    return ServiceResponse.buildErrorResponse(2, "No such user");
                }
            } else {
                return ServiceResponse.buildErrorResponse(2, "Username/password not match.");
            }
        } catch (Exception e) {
            log.error("Error when executing SQL: ", e);
            return ServiceResponse.buildErrorResponse(2, "Error when registration.");
        }
    }

    public ServiceResponse<Boolean> update(UserBaseInfo userBaseInfo) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        long id = userBaseInfoMapper.getIdByUsername(userBaseInfo.getUsername());
        map.put("id", id);
        map.put("username", userBaseInfo.getUsername());
        map.put("encryptedPassword", userBaseInfo.getEncryptedPassword());
        map.put("nickname", userBaseInfo.getNickname());
        map.put("phoneNumber", userBaseInfo.getPhoneNumber());
        map.put("emailAddress", userBaseInfo.getEmailAddress());
        try {
            int updateSuccessCount = userBaseInfoMapper.updateUser(map);

            if (updateSuccessCount > 0) {
                return ServiceResponse.buildSuccessResponse(true);
            } else {
                return ServiceResponse.buildErrorResponse(3, "Error when update.");
            }
        } catch (Exception e) {
            log.error("Error when executing SQL: ", e);
            return ServiceResponse.buildErrorResponse(3, "Error when update.");
        }

    }

    public ServiceResponse<Boolean> deleteUser(UserBaseInfo userBaseInfo) {
        try {
            long id = userBaseInfoMapper.getIdByUsername(userBaseInfo.getUsername());
            long deleteCount = userBaseInfoMapper.deleteUser(id);

            if (deleteCount > 0) {
                return ServiceResponse.buildSuccessResponse(true);
            } else {
                return ServiceResponse.buildErrorResponse(4, "Error when delete.");
            }

        } catch (Exception e) {
            log.error("Error when executing SQL: ", e);

            return ServiceResponse.buildErrorResponse(4, "Error when delete.");
        }
    }

    public ServiceResponse<ArrayList<String>> selectAllStore() {
        try {
            ArrayList<String> storeList = userBaseInfoMapper.selectAllStore();
            return ServiceResponse.buildSuccessResponse(storeList);
        } catch (Exception e) {
            log.error("Error when executing SQL: ", e);

            return ServiceResponse.buildErrorResponse(5, "Error when selectAllStore.");
        }
    }

    public ServiceResponse<ArrayList<StoreBaseInfo>> selectStoreByStoreId(long storeId) {
        ArrayList<StoreBaseInfo> storeList =userBaseInfoMapper.selectStoreByStoreId(1);
        return ServiceResponse.buildSuccessResponse(storeList);
    }

}
