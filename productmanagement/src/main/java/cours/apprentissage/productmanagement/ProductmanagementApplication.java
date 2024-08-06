package cours.apprentissage.productmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductmanagementApplication {

    public static void main(String[] args) {
        System.out.println("Hello i'm product management application");
        SpringApplication.run(ProductmanagementApplication.class, args);
    }

}
