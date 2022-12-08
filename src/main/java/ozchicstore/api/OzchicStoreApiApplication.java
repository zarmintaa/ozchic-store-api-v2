package ozchicstore.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OzchicStoreApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(OzchicStoreApiApplication.class, args);
        System.out.println("==================");
        System.out.println("SERVER IS RUNNING");
        System.out.println("==================");
    }

}
