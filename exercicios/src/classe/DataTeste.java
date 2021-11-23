package classe;

public class DataTeste {
	public static void main(String[] args) {
		
		Data d1 = new Data();
		
		d1.imprimirDataFormatada();
		
		Data d2 = new Data(23, 01, 1989);
		
		d2.imprimirDataFormatada();
		
		Data d3 = new Data();
		
		d3.dia = 19;
		d3.mes = 04;
		d3.ano = 1995;		
		
	}
}
