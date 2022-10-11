package org.angryfood.controller;

import org.angryfood.domain.AddressBaseInfo;
import org.angryfood.models.ServiceResponse;
import org.angryfood.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 作者
 * @Date: 2022/10/09/11:01
 * @Description: 致敬
 */
@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    private AddressService addressService;
    @PostMapping("/addAddress")
    public ServiceResponse<Boolean> addAddress(AddressBaseInfo addressBaseInfo){
        return addressService.addAddress(addressBaseInfo);
    }
}
