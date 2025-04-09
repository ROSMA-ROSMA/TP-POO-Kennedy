package vol;

import java.util.Date;

public class Declareur {
	String nom ;
	String address ;
	String profession ;
	String numtel ;
	String email ;
	

	public Declareur(String profession ,String nom  ,String address,String email,String numtel) {
		this.profession = profession;
		this.nom =nom;
		this.address=address;
		this. email= email;
		this.numtel= numtel;
		
		
		// TODO Auto-generated constructor stub
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
	    

	 public void setTelNumber(String numtel) {
	        this.numtel = numtel; 
	  }

	

}
