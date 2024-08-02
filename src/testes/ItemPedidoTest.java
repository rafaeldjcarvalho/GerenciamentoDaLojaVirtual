package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import principal.ItemPedido;
import principal.Produto;

class ItemPedidoTest {
	
	@Test
	public void testConstrutor() {
        Produto produto = new Produto("Teclado", "Teclado Mecânico", 200.00, 30);
        
        //"O item não pode ter uma quantidade maior que o produto."
        assertThrows(RuntimeException.class, () -> {
        	ItemPedido item = new ItemPedido(produto, 40, produto.getPreco());
        });
        
        //"O item não pode ter uma quantidade menor que zero."
        assertThrows(RuntimeException.class, () -> {
        	ItemPedido item = new ItemPedido(produto, -10, produto.getPreco());
        });
        
        //"O item não pode ter um preço diferente do produto."
        assertThrows(RuntimeException.class, () -> {
        	ItemPedido item = new ItemPedido(produto, 40, 100);
        });
    }

	@Test
	public void testCalcularSubtotal() {
        Produto produto = new Produto("Teclado", "Teclado Mecânico", 200.00, 30);
        ItemPedido item = new ItemPedido(produto, 2, produto.getPreco());

        double subtotal = item.calcularSubTotal();
        
        //"O subtotal do item deve ser 400.00."
        assertEquals(400.00, subtotal);
    }

}
