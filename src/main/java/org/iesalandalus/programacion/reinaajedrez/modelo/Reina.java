package org.iesalandalus.programacion.reinaajedrez.modelo;

public class Reina {
	Posicion posicion;
	Color color;
	Direccion direccion;
	
	public Reina() {
		setColor(color.BLANCO);
	}
	public Reina(Color color) {
		if(color == null ) {
			throw new NullPointerException("ERROR: El color no puede ser nulo.");
		}
		setColor(color);
	}
	public Posicion getPosicion() {
		return posicion;
	}
	private void setPosicion(Posicion posicion) {
		this.posicion = posicion;
	}
	public Color getColor() {
		return color;
	}
	private void setColor(Color color) {
		this.color = color;
		if(color == color.BLANCO) {
			posicion = new Posicion(1,'d');
		}
		if(color == color.NEGRO) {
			posicion = new Posicion(8,'d');
		}
	}
	public void mover(Direccion direccion, int pasos) {
		if(direccion==null) {
			throw new IllegalArgumentException("ERROR: Fila no válida.");
		}
	}
	@Override
	public String toString() {
		return "color=" + color + ", posicion=(" + posicion+")" ;
	}
	
}
