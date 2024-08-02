package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import principal.GeradorDeIdentificadores;

class GeradorDeIdentificadoresTest {

	@Test
	public void gerarIdUnicoTeste() {
		GeradorDeIdentificadores gerador = new GeradorDeIdentificadores();
		GeradorDeIdentificadores gerador2 = new GeradorDeIdentificadores();
		
		assertEquals(1, gerador.gerarIdUnico()); // tem que ser 1
		assertEquals(2, gerador.gerarIdUnico()); // tem que ser 2
		assertEquals(3, gerador.gerarIdUnico()); // tem que ser 3
		
		assertEquals(4, gerador2.gerarIdUnico()); // tem que ser 4
		assertEquals(5, gerador2.gerarIdUnico()); // tem que ser 5
		assertEquals(6, gerador2.gerarIdUnico()); // tem que ser 6
	}

}
