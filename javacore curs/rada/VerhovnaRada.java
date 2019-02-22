package rada;

import java.io.BufferedReader;
import java.util.List;

public class VerhovnaRada {

	public List<Faction> factions;

	
	public VerhovnaRada() {
	}


	public VerhovnaRada(List<Faction> factions) {
		this.factions = factions;
	}


	public List<Faction> getFactions() {
		return factions;
	}


	public void setFactions(List<Faction> factions) {
		this.factions = factions;
	}

	@Override
	public String toString() {
		return "VerhovnaRada [factions=" + factions + "]";
	}
	
	
	
	
}
