package org.angryfood.controller;

import org.angryfood.domain.StoreBaseInfo;
import org.angryfood.models.Id;
import org.angryfood.models.ServiceResponse;
import org.angryfood.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * @Author: 作者
 * @Date: 2022/10/09/11:00
 * @Description: 致敬
 */

@RestController
@RequestMapping("/store")
public class StoreController {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private StoreService storeService;
    @PostMapping("/addStore")
    public ServiceResponse<Boolean>  addStore(@RequestBody StoreBaseInfo storeBaseInfo){
        return storeService.addStore(storeBaseInfo);
    }
    @GetMapping("/getAllStore")
    public ServiceResponse<ArrayList<StoreBaseInfo>> getAllStore() {
        return storeService.getAllStore();

    }
    @PostMapping("/getStoreById")
    public ServiceResponse<StoreBaseInfo> getStoreById(@RequestBody Id id) {
        return storeService.getStoreById(id);
    }
}
