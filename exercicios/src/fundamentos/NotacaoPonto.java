package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		String s = "Bom dia X";
		
		s = s.replace("X", "Senhora"); //Essa Função substitui as palavras
		s = s.toUpperCase(); //Essa função deixa tudo em maiusculo
		s = s.concat("!!!"); //essa função concatena
		
		System.out.println(s);
		
		//Tambem pode fazer dessa forma
		
		System.out.println("Airton".toUpperCase());
		
		String x = "Franco".toUpperCase();
		System.out.println(x);
		String y = "x"
				.replace("x", "Silveira")
				.toUpperCase()
				.concat("!!!");
		System.out.println(y);
		
		//tipos primitivos não tem operador "."
		//ex:
		int a = 3;
		//a = a.toUpperCase()
	}
}
