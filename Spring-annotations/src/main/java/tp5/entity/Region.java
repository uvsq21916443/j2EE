package tp5.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class Region {

	@Value(value = "IDF")
	private String nomr;
	
	@Autowired
	private Ville megaPole;
	
	@Autowired
	private Ville capitaleRegion;
	
	@Autowired
	private Pays pays;

	public void affiche() {
		System.out.println(nomr + " " + pays.getNomp() + " " + capitaleRegion.getNomv() + " " + megaPole.getNomv());
	}
	
	public String getNomr() {
		return nomr;
	}

	public void setNomr(String nomr) {
		this.nomr = nomr;
	}

	public Ville getCapitaleRegion() {
		return capitaleRegion;
	}

	public void setCapitaleRegion(Ville capitaleRegion) {
		this.capitaleRegion = capitaleRegion;
	}

	public Pays getPays() {
		return pays;
	}

	public void setPays(Pays pays) {
		this.pays = pays;
	}

	public Ville getMegaPole() {
		return megaPole;
	}

	public void setMegaPole(Ville megaPole) {
		this.megaPole = megaPole;
	}

}
