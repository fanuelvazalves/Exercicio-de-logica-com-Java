package cursojavalogica;

import java.util.Scanner;

public class CalcularValorTroco {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Digite o valor do produto: ");
	
	Double valorProduto = scanner.nextDouble ();
	
	System.out.print("Digite quantidade passada pelo cliente: ");
	Double ValorPassadoPeloCliente = scanner.nextDouble();
	
	Double Resultado = ValorPassadoPeloCliente - valorProduto;
	
	System.out.println("Troco: " + Resultado);
	
	scanner.close();
	
	}
	
}
	