package services;

import java.util.Date;

import utilisateur.Equip_vole;
import utilisateur.Utilisateur;

public class Declarervoler {
	Utilisateur declareur ;
	

	public void declarervoler() {
		Equip_vole equipement  =new Equip_vole();
		System.out.println("veuillez entrer les informations de votre equipement");
		String nom = equipement.getNom();
		String type = equipement.getType();
		String numero_serie = equipement.getNumero_serie() ;
		Date date_vol  = equipement.getDate_vol();
		String preuvesproprietes = equipement.getPreuvesproprietes();;
		
	}

}
