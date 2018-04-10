package com.pccw.immd.adminfunc.web.controller;

import com.pccw.immd.adminfunc.domain.Func;
import com.pccw.immd.adminfunc.domain.Group;
import com.pccw.immd.adminfunc.domain.GroupFunc;
import com.pccw.immd.adminfunc.repository.FuncRepository;
import com.pccw.immd.adminfunc.repository.GroupFuncRepository;
import com.pccw.immd.adminfunc.repository.GroupRepository;
import com.pccw.immd.adminfunc.repository.RoleGroupRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ws.cds.immd.v1.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(value = "/e-Services-2/maintenance")
public class UPMSController {


    @Autowired
    RoleGroupRepository roleGroupRepository;

    @Autowired
    GroupRepository groupRepository;

    @Autowired
    GroupFuncRepository groupFuncRepository;

    @Autowired
    FuncRepository funcRepository;

    private static final Logger LOG = Logger.getLogger(UPMSController.class);

    @GetMapping(value = "/ivrs_enquireAllData.do")
    public String enquireAllData() {

        LOG.info("Executing operation enquireAllData");
        try {
            RoleTxgpTxidDTO roleTxgpTxidDTO = new RoleTxgpTxidDTO();
            List<String> roleIdList = roleGroupRepository.findAllRoleId();
            for (String roleId: roleIdList) {
                RoleTxgp roleTxgp = new RoleTxgp();
                roleTxgp.setRoleCD(roleId);
                List<String> roleGroupList = roleGroupRepository.findAllByRoleId(roleId);

                for (String groupID: roleGroupList) {
                    roleTxgp.getTxGps().add(groupID);
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
                List<String> funcList = groupFuncRepository.findAllByFuncId(funcId);
                for (String groupFunc : funcList) {
                    txgpTxid.getTxids().add(groupFunc);
                }
                roleTxgpTxidDTO.getTxgpTxids().add(txgpTxid);
            }

            LOG.debug("--------enquireAllData --> Role : Transaction Group--------");
            for (RoleTxgp roleTxgp : roleTxgpTxidDTO.getRoleTxgps()) {
                LOG.debug("RoleCode: " + roleTxgp.getRoleCD());
                for (String txgp : roleTxgp.getTxGps()) {
                    LOG.debug("Transaction Group: " + txgp);
                }
            }
            LOG.debug("--------enquireAllData --> Transaction Group ID : Transaction Group Desc--------");
            for (Txgp txgp : roleTxgpTxidDTO.getTxgps()) {
                LOG.debug("Transaction Group ID: " + txgp.getTxGp());
                LOG.debug("Transaction Group Description: " + txgp.getTxGpDesc());
            }
            LOG.debug("--------enquireAllData --> Group ID : Function ID--------");
            for (TxgpTxid txgptxid : roleTxgpTxidDTO.getTxgpTxids()) {
                LOG.debug("Group ID: " + txgptxid.getTxGp());
                for (String groupId : txgptxid.getTxids()) {
                    LOG.debug("Function ID: " + groupId);
                }
            }
            LOG.debug("roleTxgpTxidDTO: " + roleTxgpTxidDTO);


        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        return null;

//        return "/eServices2/IVRS/ivrs-success";
    }

    @PostMapping(value = "/enquireTransactionGroup.do")
    public String enquireTransactionGroup(List<String> roleCdList) {
        LOG.debug("Executing operation enquireTransactionGroup");
        try {
            List<TransGrpRoleDTO> transGrpRoleDTO = new ArrayList<TransGrpRoleDTO>();
            for (String roleCd : roleCdList) {
                List<String> roleGroupList = roleGroupRepository.findAllByRoleId(roleCd);
                for (String groupId : roleGroupList) {
                    TransGrpRoleDTO roleGroupDescList = new TransGrpRoleDTO();
                    roleGroupDescList.setRoleCd(roleCd);
                    Group groupID = groupRepository.findByGroupId(groupId);
                    roleGroupDescList.setTxGrpId(groupID.getFuncId());
                    roleGroupDescList.setTxGrpDesc(groupID.getFuncDesc());
                    transGrpRoleDTO.add(roleGroupDescList);
                }
            }
            LOG.debug("--------enquireTransactionGroup --> Role ID : Function ID : Function Description--------");
            for (TransGrpRoleDTO transGrpRoleDTO1 : transGrpRoleDTO) {
                LOG.debug("RoleCode: " + transGrpRoleDTO1.getRoleCd());
                LOG.debug("Function ID: " + transGrpRoleDTO1.getTxGrpId());
                LOG.debug("Function Description: " + transGrpRoleDTO1.getTxGrpDesc());
            }
//            return transGrpRoleDTO;

        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        return null;
//        return "/eServices2/IVRS/ivrs-success";
    }


    @PostMapping(value = "/enquireTxIDsByRoleCd.do")
    public String enquireTxIDsByRoleCd(String roleCd){
        LOG.debug("Executing operation enquireTxIDsByRoleCd");
        try {
            List<Txid> txidList = new ArrayList<Txid>();
            List<String> groupIdList = roleGroupRepository.findAllByRoleId(roleCd);
            for (String groupID : groupIdList) {
                List<GroupFunc> groupFunc = groupFuncRepository.findAllByGroupId(groupID);
                for (GroupFunc funcIdDesc : groupFunc ) {
                    Txid txid = new Txid();
                    Func txIdDesc = funcRepository.findByFuncId(funcIdDesc.getFuncId());
                    txid.setTxid(txIdDesc.getFuncId());
                    txid.setTxidDesc(txIdDesc.getFuncDesc());
                    txidList.add(txid);
                }
            }
            LOG.debug("--------enquireTxIDsByRoleCd--------");
            for (Txid txid : txidList) {
                LOG.debug("TXID: " + txid.getTxid());
                LOG.debug("TXIDDescription: " + txid.getTxidDesc());
            }
//            return txidList;
        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        return null;
//        return "/eServices2/IVRS/ivrs-success";
    }




}
