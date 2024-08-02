package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import principal.Cliente;
import principal.ItemPedido;
import principal.Pedido;
import principal.ProcessadorDeCheckout;
import principal.Produto;

class ProcessadorDeCheckoutTest {

	@Test
	public void testValidarPedido() {
        Cliente cliente = new Cliente("John Doe", "john@example.com", "79912344321");
        Pedido pedido = new Pedido(cliente);

        ProcessadorDeCheckout processador = new ProcessadorDeCheckout();
        
        // "O pedido deve ser inválido."
        assertFalse(processador.validarPedido(pedido));

        pedido.addItens(new ItemPedido(new Produto("Monitor", "Monitor LED", 800.00, 5), 1, 800.00)); // Produto fora de estoque
        
        //"O pedido deve ser inválido devido ao estoque."
        assertFalse(processador.validarPedido(pedido));
    }

}
