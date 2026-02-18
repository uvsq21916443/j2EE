package tp10.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Adresse {
	private String rue;

	public Adresse() {}
	public Adresse(String rue) {
		this.rue = rue;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
}
