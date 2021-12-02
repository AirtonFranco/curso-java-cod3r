package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos alunos? ");
		int qtdAlunos = entrada.nextInt();
		
		System.out.print("Quantas notas por alunos? ");
		int qtdNotas = entrada.nextInt();
		
		
		double[][] notasTurma = new double[qtdAlunos][qtdNotas];
		
		double total = 0;
		for (int a = 0; a < notasTurma.length; a++ ) {
			for (int n = 0; n < notasTurma[a].length; n++) {
				System.out.printf("Informe a nota %d do aluno %d: ", a + 1, n + 1 );
				
				notasTurma[a][n] = entrada.nextDouble();
				total += notasTurma[a][n];
			}
			double media = total / (qtdAlunos * qtdNotas);
			System.out.println("Media da turma é: " + media);
			
			for (double[] notasAluno: notasTurma) {
				System.out.println(Arrays.toString(notasAluno));
				
			}
		}	
		entrada.close();
	}
}
