package se.knowit.hackit.politiker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class HackitPolitikerApplication {

  public static void main(String[] args) {
    SpringApplication.run(HackitPolitikerApplication.class, args);
  }

}
