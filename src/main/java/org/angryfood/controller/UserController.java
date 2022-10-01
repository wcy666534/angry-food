package org.angryfood.controller;

import org.angryfood.domain.StoreBaseInfo;
import org.angryfood.domain.UserBaseInfo;
import org.angryfood.models.ServiceResponse;
import org.angryfood.models.UsernamePassword;
import org.angryfood.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @PostMapping("/register")
    public ServiceResponse<Boolean> register(@RequestBody UserBaseInfo userBaseInfo) {
        return userService.register(userBaseInfo);
    }

    @PostMapping("/login")
    public ServiceResponse<Long> login(@RequestBody UsernamePassword usernamePassword) {
        return userService.login(usernamePassword);
    }

    @PostMapping("/update")
    public ServiceResponse<Boolean> update(@RequestBody UserBaseInfo userBaseInfo) {
        return userService.update(userBaseInfo);
    }

    @PostMapping("/delete")
    public ServiceResponse<Boolean> delete(@RequestBody UserBaseInfo userBaseInfo) {
        return userService.deleteUser(userBaseInfo);
    }

    @GetMapping("/selectAllStore")
    public ServiceResponse<ArrayList<String>> selectAllStore() {
        return userService.selectAllStore();

    }

    @GetMapping("/selectStoreByStoreId")
    public ServiceResponse<ArrayList<StoreBaseInfo>> selectStoreByStoreId() {
        //先用1代替吧
        return userService.selectStoreByStoreId(1);
    }
    @PostMapping("/insertOrder")
    public ServiceResponse<Boolean> insertOrder(@RequestBody long userId,long storeId,long comboId){
        return userService.insertOrder(userId, storeId,comboId);
    }
    @PostMapping("/insertComment")
    public ServiceResponse<Boolean> insertComment(@RequestBody long orderId,String comment){
        return userService.insertComment( orderId, comment);
    }
}
