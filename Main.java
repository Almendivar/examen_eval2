package examen_eval2;

import java.util.ArrayList;

public class Main {
	
	public static int [] crearTabla(int[] tabla) {
		int borrador = 0;
		for (int i = 0; i < tabla.length; i++) {
			tabla[i] = i + 1;
			System.out.println(tabla[i]);
		}
		for (int i = 0; i < tabla.length; i++) {
			int random = (int)(Math.random()*tabla.length - 1);
			borrador = tabla[i];
			tabla[i] = tabla[random];
			tabla[random] = borrador;
		}
		return tabla;
	}
	
	public static void rapido(int [] tabla, ArrayList<Jugador> jugadores) {
		int cont = 0;
		int finalizador = jugadores.size();
		while( finalizador != 1) {
			if(jugadores.get(cont).getVidas() > 0) {
				if(cont != jugadores.size() - 1) {
					if (jugadores.get(i).habilidadDisparo()> jugadores.get(i+1).habilidadPorteria()) {
						jugadores.get(i+1).setVidas(jugadores.get(i+1).getVidas() - 1);
					}
				}	
			}
		}
	}
	
	public static void main(String[]args) {
		ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
		for(int i = 0; i < 10; i++) {
			jugadores.add(new Jugador("Jugador " + (i+1), i+1, 1 + (int)(Math.random() * 9),
					1 + (int)(Math.random() * 10), 2 ));
			System.out.println(jugadores.get(i).toString());
			System.out.println("---------");
			System.out.println("Habilidad portero: " +jugadores.get(i).habilidadPorteria() );
			System.out.println("Habilidad jugador: " +jugadores.get(i).habilidadDisparo() );
		}
		System.out.println("---------");
		System.out.println("---------");
		System.out.println("---------");
		int [] tabla = new int[jugadores.size()];
		tabla = crearTabla(tabla);
		System.out.println("---------");
		for(int i = 0; i < 10; i++) {
			//System.out.println(jugadores.get(i).toString());
			System.out.println(tabla[i]);
		}
	}
}
