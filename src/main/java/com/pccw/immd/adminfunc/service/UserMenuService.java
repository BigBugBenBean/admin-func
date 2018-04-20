package com.pccw.immd.adminfunc.service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

public interface UserMenuService {
    MenuService.MenuItem getFunctionForUserRole(Map<String,String> applicationMenu, HttpServletRequest request, List<String> roleCDs) throws Exception ;
}
