package funciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UtildadesTest {

private static Utilidades utils;
	
	

	@Test
	void testDevuelveNota() {
		assertThrows(ArithmeticException.class,
				()->utils.devuelveNota(-2));
		assertThrows(ArithmeticException.class,
				()->utils.devuelveNota(12));
		//límite
		assertEquals("Suspenso",
				utils.devuelveNota(0));
		assertEquals("Suspenso",
				utils.devuelveNota(4));
		//límite
		assertEquals("Bien",
				utils.devuelveNota(5));
		assertEquals("Bien",
				utils.devuelveNota(6));
		// límite
		assertEquals("Notable",
				utils.devuelveNota(6.5));
		assertEquals("Notable",
				utils.devuelveNota(8.4));
		//límite
		assertEquals("Sobresaliente",
				utils.devuelveNota(8.5));
		assertEquals("Sobresaliente",
				utils.devuelveNota(9.9));
		assertEquals("Matrícula",
				utils.devuelveNota(10));
	}

	@Test
	void testCalculaSalario() {
		
	}

	@Test
	void testCuentaDivisores() {

	}

	@Test
	void testDevuelveMenor() {
		int v[] = { 2,3,8,1,7 };
		assertEquals(1, utils.devuelveMenor(v));
		
		int v2[] = { 2,3,-8,1,7 };
		assertEquals(-8, utils.devuelveMenor(v2));
	}

	@Test
	void testBurbuja() {

	}

}
