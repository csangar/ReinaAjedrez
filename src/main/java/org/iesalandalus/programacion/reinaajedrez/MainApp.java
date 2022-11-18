package org.iesalandalus.programacion.reinaajedrez;

import javax.naming.OperationNotSupportedException;

import org.iesalandalus.programacion.reinaajedrez.modelo.Color;
import org.iesalandalus.programacion.reinaajedrez.modelo.Direccion;
import org.iesalandalus.programacion.reinaajedrez.modelo.Posicion;
import org.iesalandalus.programacion.reinaajedrez.modelo.Reina;
import org.iesalandalus.programacion.utilidades.Entrada;

public class MainApp {
	
	private static Reina reina;
	
	public static void main(String[] args) throws OperationNotSupportedException {
		int opcion =0;
		do {
			Consola.mostrarMenu();
			System.out.print("Introduce el numero de la opcion que quieres realizar: ");
			opcion = Entrada.entero();
			switch(opcion) {
			case 1:
				crearReinaDefecto();
				mostrarReina();
				break;
			case 2:
				ReinaColor();
				mostrarReina();
				break;
			case 3:
				mover();
				mostrarReina();
				break;
			case 4:
				Consola.despedirse();
			}
		}while(opcion !=4);
	}
	private void ejecutarOpcion(int opcion) {
		Consola.elegirOpcionMenu(opcion);
	}
	private static void crearReinaDefecto() {
		reina = new Reina();
	}
	private static void ReinaColor(){
		Color color=null;
		int opcion = 0;
		System.out.println("Colores disponibles: ");
		System.out.println("1: Blanco");
		System.out.println("2: Negro");
		System.out.print("Indica el numero del color deseado: ");
		opcion = Entrada.entero();
		if(opcion ==1) {
			color = color.BLANCO;
		}
		else {
			color = Color.NEGRO;
		}
		reina = new Reina(color);
		System.out.println(reina);
	}
	private static void mover() throws OperationNotSupportedException {
		Consola.mostrarMenuDirecciones();
		Direccion direccion=Consola.elegirDireccion();
		int pasos =Consola.elegirPasos();
		try{
			if(reina!=null) {
			reina.mover(direccion, pasos);
				}
		}catch(IllegalArgumentException|OperationNotSupportedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("No existe ninguna reina que pueda moverse");
		}

	private static void mostrarReina() {
			System.out.println(reina);
	}
}
