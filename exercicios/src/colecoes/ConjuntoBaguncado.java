package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		//toda colections transforma tipos primitivos para wraper
		
		HashSet conjunto = new HashSet();
		
		conjunto.add("Airton"); //String 
		conjunto.add(1.2); //double => Double
		conjunto.add(3); //int => Integer
		conjunto.add("x"); //String => Char
		
		
		//para ver o tamanho da colections não se usa .length e sim size()
		System.out.println("Tamanho da coletion Set: " + conjunto.size());
		System.out.println("Removendo um item da coletion Set: " + conjunto.remove("Airton"));
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//conjunto.addAll(nums); //União de dois conjuntos
		conjunto.retainAll(nums); //Intercessão de dois conjuntos
		
		System.out.println(conjunto);
		
		conjunto.clear(); //Limpa todos os itens do conjunto
		
		System.out.println(conjunto);
		
	}
}
