package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		
		//offer e add -> adcionam elementos na fila
		//Diferença é o comportamento quando a fila estiver cheia!
		
		fila.add("Airton"); //fila cheia -> retorna false
		fila.offer("Vane"); //fila cheia -> retorna uma exception
		fila.offer("Luiz");
		fila.offer("Rhuan");
		
		//Pegar o primeiro elemento da fila
		//peek e element -> retorna o primeiro elemento da fila porem não o exclui
		System.out.println(fila.peek()); //fila vazia -> retorna null
		System.out.println(fila.element()); //fila vazia retorna uma exception
		
		//pool -> retorna o primeiro elemento da fila e o exclui
		System.out.println(fila.poll());
		System.out.println(fila.poll()); //fila vazia -> retorna null
		System.out.println(fila.remove()); //fila vazia -> retorna exception
	}
}
