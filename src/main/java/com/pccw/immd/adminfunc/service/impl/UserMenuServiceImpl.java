package com.pccw.immd.adminfunc.service.impl;

import com.pccw.immd.adminfunc.service.MenuService.MenuItem;
import com.pccw.immd.adminfunc.domain.Func;
import com.pccw.immd.adminfunc.repository.FuncRepository;
import com.pccw.immd.adminfunc.repository.GroupFuncRepository;
import com.pccw.immd.adminfunc.repository.RoleGroupRepository;
import com.pccw.immd.adminfunc.repository.UserMenuRepository;
import com.pccw.immd.adminfunc.service.MenuService;
import com.pccw.immd.adminfunc.service.UserMenuService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("userMenuService")
public class UserMenuServiceImpl implements UserMenuService {

    private static final Logger logger = Logger.getLogger(UserMenuServiceImpl.class);

    @Autowired
    @Qualifier("userMenuRepository")
    UserMenuRepository userMenuRepository;


    @Autowired
    @Qualifier("menuService.eservices2")
    MenuService menuService;

    @Override
    public MenuService.MenuItem getFunctionForUserRole(MenuItem applicationMenu, HttpServletRequest request, List<String> roleCDs) {
        List<Object[]> functionsForUserRole = userMenuRepository.findFunctionsForUserRole("R01");
        Map<String, String> menuProperties = new HashMap<>();
        List<String> grantedFuncs = new ArrayList<>();

        for ( Object[] o : functionsForUserRole ) {
            String url = (String)o[6];
            String labelKey = isContains(url, applicationMenu);
            if (labelKey != null) {
                menuProperties.put(labelKey, url);
                grantedFuncs.add(url);
            }
        }

        request.getSession().setAttribute("test menu", grantedFuncs);
        return menuService.buildMenuTree(menuProperties);
    }

    private String isContains(String url, MenuItem menu) {
        if (url.equals(menu.getUrl())){
            return menu.getLabelKey();
        }else{
            if (menu.getChild().size() > 0 ){
                String tmp = null;
                for ( MenuItem m : menu.getChild())
                    tmp = isContains(url, m);
                return tmp;
            }else {
                return null;
            }
        }
    }

}
