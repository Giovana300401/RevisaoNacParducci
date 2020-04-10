package br.com.revisao.teste;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.revisao.Calculadora;

class CalculadoraTeste {
	
	private static Calculadora calc;
	private static int n1;
	private static int n2;
	
	
	
	@BeforeAll
	static void inicializar() {
		int n1 = 5;
		int n2 = 5;
		calc = new Calculadora();
		
	}
	
	
	@Test
	@DisplayName("Testar o método de somar com sucesso")	
	void somarComSucessoTeste() {
	assertEquals(0, calc.somar(n1, n2));	
	}
	
	@Test
	@DisplayName("Testar o método de subtrair com sucesso")
	void subtrairComSucessoTeste() {
	assertEquals(0, calc.subtrair(n1, n2));
	}
	
	@Test
	@DisplayName("Testar o método de multiplicar com sucesso")
	void multiplicarComSucessoTeste(){
		//Assert
		assertEquals(25, calc.multiplicar(n1, n2));
		}

	@Test
	@DisplayName("Testar o método de dividir com sucesso")
	void dividirComSucessoTeste() {
		//Assert
		assertEquals(25,calc.dividir(n1, n2));
	}


}
