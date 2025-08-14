package primeiroProjeto;

import java.util.Scanner;

public class Biblioteca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner  scanner = new Scanner(System.in);
		
		String nome;
		System.out.println("qual seu nome? ");
		nome = scanner.nextLine();
		
		System.out.println("ola " + nome );
		//-----------------------------------
		double salario, aumento;
		System.out.println("informe o salario: ");
		salario = scanner.nextDouble();
		System.out.println("informe o aumento: ");
		aumento = scanner.nextDouble();
		
		double total = salario + aumento;
		System.out.println(" o novo salario é: " + total );
		//--------------------------------------
		int numero;
		System.out.println("informe um numero");
		numero = scanner.nextInt();
		int divisao = numero / 2;
		int resto = numero % 2;
		System.out.println("numero / 2: " + divisao);
		System.out.println("numero % 2: " + resto);
        
	}

}
