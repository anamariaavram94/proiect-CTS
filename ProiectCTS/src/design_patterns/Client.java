package design_patterns;

import interfete.Observer;

public class Client implements Observer{
	
	private String codClient;

	public Client(String codClient) {
		super();
		this.codClient = codClient;
	}

	@Override
	public void update(String mesaj) {
		System.out.println("Clientul " + codClient + " a fost instiintat ca " + mesaj);
	}

}
