package net.peboleiros.mockbean;

import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;


@Controller("meusDadosMockBean")
@Scope("session")
public class MeusDadosMockBean implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8805006313881393131L;
	private Calendar dataNascimento = new GregorianCalendar(1990,9,25);

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}	
	
	

}
