package com.pccw.immd.adminfunc.service.impl;

import static com.pccw.immd.adminfunc.service.MenuService.FUNC_LIST;
import static com.pccw.immd.adminfunc.service.impl.MenuServiceImpl.MENU_DELIMITER;
import static com.pccw.immd.adminfunc.service.impl.MenuServiceImpl.MENU_DELIMITER_REG;

import com.pccw.immd.adminfunc.repository.UserMenuRepository;
import com.pccw.immd.adminfunc.service.MenuService;
import com.pccw.immd.adminfunc.service.MenuService.MenuItem;
import com.pccw.immd.adminfunc.service.UserMenuService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

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
    public MenuItem getFunctionForUserRole(MenuItem applicationMenu, HttpServletRequest request, List<String> roleCDs) {
        Map<String, String> menuProperties = new LinkedHashMap<>();
        List<String> grantedFuncs = new ArrayList<>();
        List<String> functionsForUserRole = new ArrayList<>();

        for (String roleCd : roleCDs ){
            functionsForUserRole = userMenuRepository.findFunctionsForUserRole(roleCd);
        }
        logger.info("functionsforrole: " + functionsForUserRole.toString());

        for ( String url: functionsForUserRole) {
            MenuItem tempMenu = getMenuItemByUrl(applicationMenu, url);
            if (tempMenu != null) {
                String labelKey = tempMenu.getLabelKey();
                addParent(applicationMenu, labelKey, menuProperties);
                menuProperties.put(labelKey, url);
                grantedFuncs.add(url);
            }
        }

        request.getSession().setAttribute(FUNC_LIST, grantedFuncs);
        return menuService.buildMenuTree(menuProperties);
    }

    /**
     * Hardcode 3 level logic
     */
    private void addParent(MenuItem applicationMenu, String labelKey, Map<String, String> menuProperties) {

        int count = StringUtils.countOccurrencesOf(labelKey, MENU_DELIMITER);
        String[] menuKeyAry = labelKey.split(MENU_DELIMITER_REG);
        if ( count > 0 ){
            String lookupKey = menuKeyAry[0];
            if (!menuProperties.containsKey(lookupKey)) {
                MenuItem menu = getMenuItemByKey(applicationMenu, lookupKey);
                menuProperties.put(menu.getLabelKey(), menu.getUrl());
            }
        }
        if ( count > 1 ){
            String lookupKey = menuKeyAry[0] + MENU_DELIMITER + menuKeyAry[1];
            if (!menuProperties.containsKey(lookupKey)) {
                MenuItem menu = getMenuItemByKey(applicationMenu, lookupKey);
                menuProperties.put(menu.getLabelKey(), menu.getUrl());
            }
        }
    }

    private MenuItem getMenuItemByUrl(MenuItem menu, String url) {
        if (url.equals(menu.getUrl())){
            return menu;
        }else {
            if ( menu.getChild() != null && menu.getChild().size() > 0) {
                for (MenuItem m : menu.getChild()) {
                    MenuItem tempMenu = getMenuItemByUrl(m, url);
                    if (tempMenu != null)
                        return tempMenu;
                }
            }
            return null;
        }
    }

    private MenuItem getMenuItemByKey(MenuItem menu, String labelKey) {
        if (labelKey.equals(menu.getLabelKey())){
            return menu;
        }else {
            if ( menu.getChild() != null && menu.getChild().size() > 0) {
                for (MenuItem m : menu.getChild()) {
                    MenuItem tempMenu = getMenuItemByKey(m, labelKey);
                    if (tempMenu != null)
                        return tempMenu;
                }
            }
            return null;
        }
    }
}
