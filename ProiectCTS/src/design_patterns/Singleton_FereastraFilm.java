package design_patterns;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Singleton_FereastraFilm extends JFrame implements ActionListener{

	public Singleton_FereastraFilm() {
		super("Premiera filmului 'Vecini de cosmar 2'");
		this.setSize(400, 300);
		
		JButton button = new JButton("Click aici pentru a afla cat timp a mai ramas pana la premiera!");
		button.setBounds(10, 10, 150, 20);
		button.addActionListener(this);
		this.add(button);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		PopUp_FereastraFilm P = PopUp_FereastraFilm.getInstance();
		P.setVisible(true);
	}

}
