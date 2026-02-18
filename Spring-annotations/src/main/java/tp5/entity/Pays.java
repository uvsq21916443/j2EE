package tp5.entity;

import org.springframework.beans.factory.annotation.Value;

public class Pays {
	
	@Value(value = "France")
	private String nomp;
	
	public Pays() {
		System.out.println("Un pays est créé");
	}

	public String getNomp() {
		return nomp;
	}

	public void setNomp(String nomp) {
		this.nomp = nomp;
	}

}
