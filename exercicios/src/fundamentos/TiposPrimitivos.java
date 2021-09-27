package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//Informações do funcionario
		
		//tipos numericos inteiros
		byte anosDeEmpresa = 23;
		short numeroVoos = 542;
		int id = 56282;
		long pontosAcumulados = 3_123_252_528L; //Representando 3 milhoes ...
		
		//tipos numericos reais
		float salario = 11_445.44F; //Representando 11 mil ...
		double vendasAcumuladas = 2_991_797_103.01; //Double é maior que float
		
		//Tipo caractere
		char status = 'a';
		
		//Tipo Booleano
		boolean estaDeFerias = false; //true
		
		//Dias da empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Numero de voos
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		//Funcionario de ferias 
		System.out.println("O funcionario esta de ferias? " + estaDeFerias);
		
		//Salario do funcionario
		System.out.println("id: " + id + " Recebe: " + salario);
	}
}
