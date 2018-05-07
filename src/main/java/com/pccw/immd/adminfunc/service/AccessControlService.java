package com.pccw.immd.adminfunc.service;

import com.pccw.immd.adminfunc.domain.AccessControl;
import com.pccw.immd.adminfunc.domain.AccessControlBlackList;
import com.pccw.immd.adminfunc.domain.AccessControlGlobalParam;
import com.pccw.immd.adminfunc.domain.AccessControlWhiteList;
import com.pccw.immd.adminfunc.dto.AccessControlCreateDTO;
import com.pccw.immd.adminfunc.dto.AccessControlGlobalParamsDTO;

import java.util.List;

/**
 * Created by Dell on 13/2/2018.
 */
public interface AccessControlService {

    List<AccessControl> listAll();

    void createWhiteList(AccessControlCreateDTO accessControlCreateDTO);

    void createBlackList(AccessControlCreateDTO accessControlCreateDTO);

    void updateWhiteList(AccessControlWhiteList accessControlWhiteList);

    void updateBlackList(AccessControlBlackList accessControlBlackList);

    void deleteWhiteList(AccessControlWhiteList accessControlWhiteList);

    void deleteBlackList(AccessControlBlackList accessControlBlackList);

    List<AccessControlGlobalParam> getGlobalParam();

    void updateGlobalParam(AccessControlGlobalParamsDTO accessControlGlobalParamsDTO);

    List<AccessControlBlackList> listAllBlackList();
}
