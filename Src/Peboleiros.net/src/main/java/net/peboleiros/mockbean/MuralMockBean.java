package net.peboleiros.mockbean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import net.peboleiros.mockentitys.MensagemMural;

import org.primefaces.model.chart.CartesianChartModel;
import org.primefaces.model.chart.ChartSeries;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller("muralMockBean")
@Scope("session")
public class MuralMockBean implements Serializable {

	private static final long serialVersionUID = -6642734447578687952L;

	public MuralMockBean(){
		
		MensagemMural mensagemUm = new MensagemMural(1, "Cara o Gildo � muito ruim!", "Paulinho","paulo@gmail.com", new GregorianCalendar(2012,GregorianCalendar.DECEMBER,2,15,22,14));
		MensagemMural mensagemDois = new MensagemMural(2, "queria ver se algu�m � melhor que eu!", "Fenomeno","chicao@gmail.com", new GregorianCalendar(2012,GregorianCalendar.DECEMBER,3,9,20,11));
		MensagemMural mensagemTres = new MensagemMural(3, "visite meu �lbum bit.ly/a2sa2", "Pepe","pepe@gmail.com", new GregorianCalendar(2012,GregorianCalendar.NOVEMBER,21,11,22,13));
		MensagemMural mensagemQuatro = new MensagemMural(4, "muito legal! convidarei meus amigos", "Rapha","r10@gmail.com", new GregorianCalendar(2012,GregorianCalendar.OCTOBER,4,15,22,14));
		MensagemMural mensagemCinco = new MensagemMural(5, "enviando um abra�o pra galera de Mapinguari", "Roger","caxias@hotmail.com", new GregorianCalendar(2012,GregorianCalendar.NOVEMBER,9,15,22,14));
		MensagemMural mensagemSeis = new MensagemMural(6, "� noixx!", "Joca Rox","joqua@hotmail.com", new GregorianCalendar(2012,GregorianCalendar.DECEMBER,02,15,22,14));
		MensagemMural mensagemSete = new MensagemMural(7, "vamos vamos!", "Cobra Cega","jonatas@gmail.com", new GregorianCalendar(2012,GregorianCalendar.DECEMBER,02,15,22,14));
		MensagemMural mensagemOito = new MensagemMural(8, "ei cara, me diz uma coisa...", "John","john.paul@uol.com", new GregorianCalendar(2012,GregorianCalendar.DECEMBER,02,15,22,14));
		MensagemMural mensagemNove = new MensagemMural(9, "n�o v�io, na real voc�...", "Gordito","eder@gmail.com", new GregorianCalendar(2012,GregorianCalendar.DECEMBER,02,15,22,14));
		MensagemMural mensagemDez = new MensagemMural(10, "fala galerinha, vcs est�o sendos testados", "Alvaro","alvaro@gmail.com", new GregorianCalendar(2012,GregorianCalendar.DECEMBER,02,15,22,14));
		
		recadosMural.add(mensagemUm);
		recadosMural.add(mensagemDois);
		recadosMural.add(mensagemTres);
		recadosMural.add(mensagemQuatro);
		recadosMural.add(mensagemCinco);
		recadosMural.add(mensagemSeis);
		recadosMural.add(mensagemSete);
		recadosMural.add(mensagemOito);
		recadosMural.add(mensagemNove);
		recadosMural.add(mensagemDez);
		
		timesResult = new CartesianChartModel();
		
		ChartSeries results = new ChartSeries();
		
		results.setLabel("Resultado");
		results.set("Fluminense", 52);
		results.set("Atl�tico-MG", 52);
		results.set("S�o Paulo", 52);
		results.set("Corinthians", 52);
		
				
		
	}
	
	private List<MensagemMural> recadosMural = new ArrayList<MensagemMural>(10);
	private CartesianChartModel timesResult; 
	
	

	public CartesianChartModel getTimesResult() {
		return timesResult;
	}

	public void setTimesResult(CartesianChartModel timesResult) {
		this.timesResult = timesResult;
	}

	public List<MensagemMural> getRecadosMural() {
		return recadosMural;
	}

	public void setRecadosMural(List<MensagemMural> recadosMural) {
		this.recadosMural = recadosMural;
	}
	
	

}
