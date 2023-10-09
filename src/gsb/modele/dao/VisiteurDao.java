package gsb.modele.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.*;

import gsb.modele.*;

public class VisiteurDao {

	public static Visiteur rechercher(String unMatricule){
		Visiteur unVisiteur =null;
		ResultSet req = ConnexionMySql.execReqSelection("select * from visiteur where MATRICULE="+unMatricule);
		try {
			if (req.next()) {
				Localite uneLocalite= LocaliteDao.rechercher(req.getString(7));
				unVisiteur = new Visiteur(req.getString(1),req.getString(2),req.getString(3),req.getString(4),req.getString(5),req.getString(6),uneLocalite,"",req.getDate(8),0,req.getString(9),req.getString(10));
			};
			}
		catch(Exception e) {
			System.out.println("erreur reqSelection.next() pour la requ�te - select * from visiteur where MATRICULE="+unMatricule+"'");
			e.printStackTrace();
			}
		ConnexionMySql.fermerConnexionBd();
		return unVisiteur;
	}
	
	public static int creer(Visiteur unVisiteur){
		int result = 0;
		String requeteInsertion;
		String matricule = unVisiteur.getMatricule();
		String nom = unVisiteur.getNom();
		String prenom = unVisiteur.getPrenom();
		String login = unVisiteur.getLogin();
		String mdp = unVisiteur.getMdp();
		String adresse = unVisiteur.getAdresse();
		String codePostale = unVisiteur.getUneLocalite().getCodePostal();
		Date date = unVisiteur.getDateEntree();
		String codeUnite = unVisiteur.getCodeUnite();
		String nomUnite = unVisiteur.getNomUnite();
		requeteInsertion = "insert into visiteur values('"+matricule+"','"+nom+"','"+prenom+"','"+login+"','"+mdp+"','"+adresse+"','"+codePostale+"','"+date+"','"+codeUnite+"','"+nomUnite+"')";
		try{
			result = ConnexionMySql.execReqMaj(requeteInsertion);
		}
		catch(Exception e){
			System.out.println("echec insertion Localite");
		}
		ConnexionMySql.fermerConnexionBd();
		return result;
	}
	
	public static ArrayList<Visiteur> rechercherTout(){
		ArrayList<Visiteur> collectionDesVisiteur = new ArrayList<Visiteur>();
		ResultSet reqSelection = ConnexionMySql.execReqSelection("select MATRICULE from visiteur");
		try{
		while (reqSelection.next()) {
			String matricule = reqSelection.getString(1);
			collectionDesVisiteur.add(VisiteurDao.rechercher(matricule));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
			System.out.println("erreur rechercherTout()");
		}
		return collectionDesVisiteur;
	}
}
