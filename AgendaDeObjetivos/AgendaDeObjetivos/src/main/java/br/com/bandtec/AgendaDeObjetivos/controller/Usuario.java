package br.com.bandtec.AgendaDeObjetivos.controller;

public class Usuario {
	
	private String nome;
	private Integer idade;
		
	public Usuario(String nome, Integer idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public Integer getIdade() {
		return idade;
	}
	
	public static boolean isUsuarioValido(Usuario objetoAvaliado) {
		return 	objetoAvaliado.nome != null &&
				objetoAvaliado.idade != null;
	}
	
}
