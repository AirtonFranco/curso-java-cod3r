package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {
	
	public static void main(String[] args) {
		//Tipo de lista de String
		//Set<String> lista = new HashSet<String>();
		Set<String> listAprovados = new HashSet<>(); //HashSet -> Lista desordenada
		
		listAprovados.add("Airton");
		listAprovados.add("Vane");
		listAprovados.add("Rhuan");
		listAprovados.add("Miguel");
		
		for (String lista : listAprovados) {
			System.out.println(lista);
		}
		System.out.println("-------------------------");
		
		Set<Integer> nums = new TreeSet<>(); //O TreeSet garante que a lista esteja em ordem de inserssão -> Lista Ordenada
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		
		for (int listaNums : nums) {
			System.out.println(listaNums);
		}
	}
}	
