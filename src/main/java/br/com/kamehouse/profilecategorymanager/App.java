package br.com.kamehouse.profilecategorymanager;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Map;

@SpringBootApplication
@Slf4j
public class App {

    public static void main(String[] args) {
        var context = SpringApplication.run(App.class, args);
        var appName = context.getEnvironment().getProperty("spring.application.name");
        var appKey = context.getEnvironment().getProperty("app.key");
        log.info("The application {} is running! app key: {}", appName, appKey);
    }

}
