package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		double media = 6.5;
		
		String resultadoParcial = media >= 5 ? "em recupera��o" : "reprovado";
		
		String resultadoFinal = media >= 7.0 ? "aprovado." : resultadoParcial;
		
		System.out.println("O aluno est� " + resultadoFinal);
	}
}
