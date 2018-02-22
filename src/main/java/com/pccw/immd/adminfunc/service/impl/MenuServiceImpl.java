package com.pccw.immd.adminfunc.service.impl;

import com.pccw.immd.adminfunc.service.MenuService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertiesFactoryBean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

@Service ("menuService.eservice2")
public class MenuServiceImpl implements MenuService {

    private static final String MENU_DELIMITER = ".";

    private static final String MENU_DELIMITER_REG = "\\.";

    @Value("${web.menu.config.path}")
    private String propertiesFilePath;

    @Value("${web.menu.config.landing.path}")
    private String landingUrl;

    public MenuItem buildMenuTree() throws IOException {
        PropertiesFactoryBean menuPropertiesFile = new PropertiesFactoryBean();
        menuPropertiesFile.setLocation(new ClassPathResource(propertiesFilePath));
        menuPropertiesFile.afterPropertiesSet();
        MenuItem root = new MenuItem(null, "ROOT", landingUrl);
        formMenuTree(root, menuPropertiesFile.getObject());
        return root;
    }

    private void formMenuTree(MenuItem root, Properties menuProperties ){
        Map<String, MenuItem> allMenu = new HashMap<>();
        allMenu.put(root.getLabel(), root);

        for (Object key : menuProperties.keySet()){
            String k = (String)key;
            int count =StringUtils.countOccurrencesOf(k, MENU_DELIMITER);
            String[] menuKeyAry = k.split(MENU_DELIMITER_REG);

            if (count != 0)
                continue;

            root.addChild(formFirstLevel(allMenu, root, menuKeyAry[0], menuProperties));
        }
    }

    private MenuItem getMenuItem(Map<String, MenuItem> allMenu, MenuItem parent, String key, Properties menuProperties){
        if (allMenu.containsKey(key))
            return allMenu.get(key);

        String label = key.replaceAll("_", " ");
        if (label.indexOf(MENU_DELIMITER) > -1){
            String[] labels = label.split(MENU_DELIMITER_REG);
            label = labels[labels.length - 1];
        }
        MenuItem menu = new MenuItem(parent, label, menuProperties.getProperty(key));
        allMenu.put(key, menu);
        return menu;
    }

    private MenuItem formFirstLevel(Map<String, MenuItem> allMenu, MenuItem root, String key, Properties menuProperties ){
        MenuItem menu = getMenuItem(allMenu, root, key, menuProperties);
        setChildern(allMenu, menu, key, menuProperties);
        return menu;
    }

    private void setChildern(Map<String, MenuItem> allMenu, MenuItem parentMenu, String parentKey, Properties menuProperties) {
        for (Object key : menuProperties.keySet()){
            String keyStr = (String)key;
            if ( !keyStr.equals(parentKey) && keyStr.startsWith(parentKey) && keyStr.lastIndexOf(MENU_DELIMITER) == parentKey.length()){
                MenuItem menu = formChildLevel(allMenu, parentKey, keyStr, menuProperties);
                parentMenu.addChild(menu);
                setChildern(allMenu, menu, keyStr, menuProperties);
            }
        }
    }

    private MenuItem formChildLevel(Map<String, MenuItem> allMenu, String parentKey, String key, Properties menuProperties ){
        MenuItem parent = allMenu.get(parentKey);
        MenuItem menu = getMenuItem(allMenu, parent, key, menuProperties);
        return menu;
    }
}
