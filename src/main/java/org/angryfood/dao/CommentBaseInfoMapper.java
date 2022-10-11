package org.angryfood.dao;

import org.angryfood.domain.CommentBaseInfo;
import org.angryfood.models.ServiceResponse;

/**
 * @Author: 作者
 * @Date: 2022/10/09/11:05
 * @Description: 致敬
 */
public interface CommentBaseInfoMapper {
   int addComment(CommentBaseInfo commentBaseInfo);
}
