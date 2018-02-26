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
//        list.clear();

        LOG.info("-----------------------generateNavigationBar-----------------------");

        LOG.info("root: " + root);
        LOG.info("url: " + url);

        String[] urlArray = url.split("/");
        String targetURL = urlArray[urlArray.length-1];
        LOG.info("targetURL: " + targetURL);

//        String action = getFuncAction(url);



        LOG.info("-----------------------firstItem(" + root.getChild().size() + ")-----------------------");
        for (MenuService.MenuItem firstItem : root.getChild() ) {
            String firstLabel = firstItem.getLabel();
            LOG.info("firstItem: " + firstLabel);
            LOG.info("-------------secondItem(" + firstItem.getChild().size() + ")-------------");
            for (MenuService.MenuItem secondItem : firstItem.getChild() ) {
                String secondLabel = secondItem.getLabel();
                LOG.info("secondItem: " + secondLabel);
                LOG.info("---thirdItem(" + secondItem.getChild().size() + ")---");
                for (MenuService.MenuItem thirdItem : secondItem.getChild() ) {
                    String thirdLabel = thirdItem.getLabel();
                    LOG.info("thirdItem: " + thirdLabel);

                    String[] tmpURLArr = thirdItem.getUrl().split("/");

                    String tmpTargetURL = targetURL.toLowerCase();
                    String tmpThirdURL = tmpURLArr[tmpURLArr.length-1].toLowerCase();
                    LOG.info("tmpTargetURL: " + tmpTargetURL + " , tmpThirdURL: " + tmpThirdURL);

                    if (tmpTargetURL.contains(tmpThirdURL)) {
                        LOG.info("**********  HIT  ***********");
                        list.add(firstLabel);
                        list.add(secondLabel);
                        list.add(thirdLabel);
                        break;
                    }

                }
            }
        }


//        list.add("e-Services-2");
//        list.add("Enquiry");
//        list.add("System Holiday View");

        this.setNavigationList(list);

        LOG.info("-----------------------End of generateNavigationBar-----------------------");

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
