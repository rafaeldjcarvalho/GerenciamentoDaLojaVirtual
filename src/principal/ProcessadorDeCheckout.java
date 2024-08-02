package principal;

import interfaces.*;

public class ProcessadorDeCheckout {
	
	private CalculadoraDeImpostos calculadoraDeImposto;
	private ServicoDeNotificacao serviccoDeNotificacao;
	private MetodoDePagamento metodoDePagamento;
	
	public ProcessadorDeCheckout(CalculadoraDeImpostos calculadoraDeImposto, ServicoDeNotificacao serviccoDeNotificacao,
			MetodoDePagamento metodoDePagamento) {
		setCalculadoraDeImposto(calculadoraDeImposto);
		setServiccoDeNotificacao(serviccoDeNotificacao);
		setMetodoDePagamento(metodoDePagamento);
	}

	public ProcessadorDeCheckout() {
		super();
	}

	public boolean validarPedido(Pedido pedido) {
		pedido.atualizarStatus();
		GerenciadorDeProdutos gerenciador = new GerenciadorDeProdutos();
		for (int i = 0; i < pedido.getItens().size(); i++) {
		     if (gerenciador.getEstoqueProdutos().contains(pedido.getItens().get(i))) return true;
		}
		pedido.cancelarPedido();
		return false;
	}
	
	public void processarPedido(CalculadoraDeImpostos calculadoraDeImposto, ServicoDeNotificacao serviccoDeNotificacao,
			MetodoDePagamento metodoDePagamento) {
		//finalizar o pedido
	}

	public CalculadoraDeImpostos getCalculadoraDeImposto() {
		return calculadoraDeImposto;
	}

	public void setCalculadoraDeImposto(CalculadoraDeImpostos calculadoraDeImposto) {
		this.calculadoraDeImposto = calculadoraDeImposto;
	}

	public ServicoDeNotificacao getServiccoDeNotificacao() {
		return serviccoDeNotificacao;
	}

	public void setServiccoDeNotificacao(ServicoDeNotificacao serviccoDeNotificacao) {
		this.serviccoDeNotificacao = serviccoDeNotificacao;
	}

	public MetodoDePagamento getMetodoDePagamento() {
		return metodoDePagamento;
	}

	public void setMetodoDePagamento(MetodoDePagamento metodoDePagamento) {
		this.metodoDePagamento = metodoDePagamento;
	}
	
	
	
}
