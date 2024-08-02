package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import principal.ItemPedido;
import principal.Pedido;
import principal.Produto;

class PedidoTest {
	
	@Test
	public void testAddItem() {
		Produto produto1 = new Produto("Livro", "Livro de Java", 100.00, 20);
		ItemPedido item1 = new ItemPedido(produto1, 2, produto1.getPreco());
		
		Pedido pedido = new Pedido();
		//"Adicionando a lista."
		assertDoesNotThrow(() -> {
			pedido.addItens(item1);
		});
	}
	@Test
	public void testCalcularValorTotal() {
        Produto produto1 = new Produto("Livro", "Livro de Java", 100.00, 20);
        Produto produto2 = new Produto("Mouse", "Mouse sem fio", 50.00, 15);

        ItemPedido item1 = new ItemPedido(produto1, 2, produto1.getPreco());
        ItemPedido item2 = new ItemPedido(produto2, 3, produto2.getPreco());

        Pedido pedido = new Pedido();
        pedido.addItens(item1);
        pedido.addItens(item2);

        pedido.calcularValorTotal();
        
        //"O valor total do pedido deve ser 350.00."
        assertEquals(350.00, pedido.getValorTotal());
    }

}
