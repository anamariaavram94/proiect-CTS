package design_patterns;

import interfete.IFilmBuilder;

public class FilmBuilder implements IFilmBuilder{

	private String numeFilm;
	private int an;
	private int durata;
	private String gen;
	
	
	
	public FilmBuilder(String numeFilm, int an, int durata, String gen) {
		this.numeFilm = numeFilm;
		this.an = an;
		this.durata = durata;
		this.gen = gen;
	}

	public FilmBuilder() {
		this.numeFilm = "Deadpool";
		this.an = 2016;
		this.durata = 108;
		this.gen = "Actiune, Aventura, Comedie";
	}

	public FilmBuilder setNumeFilm(String numeFilm) {
		this.numeFilm = numeFilm;
		return this;
	}



	public FilmBuilder setAn(int an) {
		this.an = an;
		return this;
	}



	public FilmBuilder setDurata(int durata) {
		this.durata = durata;
		return this;
	}



	public FilmBuilder setGen(String gen) {
		this.gen = gen;
		return this;
	}

	@Override
	public Film build() {
		return new Film(this.numeFilm, this.an, this.durata, this.gen);
	}

}
