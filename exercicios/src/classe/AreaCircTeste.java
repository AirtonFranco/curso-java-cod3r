package classe;

public class AreaCircTeste {
	public static void main(String[] args) {
		AreaCirc p2 = new AreaCirc(10);
		
		//p2.pi = 17;
		
		//AreaCirc.pi = 17;
		
		double teste = AreaCirc.area(100);
		
		System.out.println(p2.area());
		System.out.println(AreaCirc.PI);
		System.out.println(teste);
	}
}
