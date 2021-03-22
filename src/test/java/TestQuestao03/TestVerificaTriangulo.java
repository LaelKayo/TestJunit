package TestQuestao03;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import questao03.VerificarTriangulo;

public class TestVerificaTriangulo {

	@Test
	public void CT01() {
		VerificarTriangulo triangulo = new VerificarTriangulo();
		Boolean esperado = triangulo.verificarTriangulo(5, 6, 10);
		
		assertTrue(esperado);
	}
	
	@Test
	public void CT02() {
		VerificarTriangulo triangulo = new VerificarTriangulo();
		Boolean esperado = triangulo.verificarTriangulo(5, 6, 20);
		
		assertFalse(esperado);
	}
	
	@Test
	public void CT03() {
		VerificarTriangulo triangulo = new VerificarTriangulo();
		assertEquals("Nao é triangulo", triangulo.classificacaoDoTriangulo(5, 6, 20));
	}
	@Test
	public void CT04() {
		VerificarTriangulo triangulo = new VerificarTriangulo();
		assertEquals("Triangulo Equilatero", triangulo.classificacaoDoTriangulo(6, 6, 6));
	}
	@Test
	public void CT05() {
		VerificarTriangulo triangulo = new VerificarTriangulo();
		assertEquals("Triangulo Isosceles", triangulo.classificacaoDoTriangulo(6, 6, 10));
	}
	@Test
	public void CT06() {
		VerificarTriangulo triangulo = new VerificarTriangulo();
		assertEquals("Triangulo Isosceles", triangulo.classificacaoDoTriangulo(6, 10, 6));
	}
	@Test
	public void CT07() {
		VerificarTriangulo triangulo = new VerificarTriangulo();
		assertEquals("Triangulo Isosceles", triangulo.classificacaoDoTriangulo(10, 6, 6));
	}
	@Test
	public void CT08() {
		VerificarTriangulo triangulo = new VerificarTriangulo();
		assertEquals("Triangulo Escaleno", triangulo.classificacaoDoTriangulo(6, 7, 8));
	}
	
}
