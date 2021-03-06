package ac.za.cput;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@EnableJpaRepositories(basePackages = "ac.za.cput.repository")
@SpringBootApplication
public class GameReserveApp {

    public static void main(String[] args){
        SpringApplication.run(GameReserveApp.class, args);
    }

    /*@Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }*/
} 
