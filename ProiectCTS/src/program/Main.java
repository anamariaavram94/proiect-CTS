package program;

import design_patterns.BiletetFactory;
import design_patterns.Card;
import design_patterns.Client;
import design_patterns.Comanda;
import design_patterns.FaraNotificare;
import design_patterns.Film;
import design_patterns.FilmBuilder;
import design_patterns.NotificareEmail;
import design_patterns.NotificareMesaj;
import design_patterns.Rezervare;
import design_patterns.Sala;
import design_patterns.SalaAdaptata;
import design_patterns.Singleton_FereastraFilm;
import design_patterns.TransferBancar;
import interfete.Bilete;
import interfete.Handler;
import interfete.IBilet;
import interfete.IStrategy;

public class Main {

	public static void main(String[] args) {
		
		//SINGLETON
		System.out.println("SINGLETON****************************");
		Singleton_FereastraFilm S = new Singleton_FereastraFilm();
		S.setVisible(true);
		
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
		IStrategy IS = new Card();
		R.rezervaLocuriFilm("Zootropolis", 2016, 108, "Actiune, Animatie, Aventura", IS, 4, "Bucuresti AFI");
		
		//STRATEGY
		System.out.println("STRATEGY*****************************");
		F2.modPlata();
		F1.setModPlata(new TransferBancar());
		F1.modPlata();
		
		//CHAIN OF RESPONSABILITY
		System.out.println("CHAIN OF RESPONSABILITY**************");
		Handler notifica1 = new NotificareMesaj();
		Handler notifica2 = new NotificareEmail();
		Handler notifica3 = new FaraNotificare();
		
		notifica1.setSuccesor(notifica2);
		notifica2.setSuccesor(notifica3);
		
		notifica1.notifica(1);
		
		//OBSERVER
		System.out.println("OBSERVER*****************************");
		Client C1 = new Client("A123");
		Client C2 = new Client("G23");
		Comanda com = new Comanda(145);
		com.addObserver(C1);
		com.addObserver(C2);
		com.inregistrareComanda();
		com.confirmareComanda();
		
		//ADAPTER
		System.out.println("ADAPTER******************************");
		Sala s = new Sala();
		SalaAdaptata sa = new SalaAdaptata(s);
		
		sa.open();
		sa.close();
		
		//FACTORY
		System.out.println("FACTORY*******************************");
		BiletetFactory bf = new BiletetFactory();
		IBilet b = bf.create(Bilete.BiletElev);
		System.out.println(b.alegeBilet());
		
		IBilet b1 = bf.create(Bilete.BiletNormal);
		System.out.println(b1.alegeBilet());
	}

}
