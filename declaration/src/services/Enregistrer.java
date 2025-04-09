package services;
import java.util.ArrayList;

import utilisateur.Equipement;


public class Enregistrer {
	ArrayList<Equipement> equipements ;
	public Enregistrer() {
		this.equipements = new ArrayList<>();
	}
    public void enregitrer(Equipement equipement) {
	        this.equipements.add(equipement);
	    }

	
	
}
