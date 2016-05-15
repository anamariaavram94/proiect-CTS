package design_patterns;

import interfete.ISala;

public class SalaAdaptata implements ISala{
	
	Sala s;

	public SalaAdaptata(Sala s) {
		super();
		this.s = s;
	}

	@Override
	public void open() {
		s.deschide();
	}

	@Override
	public void close() {
		s.inchide();
	}

}
