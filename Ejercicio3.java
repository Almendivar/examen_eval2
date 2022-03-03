package examen_eval2;

import java.io.*;
import java.util.*;

public class Ejercicio3 {
	
	/*
	 * Pre: ---
	 * Post:En este método seleccionamos la plataformas sin repetirse del arrayList que hemos 
	 * enviado y las mostramos por pantalla.
	 */
	public static void verPlataformas(ArrayList<String> plataformas) {
		for(int i = 0; i < plataformas.size(); i++) {
			String p = plataformas.get(i);
			if(!p.equals("")) {
				for(int j = 0; j < plataformas.size(); j++) {
					if(p.equals(plataformas.get(j)) && i != j) {
						plataformas.set(j,"");
					}
				}
			}
		}
		for(int i = 0; i < plataformas.size(); i++) {
			String p = plataformas.get(i);
			if(!p.equals("") && !p.contains("\"") && !p.contains("0")) {
			System.out.println(plataformas.get(i));
			}
		}
	}
	
	/*
	 * Pre: ---
	 * Post:En este método leemos la hoja de cálculo VentasVideojuegos.csv y 
	 * guardamos las plataformas de videojuegos dentro de un ArrayList de String,
	 * posteriormente llamamos al método verPlataformas.
	 */
	public static void informacionVideojuegos () {
		File f = new File("C:\\Users\\diegi\\Desktop\\VentasVideojuegos.csv");
		try {
			Scanner lineas = new Scanner (f);
			int cont = 0; 
			boolean comp = false;
			ArrayList<String> plataformas = new ArrayList<String>();
			while(lineas.hasNextLine()) {
				String linea = lineas.nextLine();
				String [] palabras = linea.split(",");
				//System.out.println(palabras[2]);
				for(int i = 0; i < palabras.length; i++) {
					if(palabras[1].contains("\"")){
						comp = true;
					}
					if(comp = true && i != 1 && palabras[i].contains("\"") ) {
						comp = false;
						plataformas.add(palabras[i + 1]);
					}
				}
				if(!palabras[1].contains("\"")){
					plataformas.add(palabras[2]);
				}
			}
			verPlataformas(plataformas);
		}
		catch(Exception e) {
			System.out.println("error");
		}
	}
	

	/*
	 * Pre: ---
	 * Post: En este método solamente llamamos al método informacionVideojuegos().
	 */
	public static void main(String[]args) {
		informacionVideojuegos();
	}
}
