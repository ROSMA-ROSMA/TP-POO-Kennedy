package equipements.miseajour.telephone;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import equipement.ordinateur.Ordinateur;
import equipements.miseajour.interfaces.Update;

public class Miseajourordinateur implements Update {
	Ordinateur ordinateur ;

	@Override
	public void mettrejour(Connection conn, String address_mac ) {
		String query = "UPDATE Telephone SET nom = ?, type = ?, marque = ?, modele =?,numero_serie = ?, addresse_mac = ? WHERE address_mac ="+ address_mac ;  ;
		try (PreparedStatement pts = conn.prepareStatement(query)){
			pts.setString(1, ordinateur.getNom());
			pts.setString(2, ordinateur.getType());
			pts.setString(3, ordinateur.getAddress_mac());
			pts.setString(4, ordinateur.getMarque());
			pts.setString(5,ordinateur.getModele());
			pts.setString(6, ordinateur.getNumero_serie());
			pts.executeUpdate( );
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
	}
	

}
