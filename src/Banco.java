import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas = new ArrayList<>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	public void addConta(Conta conta) {
		this.contas.add(conta);
	}
	
	public void imprimirContas() {
		for(int i=0;i<this.contas.size();i++) {
			System.out.println(contas.get(i));
		}
	}
	public void imprimirNomesClientes() {
		for(int i=0;i<this.contas.size();i++) {
			System.out.println(contas.get(i).cliente.getNome());
		}
	}
	public void imprimirInfo() {
		for(int i=0;i<this.contas.size();i++) {
			contas.get(i).imprimirExtrato();
		}
	}
	public void imprimirAgencias() {
		for(int i=0;i<this.contas.size();i++) {
			System.out.println(contas.get(i).getAgencia());
		}
	}
	public void imprimirSaldo() {
		for(int i=0;i<this.contas.size();i++) {
			System.out.println(contas.get(i).saldo);
		}
	}
	public Conta getContaPorCpf(String CPF) {
		int numConta = 0;
		for(int i=0;i<this.contas.size();i++) {
			if(contas.get(i).cliente.getCpf() == CPF) {
				numConta = i;
			}
		}
		return contas.get(numConta);
	}
}
