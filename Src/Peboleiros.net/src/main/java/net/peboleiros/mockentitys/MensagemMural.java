package net.peboleiros.mockentitys;

import java.io.Serializable;
import java.util.Calendar;


public class MensagemMural implements Serializable{
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -9019084537584447768L;
	private Integer idRecado;
	private String mensagem;
	private String nomeAutor;
	private String emailAutor;
	private Calendar dataHoraPublicacao;
	
	public MensagemMural(){}
	
	public MensagemMural(Integer idRecado, String mensagem, String nomeAutor, String emailAutor, Calendar dataHora){
		this.idRecado=idRecado;
		this.mensagem=mensagem;
		this.nomeAutor=nomeAutor;
		this.emailAutor=emailAutor;
		this.dataHoraPublicacao=dataHora;
	}
	
	public Integer getIdRecado() {
		return idRecado;
	}
	public void setIdRecado(Integer idRecado) {
		this.idRecado = idRecado;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public String getNomeAutor() {
		return nomeAutor;
	}
	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}
	public String getEmailAutor() {
		return emailAutor;
	}
	public void setEmailAutor(String emailAutor) {
		this.emailAutor = emailAutor;
	}
	public Calendar getDataHoraPublicacao() {
		return dataHoraPublicacao;
	}
	public void setDataHoraPublicacao(Calendar dataHoraPublicacao) {
		this.dataHoraPublicacao = dataHoraPublicacao;
	}
	
	

}
