package pro.games;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "pro.games")
@EntityScan(basePackages = "pro.games.Model", basePackageClasses = Jsr310JpaConverters.class)
@EnableJpaRepositories(basePackages = "pro.games.Repository")
public class Apllication {
    public static void main(String[] args) {
        SpringApplication.run(Apllication.class,args);
    }
}
