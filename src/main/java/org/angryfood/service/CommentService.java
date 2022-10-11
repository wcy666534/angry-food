package org.angryfood.service;

import org.angryfood.domain.CommentBaseInfo;
import org.angryfood.models.ServiceResponse;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @Author: 作者
 * @Date: 2022/10/09/11:08
 * @Description: 致敬
 */
public interface CommentService {
    ServiceResponse<Boolean> addComment( CommentBaseInfo commentBaseInfo);
}
