package cl.ufro.service;
import cl.ufro.bd.Mensaje;
import cl.ufro.dao.MsjDao;

public class MsjService {

	private MsjDao msjDao = new MsjDao();

	public void agregar(Mensaje mensaje) {
		msjDao.agregar(mensaje);		
	}

	public Object listar() {
		return msjDao.listar();
	}


}