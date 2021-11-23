package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		//Intanciando a classe Produto
		Produto p1 = new Produto("Notebook", 4385.65);
		
		var p2 = new Produto();
		
		p2.nome = "Caneta";
		p2.preco = 1.99;
		Produto.desconto = 0.25;
		double teste = p2.desconto = 0.30;
		
		System.out.println(teste);
		
		double precoFinal2 = p2.precoDesconto();
		
		
		System.out.println("O produto " + p1.nome + "de valor " + p1.preco
				+ " esta saindo por = R$" + precoFinal2);
	}
}
