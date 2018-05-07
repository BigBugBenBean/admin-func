package com.pccw.immd.adminfunc.service;

import com.pccw.immd.adminfunc.service.MenuService.MenuItem;

import java.io.IOException;
import java.util.List;

public interface NavigationService {
    public List<MenuItem> generateNavigationBar(String url, MenuItem root) throws IOException;
}
