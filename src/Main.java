
public class Main {

	public static void main(String[] args) {
		Banco banco = new Banco();
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		
		Conta cc = new ContaCorrente(venilton);
		banco.addConta(cc);
		Conta poupanca = new ContaPoupanca(venilton);
		banco.addConta(poupanca);
		cc.depositar(100);
		cc.transferir(100, poupanca);
		//O Banco agora tem acesso a todas as informa��es dos clientes.
		System.out.println("-------------- Informa��o dos clientes do Banco --------------");
		banco.imprimirInfo();
		
		//Clientes agora tem um m�todo para imprimir o pr�prio extrato
		System.out.println("-------------- Extrato do Cliente --------------");
		venilton.imprimirSaldo(banco);
	}
}

