package org.angryfood.controller;

import org.angryfood.domain.UserBaseInfo;
import org.angryfood.models.Id;
import org.angryfood.models.ServiceResponse;
import org.angryfood.models.UsernamePassword;
import org.angryfood.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    //ServiceResponse
    public ServiceResponse<Boolean> delete(@RequestBody UserBaseInfo userBaseInfo) {
        return userService.deleteUser(userBaseInfo);
    }
}
