package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		//Desenvolva uma aplicação que calcule a media de 3 salarios de um funcionario
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("\nDigite o valor do primeiro Salario: ");
		
		String s1 = entrada.nextLine().replace(",", ".");
		
		System.out.print("\nDigite o valor do segundo Salario: ");
		
		String s2 = entrada.nextLine().replace(",", ".");
		
		System.out.print("\nDigite o valor do terceiro Salario: ");
		
		String s3 = entrada.nextLine().replace(",", ".");
		
		double v1 = Double.parseDouble(s1);
		double v2 = Double.parseDouble(s2);
		double v3 = Double.parseDouble(s3);
		
		double media = (v1 + v2 + v3) / 3;
		
		System.out.println(media);
		
		entrada.close();
	}
}
