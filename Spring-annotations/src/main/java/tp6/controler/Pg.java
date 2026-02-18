package tp6.controler;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import tp6.entity.Region;
import tp6.entity.Ville;


public class Pg {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext monContext = new AnnotationConfigApplicationContext();
		monContext.scan("tp6");
		monContext.refresh();
		Region r = monContext.getBean(Region.class);
		r.affiche();
		r.setNomr("Yvelines");
		//r.getCapitaleRegion().setNomv("Versailles");
		Ville v = new Ville();
		v.setNomv("Versailles");
		r.setCapitaleRegion(v);
		r.affiche();
		System.out.println(r.getPays().getContinent());
		monContext.close();
	}

}
