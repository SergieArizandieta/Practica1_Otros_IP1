package juego;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class juego {
	public static Scanner read = new Scanner(System.in);
	static String[][] tablero = new String[8][8];
	public static ThreadLocalRandom tlr = ThreadLocalRandom.current();

	static int posicon = 0;
	// filas vs columnas

	public static void juego() {
		System.out.println("Bienvenido a Escaleras Matemáticas");
		inicializandoGeneral();
		gestionInterna.inicializandoPenalizaciones();
		
		//Looktablero();
		tablero();
	
	}

	public static void tablero() {
	
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
				System.out.print("|\t" + espaciado(tablero[i][j]) + "|");
			}
			System.out.println("\t");
		}
		System.out.println("--------------------------------------------------------------------");

	}

	public static String espaciado(String dato) {
		String EspaciadosT[] = null;
		String espaciado = "";

		EspaciadosT = dato.split(",");

		int cantidad = EspaciadosT.length;

		for (int i = 0; i < EspaciadosT[0].length() + 1; i++) {
			espaciado += " ";
		}

		if (cantidad == 2 && EspaciadosT[1].equals("@")) {

			espaciado = "";
			for (int j = 0; j < EspaciadosT[0].length(); j++) {
				espaciado += " ";
			}
			espaciado += EspaciadosT[1];

		}

		if (cantidad == 3) {

			espaciado = "";
			for (int j = 0; j < EspaciadosT[0].length() - 1; j++) {
				espaciado += " ";
			}
			espaciado += EspaciadosT[1] + EspaciadosT[2];
		}

		return espaciado;
	}

	public static void inicializandoGeneral() {
		int temporal = 1;
		tablero[0][0] = "Primero";
		tablero[7][0] = "Ultimo";
		int alternante = 2;

		for (int j = 7; j >= 0; j--) {
			if (alternante % 2 == 0) {
				for (int i = 0; i < 8; i++) {
					tablero[j][i] = String.valueOf(temporal);
					temporal++;
				}
				alternante = 3;
			} else {
				for (int i = 7; i >= 0; i--) {
					tablero[j][i] = String.valueOf(temporal);
					temporal++;
				}
				alternante = 2;
			}
		}

		tablero[7][0] = "1";

	}

	
	public static void tirar_dados() {
		int dado = tlr.nextInt(2, 6 + 1);
	}

	
}
