package juego;

public class gestionInterna {
	static String ReporteTemp = "";
	static int contadoF=0,contadoM=0,contadoD=0;
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
		reportes.VariblesNoCambian();
		juego.Ganador = false;
		juego.posicion = 1;
		resolvedor.Facil1 = true;
		resolvedor.Facil2 = true;
		resolvedor.Facil3 = true;
		resolvedor.Medio1 = true;
		resolvedor.Medio2 = true;
		resolvedor.Medio3 = true;
		resolvedor.Dificil1 = true;
		resolvedor.Dificil2 = true;
		resolvedor.Dificil3 = true;
		gestionInterna.ContadorFacil = 0;
		gestionInterna.ContadorMedio = 0;
		gestionInterna.ContadorDificl = 0;
		gestionInterna.ReporteTemp = "";
		gestionInterna.contadoF=0;
		gestionInterna.contadoM=0;
		gestionInterna.contadoD=0;
		juego.Revision =true;
		juego.tiro = 0;
		
		//reportes
		reportes.VariblesNoCambian();

		int temporal = 1;
		juego.tablero[0][0] = "Primero";
		juego.tablero[7][0] = "Ultimo";
		int alternante = 2;

		for (int j = 7; j >= 0; j--) {
			if (alternante % 2 == 0) {
				for (int i = 7; i >= 0; i--) {
					juego.tablero[j][i] = String.valueOf(temporal);
					temporal++;
				}
				
				alternante = 3;
			} else {
				
				for (int i = 0; i < 8; i++) {
					juego.tablero[j][i] = String.valueOf(temporal);
					temporal++;
				}
				
				alternante = 2;
			}
		}
		
		
	}

	public static void inicializandoPenalizaciones() {
		int a=2;
		int position = 0;
		boolean verificar = true;

		for (int i = 0; i < 8; i++) {
			int noPenalizacion = juego.tlr.nextInt(2, 4 + 1);

			for (int j = 0; j < noPenalizacion; j++) {
				verificar = true;
				while (verificar == true) {
					if( i==7) {
						int Posicion = juego.tlr.nextInt(0, 6 + 1);
						position= Posicion;
						a=3;
					}else {
						int Posicion = juego.tlr.nextInt(0, 7 + 1);
						position= Posicion;
					}
					

					String[] data = juego.tablero[i][position].split(",");
					int cantidad = data.length;
					if (cantidad != 2) {

						juego.tablero[i][position] = data[0] + "," + "#";
						verificar = false;

					}
				}
			}
		}
	}

	public static void buscar(int dado) {
		String tipo="";
		boolean validacion = true;

		if (juego.posicion != 0) {
			for (int k = 0; k < 8; k++) {
				for (int l = 0; l < 8; l++) {
					if (validacion == true) {
						String[] dataEliminar = juego.tablero[k][l].split(",");
						int cantidadEliminar = dataEliminar.length;

						if (cantidadEliminar == 2) {					
							
							if (dataEliminar[1].equals("@")) {
								juego.tablero[k][l] = dataEliminar[0];
								validacion = false;
							}
						}

						if (cantidadEliminar == 3) {
							if (dataEliminar[2].equals("@")) {
								
								juego.tablero[k][l] = dataEliminar[0] + "," + dataEliminar[1];
								validacion = false;
							}
						}
					}

				}
			}
		}

		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {

				String[] data = juego.tablero[i][j].split(",");
				int cantidad = data.length;

				if (data[0].equals(Integer.toString(juego.posicion))) {
					if (cantidad == 2) {
						if(juego.posicion<17) {
							contadoF++;
							tipo = "facil";
							if(contadoF<3) {
								ReporteTemp += "@\nCasilla actual: "+  (juego.posicion-dado)  +"\n<br>Se tiraro dado: " + dado + "\n<br>Se realizo penalizacion: " + tipo +"\n";
							}else {
								ReporteTemp += "@\nCasilla actual: "+  (juego.posicion-dado)  +"\n<br>Se tiraro dado: " + dado +"\n";
							}
							
						}else if(juego.posicion > 16 && juego.posicion < 41) {
							contadoM++;
							tipo = "Medio";
							if(contadoM<3) {
								ReporteTemp += "@\nCasilla actual: "+  (juego.posicion-dado)  +"\n<br>Se tiraro dado: " + dado + "\n<br>Se realizo penalizacion: " + tipo +"\n";
							}else {
								ReporteTemp += "@\nCasilla actual: "+  (juego.posicion-dado)  +"\n<br>Se tiraro dado: " + dado +"\n";
							}
						}else if(juego.posicion > 40) {
							contadoD++;
							tipo = "Dificil";
							if(contadoD<3) {
								ReporteTemp += "@\nCasilla actual: "+  (juego.posicion-dado)  +"\n<br>Se tiraro dado: " + dado + "\n<br>Se realizo penalizacion: " + tipo +"\n";
							}else {
								ReporteTemp += "@\nCasilla actual: "+  (juego.posicion-dado)  +"\n<br>Se tiraro dado: " + dado +"\n";
							}
						}

						juego.tablero[i][j] = data[0] + "," + data[1] + "," + "@";
						penalizacion();
					}
					if (cantidad == 1) {
						ReporteTemp += "@\nCasilla actual: "+  (juego.posicion-dado)  +"\n<br>Se tiraro dado: " + dado +"\n";
						juego.tablero[i][j] = data[0] + "," + "@";
					}
				}
			}
		}
	}

	static int ContadorFacil = 0;
	static int ContadorMedio = 0;
	static int ContadorDificl = 0;

	public static void penalizacion() {
		
		if (juego.posicion < 17 && ContadorFacil <= 1) {
			int noPenalizacion = juego.tlr.nextInt(1, 3 + 1);
			resolvedor.trigonometria(noPenalizacion);
		}

		if (juego.posicion > 16 && juego.posicion < 41 && ContadorMedio <= 1) {
			System.out.println("Haz caido en una penalizacion media :) suerte... ");
			int noPenalizacion = juego.tlr.nextInt(1, 3 + 1);
			resolvedor.matricesMedio(noPenalizacion);
		}

		if (juego.posicion > 40 && ContadorDificl <= 1) {
			System.out.println(ContadorMedio);
			System.out.println("Haz caido en una penalizacion dificil >:) ... ");
			int noPenalizacion = juego.tlr.nextInt(1, 3 + 1);
			resolvedor.matricesDificl(noPenalizacion);
		}

	}
}
