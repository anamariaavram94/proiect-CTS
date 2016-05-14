package design_patterns;

import interfete.IStrategy;

public class Card implements IStrategy{

	@Override
	public void execute() {
		System.out.println("Clientul plateste cu cardul!");
	}
	
}
