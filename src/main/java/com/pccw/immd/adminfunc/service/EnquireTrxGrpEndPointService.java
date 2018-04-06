package com.pccw.immd.adminfunc.service;

import com.pccw.immd.adminfunc.domain.Group;
import com.pccw.immd.adminfunc.domain.GroupFunc;
import com.pccw.immd.adminfunc.domain.RoleGroup;
import com.pccw.immd.adminfunc.repository.GroupFuncRepository;
import com.pccw.immd.adminfunc.repository.GroupRepository;
import com.pccw.immd.adminfunc.repository.RoleGroupRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ws.cds.immd.v1.*;

import java.util.List;

@Service("EnquireTrxGrpEndPointService")
public class EnquireTrxGrpEndPointService extends AbstractEnquireTrxService implements EnquireTransactionGroupServiceWS {

    static final Logger logger = Logger.getLogger(EnquireTrxGrpEndPointService.class);

    @Autowired
    RoleGroupRepository roleGroupRepository;

    @Autowired
    GroupRepository groupRepository;

    @Autowired
    GroupFuncRepository groupFuncRepository;

    @Override
    public RoleTxgpTxidDTO enquireAllData() throws VLDExceptionException, CoreAppExceptionException {
        logger.info("Getting All Transaction Group, id, and role.");
        RoleTxgpTxidDTO roleTxgpTxidDTO = new RoleTxgpTxidDTO();

        List<String> roleIdList = roleGroupRepository.findAllRoleId();
        for (String roleId: roleIdList) {
            RoleTxgp roleTxgp = new RoleTxgp();
            roleTxgp.setRoleCD(roleId);
            List<RoleGroup> roleGroupList = roleGroupRepository.findAllByRoleId(roleId);
            for (RoleGroup roleGroup: roleGroupList) {
                roleTxgp.getTxGps().add(roleGroup.getGroupId());
            }
            roleTxgpTxidDTO.getRoleTxgps().add(roleTxgp);
        }

        List<Group> groupIdDescList = groupRepository.findAll();
        for (Group group : groupIdDescList) {
            Txgp txgp = new Txgp();
            txgp.setTxGp(group.getFuncId());
            txgp.setTxGpDesc(group.getFuncDesc());
            roleTxgpTxidDTO.getTxgps().add(txgp);
        }

        List<String> funcIdList = groupFuncRepository.findAllFuncId();
        for (String funcId: funcIdList) {
            TxgpTxid txgpTxid = new TxgpTxid();
            txgpTxid.setTxGp(funcId);
            List<GroupFunc> funcList = groupFuncRepository.findAllByFuncId(funcId);
            for (GroupFunc groupFunc : funcList) {
                txgpTxid.getTxids().add(groupFunc.getFuncId());
            }
            roleTxgpTxidDTO.getTxgpTxids().add(txgpTxid);
        }

        logger.debug("RoleTxgpTxidDTo: " + roleTxgpTxidDTO);
        return roleTxgpTxidDTO;
    }

    @Override
    public List<TransGrpRoleDTO> enquireTransactionGroup(List<String> roleCdList) throws VLDExceptionException, CoreAppExceptionException {
        return null;
    }

    @Override
    public List<Txid> enquireTxIDsByRoleCd(String roleCd) {
        return null;
    }
}
