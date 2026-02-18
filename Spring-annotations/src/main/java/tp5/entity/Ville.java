package tp5.entity;

import org.springframework.beans.factory.annotation.Value;

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
