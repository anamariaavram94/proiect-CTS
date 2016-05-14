package design_patterns;

public class Film {
	private String numeFilm;
	private int an;
	private int durata;
	private String gen;
	
	public Film(String numeFilm, int an, int durata, String gen) {
		this.numeFilm = numeFilm;
		this.an = an;
		this.durata = durata;
		this.gen = gen;
	}
	
	public Film() {
		this.numeFilm = "Deadpool";
		this.an = 2016;
		this.durata = 108;
		this.gen = "Actiune, Aventura, Comedie";
	}

	public Film setNumeFilm(String numeFilm) {
		this.numeFilm = numeFilm;
		return this;
	}

	public Film setAn(int an) {
		this.an = an;
		return this;
	}

	public Film setDurata(int durata) {
		this.durata = durata;
		return this;
	}

	public Film setGen(String gen) {
		this.gen = gen;
		return this;
	}
	
	public void cereRezervare() {
		System.out.println("Filmul: " + numeFilm + " a fost selectat!");
	}
	
	public void rezervareOK() {
		System.out.println("Locurile la filmul: " + numeFilm + " au fost rezervat!");
	}
	
	@Override
	public String toString() {
		return "Filmul: " + numeFilm + ", an: " + an + ", durata: " + durata + " minute, gen: " + gen + ".";
	}
	
}
