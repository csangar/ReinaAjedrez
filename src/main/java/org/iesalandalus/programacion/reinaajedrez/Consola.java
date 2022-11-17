package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;
import org.iesalandalus.programacion.reinaajedrez.modelo.Posicion;
import org.iesalandalus.programacion.reinaajedrez.modelo.Reina;
import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {
	
	private static void Consola() {
		
	}
	public void mostrarMenu() {
		System.out.println("Menú de opciones disponibles: ");
		System.out.println("Opción 1:Crear reina por defecto");
		System.out.println("Opción 2:Crear reina eligiendo color");
		System.out.println("Opción 3:mover");
		System.out.println("Opción 4:Salir");
	}
	public int elegirOpcionMenu() {
		int opcion=0;
		System.out.println("Introduce el numero de la opcion elegida: ");
		opcion = Entrada.entero();
		return opcion;
	}
	public Color elegirColor() {
		Color color = null;
		int opcion = 0;
		do {
			System.out.println("Los colores dispinibles son: ");
			System.out.println("1: Blanco");
			System.out.println("2: Negro");
			System.out.print("Elige el número del color escogido: ");
			opcion = Entrada.entero();	
		}while(opcion != 1 || opcion !=2);
		if(opcion == 1) {
			return color.BLANCO;
		}if(opcion == 2) {
			return color.NEGRO;
		}
		throw new IllegalArgumentException("Color no válido");
	}
	public void mostrarMenuDirecciones() {
		System.out.println("Menu de direcciones:");
		System.out.println("1: Norte");
		System.out.println("2: Noreste");
		System.out.println("3: Este");
		System.out.println("4: Sureste");
		System.out.println("5: Sur");
		System.out.println("6: Suroeste");
		System.out.println("7: Oeste");
		System.out.println("8: Noroeste");
	}
	public Direccion elegirDireccion() {
		int opcion =0;
		do {
			System.out.print("Intoduce el numero de la direccion deseada: ");
			opcion = Entrada.entero();
		}while(opcion < 1 || opcion>8);
		switch (opcion) {
		case 1: 
			return Direccion.NORTE;
		case 2:
			return Direccion.NORESTE;
		case 3:
			return Direccion.ESTE;
		case 4:
			return Direccion.SURESTE;
		case 5:
			return Direccion.SUR;
		case 6:
			return Direccion.SUROESTE;
		case 7:
			return Direccion.OESTE;
		case 8:
			return Direccion.NOROESTE;
		default:
			throw new IllegalArgumentException("Unexpected value: " + opcion);
		}
	}
	public int elegirPasos() {
		int numPasos =0;
		System.out.print("Intoduce el numero de pasos deseados: ");
		numPasos= Entrada.entero();
		return numPasos;
	}
	public void despedirse() {
		System.out.println("Se acabo la partida");
	}
}
