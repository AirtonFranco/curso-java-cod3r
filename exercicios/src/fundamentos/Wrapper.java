package fundamentos;

public class Wrapper {
	public static void main(String[] args) {
		
		/**Wrapper são a verão orientada a objeto de cada tipo primitivo, 
		permitindo que eles possuam metodos, se perceber todos eles começam com letra maiusculas**/
		
		//byte
		Byte b = 100;
		Short s = 1000;
		
		Integer i = 10000;
		Integer t = Integer.parseInt("10000"); //Tranformando para numero inteiro
		Long l = 100000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Float f = 123.10F;
		Double d = 1234.5678;
		
		Character c = 'c';
	}
}
