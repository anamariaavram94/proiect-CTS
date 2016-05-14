package design_patterns;

public class Loc {
	private String numarLoc;

	public Loc(String numarLoc) {
		super();
		this.numarLoc = numarLoc;
	}
	
	public void alege() {
		System.out.println("	Clientul alege locul: " + numarLoc + ".");
	}
	
	public void confirma() {
		System.out.println("	Sistemul confirma locul: " + numarLoc + ".");
	}
}
