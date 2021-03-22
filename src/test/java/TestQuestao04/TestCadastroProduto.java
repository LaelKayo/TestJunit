package TestQuestao04;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import questao04.CadastroProduto;
import questao04.Produto;

public class TestCadastroProduto {

private CadastroProduto cp = null;
	
	@Before
	public void before() {
		cp = new CadastroProduto();
	}
	@After
	public void after() {
		cp = null;
	}
	
	@Test
	public void atualizarProduto() {
		Produto p = new Produto(1, "Shampoo", 1.5F);
		cp.salvarProduto(p);
		Produto pa = new Produto(1, "Produto atualizado", 2.5F);
				
		assertFalse(cp.atualizarProduto(-1, pa));
		assertFalse(cp.atualizarProduto(2, pa));
		
	}
	
	@Test
	public void salvarProduto() {
		Produto p = new Produto(1, "Suco Isis", 2.5F);		
		
		assertTrue(cp.salvarProduto(p));
	}
	
	
	@Test
	public void deletarProdutoTest2() {
		Produto p = new Produto(1, "Suco Isis", 2.5F);	
		cp.salvarProduto(p);	
		assertEquals(1, cp.getProdutos().size());		
		cp.deletarProduto(p);
		assertEquals(0, cp.getProdutos().size());		
	}
}
