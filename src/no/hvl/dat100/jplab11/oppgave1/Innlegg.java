package no.hvl.dat100.jplab11.oppgave1;

import no.hvl.dat100.jplab11.common.TODO;

public abstract class Innlegg {
	
	// TODO - deklarering av objektvariable
	private int id;
	private String bruker;
	private String dato;
	private int likes;
	
	public Innlegg() {
		
	}
	
	public Innlegg(int id, String bruker, String dato) {

		// TODO 
		//throw new UnsupportedOperationException(TODO.constructor("Innlegg"));
		this.likes = 0;
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		
	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		// TODO - START		
		//throw new UnsupportedOperationException(TODO.constructor("Innlegg"));
		this.likes = likes;
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
	}
	
	public String getBruker() {
		
		//throw new UnsupportedOperationException(TODO.method());
		return bruker;

	}

	public void setBruker(String bruker) {
		//throw new UnsupportedOperationException(TODO.method());
		this.bruker = bruker;
	}

	public String getDato() {
		//throw new UnsupportedOperationException(TODO.method());
		return dato;
		
	}

	public void setDato(String dato) {
		//throw new UnsupportedOperationException(TODO.method());
		this.dato = dato;
	}

	public int getId() {
		//throw new UnsupportedOperationException(TODO.method());
		return id;

	}

	public int getLikes() {
		//throw new UnsupportedOperationException(TODO.method());
		return likes;

	}
	
	public void doLike () {
		//throw new UnsupportedOperationException(TODO.method());
		this.likes += 1;
	}
	
	public boolean erLik(Innlegg innlegg) {
		/* Implementer metoden public boolean erLik(Innlegg innlegg) 
		 * som returnerer true hvis og kun hvis innlegget har samme 
		 * id som innlegget innlegg git med som parameter.*/
		//throw new UnsupportedOperationException(TODO.method());
		boolean erlik = false;
		
		if (getId() == innlegg.getId()) {
			erlik = true;
		}
		
		return erlik;
		

	}
	
	@Override
	public String toString() {
		
		//throw new UnsupportedOperationException(TODO.method());
		//"1\nOle Olsen\n23-10\n7\n"
		//id\nbruker\ndato\nlikes\n
		String s = "" + id +"\n" + 
					bruker + "\n" + 
					dato + "\n" + likes + 
					"\n";
		return s;
		
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
