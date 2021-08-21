package juego;

public class resolvedor {
	static boolean Facil1 = true, Facil2 = true, Facil3 = true;
	static boolean Medio1 = true, Medio2 = true, Medio3 = true;
	static boolean Dificil1 = true, Dificil2 = true, Dificil3 = true;
	
	public static void trigonometria(int opcion) {

		double A = 0, B = 0, C = 0;
		double a = 0, b = 0, c = 0;

		switch (opcion) {

		case 1:
			if (Facil1 == false) {
				gestionInterna.penalizacion();
			} else {
				a = 15;
				c = 20;
				B = 25;

				b = Math.pow((a * a + c * c - 2 * a * c * Math.cos(Math.toRadians(B))), 0.5);
				C = Math.toDegrees(Math.asin((Math.sin(Math.toRadians(B)) * a) / b));
				A = 180 - B - C;
				System.out.println("uno - F");
				gestionInterna.ContadorFacil += 1;
				Facil1 = false;
			}

			break;

		case 2:
			if (Facil2 == false) {
				gestionInterna.penalizacion();
			} else {
				b = 10;
				c = 25;
				A = 30;

				a = Math.pow((b * b + c * c - 2 * b * c * Math.cos(Math.toRadians(A))), 0.5);
				C = Math.toDegrees(Math.asin((Math.sin(Math.toRadians(A)) * b) / a));
				B = 180 - C - A;
				System.out.println("dos - F");
				gestionInterna.ContadorFacil += 1;
				Facil2 = false;
			}
			break;

		case 3:
			if (Facil3 == false) {
				gestionInterna.penalizacion();
			} else {
				a = 18;
				b = 25;
				C = 30;

				c = Math.pow((b * b + a * a - 2 * b * a * Math.cos(Math.toRadians(C))), 0.5);
				B = Math.toDegrees(Math.asin((Math.sin(Math.toRadians(C)) * a) / c));
				A = 180 - C - B;
				System.out.println("tres - F");
				gestionInterna.ContadorFacil += 1;
				Facil3 = false;
			}
			break;
		}

	}

	public static void matricesMedio(int opcion) {
		
		switch (opcion) {

		case 1:
			if (Medio1 == false) {
				gestionInterna.penalizacion();
			} else {
				int MatrizA[][] = {{7,48,5,0,1},{57,8,4,6,14},{0,5,6,78,15},{21,14,8,19,54},{32,20,26,47,12}};
				int MatrizB[][] = {{9,5,2,1,8},{4,2,3,47,8},{48,55,32,19,6},{7,56,32,14,8},{32,87,0,1,7}};
				
				System.out.println("uno - M");
				gestionInterna.ContadorMedio += 1;
				Medio1 = false;
	
				sumarMatrices(MatrizA,MatrizB);
			}

			break;

		case 2:
			if (Medio2 == false) {
				gestionInterna.penalizacion();
			} else {
				int MatrizA[][] = {{4,9,7,45,18},{7,51,26,8,38},{48,26,37,21,19},{1,0,6,8,1},{2,19,55,25,15}};
				int MatrizB[][] = {{0,2,15,1,66},{21,48,62,7,33},{4,88,0,68,4},{25,18,24,7,55},{24,15,36,5,98}};
				
				System.out.println("dos - M");
				gestionInterna.ContadorMedio += 1;
				Medio2 = false;
				
				sumarMatrices(MatrizA,MatrizB);
			}
			break;

		case 3:
			if (Medio3 == false) {
				gestionInterna.penalizacion();
			} else {
				int MatrizA[][] = {{0,1,15,5,36},{1,78,65,32,4},{48,66,39,0,55},{14,98,63,20,15},{11,39,84,7,1}};
				int MatrizB[][] = {{78,25,66,48,98},{0,45,2,3,1},{2,9,14,10,20},{35,87,65,2,32},{25,8,4,9,39}};
				
				System.out.println("tres - M");
				gestionInterna.ContadorMedio += 1;
				Medio3 = false;
				
				sumarMatrices(MatrizA,MatrizB);
			}
			break;
		}
	}
	
	public static void sumarMatrices( int[][]MatrizA ,int[][]MatrizB) {
		int[][] matriz_t = new int[5][5];
        for (int i=0; i<5; i++){
            for (int j=0; j<5; j++){
            	matriz_t [i][j]= MatrizA[i][j]+MatrizB[i][j];
               }
           }
        
        for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("|" + matriz_t[i][j] + "|\t");
			}
			System.out.println("\t");
		}
	}

	public static void matricesDificl(int opcion) {
		
		switch (opcion) {

		case 1:
			if (Dificil1 == false) {
				gestionInterna.penalizacion();
			} else {
				int MatrizA[][] = {{5,10,1,3},{9,14,2,6},{7,8,15,3},{6,8,9,2}};
				int MatrizB[][] = {{5,13,9,4},{1,9,6,3},{8,11,69,33},{25,6,7,4}};
				
	
				tranpuesta(MatrizB,determinante(MatrizB,4),MatrizA);
				
				
				System.out.println("uno - D");
				gestionInterna.ContadorDificl += 1;
				Dificil1 = false;
	
				
			}

			break;

		case 2:
			if (Dificil2 == false) {
				gestionInterna.penalizacion();
			} else {
				int MatrizA[][] = {{1,12,9,8},{7,6,3,2},{0,5,6,14},{6,9,6,10}};
				int MatrizB[][] = {{8,19,20,4},{12,33,6,8},{4,5,9,7},{8,22,14,6}};

				System.out.println("dos - D");
				gestionInterna.ContadorDificl += 1;
				Dificil2 = false;

			}
			break;

		case 3:
			if (Dificil3 == false) {
				gestionInterna.penalizacion();
			} else {
				int MatrizA[][] = { { 5, 9, 14, 5 }, { 6, 0, 5, 3 }, { 1, 14, 68, 8 }, { 7, 5, 3, 9 } };
				int MatrizB[][] = { { 0, 9, 7, 19 }, { 2, 30, 5, 48 }, { 1, 31, 2, 5 }, { 15, 8, 4, 3 } };

				System.out.println("tres - D");
				gestionInterna.ContadorDificl += 1;
				Dificil3 = false;

			}
			break;
		}
	}

	public static void cofactor(int[][] Matriz, int[][] MatrizTemp, int x, int y, int n) {
		int a = 0, b = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i != x && j != y) {
					MatrizTemp[a][b++] = Matriz[i][j];
					if (b == n - 1) {
						b = 0;
						a++;
					}
				}
			}
		}

	}

	public static int determinante(int[][] Matriz, int n) {
		int Determinante = 0;

		if (n == 1) {
			return Matriz[0][0];
		}

		int MatrizTemp[][] = new int[n][n];
		int multiplicador = 1;

		for (int i = 0; i < n; i++) {
			cofactor(Matriz, MatrizTemp, 0, i, n);
			Determinante += multiplicador * Matriz[0][i] * determinante(MatrizTemp, n - 1);
			multiplicador = -multiplicador;
		}
		return Determinante;
	}

	public static int[][] tranpuesta(int[][] Matriz,int det,int[][]MatrizA) {
		int MatrizT[][] = new int[4][4];

		for (int x = 0; x < 4; x++) {
			for (int y = 0; y < 4; y++) {
				MatrizT[y][x] = Matriz[x][y];
			}
		}

		
		for (int i = 0; i < 4; i++) {
		for (int j = 0; j < 4; j++) {
			System.out.print("|" + MatrizT[i][j] + "|\t");
		}
		System.out.println("\t");
	}
		System.out.println("\t");
		adjunta(MatrizT,det,MatrizA);

		return MatrizT;
	}

	public static void adjunta(int[][] Matriz,int det, int[][] matrizA) {
		int MatrizA[][] = new int[4][4];
		int Temp[][] = new int[3][3];

		int x = 0, y = 0;
		int fila = 0, columna = 0;
		for (int k = 0; k < 16; k++) {
			int a = 0, b = 0;
		

			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					if (i != x && j != y) {
						Temp[a][b++] = Matriz[i][j];
						if (b == 3) {
							b = 0;
							a++;
						}
					}
				}
			}
			
			/*for (int i = 0; i < Temp.length; i++) {
				for (int j = 0; j < Temp.length; j++) {
					System.out.print("|" + Temp[i][j] + "|\t");
				}
				System.out.println("\t");
			}
			System.out.println(determinante(Temp, 3)+" det\t");*/
				MatrizA[fila][columna] = determinante(Temp, 3);

			y++;
			if (y == 4) {
				y = 0;
				x++;
			}
			
			fila++;
			if (fila == 4) {
				fila = 0;
				columna++;	
			}
		}

		System.out.println("\t");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				
				if((i+1+j+1)%2==0) {
					MatrizA[i][j] = MatrizA[i][j];
				}else {
					MatrizA[i][j] = -1* MatrizA[i][j];
				}
				
			}
	
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("|" + MatrizA[i][j] + "|\t");
			}
			System.out.println("\t");
		}
		System.out.println("\t");
		inversa(MatrizA,det,matrizA);
	}

	public static void inversa(int[][]Matriz, int det,int[][]MatrizA) {
	
		double MatrizI[][] = new double[4][4];
			
		for (int i = 0; i < 4; i++) {	
			for (int j = 0; j < 4; j++) {
				double Dato1 = (double) Matriz[i][j];
				double Dato2 = (double) det; 
				double resultado = Dato1/Dato2;
				System.out.println(Dato1 + "a/a" + Dato2 + " = " + resultado);
				MatrizI[i][j] = resultado;
				
			}
		}
		
		System.out.println("\t");
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print("|" + MatrizI[i][j] + "|\t");
			}
			System.out.println("\t");
		}
		
		producto(MatrizA,MatrizI);
	}
	
	 private static int[][] producto(int matriz1[][], double[][] matrizI){  
	        int suma = 0;  
	        int result[][] = new int[matriz1.length][matrizI.length];  
	        for(int i = 0; i < matriz1.length; i++){  
	            for(int j = 0; j < matrizI.length; j++){  
	                suma = 0;  
	                for(int k = 0; k < matrizI.length; k++){  
	                    suma += matriz1[i][k] * matrizI[k][j];  
	                }  
	                result[i][j] = suma;  
	            }  
	        }  
	        
	        
	        for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					System.out.print("|" + result[i][j] + "|\t");
				}
				System.out.println("\t");
			}
	        
	        return result;  
	     
	    } 

	 
}
