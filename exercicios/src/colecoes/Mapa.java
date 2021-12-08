package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		Map<Integer, String> usuario = new HashMap<>();
		
		usuario.put(1, "Airton");
		usuario.put(2, "Vane");
		usuario.put(3, "Rhuan");
		usuario.put(4, "Miguel");
		
		System.out.println(usuario.size()); //Tamanho da coleção
		System.out.println(usuario.isEmpty()); //Verifica se esta vazio
		System.out.println(usuario.keySet()); //pega o conjunto de chaves
		System.out.println(usuario.values()); //pega o conjunto de valores
		System.out.println(usuario.entrySet()); //pega chave e valor
		System.out.println(usuario.containsKey(3)); //contem esse key?
		System.out.println(usuario.containsValue("Airton")); //contem esse value?
		System.out.println(usuario.get(4)); //pagando o value a partir da key
		
		
		//Pegando as Keys
		for (int chave : usuario.keySet()) {
			System.out.println(chave);
		}
		
		//Pegando as Values
		for (String string : usuario.values()) {
			System.out.println(string);
		}
		
		//Pegando chave e valor
		for(Entry<Integer, String> registro: usuario.entrySet()) {
			System.out.println(registro);
			System.out.println(registro.getKey());
			System.out.println(registro.getValue());
		}
	}
}
