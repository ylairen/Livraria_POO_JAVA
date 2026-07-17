package app;

import model.Autor;
import model.Ebook;
import model.LivroFisico;
import model.MiniLivro;
import repository.CarrinhoDeCompras;

public class RegistroDeVendas {

	/*
	 * a) Crie uma classe main chamada RegistroDeVendas. Nela, instancie um autor e,
	 * a partir desse autor, crie um livro físico e um e-book. Ambos os livros devem
	 * ter o mesmo nome, mas com valores distintos. É importante destacar que um
	 * Ebook e um Livro Físico são tipos de Livro, pois herdam essa classe. Para
	 * testar esse conceito, experimente declarar Livro ebook = new Ebook(); e
	 * observe o comportamento. O objeto Ebook continua sendo um Ebook; não estamos
	 * transformando-o, apenas referenciando-o como um Livro, aproveitando a
	 * abstração proporcionada pela herança. Isso demonstra que podemos referenciar
	 * um objeto de forma mais genérica.
	 */

	public static void main(String[] args) {
		
		Autor a1 = new Autor();
		LivroFisico l1 = new LivroFisico(a1);
		Ebook ebook = new Ebook(a1);
		MiniLivro ml = new MiniLivro(a1);
		CarrinhoDeCompras cc = new CarrinhoDeCompras();
		
		a1.setNome("Machado de Assis");
		a1.setEmail("machado@gmail.com");
		a1.setCPF("123.456.789-00");
		
		l1.setNome("Dom Casmurro");
		l1.setDescrição("Romance");
		l1.setValor(200);
		l1.setNumeroDePaginas(320);
		l1.setISBN("123-12-1234-12-1");
		
		ebook.setNome("Dom Casmurro");
		ebook.setDescrição("Romance");
		ebook.setValor(60);
		ebook.setNumeroDePaginas(320);
		ebook.setISBN("123-12-1234-12-1");
		
		ml.setValor(100);
		
		
		//METODOS
		
		//MOSTRAR DETALHES
		l1.mostrarDetalhes();
		ebook.mostrarDetalhes();
		
		//ADICIONANDO AO CARRINHO
		//imprime a referencia
		cc.adiciona(ebook);
		cc.adiciona(ebook);
		System.out.println(cc.getTotal());
		
		
		
		
	}

}
