package design_patterns;

import interfete.IStrategy;

public class Film {
	private String numeFilm;
	private int an;
	private int durata;
	private String gen;
	public IStrategy modPlata;
	
	public Film(String numeFilm, int an, int durata, String gen, IStrategy modPlata) {
		this.numeFilm = numeFilm;
		this.an = an;
		this.durata = durata;
		this.gen = gen;
		this.modPlata = modPlata;
	}
	
	public Film() {
		this.numeFilm = "Deadpool";
		this.an = 2016;
		this.durata = 108;
		this.gen = "Actiune, Aventura, Comedie";
		this.modPlata = new Cash();
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
	
	public void setModPlata(IStrategy modPlata) {
		this.modPlata = modPlata;
	}
	
	public void modPlata() {
		modPlata.execute();
	}

	public void cereRezervare() {
		System.out.println("Filmul: " + numeFilm + " a fost selectat!");
	}
	
	public void rezervareOK() {
		System.out.println("Locurile la filmul: " + numeFilm + " au fost rezervate!");
	}
	
	public double calculNota(double notaScenariu, double notaCalitateImagine, double notaPoveste) {
		double notaFinala = notaScenariu * 0.3 + notaCalitateImagine * 0.3 + notaPoveste * 0.4;
		return notaFinala;
	}
	
	@Override
	public String toString() {
		return "Filmul: " + numeFilm + ", an: " + an + ", durata: " + durata + " minute, gen: " + gen + ", stil plata: " + ".";
	}
	
}
