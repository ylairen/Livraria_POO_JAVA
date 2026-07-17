package app;

import model.Autor;
import model.Ebook;
import model.Livro;
import model.LivroFisico;

public class CadastroDeLivros {

	public static void main(String[] args) {

		// OBJETO LIVRO
		// Livro l1 = new Livro();

		// INFORMAÇÕES
		/*
		 * System.out.println(livro.getNome());
		 * System.out.println(livro.getDescrição());
		 * System.out.println(livro.getValor());
		 * System.out.println(livro.getNumeroDePaginas());
		 * System.out.println(livro.getISBN());
		 */

		// É melhor usar um metodo com todas as informações

		// Chamando o metodo ele já trara todas as informações
		// l1.mostrarDetalhes();

		// Criamos dois autores para verificar a associação livro autor

		Autor a1 = new Autor();
		//Livro livro1 = new Livro(a1);
		
		LivroFisico lf = new LivroFisico(a1);
		
		/*
		 * a1.nome = "Machado de Assis"; a1.email = "machado@gmail.com"; a1.CPF =
		 * "123.456.789-00"; livro1.nome = "Dom Casmurro"; livro1.descrição = "Romance";
		 * livro1.valor = 60; livro1.numeroDePaginas = 320; livro1.ISBN = 123456789;
		 */

		// USANDO OS MODIFICADORES DE ACESSO

		a1.setNome("Machado de Assis");
		a1.setEmail("machado@gmail.com");
		a1.setCPF("123.456.789-00");
		// a1.CPF = "123.456.789-00";ERRO

		// NULL
		// a1.getCPF();

		lf.setNome("Dom Casmurro");
		lf.setDescrição("Romance");
		lf.setValor(60);
		lf.setNumeroDePaginas(320);
		lf.setISBN("123-12-1234-12-1");

		// O atributo 'autor' pertence à classe Livro:
		// public Autor autor;
		// Ele é apenas uma referência e inicialmente vale null.
		// Nesta linha, o atributo livro1.autor passa a apontar
		// para o mesmo objeto apontado por a1.

		// livro1.autor = a1;
		lf.mostrarDetalhes();

		// a1.nome = "LOUCURAAAAAAAAAAA";
		// livro1.temAutor();

		lf.aplicarDesconto(10);

		/*
		 * e) Agora podemos usar os atributos e métodos definidos na superclasse, pois o
		 * Ebook herda tudo que o Livro tem. Portanto, podemos executar um método que
		 * está declarado apenas na classe Livro sem nenhum problema: Ebook ebook = new
		 * Ebook(autor); ebook.setNome(“O pequeno príncipe”);
		 * 
		 */
		
		//EBOOK E LIVRO SÃO DIFERENTES POR MAIS QUE O AUTOR SEJA O MESMO
		//TODAS AS INFORMAÇÕES DO AUTOR SERAM PRINTADAS MAS O EBOOK NÃO TEM INFORMAÇÕES
		Ebook ebook = new Ebook(a1);
		ebook.setNome("Pequeno principe");
		ebook.mostrarDetalhes();
		ebook.aplicarDesconto(10);

	}

}
