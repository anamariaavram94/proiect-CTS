package design_patterns;

import interfete.Handler;

public class NotificareEmail extends Handler{

	@Override
	public void notifica(int nrTrimiteri) {
		int nr = nrTrimiteri + nrTrimiteri;
		
		if(nr < 5) {
			System.out.println("Clientul a fost notificat prin email!");
		} else {
			succesor.notifica(nrTrimiteri);
		}
	}

}
