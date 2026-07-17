package app;

import model.Autor;
import model.Ebook;
import model.Livro;
import model.LivroFisico;

public class CadastroDeLivros {

	public static void main(String[] args) {

		Autor a1 = new Autor();

		
		LivroFisico lf = new LivroFisico(a1);
		
		a1.setNome("Machado de Assis");
		a1.setEmail("machado@gmail.com");
		a1.setCPF("123.456.789-00");

		lf.setNome("Dom Casmurro");
		lf.setDescrição("Romance");
		lf.setValor(60);
		lf.setNumeroDePaginas(320);
		lf.setISBN("123-12-1234-12-1");

		lf.mostrarDetalhes();

		lf.aplicarDesconto(10);

		Ebook ebook = new Ebook(a1);
		ebook.setNome("Pequeno principe");
		ebook.mostrarDetalhes();
		ebook.aplicarDesconto(10);

	}

}
