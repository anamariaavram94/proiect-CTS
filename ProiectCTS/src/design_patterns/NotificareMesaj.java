package design_patterns;

import interfete.Handler;

public class NotificareMesaj extends Handler{

	@Override
	public void notifica(int nrTrimiteri) {
		int nr = nrTrimiteri + nrTrimiteri;
		
		if(nr < 3) {
			System.out.println("Clientul a fost notificat prin mesaj pe telefon!");
		} else {
			succesor.notifica(nrTrimiteri);
		}
	}

}
