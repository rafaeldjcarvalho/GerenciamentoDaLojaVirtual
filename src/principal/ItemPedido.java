package principal;

public class ItemPedido {
	
	private Produto produto;
	private int quantidadeDoPedido;
	private double preco;
	
	public ItemPedido(Produto produto, int quantidadeDoPedido, double preco) {
		setProduto(produto);
		setQuantidadeDoPedido(quantidadeDoPedido);
		setPreco(preco);
	}
	
	public double calcularSubTotal() {
		return getQuantidadeDoPedido() * getPreco();
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public int getQuantidadeDoPedido() {
		return quantidadeDoPedido;
	}

	public void setQuantidadeDoPedido(int quantidadeDoPedido) {
		if ((quantidadeDoPedido > 0) && (quantidadeDoPedido <= getProduto().getQuantidade())) {
			this.quantidadeDoPedido = quantidadeDoPedido;
		} else {
			throw new RuntimeException("Quantidade Invalida!");
		}
		
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco == getProduto().getPreco()) {
			this.preco = preco;
		} else {
			throw new RuntimeException("Preço Inválido!");
		}
		
	}
	
	
}
