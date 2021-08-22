package juego;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import main.main;

public class juego {
	public static boolean Revision =true;
	public static ThreadLocalRandom tlr = ThreadLocalRandom.current();
	public static Scanner read = new Scanner(System.in);

	static boolean Ganador = false;
	static String[][] tablero = new String[8][8];
	public static int posicion = 1;
	
	public static int tiro = 0;

	public static void juego() {
		System.out.println("Bienvenido a Escaleras Matemticas");
		gestionInterna.inicializandoGeneral();
		gestionInterna.inicializandoPenalizaciones();
		
		gestionInterna.ReporteTemp += "Se inicio el juego de <br>ESCALERAS MATEMATICAS\n";
		tablero();

	}

	public static void tablero() {
		if(Ganador == true) {
			System.out.println("Haz Ganado!!\n");
		}else {
		mostrar_tablero(posicion);
		if(posicion >=  64) {
			gestionInterna.ReporteTemp += "\n@Casilla actual: "+  (64)  +"\nHAZ GANADO!!";
			System.out.println("TABLERO DE EJECUCION\n");
			Looktablero();
			Ganador = true;
			tablero();
		}else {
			menu();
		}
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
	
				case "x":
					tiro++;
					tirar_dados();
					check = false;
					tablero();
					break;
				
				case "p":
					check = false;
					main.menu();
					break;
				default:
					System.out.println("opcion incorrecta");
				}
			} catch (Exception e) {
				System.out.println("Error " + e);
			}
		} while (check == true);
	}

	public static void mostrar_tablero(int posicion) {
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
				if (posicion==1 && i==7 && j==7) {
					System.out.print("|\t" + " "+ "@|");
				}else {
					System.out.print("|\t" + gestionInterna.espaciado(tablero[i][j]) + "|");
				}
				
			}
			System.out.println("\t");
		}
		System.out.println("--------------------------------------------------------------------");
		
	}

	public static void tirar_dados() {

		int dado = tlr.nextInt(2, 6 + 1);
		System.out.println("Se tiro el dado!! y salio...: " + dado);
		posicion += dado;
		if (posicion>=64) {
			posicion=64;
		}
		gestionInterna.buscar(dado);
	}

	public static void Looktablero() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				System.out.print("|" + tablero[i][j] + "|\t");
			}
			System.out.println("\t");
		}
	}
}
