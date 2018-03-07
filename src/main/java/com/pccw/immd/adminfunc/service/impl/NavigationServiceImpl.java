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


    private List<MenuService.MenuItem> navigationList = new ArrayList<>();

    public List<MenuService.MenuItem> generateNavigationBar(String url, MenuService.MenuItem root) throws IOException {
        List<MenuService.MenuItem> list = new ArrayList<>();

        String[] urlArray = url.split("/");

        if (urlArray.length >= root.getChild().size()) {
            String targetURL = urlArray[urlArray.length-1];
            String targetSecendURL = urlArray[urlArray.length-2];
            String targetFirstURL = urlArray[urlArray.length-3];

            for (MenuService.MenuItem firstItem : root.getChild() ) {
                String firstLabel = firstItem.getLabel();
                for (MenuService.MenuItem secondItem : firstItem.getChild() ) {
                    String secondLabel = secondItem.getLabel();
                    for (MenuService.MenuItem thirdItem : secondItem.getChild() ) {
                        String thirdLabel = thirdItem.getLabel();

                        String[] tmpURLArr = thirdItem.getUrl().split("/");

                        String tmpTargetURL = targetURL.toLowerCase();
                        String tmpThirdURL = tmpURLArr[tmpURLArr.length-1].toLowerCase();
                        String tmpFuncName = tmpTargetURL.split("_")[0];

                        String tmpSecendURL = tmpURLArr[tmpURLArr.length-2].toLowerCase();
                        String tmpFirstURL = tmpURLArr[tmpURLArr.length-3].toLowerCase();

                        if (tmpThirdURL.startsWith(tmpFuncName)
                                && targetSecendURL.toLowerCase().equals(tmpSecendURL)
                                && targetFirstURL.toLowerCase().equals(tmpFirstURL)) {
                            list.add(firstItem);
                            list.add(secondItem);
                            list.add(thirdItem);
                            break;
                        }

                    }
                }
            }
        }



        LOG.debug("generateNavigationBar.navigationList: " + this.navigationList.size());

        this.setNavigationList(list);

        return list;
    }

    private String getRequestLinkFromURL(String url) {




        String action = "";

        return action;
    }

    public List<MenuService.MenuItem> getNavigationList() {
        return navigationList;
    }

    public void setNavigationList(List<MenuService.MenuItem> navigationList) {
        this.navigationList = navigationList;
    }

}
