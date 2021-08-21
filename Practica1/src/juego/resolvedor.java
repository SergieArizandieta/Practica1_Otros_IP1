package juego;

public class resolvedor {
	static boolean Facil1 = true, Facil2 = true, Facil3 = true;

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

		/*
		if (a!=0 && c!= 0 && B!=0 && Facil1 == true) {
			b = Math.pow((a*a+c*c-2*a*c*Math.cos(Math.toRadians(B))), 0.5);
			C = Math.toDegrees(Math.asin((Math.sin(Math.toRadians(B))*a)/b));
			A = 180 - B -C;
			System.out.println("uno - F");
			gestionInterna.ContadorFacil +=1;
			Facil1 = false;
		}
		
		if (b != 0 && c != 0 && A != 0 && Facil2 == true) {	
			a = Math.pow((b*b+c*c-2*b*c*Math.cos(Math.toRadians(A))), 0.5);
			C = Math.toDegrees(Math.asin((Math.sin(Math.toRadians(A))*b)/a));
			B = 180- C-A;
			System.out.println("dos - F");
			gestionInterna.ContadorFacil +=1;
			Facil2 = false;
		}
		if (a != 0 && b != 0 && C != 0 && Facil3 == true) {
			c = Math.pow((b*b+a*a-2*b*a*Math.cos(Math.toRadians(C))), 0.5);
			B = Math.toDegrees(Math.asin((Math.sin(Math.toRadians(C))*a)/c));
			A = 180- C-B;
			System.out.println("tres - F");
			gestionInterna.ContadorFacil +=1;
			Facil3 = false;
		}*/
		
		
	}

	
}
