package utilisateur;
import java.util.Date; 

public class Equip_vole extends Equipement {
	Date date_vol ;
	String preuvesproprietes ;
	String infosconnexion ;
	//public Equip_vole(Date date_vol ,String preuvesproprietes ,String infosconnexion ) {
		//this.date_vol  = date_vol ;
		//this.preuvesproprietes  = preuvesproprietes ;
		//this. infosconnexion=  infosconnexion;
	
	public Date getDate_vol() {
        return date_vol;
    }

    public void setDate_vol(Date date_vol) {
        this.date_vol= date_vol;
    }

    public String getPreuvesproprietes () {
      return preuvesproprietes ;
    }

    public void setPreuvesproprietes (String preuvesproprietes ) {
      this.preuvesproprietes = preuvesproprietes ;
    }




}
