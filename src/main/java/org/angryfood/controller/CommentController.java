package org.angryfood.controller;

import org.angryfood.domain.CommentBaseInfo;
import org.angryfood.models.ServiceResponse;
import org.angryfood.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 作者
 * @Date: 2022/10/09/11:05
 * @Description: 致敬
 */
@RestController
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    private CommentService commentService;
    @PostMapping("/addComment")
    public ServiceResponse<Boolean> addComment(@RequestBody CommentBaseInfo commentBaseInfo){
        return commentService.addComment(commentBaseInfo);
    }
}
