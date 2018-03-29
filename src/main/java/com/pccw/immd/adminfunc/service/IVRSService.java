package com.pccw.immd.adminfunc.service;

import com.pccw.immd.adminfunc.domain.SystemParam;
import com.pccw.immd.adminfunc.dto.IvrsDTO;

import java.util.List;

public interface IVRSService {
    List<SystemParam> listAll();
    List<SystemParam> updateSystemParam(IvrsDTO ivrsDTO);
}
