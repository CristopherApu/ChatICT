package cl.ufro.service;
import cl.ufro.bd.User;
import cl.ufro.dao.UserDao;

public class UserService {

	private UserDao userDao = new UserDao();

	public void agregar(User item) {
		userDao.agregar(item);		
	}

	public Object listar() {
		return userDao.listar();
	}

	public void borrar(User item) {
		userDao.remove(item);	
	}
}