package arrays;

public class Foreach {
	public static void main(String[] args) {
		double[] notas = {7.9, 8.9, 3.1, 3.1};
		
		for(int i = 0; i < notas.length; i++ ) {
			System.out.println(notas[i]);
		}
		
		for (double nota : notas) {
			System.out.println(nota);
		}
	}
}
