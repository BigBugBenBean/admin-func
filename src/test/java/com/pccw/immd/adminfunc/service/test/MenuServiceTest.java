package com.pccw.immd.adminfunc.service.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.pccw.immd.adminfunc.service.MenuService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import java.io.IOException;

import static com.pccw.immd.adminfunc.service.MenuService.MenuItem;

@ContextConfiguration(locations = { "classpath:service/menuServiceTest.xml" })
public class MenuServiceTest extends AbstractTestNGSpringContextTests {

    private static final Logger LOG = LoggerFactory.getLogger(MenuServiceTest.class);
    private ObjectMapper mapper = new ObjectMapper();

    @Autowired
    @Qualifier ("menuService")
    MenuService menuService;

    @Test
    public void generateMenuTree() throws IOException {
        MenuItem root = menuService.buildMenuTree();

        LOG.info("Tree result: " + mapper.writeValueAsString(root));
    }

}
