package cl.ufro.bd;

import java.io.Serializable;

import utils.ObjetoBd;

public class User extends ObjetoBd implements Serializable{
	private String nombre = "";
	
	
	public User() {
		addToPrimaryKey("nombre");	
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	} 

	
}