package design_patterns;

import interfete.Handler;

public class FaraNotificare extends Handler{

	@Override
	public void notifica(int nrTrimiteri) {
		int nr = nrTrimiteri + nrTrimiteri;
		
		if(nr > 5) {
			System.out.println("Clientul nu a fost notificat!");
		} else {
			succesor.notifica(nrTrimiteri);
		}
	}

}
