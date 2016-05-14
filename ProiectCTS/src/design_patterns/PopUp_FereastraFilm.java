package design_patterns;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class PopUp_FereastraFilm extends JFrame{
	private static PopUp_FereastraFilm instance = null;
	
	private PopUp_FereastraFilm() {
		super("PopUp");
		this.setSize(300, 200);
		
		String premiera = "05/18/2016";
		DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		Date dataPremiera;
		Calendar date1 = new GregorianCalendar();
		Calendar date2 = new GregorianCalendar();
		
		try {
			dataPremiera = df.parse(premiera);
			date1.setTime(dataPremiera);
			date2.setTime(new Date());
			
			long rez = ((date1.getTime().getTime() - date2.getTime().getTime()) / (1000 * 60 * 60 * 24));
		
			JLabel label = new JLabel("Au mai ramas " + String.valueOf(rez) + " zile pana la premiera filmului!");
			label.setBounds(10, 10, 200, 100);
			this.add(label);
			System.out.println(rez);
			
			this.setVisible(true);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static PopUp_FereastraFilm getInstance() {
		if(instance == null) {
			instance = new PopUp_FereastraFilm();
		}
		return instance;
	}
}
