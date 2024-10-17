package cl.ufro.gui;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public abstract class VistaUsuario extends JPanel {

	protected Principal principal;
	
	public VistaUsuario() {
		setBounds(0, 0, Principal.WIDTH, Principal.HEIGHT);
		setLayout(null);
		build();
	}

	public void mostrar() {
		init();
		setVisible(true);		
	}
	public void ocultar() {
		setVisible(false);		
	}
	public abstract void init();
	protected abstract void build();
}