package com.pccw.immd.adminfunc.service.impl;

import com.pccw.immd.adminfunc.repository.UserMenuRepository;
import com.pccw.immd.adminfunc.service.UserMenuService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userMenuService")
public class UserMenuServiceImpl implements UserMenuService {

    private static final Logger logger = Logger.getLogger(UserMenuServiceImpl.class);

    @Autowired
    @Qualifier("userMenuRepository")
    UserMenuRepository userMenuRepository;

    @Override
    public void getFunctionForUserRole(String roleCd) {

        List<String[]> functionsForUserRole = userMenuRepository.findFunctionsForUserRole("R01");
        for(Object sample : functionsForUserRole) {
            logger.info("functionsforrole: " + sample.toString());

        }

    }
}
