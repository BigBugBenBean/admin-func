package com.pccw.immd.adminfunc.service;

import java.io.IOException;
import java.util.List;

public interface NavigationService {
    public List<String> generateNavigationBar(String url, MenuService.MenuItem root) throws IOException;
}
