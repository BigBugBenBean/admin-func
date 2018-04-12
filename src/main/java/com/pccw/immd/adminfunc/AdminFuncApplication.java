package com.pccw.immd.adminfunc;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.context.MessageSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(exclude = MessageSourceAutoConfiguration.class)
@EnableAutoConfiguration(exclude={
        DataSourceAutoConfiguration.class
})
@ImportResource ("classpath:/config/application-context.xml")
public class AdminFuncApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(AdminFuncApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(AdminFuncApplication.class, args);
    }
}
