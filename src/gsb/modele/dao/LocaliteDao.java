package gsb.modele.dao;

import java.sql.ResultSet;
import java.util.ArrayList;

import gsb.modele.*;

public class LocaliteDao {


	public static Localite rechercher(String unCodeLocalite){
		Localite uneLocalite =null;
		ResultSet req = ConnexionMySql.execReqSelection("select * from localite where CODEPOSTAL="+unCodeLocalite);
		try {
			if (req.next()) {
				uneLocalite = new Localite(req.getString(1),req.getString(2));
			};
			}
		catch(Exception e) {
			System.out.println("erreur reqSelection.next() pour la requ�te - select * from localite where CODEPOSTAL="+unCodeLocalite+"'");
			e.printStackTrace();
			}
		ConnexionMySql.fermerConnexionBd();
		return uneLocalite;
	}
	
	public static int creer(Localite uneLocalite){
		int result = 0;
		String requeteInsertion;
		String codePostale = uneLocalite.getCodePostal();
		String ville = uneLocalite.getVille();
		requeteInsertion = "insert into localite values('"+codePostale+"','"+ville+"')";
		try{
			result = ConnexionMySql.execReqMaj(requeteInsertion);
		}
		catch(Exception e){
			System.out.println("echec insertion Localite");
		}
		ConnexionMySql.fermerConnexionBd();
		return result;
	}
	
	
}
