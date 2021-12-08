package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O pequeno principe");
		livros.push("Sonho grande");
		livros.push("Geração de valor");
		
		//System.out.println(livros.peek());
		//System.out.println(livros.poll());
		//System.out.println(livros.remove());
		//System.out.println(livros.pop());
		
		for (String string : livros) {
			System.out.println(string);
		}
	}
}
