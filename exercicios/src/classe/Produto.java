package classe;

public class Produto {
	String nome;
	double preco;
	static double desconto = 0.25;
	
	Produto () {
		
	}
	
	Produto (String inicialNome, double inicialPreco) {
		nome = inicialNome;
		preco = inicialPreco;
	}
	
	double precoDesconto() {
		return preco * (1 - desconto);
	}
	
	float precoDesconto(double descontoGerente) {
		return (float)(preco * (1 - desconto + descontoGerente));
	}
}