package principal;

public class GeradorDeIdentificadores {
	
	private static int identificador;
	
	public int gerarIdUnico() {
		return ++identificador;
	}

}
