package app;

import model.Autor;
import model.LivroFisico;

public class TestaCustoEnvio {

	public static void main(String[] args) {
		Autor a = new Autor();
		LivroFisico lf = new LivroFisico(a);
		lf.setNumeroDePaginas(100);
		System.out.println("Custo de envio:"+lf.calcularCustoEnvio());

	}

}
