package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //to tell SC , following class replaces xml config file
@ComponentScan(basePackages = {"dependent","dependency"})
public class AppConfig {

}
