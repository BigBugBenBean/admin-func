package com.pccw.immd.adminfunc.service;

import com.pccw.immd.adminfunc.dto.FunctionGroupCreateDTO;

import java.util.HashMap;
import java.util.List;

public interface FunctionGroupService {

    public void createNewGroupFuncGroup(FunctionGroupCreateDTO functionGroupCreateDTO);
    public void createNewGroup(String groupId, String groupDesc, String userId);
    public void updateGroup(String groupId, String groupDesc, String userId);
    public void deleteRoleGroupFunction(String groupId);
    public void deleteGroup(String groupId);

    public void createGroupFunc(String id, List<String> functionIds);
    public HashMap loadGroupFunction(String groupId);
    public void updateGroupFunction(FunctionGroupCreateDTO functionGroupCreateDTO);
    public void deleteFunctionGroup(String groupId, List<String> functionList);
    public void deleteRoleGroup(String groupId);

}
