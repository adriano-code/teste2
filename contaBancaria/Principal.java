package contaBancaria;

import java.util.Scanner;

public class Principal {
	
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cadastre uma conta\n");
		System.out.print("Número da conta: ");
		int numConta = sc.nextInt();
		System.out.print("Nome do titular da conta: ");
		sc.nextLine();
		String nomeTitular = sc.nextLine();
		System.out.print("Valor do depósito: ");
		double valor = sc.nextDouble();
		
		ContaCorrente cc = new ContaCorrente(numConta, nomeTitular, valor);
		System.out.println(cc.toString());//ou apenas System.out.println(cc); pois na classe ContaCorrente já existe uma método toString.
		System.out.println("\nDepósito\n");
		System.out.print("Digite o valor a ser depositado: ");
		valor = sc.nextDouble();
		cc.deposito(valor);
		System.out.println("Valor depositado: "+valor);
		System.out.println(cc.toString());
		
		System.out.println("\nSaque\n");
		System.out.print("Digite o valor a ser retirado: ");
		valor = sc.nextDouble();
		cc.saque(valor);
		System.out.println("Valor do saque: "+valor);
		System.out.println(cc.toString());
		
		sc.close();
	}

}
