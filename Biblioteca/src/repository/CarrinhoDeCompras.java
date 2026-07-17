package repository;

import java.util.HashMap;
import java.util.Map;

import model.Livro;
import model.Produto;

/*
 * Classe respondavel por gerenciar o carrinho de compras.
* 
* Ideia principal:
* -Guardar os produtos adicionaos
* -controlar a quantidade de cada produto
* -calcular o valor total da compra
* 
* O hashMap permite associoar
* 
* Produto -> Quantidade
* 
* Exemplo:
* 
* Livro Java -> 2
* Revista POO ->1
* 
* Assim evitamos repetir o mesmo produto varias vezes
* 
* */

public class CarrinhoDeCompras {

	/*
	 * O map é declarado como interface
	 * 
	 * Vantagem: Podemos trocar a implementação depois sem alterar o restante do
	 * codigo
	 * 
	 * Exemplo: HashMap LinkedHashMap TreeMap
	 * 
	 * Todos implementam Map
	 * 
	 */

	private Map<Produto, Integer> produtos;

	/*
	 * 
	 * Construtor vazio
	 * 
	 * Quando o carrinho é criado,começa sem nenhum produto
	 */

	public CarrinhoDeCompras() {

		/*
		 * Criamos o HashMap que armazena:
		 * 
		 * chave = Produto valor = Quantidade
		 * 
		 */
		this.produtos = new HashMap<>();
	}

	/*
	 * Calcula o valor total da compra
	 * 
	 * Não armazenamos o total em uma variavel global porque O preço dos produtos
	 * pode mudar (exemplo:desconto)
	 * 
	 * Então sempre calculamos novamente os dados atuais
	 * 
	 */

	public float getTotal() {

		/*
		 * 
		 * 
		 * 
		 * 
		 * */
		float total = 0;

		/*
		 * 
		 * 
		 * 
		 * 
		 * */
		for (Produto p : produtos.keySet()) {

			/*
			 * 
			 * 
			 * 
			 * 
			 * */
			int quantidade = produtos.get(p);

			/*
			 * 
			 * 
			 * 
			 * 
			 * */
			total += p.getValor() * quantidade;
		}

		/*
		 * 
		 * 
		 * 
		 * 
		 * */
		return total;
	}

	/*
	 * 
	 * 
	 * 
	 * 
	 * */
	public Map<Produto, Integer> getProdutos() {
		return produtos;
	}

	/*
	 * 
	 * 
	 * 
	 * 
	 * */
	public void adiciona(Produto produto) {

		/*
		 * 
		 * 
		 * 
		 * 
		 * */

		produtos.put(produto, produtos.getOrDefault(produto, 0) + 1);
		System.out.println(produto);
	}

	/*
	 * 
	 * 
	 * 
	 * 
	 * */
	public void aplicarPercentualDesconto(double desconto) {

		/*
		 * 
		 * 
		 * 
		 * 
		 * */
		for (Produto p : produtos.keySet()) {

			/*
			 * 
			 * 
			 * 
			 * 
			 * */
			if (p instanceof Promocional) {
				/*
				 * 
				 * 
				 * 
				 * 
				 * */
				Promocional promocional = (Promocional) p;
				/*
				 * 
				 * 
				 * 
				 * 
				 * */
				promocional.aplicaDescontoDe(desconto);
			}

		}

	}

	/*
	 * 
	 * 
	 * 
	 * 
	 * */
	public void imprimirCarrinho() {

		/*
		 * 
		 * 
		 * 
		 * 
		 * */
		for (Produto p : produtos.keySet()) {
			/*
			 * 
			 * 
			 * 
			 * 
			 * */
			int quantidade = produtos.get(p);
			/*
			 * 
			 * 
			 * 
			 * 
			 * */
			double subtotal = p.getValor() * quantidade;

			System.out.println("Nome" + p.getResumo());
			System.out.println("Quantidade:" + quantidade);
			System.out.println("Valor unitario:" + p.getValor());
			System.out.println("Subtotal:" + subtotal);
			System.out.println("---------------------------");
		}
		/*
		 * 
		 * 
		 * 
		 * 
		 * */
		System.out.println("Total da compra:" + getTotal());
	}

}
