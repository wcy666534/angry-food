package org.angryfood.controller;

import org.angryfood.domain.MerchantBaseInfo;
import org.angryfood.domain.UserBaseInfo;
import org.angryfood.models.ServiceResponse;
import org.angryfood.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: 作者
 * @Date: 2022/10/09/10:59
 * @Description: 致敬
 */
@RestController
@RequestMapping("/merchant")
public class MerchantController {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private MerchantService merchantService;
    @GetMapping ("/hello")
    public String hello(){return "hell0!";}
    @PostMapping("/addMerchant")
    public ServiceResponse<Boolean> addMerchant(@RequestBody MerchantBaseInfo merchantBaseInfo) {
        return merchantService.addMerchant(merchantBaseInfo);
    }

}
