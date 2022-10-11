package org.angryfood.controller;

import org.angryfood.domain.ComboBaseInfo;
import org.angryfood.models.ServiceResponse;
import org.angryfood.service.ComboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 作者
 * @Date: 2022/10/09/11:00
 * @Description: 致敬
 */
@RestController
@RequestMapping("/combo")
public class ComboController {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private ComboService comboService;
    @PostMapping("/update")
    public ServiceResponse<Boolean> updateCombo(@RequestBody ComboBaseInfo comboBaseInfo){
        return comboService.updateCombo(comboBaseInfo);
    }
}
