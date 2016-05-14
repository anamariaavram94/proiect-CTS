package design_patterns;

import interfete.IFilmBuilder;
import interfete.IStrategy;

public class FilmBuilder implements IFilmBuilder{

	private String numeFilm;
	private int an;
	private int durata;
	private String gen;
	private IStrategy modPlata;
	
	
	public FilmBuilder(String numeFilm, int an, int durata, String gen, IStrategy modPlata) {
		this.numeFilm = numeFilm;
		this.an = an;
		this.durata = durata;
		this.gen = gen;
		this.modPlata = modPlata;
	}

	public FilmBuilder() {
		this.numeFilm = "Deadpool";
		this.an = 2016;
		this.durata = 108;
		this.gen = "Actiune, Aventura, Comedie";
		this.modPlata = new Cash();
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

	public FilmBuilder setModPlata(IStrategy modPlata) {
		this.modPlata = modPlata;
		return this;
	}

	@Override
	public Film build() {
		return new Film(this.numeFilm, this.an, this.durata, this.gen, this.modPlata);
	}

}
