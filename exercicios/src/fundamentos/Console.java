package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		
		//Esse tipo de print imprimi na mesma linha
		System.out.print("Bom "); 
		System.out.print("Dia \n"); //\n = pula uma linha
		
		//tipo de print formatado
		System.out.printf("Bom dia: %d %d %d %d %d %d %n", 1,2,3,4,5,6); //%n = tambem quebra de linha
		
		System.out.printf("Salario: R$%.2f%n", 15000.2525); //%f = ponto flutuante
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos de idade", nome, sobrenome, idade);
		
		entrada.close(); //finalisando o programa
		
	}
}
