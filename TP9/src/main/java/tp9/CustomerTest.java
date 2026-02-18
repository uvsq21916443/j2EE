package tp9;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import tp9.entity.Adresse;
import tp9.entity.Customer;
import tp9.entity.Metier;
import tp9.service.CustomerService;

public class CustomerTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext();
		appContext.scan("tp9");
		appContext.refresh();
		CustomerService customerService = (CustomerService) appContext.getBean("customerService");
		Customer c = new Customer("titi", "riri");
		c.setAdresse(new Adresse("Avenue des Etats-Unis", "Versailles"));
		c.setMetier(new Metier("etudiant"));
		customerService.sauve(c);
		
		appContext.close();

	}

}
