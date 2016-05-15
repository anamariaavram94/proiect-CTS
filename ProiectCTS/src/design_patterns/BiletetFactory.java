package design_patterns;

import interfete.Bilete;
import interfete.IBilet;

public class BiletetFactory {

	public IBilet create (Bilete tip) {
		switch(tip) {
			case BiletElev:
				return new BiletElev();
			case BiletNormal:
				return new BiletNormal();
			case BiletPensionar:
				return new BiletPensionar();
			case BiletStudent:
				return new BiletStudent();
		}
		return null;
	}
	
}
