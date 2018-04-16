package com.pccw.immd.adminfunc.service.impl;

import com.pccw.immd.adminfunc.service.MenuService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@Service ("menuService.eservices2")
public class MenuServiceImpl implements MenuService {

    private static final Logger LOG = LoggerFactory.getLogger(MenuServiceImpl.class);

    public static final String MENU_DELIMITER = ".";

    public static final String MENU_DELIMITER_REG = "\\.";

    @Value("${web.menu.config.path}")
    private String propertiesFilePath;

    @Value("${web.menu.config.landing.path}")
    private String landingUrl;

    public MenuItem buildMenuTree() throws IOException {
        Map<String, String> mapping = getFromFile(propertiesFilePath);
        MenuItem root = new MenuItem(null,"ROOT","ROOT", landingUrl);
        formMenuTree(root, mapping);

        LOG.info("Menu Generation Completed.");
        return root;
    }

    private Map<String,String> getFromFile(String propertiesFilePath) {
        Map<String, String> mapping = new LinkedHashMap<>();
        try (
                FileReader fr = new FileReader(new ClassPathResource(propertiesFilePath).getFile());
                BufferedReader br = new BufferedReader(fr);
            ) {
            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null ) {
                if (sCurrentLine.trim().length() == 0
                        || sCurrentLine.startsWith("#")
                        || sCurrentLine.indexOf("=") == -1)
                    continue;
                String[] keyValue = sCurrentLine.split("=");
                if ( keyValue.length > 0 )
                    mapping.put(keyValue[0], keyValue.length > 1 ? keyValue[1] : "");
            }

        } catch (IOException e) {
            LOG.info("Generate Menu Error.");
        }
        return mapping;
    }

    public MenuItem buildMenuTree(Map<String, String> propertiesMap) {
        MenuItem root = new MenuItem(null,"ROOT","ROOT", landingUrl);
        formMenuTree(root, propertiesMap);

        LOG.info("Menu Generation Completed.");
        return root;
    }

    private void formMenuTree(MenuItem root, Map<String, String> menuProperties ){
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

    private MenuItem getMenuItem(Map<String, MenuItem> allMenu, MenuItem parent, String key, Map<String, String> menuProperties){
        if (allMenu.containsKey(key))
            return allMenu.get(key);

        String label = key.replaceAll("_", " ");
        if (label.indexOf(MENU_DELIMITER) > -1){
            String[] labels = label.split(MENU_DELIMITER_REG);
            label = labels[labels.length - 1];
        }
        MenuItem menu = new MenuItem(parent, key, label, menuProperties.get(key));
        allMenu.put(key, menu);
        return menu;
    }

    private MenuItem formFirstLevel(Map<String, MenuItem> allMenu, MenuItem root, String key, Map<String, String> menuProperties ){
        MenuItem menu = getMenuItem(allMenu, root, key, menuProperties);
        setChildren(allMenu, menu, key, menuProperties);
        return menu;
    }

    private void setChildren(Map<String, MenuItem> allMenu, MenuItem parentMenu, String parentKey, Map<String, String> menuProperties) {
        for (Object key : menuProperties.keySet()){
            String keyStr = (String)key;
            if ( !keyStr.equals(parentKey) && keyStr.startsWith(parentKey) && keyStr.lastIndexOf(MENU_DELIMITER) == parentKey.length()){
                MenuItem menu = formChildLevel(allMenu, parentKey, keyStr, menuProperties);
                parentMenu.addChild(menu);
                setChildren(allMenu, menu, keyStr, menuProperties);
            }
        }
    }

    private MenuItem formChildLevel(Map<String, MenuItem> allMenu, String parentKey, String key, Map<String, String> menuProperties ){
        MenuItem parent = allMenu.get(parentKey);
        MenuItem menu = getMenuItem(allMenu, parent, key, menuProperties);
        return menu;
    }
}
