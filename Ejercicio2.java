package examen_eval2;

import java.io.*;
import java.util.*;

public class Ejercicio2 {
	
	/*
	 * Pre: ---
	 * Post:En este método leemos el fichero textExamen y sumamos uno al contador cada vez que 
	 * el número indicado es menor o igual que la palabra que estamos leyendo.
	 */
	public static void palabrasMasLargasQue (int p) {
		File f = new File("C:\\Users\\diegi\\Desktop\\textoExamen.txt");
		try {
			Scanner lineas = new Scanner (f);
			int cont = 0; 
			while(lineas.hasNextLine()) {
				String linea = lineas.nextLine();
				String [] palabras = linea.split(" ");
				for( int i = 0; i < palabras.length ; i++) {
					if(p <= palabras[i].length()) {
						cont++;
					}
				}
			}
			System.out.println("El número de palabras más largas que "+ p + " es : " + cont);
		}
		catch(Exception e) {
			System.out.println("error");
		}
	}
	
	/*
	 * Pre: ---
	 * Post: En este método pedimos un número al usuario y lo enviamos con el método palabrasMasLargasQue.
	 */
	public static void main(String[]args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe el número que le quieres dar a longitud");
		int p = entrada.nextInt();
		palabrasMasLargasQue(p);
	}
}
