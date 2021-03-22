package TestQuestao02;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

import questao02.Cubo;

public class TestCubo {

	@Test
	public void TestAreaDeUmLado() {
		Cubo c = new Cubo();
		int esperado = 36;
        int atual = c.AreaDeUmLado(6);
		assertEquals(esperado, atual);
	}
	
	@Test
	public void TestAreaLateral() {
		Cubo c = new Cubo();
		int esperado = 144;
        int atual = c.AreaLateral(6);
		assertEquals(esperado, atual);
	}
	
	@Test
	public void TestAreaTotal() {
		Cubo c = new Cubo();
		int esperado = 216;
        int atual = c.AreaTotal(6);
		assertEquals(esperado, atual);
	}
	
	@Test
	public void TestVolume() {
		Cubo c = new Cubo();
		int esperado = 216;
        int atual = c.Volume(6);
		assertEquals(esperado, atual);
	}
	
	@Ignore
	@Test
	public void TestAreaTotal2() {
		Cubo c = new Cubo();
		int esperado = 150;
        int atual = c.AreaTotal(5);
		assertEquals(esperado, atual);
	}
	
	@Test
	public void TestAreaDeUmLado2() {
		Cubo c = new Cubo();
		int esperado = 36;
        int atual = c.AreaDeUmLado(23);
		assertEquals("Erro TestAreaDeUmLado2: ",esperado, atual);
	}
}
