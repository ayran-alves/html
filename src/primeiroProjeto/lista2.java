package primeiroProjeto;

import java.util.Scanner;

public class lista2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  scanner = new Scanner(System.in);
//1
 int nume1,nume2;
System.out.println("informe um  numero ");
nume1 = scanner.nextInt();
System.out.println("informe outro numero");
nume2 = scanner.nextInt();
int soma = nume1 + nume2;
int sub = nume1 - nume2;
int mult = nume1 * nume2;
int divi = nume1 / nume2;
System.out.println("soma: " + soma);
System.out.println("sub: " + sub);
System.out.println("mult: " + mult);
System.out.println("divisao: " + divi);
 
//2
double celsius;
System.out.println("informe uma temperatura em celsius");
celsius = scanner.nextInt();
double fire = (celsius * 1.8)+ 32; 
System.out.println("a temperatura em faherenheit é  "+ fire );
 System.out.println("a temperatura em celsius é "+ celsius);
     
 //3
 double real ;
 System.out.println("informe o valor em real");
 real = scanner.nextInt();
 double divisao =  (real / 5.70);
 System.out.println("o valor em dolar é de " + divisao);
 
 //4
 double base,altura;
 System.out.println("informe a base do retangulo");
 base = scanner.nextInt();
 System.out.println("informe a altura do retangulo ");
 altura = scanner.nextInt();
 double area = (base * altura);
 System.out.println("A area do retangulo é " + area);
 
 //5
   int idade;
   System.out.print("Digite sua idade em anos: ");
   int idadeAnos = scanner.nextInt();
   int idadeMeses = idadeAnos * 12;
   System.out.println("Você já viveu aproximadamente " + idadeMeses + " meses.");
   
   //6
    int tempo;
    System.out.print("Digite o tempo em minutos: ");
    int minutos = scanner.nextInt();
    int segundos = minutos * 60;
    System.out.println(minutos + " minutos equivalem a " + segundos + " segundos.");
    
    //7
    System.out.print("Digite o preço do produto): ");
    double preco = scanner.nextDouble();
    System.out.print("Digite a quantidade comprada: ");
    int quantidade = scanner.nextInt();
    double custoTotal = preco * quantidade;
    System.out.println("Custo total da compra: R$ " + custoTotal);
    
    //8
    System.out.print("Digite o valor total da conta (R$): ");
    double valorTotal = scanner.nextDouble();
    System.out.print("Digite o número de pessoas: ");
    int numeroPessoas = scanner.nextInt();
    if (numeroPessoas <= 0) {
    System.out.println("Número de pessoas inválido!");
    double valorPorPessoa = valorTotal / numeroPessoas;
    System.out.println("Cada pessoa deve pagar R$" + formato.format(valorPorPessoa));
            

          


           


           
   

     


 
 

 
 
 

 
	}

}
