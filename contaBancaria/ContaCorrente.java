package contaBancaria;

public class ContaCorrente {

	private int numeroDaConta;
	private String nomeDoTitular;
	private double valorDepositoInicial;
	private double saldo;
	

	public ContaCorrente(int numeroDaConta, String nomeDoTitular, double valorDepositoInicial) {
		this.numeroDaConta = numeroDaConta;
		this.nomeDoTitular = nomeDoTitular;
		this.valorDepositoInicial = valorDepositoInicial;
		this.saldo = valorDepositoInicial;
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public String getNomeDoTitular() {
		return nomeDoTitular;
	}

	public void setNomeDoTitular(String nomeDoTitular) {
		this.nomeDoTitular = nomeDoTitular;
	}

	public double getValorDepositoInicial() {
		return valorDepositoInicial;
	}

	public void setValorDepositoInicial(double valorDepositoInicial) {
		this.valorDepositoInicial = valorDepositoInicial;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public double deposito(double valor) {
		return saldo+=valor;
	}
	
	public double saque(double valor) {
		return saldo-=(valor + 5);
	}
	
	public String toString(){
		return "Conta: "+numeroDaConta+
				"  Titular da conta: "+ nomeDoTitular+
				"  Saldo: "+String.format("%.2f",saldo);	
	}
	

}
