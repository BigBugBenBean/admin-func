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

    private List<String> navigationList = new ArrayList<String>();

    public List<String> generateNavigationBar(String url, MenuService.MenuItem root) throws IOException {
        List<String> list = new ArrayList<>();

        String[] urlArray = url.split("/");
        String targetURL = urlArray[urlArray.length-1];

        for (MenuService.MenuItem firstItem : root.getChild() ) {
            String firstLabel = firstItem.getLabel();
            for (MenuService.MenuItem secondItem : firstItem.getChild() ) {
                String secondLabel = secondItem.getLabel();
                for (MenuService.MenuItem thirdItem : secondItem.getChild() ) {
                    String thirdLabel = thirdItem.getLabel();

                    String[] tmpURLArr = thirdItem.getUrl().split("/");

                    String tmpTargetURL = targetURL.toLowerCase();
                    String tmpThirdURL = tmpURLArr[tmpURLArr.length-1].toLowerCase();

                    if (tmpTargetURL.contains(tmpThirdURL)) {
                        list.add(firstLabel);
                        list.add(secondLabel);
                        list.add(thirdLabel);
                        break;
                    }

                }
            }
        }

        this.setNavigationList(list);

        return list;
    }

    private String getRequestLinkFromURL(String url) {




        String action = "";

        return action;
    }

    public List<String> getNavigationList() {
        return navigationList;
    }

    public void setNavigationList(List<String> navigationList) {
        this.navigationList = navigationList;
    }

}
