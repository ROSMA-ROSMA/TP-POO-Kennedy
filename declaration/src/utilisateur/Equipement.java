package utilisateur;

public abstract class Equipement {
	String nom ;
	String type ;
	String  marque ;
	String modele ;
	String numero_serie ;
	String etat;
	
	

	public Equipement() {
	}
	public String getNom() {
	        return nom;
	    }

    public String getType() {
	        return type;
	    }

    public String getNumero_serie() {
    	return numero_serie;
	    }

    public String getMarque() {
	        return marque;
	    }

    public String getModele() {
	        return modele;
	    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setNumeroSerie(String numero_serie) {
        this.numero_serie = numero_serie;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }



}
