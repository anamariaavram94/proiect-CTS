package design_patterns;

import interfete.IStrategy;

public class Rezervare {
	
	public static void rezervaLocuriFilm(String numeFilm, int an, int durata, String gen, IStrategy modPlata, int nrLocuri, String numeCinematograf) {
		Film F = new Film(numeFilm, an, durata, gen, modPlata);
		F.cereRezervare();
		Cinematograf C = new Cinematograf(numeCinematograf);
		C.alegeCinematograf();
		AlegeLocuri AL = new AlegeLocuri(nrLocuri);
		AL.SelecteazaLoc();
		AL.ConfirmaLoc();
		F.rezervareOK();
	}
	
}
