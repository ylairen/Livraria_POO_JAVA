package app;

import model.Autor;
import model.Ebook;
import model.Livro;
import model.LivroFisico;
import model.MiniLivro;

public class RegrasDeDesconto {

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

		lf.mostrarDetalhes();
		System.out.println("============Aplica desconto================");
	
		lf.aplicaDescontoDe10Porcento();
		lf.mostrarDetalhes();
		
		lf.aplicaDescontoDe(30);
		lf.mostrarDetalhes();
		
	

	}

}
