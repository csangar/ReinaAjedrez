package org.iesalandalus.programacion.reinaajedrez;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;
import org.iesalandalus.programacion.reinaajedrez.modelo.Posicion;
import org.iesalandalus.programacion.reinaajedrez.modelo.Reina;
import org.iesalandalus.programacion.utilidades.Entrada;

public class Consola {
	
	private static void Consola() {
		
	}
	public static void mostrarMenu() {
		System.out.println("Menú de opciones disponibles: ");
		System.out.println("Opción 1:Crear reina por defecto");
		System.out.println("Opción 2:Crear reina eligiendo color");
		System.out.println("Opción 3:mover");
		System.out.println("Opción 4:Salir");
	}
	public static int elegirOpcionMenu(int opcion2) {
		int opcion=0;
		System.out.println("Introduce el numero de la opcion elegida: ");
		opcion = Entrada.entero();
		return opcion;
	}
	public static Color elegirColor() {
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
	public static void mostrarMenuDirecciones() {
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
	public static Direccion elegirDireccion() {
		int opcion =0;
		Direccion direccion = null;
		do {
			System.out.print("Intoduce el numero de la direccion deseada: ");
			opcion = Entrada.entero();
		}while(opcion < 1 || opcion>8);
		switch (opcion) {
		case 1: 
			direccion= Direccion.NORTE;
		case 2:
			direccion= Direccion.NORESTE;
		case 3:
			direccion= Direccion.ESTE;
		case 4:
			direccion=  Direccion.SURESTE;
		case 5:
			direccion=  Direccion.SUR;
		case 6:
			direccion=  Direccion.SUROESTE;
		case 7:
			direccion=  Direccion.OESTE;
		case 8:
			direccion=  Direccion.NOROESTE;
		}return direccion;
	}
	public static int elegirPasos() {
		int numPasos =0;
		System.out.print("Intoduce el numero de pasos deseados: ");
		numPasos= Entrada.entero();
		return numPasos;
	}
	public static void despedirse() {
		System.out.println("Se acabo la partida , !Hasta la próxima!");
	}
}
