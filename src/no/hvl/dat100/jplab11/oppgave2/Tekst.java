package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Tekst extends Innlegg {

	// TODO: objektvariable 
	private String tekst;
	
	public Tekst () {
		
	}
	
	public Tekst(int id, String bruker, String dato, String tekst) {
		//throw new UnsupportedOperationException(TODO.constructor("Tekst"));
		super(id, bruker, dato);
		this.tekst = tekst;
	}
	
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		//throw new UnsupportedOperationException(TODO.constructor("Tekst"));
		super(id, bruker, dato, likes);
		this.tekst = tekst;
	}
	
	public String getTekst() {
		//throw new UnsupportedOperationException(TODO.method());
		return tekst;

	}

	public void setTekst(String tekst) {
		//throw new UnsupportedOperationException(TODO.method());
		this.tekst = tekst;
	}

	@Override
	public String toString() {
		//throw new UnsupportedOperationException(TODO.method());
		String str = "TEKST\n" + super.toString() + tekst + "\n";
		return str;

	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
			
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
