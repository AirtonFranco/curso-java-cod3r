package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Airton".charAt(3)); //Qual a letra no indice 3
		
		String s = "Boa dia";
		System.out.println(s.startsWith("Boa")); //Verifica se a string inicia com essa palavra
		System.out.println(s.startsWith("boa"));
		System.out.println(s.endsWith("dia"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.length());
		System.out.println(s.equals("bom dia")); //Verifica se é igual
		System.out.println(s.equalsIgnoreCase("bomdia")); //verifica se é igual porem ignora se é maiuscula ou minuscula
		
		var nome = "Airton";
		var sobrenome = "Franco";
		var idade = 33;
		var salario = 15000.00;
		
		System.out.println("Nome: " + nome 
				+ "\nSobrenome: " + sobrenome 
				+ "\nIdade: " + idade
				+ "\nSalario: " + salario + "\n\n");
		
		//%s = strings, %d = valores inteiros, %f = numeros flutuantes
		System.out.printf("O senhor %s %s de idade %d ganha R$%.2f.", nome, sobrenome, idade, salario);
		
		String frase = String.format("\nO senhor %s %s de idade %d ganha R$%.2f.", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("qualquer")); //Verificar se exixte uma string na frase
		System.out.println("Frase qualquer".indexOf("qualquer"));//Verifica em qual posição está a palavra na frase
		System.out.println("Frase qualquer".substring(6)); //Começar a frase apartir do indice 6
		System.out.println("Frase qualquer".substring(6, 8)); //CVai do indice
	}
}
