package org.angryfood.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.angryfood.dao.UserBaseInfoMapper;
import org.angryfood.domain.UserBaseInfo;
import org.angryfood.models.ServiceResponse;
import org.angryfood.models.UpdateUserParam;
import org.angryfood.models.UpdateUserPasswordParam;
import org.angryfood.models.UsernamePassword;
import org.angryfood.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
                return ServiceResponse.buildErrorResponse(1, "Error when user registration.");
            }
        } catch (Exception e) {
            log.error("Error when executing SQL: ", e);
            return ServiceResponse.buildErrorResponse(1, "Error when user registration.");
        }
    }

    public ServiceResponse<Long> login(UsernamePassword usernamePassword) {
        log.info("usernamePassword = " + usernamePassword);

        try {
            int userCount = userBaseInfoMapper.getUsernamePasswordMatchCount(usernamePassword);

            if (userCount > 0) {
                Long userId = userBaseInfoMapper.getIdByUsername(usernamePassword.getName());

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
            return ServiceResponse.buildErrorResponse(2, "Error when login.");
        }
    }

    public ServiceResponse<Boolean> update(UpdateUserParam updateUserParam) {
        try {
            int updateSuccessCount = userBaseInfoMapper.updateUser(updateUserParam);

            if (updateSuccessCount > 0) {
                return ServiceResponse.buildSuccessResponse(true);
            } else {
                return ServiceResponse.buildErrorResponse(3, "Error when update user.");
            }
        } catch (Exception e) {
            log.error("Error when executing SQL: ", e);
            return ServiceResponse.buildErrorResponse(3, "Error when update user.");
        }

    }

    public ServiceResponse<Boolean> updateUserPassword(UpdateUserPasswordParam updateUserPasswordParam) {
        try {
            String encryptedPassword = userBaseInfoMapper.getPasswordById(updateUserPasswordParam.getId());
            if (encryptedPassword.equals(updateUserPasswordParam.getOldEncryptedPassword())) {

                int updateSuccessCount = userBaseInfoMapper.updateUserPassword(updateUserPasswordParam);
                if (updateSuccessCount > 0) {
                    return ServiceResponse.buildSuccessResponse(true);
                } else {
                    return ServiceResponse.buildErrorResponse(3, "Error when update userPassword.");
                }

            }else{ return ServiceResponse.buildErrorResponse(3, "oldEncryptedPassword is error.");}
        } catch (Exception e) {
            log.error("Error when executing SQL: ", e);
            return ServiceResponse.buildErrorResponse(3, "Error when update userPassword.");

        }

    }

    public ServiceResponse<Boolean> deleteUser(UserBaseInfo userBaseInfo) {
        try {
            long deleteCount = userBaseInfoMapper.deleteUser(userBaseInfo.getId());
            if (deleteCount > 0) {
                return ServiceResponse.buildSuccessResponse(true);
            } else {
                return ServiceResponse.buildErrorResponse(4, "Error when delete.");
            }

        } catch (Exception e) {
            return ServiceResponse.buildErrorResponse(4, "Error when delete.");
        }
    }

}
