package tp8.entity;

public class Customer {
    private int id;
    private String name;
    private String email;
    private String adresse;

    public Customer(int id, String name, String email, String adresse) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.adresse = adresse;
    }

    public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	@Override
    public String toString() {
        return "Customer[id=" + id + ", name=" + name + ", email=" + email + ", adresse=" + adresse + "]";
    }
}