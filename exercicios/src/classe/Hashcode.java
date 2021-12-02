package classe;


public class Hashcode {
	public static void main(String[] args) {
		Usuario u1 = new Usuario();
		
		u1.nome = "Airton";
		u1.email = "airton@rvm.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Airton";
		u2.email = "airton@rvm.com";
		
		Boolean comparativoIgualdade = u1 == u2; 
		Boolean comparativoEquals = u1.equals(u2);
		Boolean comparativoEquals2 = u2.equals(u1);
		System.out.println(comparativoIgualdade);
		System.out.println(comparativoEquals);
		System.out.println(comparativoEquals2);
		
		//System.out.println(u2.equals(new Date()));
	}
	
}
