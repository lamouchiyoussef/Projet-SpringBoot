package tn.esprit.sprinproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;
@EnableAspectJAutoProxy
@EnableScheduling
@SpringBootApplication
public class SprinProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(SprinProjectApplication.class, args);
    }

}
