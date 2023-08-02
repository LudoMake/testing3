package funciones;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class UtildadesTest {

private static Utilidades utils;
	
	@BeforeAll
	static void inicializar() {
		utils = new Utilidades();//hay que instanciar el objeto cuando la clase no es estatica
	}
	

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
		assertThrows(ArithmeticException.class,
				()->utils.calculaSalario(0,0,0));
		assertThrows(ArithmeticException.class,
				()->utils.calculaSalario(-1,-1,-1));
		assertThrows(ArithmeticException.class,
				()->utils.calculaSalario(0,-1,12));
		assertEquals(306, utils.calculaSalario(39, 8, 2));
		assertEquals(20*12, utils.calculaSalario(20, 12, 15));
		assertEquals(38*12+2*15, utils.calculaSalario(40, 12, 15));
	}

	@Test
	void testCuentaDivisores() {
		assertEquals(2, utils.cuentaDivisores(7)); //usando el numero primo
		assertEquals(1, utils.cuentaDivisores(1));
		assertEquals(4, utils.cuentaDivisores(8));
		assertEquals(0, utils.cuentaDivisores(0));
		assertEquals(0, utils.cuentaDivisores(-8));
	}

	@Test
	void testDevuelveMenor() {
		int v[] = { 2,3,8,1,7 };
		assertEquals(1, utils.devuelveMenor(v));
		
		int v2[] = { 2,3,-8,1,7 };
		assertEquals(-8, utils.devuelveMenor(v2));
		
		//int v[] = {Integer.MAX_VALUE,Integer.MAX_VALUE};
	}

	@Test
	void testBurbuja() {
		int v[] = {2,7,4,9,1};
		int o[] = {1,2,4,7,9}; //vector ordenado
		int v2[] = {1,3,7,9,15};
		
		assertArrayEquals(o, utils.burbuja(v));
		assertArrayEquals(v2, utils.burbuja(v2));
		
	}

}
