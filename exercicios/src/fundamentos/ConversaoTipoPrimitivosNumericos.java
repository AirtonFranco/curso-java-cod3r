package fundamentos;

public class ConversaoTipoPrimitivosNumericos {
	public static void main(String[] args) {
		
		//convertendo um inteiro para double
		double a = 1; //conversao implicita
		System.out.println(a);
		
		//convertendo um numero double para float
		float b = (float) 1.0; //conversao explicita (CAST)
		//ou
		float c = 1.0F;
		
		int h = 4;
		byte d = (byte) h; //conversao explicita (CAST)
		System.out.println(d);
		
		double f = 1.9999;
		int g = (int) f; //conversao explicita (CAST)
		System.out.println(g);
	}
}
