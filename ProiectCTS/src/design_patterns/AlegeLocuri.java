package design_patterns;

import java.util.ArrayList;

public class AlegeLocuri {
	private int nrLocuri;
	private ArrayList<Loc> locuri;
	
	public AlegeLocuri(int nrLocuri) {
		super();
		this.nrLocuri = nrLocuri;
		this.locuri = new ArrayList<Loc>();
		for(int i = 0; i < nrLocuri; i++) {
			locuri.add(new Loc("L" + (i+1)));
		}
	}
	
	public void SelecteazaLoc() {
		System.out.println("Selecteaza locurile: ");
		for(int i = 0; i < nrLocuri; i++) {
			locuri.get(i).alege();
		}
	}
	
	public void ConfirmaLoc() {
		System.out.println("Sistemul confirma locurile: ");
		
		for(int i = 0; i < nrLocuri; i++) {
			locuri.get(i).confirma();
		}
	}
}
