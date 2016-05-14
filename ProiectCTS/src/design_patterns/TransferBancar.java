package design_patterns;

import interfete.IStrategy;

public class TransferBancar implements IStrategy{

	@Override
	public void execute() {
		System.out.println("Clientul plateste prin transfer bancar!");
	}

}
