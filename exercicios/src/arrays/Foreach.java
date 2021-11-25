package arrays;

public class Foreach {
    public static void main(String[] args) {
        double[] notas = {9.9,7.3,3.9,8.8};
        //Forma menos usado em arrays
        for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);	
		}

        //forma mais usada
        for (double nota: notas) {
            System.out.println(nota);
        }
    }
}