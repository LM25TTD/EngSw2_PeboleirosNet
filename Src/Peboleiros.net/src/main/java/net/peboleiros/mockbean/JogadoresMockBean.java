package net.peboleiros.mockbean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import net.peboleiros.mockentitys.Jogador;

import org.primefaces.event.DragDropEvent;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller("jogadoresMockBean")
@Scope("session")
public class JogadoresMockBean implements Serializable{
	
	
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = -3885838535362791889L;

	private List<Jogador> players;

	    private List<Jogador> selectedPlayers;

	    public JogadoresMockBean() {
	        players = new ArrayList<Jogador>();
	        selectedPlayers = new ArrayList<Jogador>();

	        players.add(new Jogador("Messi", 10, "messi.jpg"));
	        players.add(new Jogador("Villa", 7, "villa.jpg"));
	        players.add(new Jogador("Pedro", 17, "pedro.jpg"));
	        players.add(new Jogador("Bojan", 9, "bojan.jpg"));
	        players.add(new Jogador("Xavi", 6, "xavi.jpg"));
	        players.add(new Jogador("Iniesta", 8, "iniesta.jpg"));
	        players.add(new Jogador("Mascherano", 16, "mascherano.jpg"));
	        players.add(new Jogador("Puyol", 5, "puyol.jpg"));
	        players.add(new Jogador("Alves", 2, "alves.jpg"));
	        players.add(new Jogador("Valdes", 1, "valdes.jpg"));
	        players.add(new Jogador("Abidal", 22, "abidal.jpg"));
	        players.add(new Jogador("Adriano", 16, "adriano.jpg"));
	        players.add(new Jogador("Pinto", 13, "pinto.jpg"));
	        players.add(new Jogador("Pique", 3, "pique.jpg"));
	        players.add(new Jogador("Keita", 7, "keita.jpg"));
	        players.add(new Jogador("Maxwell", 5, "maxwell.jpg"));
	    }

	    public List<Jogador> getPlayers() {
	        return players;
	    }

	    public List<Jogador> getSelectedPlayers() {
	        return selectedPlayers;
	    }

	    public void onDrop(DragDropEvent event) {
	        Jogador player = (Jogador) event.getData();

	        selectedPlayers.add(player);

	        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(player.getNome() + " adicionado"));
	    }

	

}
