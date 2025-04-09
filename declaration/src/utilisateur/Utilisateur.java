package utilisateur;

public class Utilisateur {
	String nom ;
	String prenom ;
	String numtel ;
	String address ;
	String email ;
	
	public Utilisateur (String nom , String prenom  ,String address,String email,String numtel) {
		this.nom =nom;
		this.prenom = prenom;
		this.address=address;
		this. email= email;
		this.numtel= numtel;
		

		
		// TODO Auto-generated constructor stub
	}
	public String getPrenom() {
        return prenom;
}

public void setPrenom(String prenom) {
        this.prenom = prenom;
}

	public String getNom() {
	    return nom;
    }

	public void setNom(String nom) {
	    this.nom = nom;
	}

	
    public String getEmail() {
	    return email;
    }

	public void setEmail(String email) {
	    this.email = email;
	}
	 public String getAddress() {
	        return address;
	}

	 public void setAddress(String address) {
	        this.address = address;
	 }


	 public String getNumtel() {
	        return numtel;
	    }
	    

	 public void setnumtel(String numtel) {
	        this.numtel = numtel; 
	  }

	
	

}

	


