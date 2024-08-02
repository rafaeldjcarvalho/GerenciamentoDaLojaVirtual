package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import principal.Produto;

class ProdutoTest {

	@Test
	public void atualizarQuantidadesDosProdutosTeste() {
		Produto produto = new Produto("Notebook", "Notebook Gamer", 2500.00, 10);
        
        produto.atualizarQuantidade(5); // Adicionando 5 ao estoque
        //"O estoque deve ser 15 após adicionar 5 unidades."
        assertEquals(15, produto.getQuantidade());

        produto.atualizarQuantidade(-3); // Removendo 3 do estoque
        //"O estoque deve ser 12 após remover 3 unidades."
        assertEquals(12, produto.getQuantidade());
        
        //System.out.println(produto.getQuantidade()); // 12 no estoque
        
        //produto.atualizarQuantidade(-14); // Removendo 14 do estoque
        //"A quantidade não pode ser negativa."
        assertThrows(RuntimeException.class, () -> {
        	produto.atualizarQuantidade(-14);
        });
        
      //"A quantidade não pode ser zero."
        assertThrows(RuntimeException.class, () -> {
        	produto.atualizarQuantidade(0);
        });
	}

}
