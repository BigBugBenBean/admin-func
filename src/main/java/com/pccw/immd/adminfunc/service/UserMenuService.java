package com.pccw.immd.adminfunc.service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface UserMenuService {
    MenuService.MenuItem getFunctionForUserRole(MenuService.MenuItem applicationMenu, HttpServletRequest request, List<String> roleCDs);
}
