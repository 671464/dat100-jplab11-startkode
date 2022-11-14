package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	private Innlegg[] innleggtabell;
	private int nesteledig;

	public Blogg() {
		innleggtabell = new Innlegg[20];
		nesteledig = 0;
	}

	public Blogg(int lengde) {
		innleggtabell = new Innlegg[lengde];
		nesteledig = 0;
	}

	public int getAntall() {
		return nesteledig;
	}
	
	public Innlegg[] getSamling() {
		return innleggtabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		boolean funnet = false;
		int pos = 0;
		while (pos<nesteledig && !funnet) {
			if (innleggtabell[pos].getId() == innlegg.getId()) {
				funnet = true;
			} else {
				pos++;
			}		
		}
		if (funnet) {
			return pos;
		} else {
			return -1;
		}
		
	}

	public boolean finnes(Innlegg innlegg) {
		//3f
		int id = finnInnlegg(innlegg);
		if (id != -1) //id funnet
			return true;
		else 
			return false;
		//throw new UnsupportedOperationException(TODO.method());
	}

	public boolean ledigPlass() {
		//throw new UnsupportedOperationException(TODO.method());
		//3d, returner true om der er ledig plass. false ellers
		
		if(nesteledig < innleggtabell.length)
			return true;
		else
			return false;
	}
	
	public boolean leggTil(Innlegg innlegg) {

		boolean ny = finnInnlegg(innlegg) == -1;
		if (ny && nesteledig < innleggtabell.length) {
			innleggtabell[nesteledig] = innlegg;
			nesteledig ++;
			return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		//throw new UnsupportedOperationException(TODO.method());
		String str = "";
		str = getAntall() + "\n";
		for (int i=0; i<getAntall(); i++) {
			str += innleggtabell[i].toString();
		}
		return str;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}