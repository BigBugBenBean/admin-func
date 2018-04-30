package com.pccw.immd.adminfunc.service.impl;

import com.pccw.immd.adminfunc.domain.Group;
import com.pccw.immd.adminfunc.domain.GroupFunc;
import com.pccw.immd.adminfunc.domain.Role;
import com.pccw.immd.adminfunc.domain.RoleGroup;
import com.pccw.immd.adminfunc.domain.id.GroupFuncId;
import com.pccw.immd.adminfunc.domain.id.RoleGroupId;
import com.pccw.immd.adminfunc.dto.FunctionGroupCreateDTO;
import com.pccw.immd.adminfunc.repository.FuncRepository;
import com.pccw.immd.adminfunc.repository.GroupFuncRepository;
import com.pccw.immd.adminfunc.repository.GroupRepository;
import com.pccw.immd.adminfunc.repository.RoleGroupRepository;
import com.pccw.immd.adminfunc.service.FunctionGroupService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service("functionGroupService.eservices2")
public class FunctionGroupServiceImpl implements FunctionGroupService {

    private static final Logger LOG = Logger.getLogger(FunctionGroupServiceImpl.class);

    @Autowired
    FuncRepository funcRepository;

    @Autowired
    GroupFuncRepository groupFuncRepository;

    @Autowired
    GroupRepository groupRepository;

    @Autowired
    RoleGroupRepository roleGroupRepository;

    public void createNewGroupFuncGroup(FunctionGroupCreateDTO functionGroupCreateDTO) {

        List<String> functionList = functionGroupCreateDTO.getCurrentFunc();
        String groupId = functionGroupCreateDTO.getGrpId();
        String groupDesc = functionGroupCreateDTO.getGroupDesc();
        createNewGroup(groupId, groupDesc, "");
        createGroupFunc(groupId, functionList);
    }

    @Override
    @Transactional
    public void createNewGroup(String groupId, String groupDesc, String userId) {

        Group createdGroup = new Group();
        createdGroup.setGroupId(groupId);
        createdGroup.setGroupDesc(groupDesc);
        createdGroup.setDisplayPos("");
        createdGroup.setLstUpdTd(new Date());
        groupRepository.save(createdGroup);
    }

    @Override
    @Transactional
    public void updateGroup(String groupId, String groupDesc, String userId) {

        Group groupForUpdate = groupRepository.findByGroupId(groupId);
        groupForUpdate.setGroupId(groupId);
        groupForUpdate.setGroupDesc(groupDesc);
        groupForUpdate.setDisplayPos("");
        groupForUpdate.setLstUpdTd(new Date());
        groupForUpdate.setLstUpdId(userId);
        groupRepository.save(groupForUpdate);
    }

    @Override
    @Transactional
    public void deleteRoleGroupFunction(String groupId) {

        List<RoleGroup> rolegroupList = roleGroupRepository.findRoleIdByGroupId(groupId);
        if (rolegroupList != null && rolegroupList.size()>0) {
            deleteRoleGroup(groupId);
            deleteFunctionGroup(groupId, funcRepository.findFuncByGroupId(groupId));
            deleteGroup(groupId);
        } else {
            deleteFunctionGroup(groupId, funcRepository.findFuncByGroupId(groupId));
            deleteGroup(groupId);
        }
    }

    @Override
    @Transactional
    public void deleteGroup(String groupId) {
        Group group = groupRepository.findByGroupId(groupId);
        groupRepository.delete(group);
    }

    @Override
    @Transactional
    public void createGroupFunc(String id, List<String> functionIds){

        for (String funcId : functionIds) {
            GroupFunc groupFunc = new GroupFunc();
            GroupFuncId groupFuncId = new GroupFuncId();
            groupFuncId.setGrpId(id);
            groupFuncId.setFuncId(funcId);
            groupFunc.setId(groupFuncId);
            groupFuncRepository.save(groupFunc);
        }
    }

    @Override
    public HashMap loadGroupFunction(String groupId) {
        HashMap groupFunctionDetails = new HashMap();
        groupFunctionDetails.put("groupid", groupId);
        groupFunctionDetails.put("groupDesc", groupRepository.findByGroupId(groupId).getGroupDesc());
        groupFunctionDetails.put("functionList", funcRepository.findFuncByGroupId(groupId));
        return groupFunctionDetails;
    }

    @Override
    @Transactional
    public void updateGroupFunction(FunctionGroupCreateDTO functionGroupCreateDTO) {

        List<String> removedFunc = compareList(functionGroupCreateDTO.getCurrentFunc(), funcRepository.findFuncByGroupId(functionGroupCreateDTO.getGrpId()));
        List<String> addedFunc = compareList(funcRepository.findFuncByGroupId(functionGroupCreateDTO.getGrpId()), functionGroupCreateDTO.getCurrentFunc());
        deleteFunctionGroup(functionGroupCreateDTO.getGrpId(), removedFunc);
        createGroupFunc(functionGroupCreateDTO.getGrpId(), addedFunc);
        updateGroup(functionGroupCreateDTO.getGrpId(), functionGroupCreateDTO.getGroupDesc(), "");
    }

    private List<String> compareList(List<String> refList, List<String> sourceList) {

        List<String> comparedList = new ArrayList<>();
        for (String newString : sourceList) {
            if (!refList.contains(newString)) {
                comparedList.add(newString);
            }
        }
        return comparedList;
    }

    @Override
    @Transactional
    public void deleteFunctionGroup(String groupId, List<String> removedFunc) {

        for (String funcId : removedFunc) {
            GroupFunc groupFunc = new GroupFunc();
            GroupFuncId groupFuncId = new GroupFuncId();
            groupFuncId.setGrpId(groupId);
            groupFuncId.setFuncId(funcId);
            groupFunc.setId(groupFuncId);
            groupFuncRepository.delete(groupFunc);
        }
    }

    @Override
    @Transactional
    public void deleteRoleGroup(String groupId) {

        List<RoleGroup> roleGroupList = roleGroupRepository.findByIdGroupId(groupId);

        for (RoleGroup roleGroup : roleGroupList) {
            RoleGroupId roleGroupId = new RoleGroupId();
            roleGroupId.setGroupId(roleGroup.getId().getGroupId());
            roleGroupId.setRoleCd(roleGroup.getId().getRoleCd());
            roleGroupId.setRoleId(roleGroup.getId().getRoleId());
            RoleGroup roleGroupForDelete = new RoleGroup();
            roleGroupForDelete.setId(roleGroupId);
            roleGroupRepository.delete(roleGroupForDelete);
        }

    }

}
