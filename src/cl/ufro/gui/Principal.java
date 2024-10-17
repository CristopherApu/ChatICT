package cl.ufro.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import cl.ufro.gui.VistaUsuario;
import cl.ufro.gui.LoginPanel;
import utils.Config;

public class Principal extends JFrame {

	private JPanel contentPane;

	public static final int WIDTH = 700;
	public static final int HEIGHT = 500;
	
	private List<VistaUsuario> vistas = new ArrayList<VistaUsuario>();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		Config.load();
		Principal frame = new Principal();
		frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, WIDTH, HEIGHT);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		vistas.add(new LoginPanel());
	}
	
	public void verVistaUsuario(Class<?> tipoVistaUsuario) {
		for(int i=0;i<vistas.size();i++) {
			VistaUsuario vistaUsuario = vistas.get(i);
			if(tipoVistaUsuario == vistaUsuario.getClass())
				vistaUsuario.mostrar();
			else
				vistaUsuario.ocultar();
		}
	}

}