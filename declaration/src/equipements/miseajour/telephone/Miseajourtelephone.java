package equipements.miseajour.telephone;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import equipements.miseajour.interfaces.Update;
import equipements.telephone.Telephone;


public class Miseajourtelephone implements Update {
	Telephone telephone ;

	@Override
	public void mettrejour( Connection conn , String Imei) {
		String query = "UPDATE Telephone SET nom = ?, type = ?, marque = ?, modele =?,numero_serie = ?, imei = ? WHERE Imei ="+ Imei ;  ;
		try (PreparedStatement pts = conn.prepareStatement(query)){
			pts.setString(1, telephone.getNom());
			pts.setString(2, telephone.getType());
			pts.setString(3, telephone.getImei());
			pts.setString(4, telephone.getMarque());
			pts.setString(5, telephone.getModele());
			pts.setString(6, telephone.getNumero_serie());
			pts.executeUpdate( );
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		
	}
	

}
