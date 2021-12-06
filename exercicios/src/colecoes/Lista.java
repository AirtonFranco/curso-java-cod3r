package colecoes;

import java.util.ArrayList;

public class Lista {
	
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Airton");
		
		lista.add(u1);
		lista.add(new Usuario("Silvane"));
		lista.add(new Usuario("Luiz Miguel"));
		lista.add(new Usuario("Rhuan Felyppe"));
		
		System.out.println(lista.get(3));
		System.out.println(lista.get(3).nome);
		
		System.out.println("Tem? " + lista.contains(new Usuario("Vane")));
		
		for (Usuario usuario : lista) {
			System.out.println(usuario);
		}
	}
}
