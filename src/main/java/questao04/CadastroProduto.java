package questao04;

import java.util.ArrayList;
import java.util.List;

public class CadastroProduto {

	private List<Produto> produtos = new ArrayList<>();
	
	public CadastroProduto() {
		
	}
	
	public boolean salvarProduto(Produto produto) {		
		return produtos.add(produto);
	}
	
	public boolean deletarProduto(Produto produto) {
		return produtos.remove(produto);		
	}	
	
	public boolean atualizarProduto(int indice, Produto produto) {
		if(indice < 0 || indice >= produtos.size()) {
			return false;
		}
			
		Produto p = produtos.set(indice, produto);
		if (p ==null) {
			return false;
		}
		return true;
	}
	
	
	public List<Produto> getProdutos(){
		return produtos;
	}
	
	public int tamanho() {
		return produtos.size(); 
	}
}
