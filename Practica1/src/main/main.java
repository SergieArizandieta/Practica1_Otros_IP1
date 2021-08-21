package main;

import java.util.Scanner;
import juego.juego;

public class main {
	public static Scanner read = new Scanner(System.in);

	public static void main(String[] args) {

		//menu();
		juego.juego();
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
