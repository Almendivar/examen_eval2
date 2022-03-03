package examen_eval2;

import java.util.ArrayList;

public class Main {
	
	/*
	 * Pre: ---
	 * Post: En este método recibimos el ArrayList y lo ordenamos de forma aleatoria.
	 */
	public static ArrayList<Jugador> ordenarArray( ArrayList<Jugador> jugadores) {
		Jugador borrador = new Jugador(" ", 0, 0, 0, 0 );
		for (int i = 0; i < jugadores.size(); i++) {
			int random = (int)(Math.random()*jugadores.size() - 1);
			borrador = jugadores.get(random);
			jugadores.remove(random);
			jugadores.add(borrador);
		}
		return jugadores;
	}
	
	/*
	 * Pre: ---
	 * Post: En este método comparamos las puntaciones obtenidas de la habilidad del portero con la 
	 * habilidad del disparo y si gana el disparo le quitamos una vida al portero, cuando le quedan 
	 * 0 vidas es eliminado. Finalmente se muestra al ganador por pantalla.
	 */
	public static void rapido( ArrayList<Jugador> jugadores) {
		int cont = 0;
		while( jugadores.size() > 1) {
			if(cont != jugadores.size() - 1 && cont != jugadores.size()) {
				int disp = jugadores.get(cont).habilidadDisparo();
				int port = jugadores.get(cont+1).habilidadPorteria();
				if (disp > port) {
					jugadores.get(cont+1).setVidas(jugadores.get(cont+1).getVidas() - 1);
					if(jugadores.get(cont + 1).getVidas() == 0) {
						System.out.println("El jugador "+jugadores.get(cont+1).getNombre() 
								+" ha sido eliminado");
						System.out.println("Habilidad portero eliminado: "
								+ port );
						System.out.println("Habilidad disparo ejecutado: "
								+ disp );
						System.out.println("---------");
						jugadores.remove(cont + 1);
					}
				}	
			}
			else {
				int disp1 = jugadores.get(jugadores.size() - 1).habilidadDisparo();
				int port1 =  jugadores.get(0).habilidadPorteria();
				if (disp1 > port1) {
					jugadores.get(0).setVidas(jugadores.get(0).getVidas() - 1);
					if(jugadores.get(0).getVidas() == 0) {
						System.out.println("El jugador "+jugadores.get(0).getNombre() 
								+" ha sido eliminado");
						System.out.println("Habilidad portero eliminado: "
								+ port1 );
						System.out.println("Habilidad disparo ejecutado: "
								+ disp1 );
						System.out.println("---------");
						jugadores.remove(0);
					}
				}
				cont = -1;
			}
			cont++;
		}
		System.out.println("Ganador: " + jugadores.get(0).toString());
	}
	
	/*
	 * Pre: ---
	 * Post: En el método main, creamos el ArrayList y le mandamos los atributos de la clase Jugador,
	 * posteriormente llamamos  a los métodos ordenarArray y rapido.
	 */
	public static void main(String[]args) {
		ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
		System.out.println("--------------- JUGADORES ----------------");
		for(int i = 0; i < 10; i++) {
			jugadores.add(new Jugador("Jugador " + (i+1), i+1, 1 + (int)(Math.random() * 9),
					1 + (int)(Math.random() * 10), 2 ));
			System.out.println(jugadores.get(i).toString());
			System.out.println("---------");
		}
		System.out.println("---------");
		System.out.println("---------");
		ordenarArray(jugadores);
		System.out.println("--------------- RÁPIDO ----------------");
		rapido(jugadores);
	}
}
