package design_patterns;

import interfete.IStrategy;

public class Cash implements IStrategy{

	@Override
	public void execute() {
		System.out.println("Clientul plateste cash!");
	}

}
