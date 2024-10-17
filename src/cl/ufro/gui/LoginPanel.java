package cl.ufro.gui;

import javax.swing.JPanel;
import javax.swing.JTextField;

import cl.ufro.bd.Cliente;
import cl.ufro.controller.ClienteController;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginPanel extends VistaUsuario {
	private JTextField txtNombre;

	public LoginPanel() {
		super();
		this.principal = principal;
	}

	@Override
	public void init() {
		txtNombre.setText("");
		
	}

	@Override
	protected void build() {
		txtNombre = new JTextField();
		txtNombre.setBounds(12, 173, 116, 22);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				User user = new User();
				User.setNombre(txtNombre.getText());
				User.setClave(txtNombre.getText());
				
				UserController userController = new UserController();
				user = userController.registrar(user);
				user = userController.identificar(user);
			}
		});
		btnEntrar.setBounds(12, 222, 97, 25);
		add(btnEntrar);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(12, 142, 56, 16);
		add(lblNombre);
		
		
	}
}