package design_patterns;

import java.util.ArrayList;

import interfete.Observer;
import interfete.Subject;

public class Comanda implements Subject{

	public ArrayList<Observer> lista;
	public int idComanda;
	
	public Comanda(int idComanda) {
		this.idComanda = idComanda;
		this.lista = new ArrayList<Observer>();
	}

	@Override
	public void addObserver(Observer o) {
		lista.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		lista.remove(o);
	}

	@Override
	public void notifica(String mesaj) {
		for(Observer o: lista) {
			o.update(mesaj);
		}
	}
	
	public void inregistrareComanda() {
		notifica("Comanda numarul " + idComanda + " a fost inregistrata!");
	}
	
	public void confirmareComanda() {
		notifica("Comanda numarul " + idComanda + " a fost confirmata! Va asteptam la film!");
	}

}
