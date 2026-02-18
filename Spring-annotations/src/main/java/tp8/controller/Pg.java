package tp8.controller;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import tp8.entity.Customer;
import tp8.service.CustomerService;

@Configuration
@ComponentScan(basePackages = "tp8")
public class Pg {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(Pg.class);

        CustomerService service = context.getBean(CustomerService.class);

        System.out.println("Nombre de clients : " + service.totalClient());
        
        service.creerClient(new Customer(3, "tata", "tata@gmail.com", "Paris"));
        
        System.out.println("Liste complète :");
        service.recupererTout().forEach(System.out::println);
        
        System.out.println("Nombre de clients : " + service.totalClient());

        context.close();
    }
}