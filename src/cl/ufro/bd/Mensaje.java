package cl.ufro.bd;

import java.io.Serializable;

import utils.ObjetoBd;

public class Mensaje extends ObjetoBd implements Serializable{
	
	private int idMsj;
	private String mensaje = "";
	private User origen;
	private User destino;
	public int getIdMsj() {
		return idMsj;
	}
	public void setIdMsj(int idMsj) {
		this.idMsj = idMsj;
	}
		
}