import java.util.*;
public class Ejercicio_Git {
	static Scanner lc= new Scanner(System.in);
	public static void main(String []args) {
		int longitud;
		System.out.println("----------------------------------------------------");
		System.out.println("Introduce la cantidad de digitos de la 1º Contraseña");
		longitud=lc.nextInt();
		System.out.println(Password.getPassword(
				Password.MINUSCULAS+
				Password.NUMEROS,longitud));
		System.out.println("----------------------------------------------------");
		System.out.println("Introduce la cantidad de digitos de la 2º Contraseña");
		longitud=lc.nextInt();
		System.out.println(Password2.getPassword(
				Password2.MINUSCULAS+
				Password.NUMEROS+
				Password2.MAYUSCULAS+
				Password2.ESPECIALES,longitud));
		}
	}

