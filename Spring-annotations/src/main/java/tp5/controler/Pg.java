package tp5.controler;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import tp5.entity.Region;
import tp5.entity.Ville;
import tp5.service.RegionConfig;

public class Pg {

	public static void main(String[] args) {
		ApplicationContext monContext = new AnnotationConfigApplicationContext(RegionConfig.class);
		Region r = monContext.getBean(Region.class);
		r.affiche();
		r.setNomr("Yvelines");
		Ville v = new Ville();
		v.setNomv("Versailles");
		r.setCapitaleRegion(v);
		//r.getCapitaleRegion().setNomv("Versailles");
		r.affiche();
	}

}
