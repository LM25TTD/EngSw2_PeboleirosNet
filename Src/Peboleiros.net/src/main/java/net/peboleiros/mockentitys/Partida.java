package net.peboleiros.mockentitys;

import java.io.Serializable;

public class Partida implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5508848985505260874L;
	private String nomePartida;
	private String resultado;
	private String local;
	
	public Partida(){}
	
	public Partida(String nomePartida, String resultado, String local){
		this.nomePartida=nomePartida;
		this.resultado=resultado;
		this.local=local;
	}
	
	public String getNomePartida() {
		return nomePartida;
	}
	public void setNomePartida(String nomePartida) {
		this.nomePartida = nomePartida;
	}
	public String getResultado() {
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	
	
	
}
