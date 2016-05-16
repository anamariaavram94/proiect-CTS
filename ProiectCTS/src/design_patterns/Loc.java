package design_patterns;

public class Loc {
	private int numarLoc;
	
	public Loc() {
		
	}

	public Loc(int numarLoc) {
		super();
		this.numarLoc = numarLoc;
	}
	
	public int locuriSala[];
	public boolean disponibilitateLoc(int nrLoc, int locuriSala[]) {
		if(nrLoc > 0 || nrLoc > 30) {
			if(locuriSala[nrLoc] == 1) {
				return false;
			} else {
				locuriSala[nrLoc] = 1;
				return true;
			}
		} else {
			throw new IllegalArgumentException("Numarul locului este invalid!");
		}
	}
	
	public void alege() {
		System.out.println("	Clientul alege locul: " + numarLoc + ".");
	}
	
	public void confirma() {
		System.out.println("	Sistemul confirma locul: " + numarLoc + ".");
	}
}
