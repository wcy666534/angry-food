package org.angryfood.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.angryfood.dao.CommentBaseInfoMapper;
import org.angryfood.domain.CommentBaseInfo;
import org.angryfood.models.ServiceResponse;
import org.angryfood.service.ComboService;
import org.angryfood.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Author: 作者
 * @Date: 2022/10/09/11:12
 * @Description: 致敬
 */

@Service
@Slf4j
public class CommentServiceImpl implements CommentService {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private CommentBaseInfoMapper commentBaseInfoMapper;
    public ServiceResponse<Boolean> addComment(CommentBaseInfo commentBaseInfo){
        try {
            int insertSuccessCount = commentBaseInfoMapper.addComment(commentBaseInfo);

            if (insertSuccessCount > 0) {
                return ServiceResponse.buildSuccessResponse(true);
            } else {
                return ServiceResponse.buildErrorResponse(1, "Error when commentBaseInfo registration.");
            }
        } catch (Exception e) {
            return ServiceResponse.buildErrorResponse(1, "Error when commentBaseInfo registration.");
        }
    }
}
