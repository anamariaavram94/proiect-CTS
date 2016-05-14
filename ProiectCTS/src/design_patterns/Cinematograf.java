package design_patterns;

public class Cinematograf {
	public String numeCinematograf;

	public Cinematograf(String numeCinematograf) {
		super();
		this.numeCinematograf = numeCinematograf;
	}
	
	public void alegeCinematograf() {
		System.out.println("Clientul a ales cinematograful: " + numeCinematograf + ".");
	}
}
