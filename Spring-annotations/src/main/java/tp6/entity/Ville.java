package tp6.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Ville {
	
	@Value(value = "Paris")
	private String nomv;

	public String getNomv() {
		return nomv;
	}

	public void setNomv(String nomv) {
		this.nomv = nomv;
	}

}
