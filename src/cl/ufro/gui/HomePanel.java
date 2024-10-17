package cl.ufro.gui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class HomePanel extends VistaUsuario {
	private JTextField txtMensaje;

	/**
	 * Create the panel.
	 */
	public HomePanel() {
		


	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void build() {
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 29, 123, 458);
		add(scrollPane);
		
		JPanel panelNombres = new JPanel();
		scrollPane.setViewportView(panelNombres);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(147, 29, 403, 415);
		add(tabbedPane);
		
		JPanel panelTodos = new JPanel();
		tabbedPane.addTab("Todos", null, panelTodos, null);
		
		JPanel panelPrivado = new JPanel();
		tabbedPane.addTab("Privado", null, panelPrivado, null);
		
		JLabel lblMensaje = new JLabel("Mensaje:");
		lblMensaje.setBounds(157, 471, 56, 16);
		add(lblMensaje);
		
		txtMensaje = new JTextField();
		txtMensaje.setBounds(226, 468, 252, 22);
		add(txtMensaje);
		txtMensaje.setColumns(10);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.setBounds(486, 467, 97, 25);
		add(btnEnviar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(525, 13, 97, 25);
		add(btnSalir);
		
	}
}