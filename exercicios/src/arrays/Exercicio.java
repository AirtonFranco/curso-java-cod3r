package arrays;

import java.util.Arrays;

public class Exercicio {
	public static void main(String[] args) {
		double[] notasAlunoA = new double[3];
		System.out.println(Arrays.toString(notasAlunoA));

		notasAlunoA[0] = 7.5;
		notasAlunoA[1] = 9.5;
		notasAlunoA[2] = 5.0;
		
		System.out.println(Arrays.toString(notasAlunoA));

		double totalAlunoA = 0;
		for (int i = 0; i < notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i];	
		}

		System.out.println(totalAlunoA / notasAlunoA.length);

		double[] notasAlunoB = {6.0, 8.9, 7.2};
		double totalAlunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalAlunoB += notasAlunoB[i];	
		}

		System.out.println(totalAlunoB / notasAlunoB.length);
	}
}
