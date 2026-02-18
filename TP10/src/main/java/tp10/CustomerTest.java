package tp10;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import tp10.conf.JpaConfig;
import tp10.entity.Adresse;
import tp10.entity.Customer;
import tp10.service.CustomerService;

public class CustomerTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(JpaConfig.class);
		appContext.scan("tp10");
		appContext.refresh();
		CustomerService customerService = (CustomerService) appContext.getBean("customerService");
		Customer c = new Customer("titi");
		c.setAdresse(new Adresse("Avenue des Etats-Unis"));
		customerService.sauve(c);
		
		appContext.close();

	}

}
