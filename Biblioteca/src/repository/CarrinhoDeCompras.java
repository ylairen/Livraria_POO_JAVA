package repository;

import java.util.HashMap;
import java.util.Map;

import model.Livro;
import model.Produto;


public class CarrinhoDeCompras {
	private Map<Produto, Integer> produtos;
	public CarrinhoDeCompras() {

		this.produtos = new HashMap<>();
	}

	public float getTotal() {

		float total = 0;

		for (Produto p : produtos.keySet()) {

			int quantidade = produtos.get(p);
			total += p.getValor() * quantidade;
		}
		return total;
	}
	public Map<Produto, Integer> getProdutos() {
		return produtos;
	}
	public void adiciona(Produto produto) {
		produtos.put(produto, produtos.getOrDefault(produto, 0) + 1);
		System.out.println(produto);
	}
	public void aplicarPercentualDesconto(double desconto) {
		for (Produto p : produtos.keySet()) {
			if (p instanceof Promocional) {
				Promocional promocional = (Promocional) p;
				promocional.aplicaDescontoDe(desconto);
			}

		}

	}
	public void imprimirCarrinho() {
		for (Produto p : produtos.keySet()) {
			int quantidade = produtos.get(p);
			double subtotal = p.getValor() * quantidade;

			System.out.println("Nome" + p.getResumo());
			System.out.println("Quantidade:" + quantidade);
			System.out.println("Valor unitario:" + p.getValor());
			System.out.println("Subtotal:" + subtotal);
			System.out.println("---------------------------");
		}
		System.out.println("Total da compra:" + getTotal());
	}

}
