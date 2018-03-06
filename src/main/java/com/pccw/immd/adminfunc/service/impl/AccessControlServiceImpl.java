package com.pccw.immd.adminfunc.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pccw.immd.adminfunc.domain.AccessControl;
import com.pccw.immd.adminfunc.domain.AccessControlBlackList;
import com.pccw.immd.adminfunc.domain.AccessControlGlobalParam;
import com.pccw.immd.adminfunc.domain.AccessControlWhiteList;
import com.pccw.immd.adminfunc.dto.AccessControlCreateDTO;
import com.pccw.immd.adminfunc.dto.AccessControlGlobalParamsDTO;
import com.pccw.immd.adminfunc.repository.HibernateUtils;
import com.pccw.immd.adminfunc.repository.UmAccessControlBlackListRepository;
import com.pccw.immd.adminfunc.repository.UmAccessControlGlobalParamRepository;
import com.pccw.immd.adminfunc.repository.UmAccessControlWhiteListRepository;
import com.pccw.immd.adminfunc.service.AccessControlService;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/**
 * Created by Dell on 13/2/2018.
 */
@Service("accessControlService.eservice2")
public class AccessControlServiceImpl implements AccessControlService {

    @Autowired
    @Qualifier("umAccessControlBlackListRepository.eservice2")
    private UmAccessControlBlackListRepository blackListRepository;

    @Autowired
    @Qualifier("umAccessControlWhiteListRepository.eservice2")
    private UmAccessControlWhiteListRepository whiteListRepository;

    @Autowired
    @Qualifier("umAccessControlGlobalParamRepository.eservice2")
    private UmAccessControlGlobalParamRepository globalParamRepository;

    @Override
    public List<AccessControl> listAll() {
        Order order = Order.asc("acId");
        List<AccessControl> accessControlList = HibernateUtils.listByDomain(AccessControl.class, order);

        accessControlList.sort(new Comparator<AccessControl>() {
            @Override
            public int compare(AccessControl ac1, AccessControl ac2) {
                return ac1.getAcId() < ac2.getAcId() ? -1 :
                        ac1.getAcId() == ac2.getAcId() ? 0 : 1;
            }
        });
        return accessControlList;
    }

    @Override
    public void createWhiteList(AccessControlCreateDTO accessControlCreateDTO) {
        AccessControlWhiteList whiteList = new AccessControlWhiteList();

        whiteList.setAcIp(accessControlCreateDTO.getDesc());
        whiteList.setAcList(accessControlCreateDTO.getType());
        whiteList.setAcName(accessControlCreateDTO.getName());
        whiteList.setChannel(accessControlCreateDTO.getChannel());
        whiteList.setEffectDateFrom(accessControlCreateDTO.getEffectiveFrom());
        whiteList.setEffectDateTo(accessControlCreateDTO.getEffectiveTo());

        whiteListRepository.saveAndFlush(whiteList);
    }

    @Override
    public void createBlackList(AccessControlCreateDTO accessControlCreateDTO) {

        AccessControlBlackList blackList = new AccessControlBlackList();

        blackList.setAcIp(accessControlCreateDTO.getDesc());
        blackList.setAcList(accessControlCreateDTO.getType());
        blackList.setAcName(accessControlCreateDTO.getName());
        blackList.setChannel(accessControlCreateDTO.getChannel());
        blackList.setEffectDateFrom(accessControlCreateDTO.getEffectiveFrom());
        blackList.setEffectDateTo(accessControlCreateDTO.getEffectiveTo());

        blackListRepository.saveAndFlush(blackList);
    }

    @Override
    public void updateWhiteList(AccessControlWhiteList accessControlWhiteList) {

    }

    @Override
    public void updateBlackList(AccessControlBlackList accessControlBlackList) {
//        blackListRepository.saveAndFlush(accessControlBlackList);
    }

    @Override
    public void deleteWhiteList(AccessControlWhiteList accessControlWhiteList) {

    }

    @Override
    public void deleteBlackList(AccessControlBlackList accessControlBlackList) {
        blackListRepository.delete(accessControlBlackList);
    }

    @Override
    public List<AccessControlGlobalParam> getGlobalParam() {
        return globalParamRepository.findAll();
    }

    @Override
    public void updateGlobalParam(AccessControlGlobalParamsDTO accessControlGlobalParamsDTO) {
        List<AccessControlGlobalParam> dbGlobalParams = this.getGlobalParam();

        List<AccessControlGlobalParam> updateParamList = new ArrayList<>();


        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> map = objectMapper.convertValue(accessControlGlobalParamsDTO, Map.class);


        // find and update edited value into list
        for (AccessControlGlobalParam param: dbGlobalParams) {
            for (String key: map.keySet() ) {
                if (key.equals(param.getKey())) {
                    AccessControlGlobalParam updateParam = new AccessControlGlobalParam();
                    Object tmpNewValue = map.get(key);

                    String dbValue = param.getValue();

                    String newValue = "";
                    if (tmpNewValue instanceof Boolean) {
                        newValue = ( (Boolean) tmpNewValue) ? "1" : "0";
                    } else if (tmpNewValue instanceof Integer) {
                        newValue = tmpNewValue.toString();
                    }

                    // add edited param into list
                    if ( !newValue.equals(dbValue) ) {
                        updateParam.setValue(newValue);
                        updateParam.setKey(key);

                        updateParamList.add(updateParam);
                    }

                }
            }
        }

        if (updateParamList.size() > 0) {
            globalParamRepository.save(updateParamList);
        }

    }

    @Override
    public List<AccessControlBlackList> listAllBlackList() {
        return blackListRepository.findAll();
    }
}
