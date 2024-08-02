package principal;

public class Produto {
	
	private int id;
	private String nome;
	private String descricao;
	private double preco;
	private int quantidade;
	
	public Produto(String nome, String descricao, double preco, int quantidade) {
		setId();
		setNome(nome);
		setDescricao(descricao);
		setPreco(preco);
		setQuantidade(quantidade);
	}
	
	public void atualizarQuantidade(int quantidade) {
		if (quantidade > 0 || ((quantidade < 0) && (getQuantidade() + quantidade >= 0))) {
			setQuantidade(getQuantidade() + quantidade);
		} else {
			throw new RuntimeException("Quantidade invalida!");
		}
	}
	
	public int getId() {
		return id;
	}
	public void setId() {
		this.id = new GeradorDeIdentificadores().gerarIdUnico();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		if (preco > 0) {
			this.preco = preco;
		} else {
			throw new RuntimeException("Preço Inválido!");
		}
		
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
	}
	
}
