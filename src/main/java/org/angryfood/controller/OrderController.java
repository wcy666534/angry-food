package org.angryfood.controller;

import org.angryfood.domain.OrderBaseInfo;
import org.angryfood.models.ServiceResponse;
import org.angryfood.service.OrderService;
import org.angryfood.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 作者
 * @Date: 2022/10/09/11:02
 * @Description: 致敬
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;
    @PostMapping("/addOrder")
    public ServiceResponse<Boolean> addOrder(@RequestBody OrderBaseInfo orderBaseInfo){
        return orderService.addOrder(orderBaseInfo);
    }

    // 支持分页和关键字的订单查询

    // 订单删除, deleteById
}
