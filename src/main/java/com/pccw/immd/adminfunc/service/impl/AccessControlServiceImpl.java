package com.pccw.immd.adminfunc.service.impl;

import com.pccw.immd.adminfunc.domain.AccessControl;
import com.pccw.immd.adminfunc.domain.AccessControlBlackList;
import com.pccw.immd.adminfunc.domain.AccessControlGlobalParam;
import com.pccw.immd.adminfunc.domain.AccessControlWhiteList;
import com.pccw.immd.adminfunc.repository.UmAccessControlBlackListRepository;
import com.pccw.immd.adminfunc.repository.UmAccessControlGlobalParamRepository;
import com.pccw.immd.adminfunc.repository.UmAccessControlWhiteListRepository;
import com.pccw.immd.adminfunc.service.AccessControlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Dell on 13/2/2018.
 */
@Service("accessControlServiceImpl.eservice2")
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
    public List<AccessControl> getByEnable() {
        return null;
    }

    @Override
    public void createWhiteList(AccessControlWhiteList accessControlWhiteList) {

    }

    @Override
    public void createBlackList(AccessControlBlackList accessControlBlackList) {
        blackListRepository.saveAndFlush(accessControlBlackList);
    }

    @Override
    public void updateWhiteList(AccessControlWhiteList accessControlWhiteList) {

    }

    @Override
    public void updateBlackList(AccessControlBlackList accessControlBlackList) {
        blackListRepository.saveAndFlush(accessControlBlackList);
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
        return null;
    }

    @Override
    public void updateGlobalParam(AccessControlGlobalParam accessControlGlobalParam) {

    }

    @Override
    public List<AccessControlBlackList> listAllBlackList() {
        return blackListRepository.findAll();
    }
}
