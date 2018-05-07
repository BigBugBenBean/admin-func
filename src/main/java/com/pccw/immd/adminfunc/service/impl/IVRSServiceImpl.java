package com.pccw.immd.adminfunc.service.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pccw.immd.adminfunc.domain.SystemParam;
import com.pccw.immd.adminfunc.dto.IvrsDTO;
import com.pccw.immd.adminfunc.repository.IvrsRepository;
import com.pccw.immd.adminfunc.service.IVRSService;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service("ivrsService.eservice2")
public class IVRSServiceImpl implements IVRSService {

    @Autowired
    @Qualifier("ivrsRepository.eservice2")
    private IvrsRepository ivrsRepository;

    @Override
    public List<SystemParam> listAll() {
        return ivrsRepository.findAll();

//        List<SystemParam> resultList;
//        resultList = ivrsRepository.findAll();

//        Map<String, Object> params = new HashMap<>();
//        String hql = "select sysParamKey, sysParamValue from SystemParam ORDER BY sysParamKey ASC";
//        hql = "select sysParamKey, sysParamValue from SystemParam ";
//        hql = "from SystemParam ";
//
////        EntityManager em = HibernateUtils.getEm();
////        Query query = em.createQuery(hql);
////        resultList = query.getResultList();
//
//        resultList = HibernateUtils.listByHQL(hql, params);
//
//        List<?> sss = new ArrayList<>();

//        return resultList;

//        return new ArrayList<>();
    }

    public List<SystemParam> updateSystemParam(IvrsDTO ivrsDTO) {
        List<SystemParam> dbSystemParams = this.listAll();

        List<SystemParam> updateSystemParamList = new ArrayList<>();

        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> map = objectMapper.convertValue(ivrsDTO, Map.class);

        // find and update edited value into list
        for (SystemParam param: dbSystemParams) {
            for (String key : map.keySet()) {
                if (key.toUpperCase().equals(param.getSysParamKey())) {
                    SystemParam updateParam = new SystemParam();
                    Object tmpNewValue = map.get(key);

                    String dbValue = param.getSysParamValue();

                    String newValue = "";
                    if (tmpNewValue instanceof String) {
                        if (tmpNewValue.equals("Y")) {
                            newValue = (String) tmpNewValue;
                        } else if (tmpNewValue.equals("N")) {
                            newValue = (String) tmpNewValue;
                        }
                    }

                    // add edited param into list
                    if (!newValue.equals(dbValue)) {
                        updateParam.setSysParamValue(newValue);
                        updateParam.setSysParamKey(key.toUpperCase());

                        updateSystemParamList.add(updateParam);
                    }
                }
            }
        }

        if (updateSystemParamList.size() > 0) {
            ivrsRepository.save(updateSystemParamList);
        }

        return this.listAll();
    }

}
