package fundamentos.operadores;

public class Unarios {
	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		
		//P�s Fixada
		a++;
		b--;
		
		//Pr� Fixada
		++a;
		--b;
		
		System.out.println(++a == b--);
	}
}
