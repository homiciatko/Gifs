package pl.homik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Pawel on 2016-10-15.
 */

@ComponentScan   //mowi springowi zeby skanowal katalogi i sprawdzal czy odpowiednie adnotacje wrzucilismy
@EnableAutoConfiguration   // konfigurowanie XML'i
public class AppConfig {

    public static void main(String[] args) {
        SpringApplication.run(AppConfig.class, args);
    }
}
