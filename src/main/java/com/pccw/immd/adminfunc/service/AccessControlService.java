package com.pccw.immd.adminfunc.service;

import com.pccw.immd.adminfunc.domain.AccessControl;
import com.pccw.immd.adminfunc.domain.AccessControlBlackList;
import com.pccw.immd.adminfunc.domain.AccessControlGlobalParam;
import com.pccw.immd.adminfunc.domain.AccessControlWhiteList;

import java.util.List;

/**
 * Created by Dell on 13/2/2018.
 */
public interface AccessControlService {

    List<AccessControl> getByEnable();

    void createWhiteList(AccessControlWhiteList accessControlWhiteList);

    void createBlackList(AccessControlBlackList accessControlBlackList);

    void updateWhiteList(AccessControlWhiteList accessControlWhiteList);

    void updateBlackList(AccessControlBlackList accessControlBlackList);

    void deleteWhiteList(AccessControlWhiteList accessControlWhiteList);

    void deleteBlackList(AccessControlBlackList accessControlBlackList);

    List<AccessControlGlobalParam> getGlobalParam();

    void updateGlobalParam(AccessControlGlobalParam accessControlGlobalParam);

    List<AccessControlBlackList> listAllBlackList();
}
