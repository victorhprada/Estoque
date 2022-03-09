package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		
		System.out.println("Entre com um produto:");
		System.out.print("Nome: ");
		produto.nome = sc.nextLine();
		System.out.print("Preço: ");
		produto.preco = sc.nextDouble();
		System.out.print("Quantidade no estoque: ");
		produto.quantidade = sc.nextInt();
		
		System.out.println("Produto adicionado "+produto);
		System.out.println();
		
		System.out.println("Digite um número para adicionar no estoque: ");
		int quantidade = sc.nextInt();
		produto.adicionarProduto(quantidade);
		
		System.out.println("Quantidade atualizada: "+produto);
		System.out.println();
		
		System.out.println("Digite um número para ser removido no estoque: ");
		quantidade = sc.nextInt();
		produto.removerProduto(quantidade);
		
		System.out.println("Quantidade atualizada: "+produto);
		
		sc.close();

	}

}
