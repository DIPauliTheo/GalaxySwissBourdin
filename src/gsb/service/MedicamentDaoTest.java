package gsb.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import gsb.modele.Medicament;
import gsb.modele.dao.MedicamentDao;
import gsb.modele.dao.VisiteurDao;

class MedicamentDaoTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public final static void testRechercherReussi() {
		assertNotNull(MedicamentDao.rechercher("?"));
	}
	
	@Test
	public final static void testRechercherEchoue() {
		assertNull(VisiteurDao.rechercher("MED_DEPOTLEGAL"));
	}
	
	@Test
	public final static void testCreerReussi() {
		Medicament unMed = new Medicament("depotLegal", "nomComercial", "composition", "effets", "contreIndication", 0, "codeFamille", "libelleFamille");
		assertEquals(1, MedicamentDao.creer(unMed));
	}
	
	@Test
	public final static void testCreerEchoue() {
		assertEquals(0, VisiteurDao.creer(VisiteurDao.rechercher("?")));
	}

}
