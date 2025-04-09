package equipements.insertion.telephone;

import java.sql.Connection;import java.sql.PreparedStatement;
import java.sql.SQLException;

import equipements.insertion.interfaces.Enregistrement;
import equipements.telephone.Telephone;

public class Insertiontelephone implements Enregistrement  {
	Telephone telephone ;
	
	@Override
	public void enregistrer(Connection conn) {
		String query = "INSERT INTO Ordinateur( nom , type , marque , modele ,numero_serie, imei) VALUES (?,?,?,?,?,?)" ;
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
	
	 }
}
	

