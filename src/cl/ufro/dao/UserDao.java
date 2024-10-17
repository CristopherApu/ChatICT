package cl.ufro.dao;

import java.util.ArrayList;
import java.util.List;


import cl.ufro.bd.User;
import utils.ObjetoBd;
import utils.ObjetoDao;

public class UserDao extends ObjetoDao{

	public User find(User user) {
		return (User)super.find(user);
	}
	public List<User> listar(){
		List<User> nueva = new ArrayList<User>();
		List<ObjetoBd> lista = listAll();
		for(int i=0;i<lista.size();i++)
			nueva.add((User)lista.get(i));
		return nueva;
	}
	
	public void agregar(User user) {
		add(user);
	}
	public void remover(User user) {
		remove(user);
	}
}