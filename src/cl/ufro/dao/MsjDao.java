package cl.ufro.dao;

import java.util.ArrayList;
import java.util.List;

import cl.ufro.bd.Mensaje;
import utils.ObjetoBd;
import utils.ObjetoDao;

public class MsjDao extends ObjetoDao{

	public Mensaje find(Mensaje mensaje) {
		return (Mensaje)super.find(mensaje);
	}
	public List<Mensaje> listar(){
		List<Mensaje> nueva = new ArrayList<Mensaje>();
		List<ObjetoBd> lista = listAll();
		for(int i=0;i<lista.size();i++)
			nueva.add((Mensaje)lista.get(i));
		return nueva;
	}
	
	//incremental
	private int getLast() {
		int last = 0;
		List<Mensaje> lista = listar();
		for(int i=0;i<lista.size();i++)
			if(last < lista.get(i).getIdMsj())
				last = lista.get(i).getIdMsj();
		return last;
	}
	
	
	public void agregar(Mensaje mensaje) {
		mensaje.setIdMsj(getLast()+1);
		add(mensaje);
	}
	
}