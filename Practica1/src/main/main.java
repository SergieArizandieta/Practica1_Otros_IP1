package main;

import java.util.Scanner;

import juego.gestionInterna;
import juego.juego;
import juego.reportes;
import juego.resolvedor;

public class main {
	public static Scanner read = new Scanner(System.in);
	
	
	public static void main(String[] args) {
	
            menu();

	}
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
					juego.juego();
					break;
				// Retomar juego
				case 2:
					juego.tablero();
					break;
				// Generar Reportes
				case 3:
					if(juego.posicion<64) {
						System.out.println("Debes terminar la partida en curso");
						
					}else {
						if (juego.Revision == true) {
							System.out.println("Reportes Creados");
							reportes.ReporteMostrar1();
							reportes.ReporteMostrar2();
							juego.Revision = false;
						}else{
							System.out.println("Ya han sido creados");
						}
					}
					
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
				System.out.println("Error de ingreso");
			}
		} while (check == true);
	}
}
