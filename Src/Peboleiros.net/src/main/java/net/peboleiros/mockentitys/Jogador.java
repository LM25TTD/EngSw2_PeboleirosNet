package net.peboleiros.mockentitys;

import java.io.Serializable;

public class Jogador implements Serializable {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8934226387456510975L;
	private String nome;
	private int camisa;
	private String foto;
	
	public Jogador() {
		
	}
	
	public Jogador(String nome, int camisa, String foto) {
		this.nome=nome;
		this.camisa=camisa;
		this.foto=foto;				
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCamisa() {
		return camisa;
	}
	public void setCamisa(int camisa) {
		this.camisa = camisa;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	
	

}
