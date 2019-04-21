package games.pro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "games.pro")
public class Apllication {
    public static void main(String[] args) {
        SpringApplication.run(Apllication.class,args);
    }
}
