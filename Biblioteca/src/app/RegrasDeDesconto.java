package app;

import model.Autor;
import model.Ebook;
import model.Livro;
import model.LivroFisico;
import model.MiniLivro;

public class RegrasDeDesconto {

	/*
	 * b) Crie a classe RegrasDeDesconto (main) para testar a regra de negócio no
	 * método aplicaDescontoDe().
	 */

	/*
	 * • Altere a classe main chamada RegrasDeDesconto, criando um objeto Autor,
	 * Livro, Ebook e aplique um desconto no livro e ebook para testar os métodos.
	 */

	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.setNome("Machado de Assis");
		autor.setEmail("machado@gmail.com");
		autor.setCPF("123.456.789-00");

		LivroFisico lf = new LivroFisico(autor);
		lf.setNome("Dom Casmurro");
		lf.setValor(100);

		Ebook ebook = new Ebook(autor);
		ebook.setNome("Dom Casmurro - Ebook");
		ebook.setValor(100);

		MiniLivro ml = new MiniLivro(autor);

		// l1.valor = 150;
		// Livro (máximo 30%)
		/*
		System.out.println(lf.aplicaDescontoDe(10.0)); // true
		System.out.println("Valor do livro: " + lf.getValor());

		// Ebook (máximo 15%)
		System.out.println(ebook.aplicaDescontoDe(20)); // false
		System.out.println("Valor do ebook: " + ebook.getValor());

		System.out.println();

		ebook.aplicaDescontoDe(10); // agora aplica
		System.out.println("Valor do ebook: " + ebook.getValor());

		// APLICAR DESCONTO
		ml.setValor(100);
		ml.aplicaDescontoDe(5);
		ml.mostrarDetalhes();
		*/
		/*
		 * f) Modifique a classe RegrasDeDesconto criando um MiniLivro onde
		 * anteriormente criávamos um Livro. Posteriormente, execute e veja o que
		 * acontece. Foi aplicado desconto? Sim. Mas a regra para o MiniLivro é que não
		 * pode ser aplicado desconto!
		 */

		/*
		 * g) Portanto, se cada tipo de livro adota uma estratégia diferente para
		 * descontos, ou seja, se não há uma regra única válida para todos, poderíamos
		 * remover o método aplicaDescontoDe() da classe Livro e implementá-lo apenas
		 * nas subclasses que permitem desconto. • No entanto, isso resultaria na perda
		 * do polimorfismo, fazendo com que o método adiciona() da classe
		 * CarrinhoDeCompras deixasse de funcionar. Pois o polimorfismo funciona em duas
		 * etapas: o Compilação: o método precisa existir na superclasse (ou interface).
		 * o Execução: o Java escolhe qual implementação da subclasse será executada
		 * (objeto em questão). • Além disso, essa abordagem poderia levar a erros, pois
		 * poderíamos esquecer de implementar o desconto em uma subclasse que deveria
		 * oferecê-lo
		 */
		lf.mostrarDetalhes();
		System.out.println("============Aplica desconto================");
		
		//boolean aplicou = lf.aplicaDescontoDe10Porcento();
		//System.out.println(aplicou);
		lf.aplicaDescontoDe10Porcento();
		lf.mostrarDetalhes();
		
		lf.aplicaDescontoDe(30);
		lf.mostrarDetalhes();
		
	

	}

}
