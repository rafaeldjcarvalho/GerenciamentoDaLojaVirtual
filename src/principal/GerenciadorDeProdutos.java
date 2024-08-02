package principal;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeProdutos {
	
	private static List<Produto> estoqueProdutos =  new ArrayList<>();;
	
	public void adicionarProduto(Produto produto) {
		estoqueProdutos.add(produto);
	}
	
	public void removeProduto(Produto produto) {
		estoqueProdutos.remove(produto);
	}
	
	public void atualizarProduto(Produto produto) {
		if (estoqueProdutos.contains(produto)) {
			for (Produto prod : estoqueProdutos) {
				if ((prod.getNome().equals(produto.getNome()))) {
					prod = produto;
					break;
				}
			}
		} else {
			throw new RuntimeException("Produto nao existe no estoque!");
		}
		
	}

	public List<Produto> getEstoqueProdutos() {
		return estoqueProdutos;
	}

	public void setEstoqueProdutos(List<Produto> estoqueProdutos) {
		this.estoqueProdutos = estoqueProdutos;
	}
	
	
	
}
