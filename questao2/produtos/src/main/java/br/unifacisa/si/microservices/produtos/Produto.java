package br.unifacisa.si.microservices.produtos;

public class Produto {
	
	private String nome;
	
	private Integer valor;

	public Produto(String nome, Integer valor) {
		this.nome = nome;
		this.valor = valor;
	}
	public Produto() {
		
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor(Integer valor) {
		this.valor = valor;
	}
	
	

}
