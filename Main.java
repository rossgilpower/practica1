package practica1;
import java.util.Scanner;
/*
 * Realizado por: Rosselin Gil Soto
 * Matricula: 1272606
 * Programación Orientada a Objetos | 2021-2
 * */
public class Main {
	
	static Scanner sc = new Scanner(System.in);
	public static void main (String[]args) {
		int opc = 0;
		
		System.out.println("-------------Practica 1------------");
		int acumul = 0;
		double suma = 0;
		double calif;
		System.out.println("Ingrese la cantidad de calificaciones: ");
		 int cantidad = sc.nextInt();
		 double [] Calificaciones = new double[cantidad];
		 String [] Nombres = new String[cantidad];
		 while(acumul < cantidad) {
			 System.out.println("Introduce la calificacion "+(acumul+1)+": ");
			 calif = sc.nextDouble();
			 sc.nextLine();
			 System.out.println("Introduce el nombre "+(acumul+1)+":");
			 String name = sc.nextLine();
			Calificaciones[acumul] = calif;
			Nombres[acumul]=name;
			suma += calif;
			acumul++;
		 }
			 do {
					
				System.out.println("Elija una opción: ");
				System.out.println("1.- Impresión de calificaciones y promedio.");
				System.out.println("2.- Impresión de calificaciones y calificación mas baja.");
				System.out.println("3.- Impresión de calificaciones y calificación mas alta.");
				System.out.println("4.- Salir.");
				System.out.println();
				System.out.println(">> Su elección: ");
				
				opc = sc.nextInt();
				switch(opc) {
			case 1:
				sacar_promedio(cantidad,suma,Calificaciones,Nombres);
				break;
			case 2:
				cal_menor(Calificaciones,Nombres);
				break;
			case 3:
				cal_mayor(Calificaciones,Nombres);
				break;
			case 4:
				System.out.println("Programa finalizado.");
				System.exit(1);
				break;
				
				default:
					System.out.println("Opción no válida. Pruebe de nuevo.");
					System.out.println();
			}
				System.out.println("¿Desea continuar ejecutando el programa? 1 = Sí  0 = No");
				int respuesta = sc.nextInt();
				if(respuesta==1) {
					continue;
				}
				else 
					System.out.println("--------------------------");
					System.out.println("Programa finalizado.");
					System.exit(1);
				
		}
		while(opc!=4);
		
	}
	
	static void sacar_promedio(int total, double suma,double Calificaciones[],String Nombres[]) {
		System.out.println("Las calificaciones son: ");
		for(int i=0; i<total;i++) {
			System.out.println(" Nombre: "+Nombres[i]+" | Calificación: "+Calificaciones[i]);
		}
		double promedio = suma/total;
		System.out.println("--------------------------");
		System.out.println("El promedio es: "+promedio);
		System.out.println("--------------------------");
		
		
	}
	static void cal_menor(double Calificaciones[],String Nombres[]) {
		double menor = Calificaciones [1];
		System.out.println("Las calificaciones son: ");
		for(int i=0; i<Calificaciones.length;i++) {
			System.out.println(" Nombre: "+Nombres[i]+" | Calificación: "+Calificaciones[i]);
		}
		for(int i=0;i<Calificaciones.length;i++) {
			if(Calificaciones[i]<menor) {
				menor = Calificaciones[i];
			}
		}
		System.out.println("--------------------------");
		System.out.println("La calificación menor es: "+menor);
		System.out.println("--------------------------");
	}
	static void cal_mayor(double Calificaciones[], String Nombres[]) {
		double mayor = Calificaciones[1];
		System.out.println("Las calificaciones son: ");
		for(int i=0; i<Calificaciones.length;i++) {
			System.out.println(" Nombre: "+Nombres[i]+" | Calificación: "+Calificaciones[i]);
		}
		for(int i=0;i<Calificaciones.length;i++) {
			if(Calificaciones[i]>mayor) {
				mayor = Calificaciones[i];
			}
		}
		System.out.println("--------------------------");
		System.out.println("La calificación mayor es: "+mayor);
		System.out.println("--------------------------");
	}
}
