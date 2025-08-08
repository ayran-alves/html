package primeiroProjeto;

import java.util.Scanner;
import java.util.StringJoiner;

public class Primeira {

	public static void main(String[] args) {
		System.out.println("ola mundo"); 
		
		//Declaração de Variável
		int idade = 24;
		double salario = 2000.50;
		char letra = 'A';
		String nome = "Ayran";
		boolean chuva = false;
	    System.out.println(idade);
	    System.out.println("o salario é "+ salario + "reais");
	    System.out.println("letra: "+letra);
	    System.out.println("o nome é: "+ nome);
	    System.out.println(chuva);
	    //operadores
	    int num1 = 10;
	    int num2 = 3;
	    double soma = num1 + num2;
	    double sub = num1 - num2;
	    double div = num1 / num2;
	    double mult = num1 * num2;
	    double resto = num1 % num2;
	    
	    System.out.println("soma: "+ soma);
	    System.out.println("subtração:"+ sub);
	    System.out.println("multiplicação"+ mult);
	    System.out.println("divisão: "+ div);
	    System.out.println("resto:"+ resto);
	    
	    //entrada de dados
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("qual seu nome? ");
	    String nome1 = scanner.nextLine();
	    System.out.println("ola "+ nome1);
	    
	    //soma de dois numeros 
	    int numero1;
	    int numero2;
	    System.out.println("informe um número: ");
	    numero1 = scanner.nextInt();
	    System.out.println("informe outro numero: ");
	    numero2 = scanner.nextInt();
	    int soma1 = numero1 + numero2;
	    System.out.println("o resultado é: "+soma1);
	    
	    /* peça o ano de nascimento do usuario e mostre quantos anos ela tem */
	    int ano = 2025;
	    int nascimento;
	    System.out.println("qual ano você nasceu?");
	    nascimento = scanner.nextInt();
	    int total = ano - nascimento;
	    System.out.println("você tem "+ total +"anos" );
	    
	    //calcular desconto 
	    double preco;
	    double desconto;
	    System.out.println("qual o valor da compra");
	    preco = scanner.nextDouble();
	    System.out.println("qual o valor do desconto");
	    desconto = scanner.nextDouble();
	    double pagar = preco - desconto;
	    System.out.println("pague:"+ pagar);
	    /*peça duas notas decimas para o usuario, calcule média e mostre*/
	     double nota1;
	     double nota2;
	     System.out.println("nota 1: ");
	     nota1 = scanner.nextDouble();
	     System.out.println("nota 2: ");
	     nota2 = scanner.nextDouble();
	     double media = (nota1 + nota2) / 2;
	     System.out.println("a media é "+media);
	}

}
