package entities;

public class Produto {
	
	public String nome;
	public double preco;
	public int quantidade;
	
	public double stockTotal() {
		return preco * quantidade;
	}
	
	public void adicionarProduto(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void removerProduto(int quantidade) {
		this.quantidade -= quantidade;
	}

	@Override
	public String toString() {
		return "Nome: " + nome + ", Preço: $" + preco + 
				", Quantidade: " + quantidade + " unidade(s), "+
				"Valor em estoque: "+stockTotal();
	}
	
	

}
