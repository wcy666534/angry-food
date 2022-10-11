package org.angryfood.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;

/**
 * @Author: 作者
 * @Date: 2022/10/09/19:12
 * @Description: 致敬
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CommentBaseInfo {
    private long id;
    private long orderId;
    private String comment;
    private Time time;
//    id,order_id,comment,time
}
