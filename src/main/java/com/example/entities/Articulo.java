package com.example.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="Articulos")
public class Articulo {
	
	@Id
	private String cod;
    
	private String nombre;
    private String descripcion;
    private int cantidad;
    
    public Articulo() {}

	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String desc) {
		this.descripcion = desc;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Articulo [cod=" + cod + ", nombre=" + nombre + ", descripcion=" + descripcion + ", cantidad=" + cantidad
				+ "]";
	}
	
	

}
