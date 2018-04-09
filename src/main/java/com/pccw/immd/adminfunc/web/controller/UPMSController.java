package com.pccw.immd.adminfunc.web.controller;

import com.pccw.immd.adminfunc.domain.Func;
import com.pccw.immd.adminfunc.domain.Group;
import com.pccw.immd.adminfunc.domain.GroupFunc;
import com.pccw.immd.adminfunc.domain.RoleGroup;
import com.pccw.immd.adminfunc.repository.FuncRepository;
import com.pccw.immd.adminfunc.repository.GroupFuncRepository;
import com.pccw.immd.adminfunc.repository.GroupRepository;
import com.pccw.immd.adminfunc.repository.RoleGroupRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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

    private static final Logger LOG = LoggerFactory.getLogger(UPMSController.class);

    @GetMapping(value = "/ivrs_enquireAllData.do")
    public String enquireAllData() {

        LOG.info("Executing operation enquireAllData");
        try {
            RoleTxgpTxidDTO roleTxgpTxidDTO = new RoleTxgpTxidDTO();

            List<String> roleIdList = roleGroupRepository.findAllRoleId();
            LOG.info("roleTxgpTxidDTO: " + roleIdList);
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
                List<GroupFunc> funcList = groupFuncRepository.findAllByFuncId(funcId);
                for (GroupFunc groupFunc : funcList) {
                    txgpTxid.getTxids().add(groupFunc.getFuncId());
                }
                roleTxgpTxidDTO.getTxgpTxids().add(txgpTxid);
            }

//            LOG.info("--------enquireAllData --> Role : Transaction Group--------");
//            for (RoleTxgp roleTxgp : roleTxgpTxidDTO.getRoleTxgps()) {
//                LOG.info("RoleCode: " + roleTxgp.getRoleCD());
//                for (String txgp : roleTxgp.getTxGps()) {
//                    LOG.info("Transaction Group: " + txgp);
//                }
//            }
//            LOG.info("--------enquireAllData --> Transaction Group ID : Transaction Group Desc--------");
//            for (Txgp txgp : roleTxgpTxidDTO.getTxgps()) {
//                LOG.info("Transaction Group ID: " + txgp.getTxGp());
//                LOG.info("Transaction Group Description: " + txgp.getTxGpDesc());
//            }
//            LOG.info("--------enquireAllData --> Group ID : Function ID--------");
//            for (TxgpTxid txgptxid : roleTxgpTxidDTO.getTxgpTxids()) {
//                LOG.info("Group ID: " + txgptxid.getTxGp());
//                for (String groupId : txgptxid.getTxids()) {
//                    LOG.info("Function ID: " + groupId);
//                }
//            }
//            LOG.info("roleTxgpTxidDTO: " + roleTxgpTxidDTO);


        } catch (Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
        return null;

//        return "/eServices2/IVRS/ivrs-success";
    }

    @PostMapping(value = "/enquireTransactionGroup.do")
    public String enquireTransactionGroup(List<String> roleCdList) {
        LOG.info("Executing operation enquireTransactionGroup");
        System.out.println(roleCdList);
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
            LOG.info("--------enquireTransactionGroup --> Role ID : Function ID : Function Description--------");
            for (TransGrpRoleDTO transGrpRoleDTO1 : transGrpRoleDTO) {
                LOG.info("RoleCode: " + transGrpRoleDTO1.getRoleCd());
                LOG.info("Function ID: " + transGrpRoleDTO1.getTxGrpId());
                LOG.info("Function Description: " + transGrpRoleDTO1.getTxGrpDesc());
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
        LOG.info("Executing operation enquireTxIDsByRoleCd");
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
            LOG.info("--------enquireTxIDsByRoleCd--------");
            for (Txid txid : txidList) {
                LOG.info("TXID: " + txid.getTxid());
                LOG.info("TXIDDescription: " + txid.getTxidDesc());
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
