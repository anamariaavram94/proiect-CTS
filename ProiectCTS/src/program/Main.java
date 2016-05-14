package program;

import design_patterns.Film;
import design_patterns.FilmBuilder;
import design_patterns.Rezervare;
import design_patterns.Singleton_FereastraFilm;

public class Main {

	public static void main(String[] args) {
		
		//SINGLETON
		//Singleton_FereastraFilm S = new Singleton_FereastraFilm();
		//S.setVisible(true);
		
		//BUILDER
		System.out.println("BUILDER******************************");
		
		Film F1 = new Film();
		F1.setNumeFilm("Vecini de cosmar 2");
		F1.setAn(2016);
		F1.setDurata(91);
		F1.setGen("Comedie");
		
		System.out.println(F1.toString());
		
		Film F2 = new Film();
		F2 = new FilmBuilder().setNumeFilm("Cartea Junglei").setGen("Fantastic").build();
		
		System.out.println(F2.toString());
		
		//FACADE
		System.out.println("FACADE*******************************");
		
		Rezervare R = new Rezervare();
		R.rezervaLocuriFilm("Zootropolis", 2016, 108, "Actiune, Animatie, Aventura", 4, "Bucuresti AFI");
	}

}
