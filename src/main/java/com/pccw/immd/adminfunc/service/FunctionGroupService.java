package com.pccw.immd.adminfunc.service;

import com.pccw.immd.adminfunc.dto.FunctionGroupCreateDTO;

import java.util.HashMap;
import java.util.List;

public interface FunctionGroupService {

    public void createNewGroup(String groupId, String groupDesc, String userId);
    public void updateGroup(String groupId, String groupDesc, String userId);
    public void createGroupFunc(String id, List<String> functionIds);

    public HashMap loadGroupFunction(String groupId);

    public void updateGroupFunction(FunctionGroupCreateDTO functionGroupCreateDTO);
    public void deleteFunctionGroup(String groupId, List<String> functionList);

}
