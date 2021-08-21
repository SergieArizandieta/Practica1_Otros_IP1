package juego;

import java.io.FileWriter;

public class reportes {
	//------------------------------------Reporte-------------------------------------------------	
	 //Varibles Globales para los reportes
		static String ReporteInicio="",ReporteFinal="";
		
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
				+ "<h6 class=\"titulos\"><b> Reportes </b></h6>\r\n"
				+ "";
		
		
		ReporteFinal="\r\n"
				+ "</center>\r\n"
				+ "\r\n"
				+ "</body>\r\n"
				+ "</html>";
	}

	//Genera la tabla para el reporte
	public static void ReportePenalizacionFacil(int opcion) {
		double A = 0, B = 0, C = 0;
		double a = 0, b = 0, c = 0;
		
		switch (opcion) {

		case 1:
			
				a = 15;
				c = 20;
				B = 25;

				b = Math.pow((a * a + c * c - 2 * a * c * Math.cos(Math.toRadians(B))), 0.5);
				C = Math.toDegrees(Math.asin((Math.sin(Math.toRadians(B)) * a) / b));
				A = 180 - B - C;
				
				
			

			break;

		case 2:
			
				b = 10;
				c = 25;
				A = 30;

				a = Math.pow((b * b + c * c - 2 * b * c * Math.cos(Math.toRadians(A))), 0.5);
				C = Math.toDegrees(Math.asin((Math.sin(Math.toRadians(A)) * b) / a));
				B = 180 - C - A;
			
			break;

		case 3:
			
				a = 18;
				b = 25;
				C = 30;

				c = Math.pow((b * b + a * a - 2 * b * a * Math.cos(Math.toRadians(C))), 0.5);
				B = Math.toDegrees(Math.asin((Math.sin(Math.toRadians(C)) * a) / c));
				A = 180 - C - B;
	
			
			break;
		}
	
			
	}

	public static void ReportePenalizacionMedia() {
		
		
		
		
	}
	
	public static void ReportePenalizacionDificl() {
		
		
		
		
	}
	//Crea el archivo HTML
		public static void ReporteMostrar() {
			
			try {	
				System.out.println("Reporte Creado");
				FileWriter archivo = new FileWriter("./Reportes/Reporte.html");
				archivo.write(ReporteInicio  + ReporteFinal);
				archivo.close();	
				
			}catch(Exception e) {	
				System.out.println("ERRO: " + e);
			}
		
		}
		
		
		
		
	//----------------------------------------------------------------------------------------------	
		
}
