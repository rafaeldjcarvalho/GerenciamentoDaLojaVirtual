package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import principal.GerenciadorDeProdutos;
import principal.Produto;

class GerenciadorDeProdutoTest {

	 @Test
    public void testAtualizarProduto() {
        GerenciadorDeProdutos gerenciador = new GerenciadorDeProdutos();
        Produto produto = new Produto("Cadeira", "Cadeira de Escritório", 150.00, 20);
        Produto produto2 = new Produto("table", "table de Escritório", 160.00, 10);

        gerenciador.adicionarProduto(produto);
        //"O produto deve ser adicionado ao estoque."
        assertTrue(gerenciador.getEstoqueProdutos().contains(produto));

        produto.atualizarQuantidade(-5);
        gerenciador.atualizarProduto(produto);
        
        //"O estoque deve ser atualizado para 15."
        assertEquals(15, gerenciador.getEstoqueProdutos().get(0).getQuantidade());
        
        //"Nao esta no estoque."
        assertThrows(RuntimeException.class, () -> {
        	gerenciador.atualizarProduto(produto2);
        });
    }

}
