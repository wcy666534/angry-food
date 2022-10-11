package org.angryfood.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.angryfood.dao.ComboBaseInfoMapper;
import org.angryfood.domain.ComboBaseInfo;
import org.angryfood.models.ServiceResponse;
import org.angryfood.service.ComboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: 作者
 * @Date: 2022/10/09/11:10
 * @Description: 致敬
 */

@Service
@Slf4j
public class ComboServiceImpl implements ComboService {
    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private ComboBaseInfoMapper comboBaseInfoMapper;
    public ServiceResponse<Boolean> updateCombo(ComboBaseInfo comboBaseInfo){
        try {
            int successCount =comboBaseInfoMapper.updateCombo(comboBaseInfo);

            if (successCount > 0) {
                return ServiceResponse.buildSuccessResponse(true);
            } else {
                return ServiceResponse.buildErrorResponse(1, "Error when mupdateCombo.");
            }
        } catch (Exception e) {
            log.error("Error when executing SQL: ", e);
            return ServiceResponse.buildErrorResponse(2, "Error when updateCombo.");
        }
    }
}
