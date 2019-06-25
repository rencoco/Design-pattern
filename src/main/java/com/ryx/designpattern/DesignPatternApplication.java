package com.ryx.designpattern;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@Log4j2
@SpringBootApplication
public class DesignPatternApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(DesignPatternApplication.class, args);
        log.info("应用启动成功！");
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DesignPatternApplication.class);
    }
}
