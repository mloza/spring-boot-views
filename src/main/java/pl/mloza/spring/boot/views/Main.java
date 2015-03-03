package pl.mloza.spring.boot.views;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import pl.mloza.spring.boot.views.configuration.WebAppConfiguration;
import pl.mloza.spring.boot.views.controllers.MainController;

@EnableAutoConfiguration
@ComponentScan(basePackageClasses = {MainController.class, WebAppConfiguration.class})
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class);
    }
}
