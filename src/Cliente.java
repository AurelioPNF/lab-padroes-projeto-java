
public class Cliente {

	private String nome;
	private String cpf;
	private String Endereco;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	
	public void imprimirSaldo(Banco banco) {
		banco.getContaPorCpf(this.cpf).imprimirExtrato();
	}
}
