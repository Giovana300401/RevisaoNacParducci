package br.com.revisao;

public class Produto {
	private int peso;
	private int altura;
	
	public Produto() {
		
	}
	
	public Produto(int peso, int altura) {
		this.peso = peso;
		this.altura = altura;
	}

	public int getPeso() {
		return peso;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	public int getAltura() {
		return altura;
	}
	
	public void setAltura(int altura) {
		this.altura = altura;
	}
}
