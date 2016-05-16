package design_patterns;

import java.util.ArrayList;

import interfete.Observer;
import interfete.Subject;

public class Comanda implements Subject{

	public ArrayList<Observer> lista;
	public int idComanda;
	
	public Comanda() {
		
	}
	
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
	
	public double totalComanda(int nrBileteNormale, int nrBileteElevi, int nrBiletePensionari, int nrBileteStudenti) {
		double total = 0;
		
		if(nrBileteNormale >= 0 && nrBileteElevi >= 0 && nrBiletePensionari >= 0 && nrBileteStudenti >= 0 &&
				(nrBileteNormale + nrBileteElevi + nrBiletePensionari + nrBileteStudenti) <= 30) {
			total = nrBileteNormale * 16 + nrBileteElevi * 14 + nrBiletePensionari * 13 + nrBileteStudenti * 14;
			return total;
		} else { 
			throw new IllegalArgumentException("Nu ati introdus numar de bilete valid!");
		}
	}
	
	public boolean acordareDiscountFete(String gen) {
		if(gen.toLowerCase() == "feminin") {
			return true;
		} else {
			return false;
		}
	}

}
