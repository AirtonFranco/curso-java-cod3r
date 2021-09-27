package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		//(°F - 32) x  5/9 = °C
		
		int F = 200;
		final int ajuste = 32;
		final double multiplicador = 0.55;
		
		final double celsios = (F - ajuste) * multiplicador; 
		
		System.out.println(celsios);
		
	}
}
