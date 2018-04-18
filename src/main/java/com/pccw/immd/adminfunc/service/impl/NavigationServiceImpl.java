package com.pccw.immd.adminfunc.service.impl;

import static com.pccw.immd.adminfunc.service.MenuService.MenuItem;

import com.pccw.immd.adminfunc.service.MenuService;
import com.pccw.immd.adminfunc.service.NavigationService;
import com.pccw.immd.adminfunc.web.interceptor.BreadcrumbInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service("navigationService.eservice2")
public class NavigationServiceImpl implements NavigationService {

    private static final Logger LOG = LoggerFactory.getLogger(BreadcrumbInterceptor.class);

    public List<MenuItem> generateNavigationBar(String url, MenuService.MenuItem root) throws IOException {
        List<MenuService.MenuItem> list = null;

        LOG.debug("generateNavigationBar url: " + url);
        MenuService.MenuItem foundItem = findMenuItemByURL(root, url);
        LOG.debug("foundItem: " + foundItem);

        list = convertToList(foundItem);
        Collections.reverse(list);

        return list;
    }

    private MenuService.MenuItem findMenuItemByURL(MenuService.MenuItem traversingItem, String targetURL) {
        String url = traversingItem.getUrl();

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

    private List<MenuItem> convertToList(MenuItem item) {
        List<MenuItem> list = new ArrayList<>();

        if (item != null) {
            MenuService.MenuItem tmpMenuItem = item;
            while (tmpMenuItem.parent != null) {
                list.add(tmpMenuItem);
                tmpMenuItem = tmpMenuItem.parent;
            }
        }

        return list;
    }

}
