package fundamentos.operadores;

public class Unarios {
	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		
		//Pós Fixada
		a++;
		b--;
		
		//Pré Fixada
		++a;
		--b;
		
		System.out.println(++a == b--);
	}
}
