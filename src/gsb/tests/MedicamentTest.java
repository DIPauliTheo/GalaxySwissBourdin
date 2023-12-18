package gsb.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import gsb.modele.Localite;

	class MedicamentTest {
		
		static Localite uneLocalite;
		
		@BeforeEach
		void setUp() throws Exception {
			
		}

		@AfterEach
		void tearDown() throws Exception {
			
		}

		@Test
		public final static void getCpReussi() {
			uneLocalite = new Localite("codePostal", "ville");
			assertEquals("codePostal", uneLocalite.getCodePostal());
		}
		
		@Test
		public final static void getCpEchoue() {
			uneLocalite = new Localite("codePostal", "ville");
			assertEquals("", uneLocalite.getCodePostal());
		}
		
		@Test
		public final static void getVilleReussi() {
			uneLocalite = new Localite("codePostal", "ville");
			assertEquals("ville", uneLocalite.getVille());
		}
		
		@Test
		public final static void getVilleEchoue() {
			uneLocalite = new Localite("codePostal", "ville");
			assertEquals("", uneLocalite.getVille());
		}

}

