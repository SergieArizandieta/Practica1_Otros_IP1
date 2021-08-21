package juego;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class juego {
	public static Scanner read = new Scanner(System.in);
	static String[][] tablero = new String[8][8];
	public static ThreadLocalRandom tlr = ThreadLocalRandom.current();

	static int posicion = 0;
	// filas vs columnas

	public static void juego() {
		System.out.println("Bienvenido a Escaleras Matemáticas");
		gestionInterna.inicializandoGeneral();
		gestionInterna.inicializandoPenalizaciones();
		
		
		tablero();
	
	}

	public static void tablero() {
		//Looktablero();
		mostrar_tablero();
		menu();
	}

	public static void Looktablero() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print("|" + tablero[i][j] + "|\t");
			}
			System.out.println("\t");
		}
	}

	public static void menu() {
		String opcion = "";
		boolean check = true;

		do {
			try {

				System.out.println("\n[X]Tira Dado\n[P]Pausar jeugo");
				opcion = read.nextLine().toLowerCase();

				switch (opcion) {
				// Iniciar Juego
				case "x":
					tirar_dados();
					check = false;
					tablero();
					break;
				// Retomar juego
				case "p":

					check = false;
					break;
				default:
					System.out.println("opcion incorrecta");
				}
			} catch (Exception e) {
				System.out.println("Error " + e);
			}
		} while (check == true);
	}

	public static void mostrar_tablero() {
		String TempDato[] = null;
		String TempEspacio = "";
		System.out.println("\nTablero");
		for (int i = 0; i < 8; i++) {
			System.out.println("--------------------------------------------------------------------");
			for (int j = 0; j < 8; j++) {
				TempDato = tablero[i][j].split(",");
				TempEspacio = TempDato[0];
				System.out.print("|\t" + TempEspacio + " |");
			}
			System.out.println("");
			for (int j = 0; j < 8; j++) {
				System.out.print("|\t" + gestionInterna.espaciado(tablero[i][j]) + "|");
			}
			System.out.println("\t");
		}
		System.out.println("--------------------------------------------------------------------");

	}

	public static void tirar_dados() {

		int dado = tlr.nextInt(2, 6 + 1);
		System.out.println("Se tiro el dado!! y salio...: " + dado);
		posicion += dado;
		gestionInterna.Buscar();
	}

	
	

}
