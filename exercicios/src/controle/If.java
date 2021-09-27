package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.printf("Informe a média: ");
		double media = entrada.nextDouble();
		
		if(media >= 7) {
			System.out.println("Aluno aprovado");
		}
		
		if(media < 7 && media >= 4.5) {
			System.out.println("O aluno esta de recuperação");
		}
		
		if (media < 4.5 && media >= 0) {
			System.out.println("O aluno foi reprovado");
		}
		
		
		entrada.close();
	}
}
