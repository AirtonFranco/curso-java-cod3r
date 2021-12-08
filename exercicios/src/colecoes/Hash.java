package colecoes;

import java.util.HashSet;

public class Hash {
	public static void main(String[] args) {
		HashSet<Usuario> usuario = new HashSet<>();
		
		usuario.add(new Usuario("Airton"));
		usuario.add(new Usuario("Vane"));
		usuario.add(new Usuario("Rhuan"));
		usuario.add(new Usuario("Miguel"));
		
		System.out.println(usuario.contains(new Usuario("Miguel")));
	}
}
