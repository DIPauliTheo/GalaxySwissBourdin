package gsb.modele.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import gsb.modele.*;

public class MedicamentDao {

	public static Medicament rechercher(String unDepotLegal){
		Medicament unMedicament =null;
		ResultSet req = ConnexionMySql.execReqSelection("select * from medicament where DEPOTLEGAL='"+unDepotLegal+"';");
		try {
			if (req.next()) {
				unMedicament = new Medicament(req.getString(1),req.getString(2),req.getString(3),req.getString(4),req.getString(5),req.getDouble(6),req.getString(7),req.getString(8));
			};
			}
		catch(Exception e) {
			System.out.println("erreur reqSelection.next() pour la requ�te - select * from Medicament where DEPOTLEGAL='"+unDepotLegal+"'");
			e.printStackTrace();
			}
		ConnexionMySql.fermerConnexionBd();
		return unMedicament;
	}
	
	public static int creer(Medicament unMedicament){
		int result = 0;
		String requeteInsertion;
		String depotLegal = unMedicament.getDepotLegal();
		String nomCommercial = unMedicament.getNomCommercial();
		String composition = unMedicament.getComposition();
		String effets = unMedicament.getEffets();
		String contreIndication = unMedicament.getContreIndication();
		double prixEchantillon = unMedicament.getPrixEchantillon();
		String codeFamille = unMedicament.getCodeFamille();
		String libelleFamille = unMedicament.getLibellefamille();
		
		requeteInsertion = "insert into medicament values('"+depotLegal+"','"+nomCommercial+"','"+composition+"','"+effets+"','"+contreIndication+"','"+prixEchantillon+"','"+codeFamille+"','"+libelleFamille+"');";
		try{
			result = ConnexionMySql.execReqMaj(requeteInsertion);
		}
		catch(Exception e){
			System.out.println("echec insertion medicament");
		}
		ConnexionMySql.fermerConnexionBd();
		return result;
	}
	
	public static ArrayList<Medicament> rechercherTout(){
		ArrayList<Medicament> collectionDesMedicament = new ArrayList<Medicament>();
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select DEPOTLEGAL from medicament");
		
		try{
		while (reqSelection.next()) {
			String depotLegal = reqSelection.getString(1);
			
			collectionDesMedicament.add(MedicamentDao.rechercher(depotLegal));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur rechercherTout()");
		}
		return collectionDesMedicament;
	}
	
	public static ArrayList<Medicament> rechercherCodeFamille(String unCodeFamille){
		ArrayList<Medicament> collectionDesMedicament = new ArrayList<Medicament>();
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select DEPOTLEGAL from medicament WHERE CODEFAMILLE ='"+unCodeFamille+"'");
		
		try{
		while (reqSelection.next()) {
			String depotLegal = reqSelection.getString(1);
			
			collectionDesMedicament.add(MedicamentDao.rechercher(depotLegal));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur rechercherCodeFamille()");
		}
		return collectionDesMedicament;
	}
}
