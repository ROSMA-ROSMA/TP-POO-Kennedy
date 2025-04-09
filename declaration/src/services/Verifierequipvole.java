package services;
import java.util.ArrayList;

import utilisateur.Equip_vole;
import utilisateur.Equipement;

public class Verifierequipvole {
	ArrayList<Equipement> equipements;
    ArrayList<Equip_vole> equipementsVolés;
    public Verifierequipvole () {
        this.equipements = new ArrayList<>();
        this.equipementsVolés = new ArrayList<>();
    }
    public boolean verifierequipvoles(Equipement equipement) {
        for (Equip_vole equipementVole : equipementsVolés) {
            if (equipementVole.getNumero_serie().equals(equipement.getNumero_serie())) {
                return true;
            }
        }
        return false;
    }



     


}
