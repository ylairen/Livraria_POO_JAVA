package app;

import model.Autor;
import model.Ebook;
import model.LivroFisico;
import model.MiniLivro;
import repository.CarrinhoDeCompras;

public class RegistroDeVendas {
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
	
		l1.mostrarDetalhes();
		ebook.mostrarDetalhes();
	
		cc.adiciona(ebook);
		cc.adiciona(ebook);
		System.out.println(cc.getTotal());
		
		
		
		
	}

}
