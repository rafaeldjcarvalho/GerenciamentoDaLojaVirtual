package principal;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
	private int id;
	private Cliente cliente;
	private List<ItemPedido> itens;
	private StatusPedido status;
	private double valorTotal;
	
	public Pedido() {
		setId();
		this.itens = new ArrayList<>();
		setStatus(StatusPedido.RECEBIDO);
	}
	
	public Pedido(Cliente cliente) {
		this();
		this.cliente = cliente;
	}
	
	public void addItens(ItemPedido item) {
		itens.add(item);
	}
	
	public void removeItem(ItemPedido item) {
		itens.remove(item);
	}
	
	public double calcularValorTotal() {
		for (ItemPedido obj : itens) {
			setValorTotal(getValorTotal() + obj.calcularSubTotal());
		}
		return getValorTotal();
	}
	
	public void atualizarStatus() {
		if (getStatus().equals(StatusPedido.RECEBIDO)) {
			setStatus(StatusPedido.EM_PROCESSAMENTO);
		} else if (getStatus().equals(StatusPedido.EM_PROCESSAMENTO)) {
			setStatus(StatusPedido.AGUARDANDO_PAGAMENTO);
		} else if (getStatus().equals(StatusPedido.AGUARDANDO_PAGAMENTO)) {
			setStatus(StatusPedido.FINALIZADO);
		}
	}
	
	public void cancelarPedido() {
		setStatus(StatusPedido.CANCELADO);
	}

	public int getId() {
		return id;
	}

	public void setId() {
		this.id = new GeradorDeIdentificadores().gerarIdUnico();
	}

	public List<ItemPedido> getItens() {
		return itens;
	}

	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	
	
}
