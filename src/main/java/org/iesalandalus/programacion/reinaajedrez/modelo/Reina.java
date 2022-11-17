package org.iesalandalus.programacion.reinaajedrez.modelo;

import javax.naming.OperationNotSupportedException;

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
	public void mover(Direccion direccion, int pasos) throws OperationNotSupportedException {
		if(direccion==null) {
			throw new NullPointerException("ERROR: La dirección no puede ser nula.");
		}
		if(pasos<1 || pasos>7) {
			throw new IllegalArgumentException("ERROR: El número de pasos debe estar comprendido entre 1 y 7.");
		}
			try {
			switch(direccion) {
			case NORTE:
				setPosicion(new Posicion(posicion.getFila() + pasos, posicion.getColumna()));
				break;
			case NORESTE:
				setPosicion(new Posicion(posicion.getFila() + pasos,(char)(posicion.getColumna() +pasos)));
				break;
			case ESTE:
				setPosicion(new Posicion(posicion.getFila(), (char)(posicion.getColumna() +pasos)));
				break;
			case SURESTE:
				setPosicion(new Posicion(posicion.getFila()-pasos, (char)(posicion.getColumna() +pasos)));
				break;
			case SUR:
				setPosicion(new Posicion(posicion.getFila()-pasos, posicion.getColumna()));
				break;
			case SUROESTE:
				setPosicion(new Posicion(posicion.getFila()-pasos, (char)(posicion.getColumna() -pasos)));
				break;
			case OESTE:
				setPosicion(new Posicion(posicion.getFila(),(char)(posicion.getColumna() -pasos)));
				break;
			case NOROESTE:
				setPosicion(new Posicion(posicion.getFila()+pasos, (char)(posicion.getColumna() -pasos)));
				break;
				}
			}catch (IllegalArgumentException e) {
				throw new OperationNotSupportedException("ERROR: Movimiento no válido (se sale del tablero).");
			}
			
	}
	@Override
	public String toString() {
		return "color=" + color + ", posicion=(" + posicion+")" ;
	}
	
}
