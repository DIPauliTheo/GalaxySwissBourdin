package gsb.tests;


import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;

import gsb.modele.*;
import gsb.modele.dao.*;

public class VisiteurTest {
	public static void main(String[] args) {
		AffichageModele.afficher(VisiteurDao.rechercher("a17"));
		}
		
		

}

