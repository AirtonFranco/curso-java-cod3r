package classe;

public class AreaCirc {
	double raio = 100;
	static final double PI = 3.1415;
	
	//CONSTRUCTOR
	public AreaCirc(double raioInicial) {
		raio = raioInicial; 
	}
	
	//METODOS
	double area() {
		return PI * Math.pow(raio, 2);
	}
	
	static double area(double raio) {
		return PI * Math.pow(raio, 2);
	}
}
