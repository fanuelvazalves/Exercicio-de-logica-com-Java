package cursojavalogica;

import java.util.Scanner;

public class CalcularValorTroco {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();

		System.out.print("Digite a quantidade passada pelo cliente: ");
		Double valorPassadoPeloCliente = scanner.nextDouble();

		if (valorPassadoPeloCliente < valorProduto) {
			System.out.println("A quantidade passada pelo cliente é insuficiente para cobrir o valor do produto.");
		} else {
			Double troco = valorPassadoPeloCliente - valorProduto;
			System.out.println("Troco: " + troco);
		}

		scanner.close();
	}
}
