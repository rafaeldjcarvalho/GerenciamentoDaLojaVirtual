package principal;

public class Cliente {
	
	private int id;
	private String nome;
	private String email;
	private String telefone;
	
	public Cliente(String nome, String email, String telefone) {
		setId();
		setNome(nome);
		setEmail(email);
		setTelefone(telefone);
	}
	
	public String notificar(String mensagem) {
		if (mensagem != null && mensagem.length() > 0) {
			return mensagem;
		} else {
			throw new RuntimeException("Mensagem invalida ou nulo!");
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
		if (nome != null && nome.length() > 0) {
			this.nome = nome;
		} else {
			throw new RuntimeException("Nome invalido ou nulo!");
		}
		
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email != null && email.length() > 0) {
			this.email = email;
		} else {
			throw new RuntimeException("Email invalido ou nulo!");
		}
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		if (telefone != null && telefone.length() > 0) {
			this.telefone = telefone;
		} else {
			throw new RuntimeException("Nome invalido ou nulo!");
		}
	}
}
