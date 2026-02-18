package tp6.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("config.properties")
public class Pays {
	
	@Value(value = "France")
	private String nomp;
	
	@Value("${lieu}")
	private String continent;
	
	public Pays() {
		System.out.println("Un pays est créé");
	}

	public String getNomp() {
		return nomp;
	}

	public void setNomp(String nomp) {
		this.nomp = nomp;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

}
