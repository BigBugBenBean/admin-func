package com.pccw.immd.adminfunc.service.impl;

import com.pccw.immd.adminfunc.service.MenuService;
import com.pccw.immd.adminfunc.service.NavigationService;
import com.pccw.immd.adminfunc.web.interceptor.BreadcrumbInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service("navigationService.eservice2")
public class NavigationServiceImpl implements NavigationService {

    private static final Logger LOG = LoggerFactory.getLogger(BreadcrumbInterceptor.class);

    public List<MenuService.MenuItem> generateNavigationBar(String url, MenuService.MenuItem root) throws IOException {
        List<MenuService.MenuItem> list = new ArrayList<>();

        LOG.debug("generateNavigationBar url: " + url);

        String targetURL = getURL(url);

        if (!targetURL.equals("")) {
            MenuService.MenuItem foundItem = findMenuItemByURL(root, targetURL);
            list = getMenuTreeFromItem(foundItem);
        }

        LOG.debug("generateNavigationBar.navigationList: " + list);

        return list;
    }

    private String getURL(String srcUrl) {
        String destUrl = "";
        if (srcUrl.contains("_")) {
            String[] urls = srcUrl.split("_");
            destUrl = urls[0];
        } else {
            String[] urls = srcUrl.split(".do");
            if (urls.length > 0) {
                destUrl = urls[0];
            }
        }
        return destUrl;
    }

    private MenuService.MenuItem findMenuItemByURL(MenuService.MenuItem root, String targetURL) {
        MenuService.MenuItem traversingItem = root;

        String url = getURL(traversingItem.getUrl());

        if (url.equals(targetURL)) {
            LOG.debug("findMenuItemByURL Found url: " + url);
            return traversingItem;
        } else {
            for (MenuService.MenuItem tmpItem : traversingItem.getChild() ) {
                 MenuService.MenuItem result = findMenuItemByURL(tmpItem, targetURL);
                LOG.debug("result: " + result + " , url: " + url);
                 if (result != null) {
                     return result;
                 }
            }
        }

        return null;
    }

    private List<MenuService.MenuItem> getMenuTreeFromItem(MenuService.MenuItem item) {
        List<MenuService.MenuItem> list = new ArrayList<>();

        if (item != null) {
            MenuService.MenuItem tmpMenuItem = item;
            while (tmpMenuItem.parent != null) {
                list.add(0, tmpMenuItem);
                tmpMenuItem = tmpMenuItem.parent;
            }
        }

        return list;
    }

}
