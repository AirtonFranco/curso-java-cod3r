package arrays;

import java.util.Arrays;

public class Exercicio {
	public static void main(String[] args) {
		double[] notasAlunoA = new double[3];
		
		notasAlunoA[0] = 7.5;
		notasAlunoA[1] = 9.5;
		notasAlunoA[2] = 5.0;
		
		String arrays = Arrays.toString(notasAlunoA);
		System.out.println(arrays);
	}
}
