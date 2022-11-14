package org.iesalandalus.programacion.reinaajedrez.modelo;

import java.util.Objects;

public class Posicion {

		private int fila;
		private char columna;
		
		public Posicion(int fila, char columna) {
			this.fila = fila;
			this.columna = columna;
		}
		public Posicion(Posicion posicion) {
			setFila(posicion.fila);
			setColumna(posicion.columna);
		}
	
		public int getFila() {
			return fila;
		}
		private void setFila(int fila) {
			this.fila = fila;
		}
		public char getColumna() {
			return columna;
		}
		private void setColumna(char columna) {
			this.columna = columna;
		}
		@Override
		public int hashCode() {
			return Objects.hash(columna, fila);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Posicion other = (Posicion) obj;
			return columna == other.columna && fila == other.fila;
		}
		@Override
		public String toString() {
			return "Posicion [fila=" + fila + ", columna=" + columna + "]";
		}
}
