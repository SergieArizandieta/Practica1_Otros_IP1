package juego;

import java.io.FileWriter;
import java.text.DecimalFormat;

public class reportes {

    static DecimalFormat df = new DecimalFormat("###.##");
 //------------------------------------Reporte 2-------------------------------------------------
    static String ReporteBitacora = "";
    public static void bitacora(int tiro){
    	String reporte ="Se gano con: " + tiro + " tiros\n@\n";
    	reporte+= gestionInterna.ReporteTemp;
    	//System.out.println(reporte);
    	
    	String[] reporteG = reporte.split("@");
    	
		
		String ReporteTemp = "";
		
		ReporteTemp+= ""
				+"<div class=\"imgs\">\r\n";

		
		ReporteTemp="<!----tabla 2-->\r\n"
				+ "<table class=\"steelBlueCols\">\r\n"
				+ "<thead>\r\n"
				+ "   <tr> <th>Evento no. </th> <th>Accion</th>  </tr>\r\n"
				+ "</thead>\r\n"
				+ "<tbody>\r\n"
				+ "\r\n"
				+ "<tr>";
		
		for(int i=0;i<reporteG.length;i++) {
			
			ReporteTemp += "<td>" + i + "</td>";
			ReporteTemp += "<td>" + reporteG[i] + "</td>";
			
			ReporteTemp += "</tr> \n <tr>";
			
		}
		
		ReporteTemp += "</tr></tbody></table> <br>";
				

		
		
		ReporteTemp+="</div>";
		
		ReporteBitacora +=ReporteTemp;
		
    }
      
//------------------------------------Reporte 1-------------------------------------------------	
	 //Varibles Globales para los reportes
		static String ReporteInicio="",ReporteFinal="";
		static String ReporteOperaciones="";
		static String ReporteOpFaciles="";
		static String ReporteOpMedios="";
		static String ReporteOpDifil="";
	
	//Inicializar las varibles que no cambian
	public static void VariblesNoCambian() {
		
		ReporteInicio = "<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "\r\n"
				+ "<!--Encabezado-->\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"UTF-8\">\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "<link rel=\"stylesheet\" type=\"text/css\" href=\"css/styles.css\"/>\r\n"
				+ "\r\n"
				+ "<title>Reporte</title>\r\n"
				+ "</head>\r\n"
				+ "\r\n"
				+ "<body>\r\n"
				+ "\r\n"
				+ "<center>\r\n"
				+ "\r\n"
				+ "<h6 class=\"titulos\"><b> Operaciones Realizadas (Penalizaciones) </b></h6>\r\n"
				+ "";
		
		
		ReporteFinal="\r\n"
				+ "</center>\r\n"
				+ "\r\n"
				+ "</body>\r\n"
				+ "</html>";
		
		ReporteOpFaciles="<div>\r\n"
				+ "    <h2> Operaciones Faciles </h2>\r\n"
				+ "    <div class=\"imgs\">\r\n"
				+ "        <img src=\"./images/Triangulo.PNG\" width=\"400px\" height=\"300px\" />\r\n"
				+ "    </div>";
		
		ReporteOpMedios="<br>\r\n"
				+ "<div>\r\n"
				+ "    <h2> Operaciones Medias </h2>";
		
		ReporteOpDifil="<br>\r\n"
		+ "<div>\r\n"
		+ "    <h2> Operaciones Dificiles </h2>";
		
		ReporteBitacora= "<br>\r\n"
				+ "<div>\r\n"
				+ "    <h2> Bitacora </h2>";
	}

	// Genera la tabla para el reporte
	public static void ReportePenalizacionFacil(int opcion) {
		double A = 0, B = 0, C = 0;
		double a = 0, b = 0, c = 0;
		String ReporteTemp = "";

		switch (opcion) {

		case 1:

			a = 15;
			c = 20;
			B = 25;

			b = Math.pow((a * a + c * c - 2 * a * c * Math.cos(Math.toRadians(B))), 0.5);
			C = Math.toDegrees(Math.asin((Math.sin(Math.toRadians(B)) * a) / b));
			A = 180 - B - C;

			ReporteTemp = "   <div class=\"imgs\">\r\n" + "        <h1>Opcion 1</h1> \r\n"
					+ "        <h1>Datos proporcionados</h1>\r\n" + "        <h1>A = 15</h1>\r\n"
					+ "        <h1>C = 20</h1>\r\n" + "        <h1>b = 25 DEG</h1>\r\n" + "    \r\n"
					+ "        <h1>Datos solicitados</h1>\r\n" + "        <h1>B =" + String.valueOf(df.format(b))
					+ "</h1>\r\n" + "        <h1>a  =" + String.valueOf(df.format(A)) + " DEG</h1>\r\n"
					+ "        <h1>c =" + String.valueOf(df.format(C)) + " DEG</h1><br>\r\n" + "    </div>\r\n"
					+ "    <br>";

			break;

		case 2:

			b = 10;
			c = 25;
			A = 30;

			a = Math.pow((b * b + c * c - 2 * b * c * Math.cos(Math.toRadians(A))), 0.5);
			C = Math.toDegrees(Math.asin((Math.sin(Math.toRadians(A)) * b) / a));
			B = 180 - C - A;

			ReporteTemp = "    <div class=\"imgs\">\r\n" + "        <h1>Opcion 2</h1> \r\n"
					+ "        <h1>Datos proporcionados</h1>\r\n" + "        <h1>B = 10</h1>\r\n"
					+ "        <h1>C = 25</h1>\r\n" + "        <h1>a  = 30 DEG</h1><br>\r\n" + "    \r\n"
					+ "        <h1>Datos solicitados</h1>\r\n" + "        <h1>A =" + String.valueOf(df.format(a))
					+ "</h1>\r\n" + "        <h1>b  =" + String.valueOf(df.format(B)) + " DEG</h1>\r\n"
					+ "        <h1>c =" + String.valueOf(df.format(C)) + " DEG</h1>\r\n" + "    </div>\r\n"
					+ "    <br>";
			break;

		case 3:

			a = 18;
			b = 25;
			C = 30;

			c = Math.pow((b * b + a * a - 2 * b * a * Math.cos(Math.toRadians(C))), 0.5);
			B = Math.toDegrees(Math.asin((Math.sin(Math.toRadians(C)) * a) / c));
			A = 180 - C - B;

			ReporteTemp = "    <div class=\"imgs\">\r\n" + "        <h1>Opcion 3</h1> \r\n"
					+ "        <h1>Datos proporcionados</h1>\r\n" + "        <h1>A = 18</h1>\r\n"
					+ "        <h1>B = 25</h1>\r\n" + "        <h1>c = 30 DEG</h1><br>\r\n" + "    \r\n"
					+ "        <h1>Datos solicitados</h1>\r\n" + "        <h1>C =" + String.valueOf(df.format(c))
					+ "</h1>\r\n" + "        <h1>a  =" + String.valueOf(df.format(A)) + " DEG</h1>\r\n"
					+ "        <h1>b =" + String.valueOf(df.format(B)) + " DEG</h1>\r\n" + "    </div>\r\n"
					+ "    <br>";
			break;
		}

		ReporteOpFaciles += ReporteTemp;

	}

	public static void ReportePenalizacionMedia(int[][] MatrizR,int[][] MatrizA, int[][] MatrizB, int opcion) {
		String ReporteTemp = "";
		
		ReporteTemp+= ""
				+"<div class=\"imgs\">\r\n"
				+ "        <h1>Suma de matrices</h1>\r\n"
				+ "        <h1>Opcion "+ String.valueOf(opcion) +"</h1> \r\n";

				
		ReporteTemp+="<h1> Matriz A<h1>";	
		ReporteTemp+="<!----tabla 2-->\r\n"
				+ "<table class=\"steelBlueCols\">\r\n"
				+ "<thead>\r\n"
				+ "   <tr> <th></th> <th></th> <th></th> <th></th> <th></th> </tr>\r\n"
				+ "</thead>\r\n"
				+ "<tbody>\r\n"
				+ "\r\n"
				+ "<tr>";
		
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				ReporteTemp += "<td>" + MatrizA[i][j] + "</td>";
			}
			ReporteTemp += "</tr> \n <tr>";
		}
		
		ReporteTemp += "</tr></tbody></table> <br>";
		
		
		ReporteTemp+="<h1> Matriz B<h1>";	
		ReporteTemp+="<!----tabla 2-->\r\n"
				+ "<table class=\"steelBlueCols\">\r\n"
				+ "<thead>\r\n"
				+ "   <tr> <th></th> <th></th> <th></th> <th></th> <th></th> </tr>\r\n"
				+ "</thead>\r\n"
				+ "<tbody>\r\n"
				+ "\r\n"
				+ "<tr>";
		
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				ReporteTemp += "<td>" + MatrizB[i][j] + "</td>";
			}
			ReporteTemp += "</tr> \n <tr>";
		}
		
		ReporteTemp += "</tr></tbody></table> <br>";
		
		
		ReporteTemp+="<h1> Matriz Resultante<h1>";	
		ReporteTemp+="<!----tabla 2-->\r\n"
				+ "<table class=\"steelBlueCols\">\r\n"
				+ "<thead>\r\n"
				+ "   <tr> <th></th> <th></th> <th></th> <th></th> <th></th> </tr>\r\n"
				+ "</thead>\r\n"
				+ "<tbody>\r\n"
				+ "\r\n"
				+ "<tr>";
		
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				ReporteTemp += "<td>" + MatrizR[i][j] + "</td>";
			}
			ReporteTemp += "</tr> \n <tr>";
		}
		
		ReporteTemp += "</tr></tbody></table> <br>";
		
		ReporteTemp+="</div>";
		
		ReporteOpMedios +=ReporteTemp;
	}

	public static void ReportePenalizacionDificl(double[][] result, int[][] matriz1, int[][] matriz2, int opcion) {
		

		String ReporteTemp = "";
		
		ReporteTemp+= ""
				+"<div class=\"imgs\">\r\n"
				+ "        <h1>divison de matrices</h1>\r\n"
				+ "<h1>A * B^-1</h1>\r\n"
				+ "        <h1>Opcion "+ String.valueOf(opcion) +"</h1> \r\n";

				
		ReporteTemp+="<h1> Matriz A<h1>";	
		ReporteTemp+="<!----tabla 2-->\r\n"
				+ "<table class=\"steelBlueCols\">\r\n"
				+ "<thead>\r\n"
				+ "   <tr> <th></th> <th></th> <th></th> <th></th>  </tr>\r\n"
				+ "</thead>\r\n"
				+ "<tbody>\r\n"
				+ "\r\n"
				+ "<tr>";
		
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				ReporteTemp += "<td>" + matriz1[i][j] + "</td>";
			}
			ReporteTemp += "</tr> \n <tr>";
		}
		
		ReporteTemp += "</tr></tbody></table> <br>";
		
		
		ReporteTemp+="<h1> Matriz B<h1>";	
		ReporteTemp+="<!----tabla 2-->\r\n"
				+ "<table class=\"steelBlueCols\">\r\n"
				+ "<thead>\r\n"
				+ "   <tr> <th></th> <th></th> <th></th> <th></th>  </tr>\r\n"
				+ "</thead>\r\n"
				+ "<tbody>\r\n"
				+ "\r\n"
				+ "<tr>";
		
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				ReporteTemp += "<td>" + matriz2[i][j] + "</td>";
			}
			ReporteTemp += "</tr> \n <tr>";
		}
		
		ReporteTemp += "</tr></tbody></table> <br>";
		
		
		ReporteTemp+="<h1> Matriz Resultante<h1>";	
		ReporteTemp+="<!----tabla 2-->\r\n"
				+ "<table class=\"steelBlueCols\">\r\n"
				+ "<thead>\r\n"
				+ "   <tr> <th></th> <th></th> <th></th> <th></th>  </tr>\r\n"
				+ "</thead>\r\n"
				+ "<tbody>\r\n"
				+ "\r\n"
				+ "<tr>";
		
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				ReporteTemp += "<td>" + df.format(result[i][j]) + "</td>";
			}
			ReporteTemp += "</tr> \n <tr>";
		}
		
		ReporteTemp += "</tr></tbody></table> <br>";
		
		ReporteTemp+="</div>";
		
		ReporteOpDifil +=ReporteTemp;
		
		
	}
	
	public static void ReporteFinalizar() {
		
		ReporteOpFaciles += "<br></div>";
		ReporteOpMedios += "<br></div>";
		ReporteOpDifil += "<br></div>";
		
		ReporteOperaciones = ReporteOpFaciles + ReporteOpMedios +ReporteOpDifil;
	}

//Crea el archivo HTML
		public static void ReporteMostrar1() {
			
			try {
				

				ReporteFinalizar();
				
				
				FileWriter archivo = new FileWriter("./Reportes/Reporte.html");
				archivo.write(ReporteInicio+ ReporteOperaciones  + ReporteFinal);
				archivo.close();	
				
			}catch(Exception e) {	
				System.out.println("ERRO: " + e);
			}
		
		}

		public static void ReporteMostrar2() {
			
			try {
				
				bitacora(juego.tiro);
				
				FileWriter archivo = new FileWriter("./Reportes/Bitacora.html");
				archivo.write(ReporteInicio+ ReporteBitacora  + ReporteFinal);
				archivo.close();	
				
			}catch(Exception e) {	
				System.out.println("ERRO: " + e);
			}
		
		}

//----------------------------------------------------------------------------------------------	
		
}
