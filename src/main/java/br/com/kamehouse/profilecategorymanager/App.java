package br.com.kamehouse.profilecategorymanager;

import br.com.kamehouse.profilecategorymanager.config.HintsConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportRuntimeHints;

@SpringBootApplication
@ImportRuntimeHints(HintsConfig.class)
@Slf4j
public class App {

    public static void main(String[] args) {
        var context = SpringApplication.run(App.class, args);
        var appName = context.getEnvironment().getProperty("spring.application.name");
        var appKey = context.getEnvironment().getProperty("app.key");
        log.info("The application {} is running! app key: {}", appName, appKey);
    }

}
