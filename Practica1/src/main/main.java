package main;

import java.util.Scanner;

import juego.gestionInterna;
import juego.juego;
import juego.resolvedor;

public class main {
	public static Scanner read = new Scanner(System.in);

	public static void main(String[] args) {

		
		/*while (1<2) {
			int opcion = 0;
			opcion = Integer.parseInt(read.nextLine());
			gestionInterna.penalizacion();
		}*/
		//menu();
		juego.juego();
		//resolvedor.trigonometria(3);
	}

	// Muestra menu
	public static void menu() {
		int opcion = 0;
		boolean check = true;

		do {
			try {
				System.out.println("\nBinvenido: Menu\n[1]Iniciar Juego\n[2]Retomar Juego\n[3]Generar reporte\n[4]Salir");
				opcion = Integer.parseInt(read.nextLine());

				switch (opcion) {
				// Iniciar Juego
				case 1:
					System.out.println("uno");
					juego.juego();
					break;
				// Retomar juego
				case 2:
					System.out.println("dos");
					break;
				// Generar Reportes
				case 3:
					System.out.println("tres");
					break;
				// Salir
				case 4:
					System.out.println("Gracias por usar");
					System.exit(0);
					break;
				default:
					System.out.println("opcion incorrecta");
				}
			} catch (Exception e) {
				System.out.println("Error " + e);
			}
		} while (check == true);
	}
}
