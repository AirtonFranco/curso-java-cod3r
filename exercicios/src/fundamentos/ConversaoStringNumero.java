package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {
	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog("Digite o Primeiro Numero: ");
		
		String valor2 = JOptionPane.showInputDialog("Digite o Segundo Numero: ");
		
		double v1 = Double.parseDouble(valor1);
		
		double v2 = Double.parseDouble(valor2);
		
		double soma = v1 + v2;
		
		System.out.println("A soma dos numero ?: " + soma);
		
		
		
	}
}
