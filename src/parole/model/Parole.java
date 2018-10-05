package parole.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Parole {
	ArrayList<String> listaParole=new ArrayList<String>();
	public Parole() {
		//TODO
	}
	
	public void addParola(String p) {
		listaParole.add(p);
	}
	
	public List<String> getElenco() {
		Collections.sort(listaParole);
		return null;
	}
	
	public void reset() {
		listaParole.clear();
	}

	@Override
	public String toString() {
		String s="";
		for(int i=0;i<listaParole.size();i++) {
			s+=listaParole.get(i)+"\n";
		}
		return s;
	}

}
