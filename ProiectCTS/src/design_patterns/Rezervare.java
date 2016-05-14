package design_patterns;

public class Rezervare {
	
	public static void rezervaLocuriFilm(String numeFilm, int an, int durata, String gen, int nrLocuri, String numeCinematograf) {
		Film F = new Film(numeFilm, an, durata, gen);
		F.cereRezervare();
		Cinematograf C = new Cinematograf(numeCinematograf);
		C.alegeCinematograf();
		AlegeLocuri AL = new AlegeLocuri(nrLocuri);
		AL.SelecteazaLoc();
		AL.ConfirmaLoc();
		F.rezervareOK();
	}
	
}
