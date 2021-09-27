package fundamentos;

public class PrimitivoVsObjeto {
	public static void main(String[] args) {
		//Outra forma não muito comum de chamar uma string
		String s = new String("Olá Mundo");
		System.out.println(s);
		
		//whappers são a versão de objetos dos tipos primitivos
		int a = 123;
		System.out.println(a);
	}
}
