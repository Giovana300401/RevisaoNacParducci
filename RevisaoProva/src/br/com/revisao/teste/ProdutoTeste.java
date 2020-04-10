package br.com.revisao.teste;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import br.com.revisao.Produto;

class ProdutoTeste {
	
	private static Produto prod;
	
	@BeforeAll
	static void inicializacao() {
		prod = new Produto();
	}
	
	@Test
	void PesoComSucessoTeste() {
		//Act
		prod.setPeso(20);
		//Assert
		assertEquals(20, prod.getPeso());
	}
	
	@Test
	void testeAlturaComSucesso() {
		//Act
		prod.setAltura(160);
		//Assert
		assertEquals(160, prod.getAltura());
	}
}
