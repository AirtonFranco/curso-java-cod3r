package fundamentos.operadores;

public class DesafioAritimeticos {
	public static void main(String[] args) {

//		int a = 3 * 4 - 10;
//		int b = (int) Math.pow(a, 3);
//		double c = Math.pow(a, 3);
//		
//		System.out.println(b);
//		System.out.println(c);
		
		int a = (int) Math.pow((6 * (3 + 2)), 2) / (3 * 2);
		
		int b = (int) Math.pow((((1 - 5) * (2 - 7))/2), 2);
		
		int c = (int) Math.pow(a - b, 3);
		
		int d = (int) Math.pow(10, 3);
		
		int e = c / d;
		
		System.out.println(e);
		
	}
}
