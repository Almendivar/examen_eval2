package examen_eval2;

public class Jugador {
	protected String nombre;
	protected int dorsal;
	protected int hab_portero;
	protected int hab_disparo;
	protected int vidas;

	public Jugador(String nombre, int dorsal, int hab_portero, int hab_disparo, int vidas) {
	this.nombre = nombre;
	this.dorsal = dorsal;
	this.hab_portero = hab_portero;
	this.hab_disparo = hab_disparo;
	this.vidas = vidas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public int getHab_portero() {
		return hab_portero;
	}

	public void setHab_portero(int hab_portero) {
		this.hab_portero = hab_portero;
	}

	public int getHab_disparo() {
		return hab_disparo;
	}

	public void setHab_disparo(int hab_disparo) {
		this.hab_disparo = hab_disparo;
	}

	public int getVidas() {
		return vidas;
	}

	public void setVidas(int vidas) {
		this.vidas = vidas;
	}

	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", dorsal=" + dorsal + ", hab_portero=" + hab_portero + ", hab_disparo="
				+ hab_disparo + ", vidas=" + vidas + "]";
	}
	
	/*
	 * Pre: ---
	 * Post: En este método multiplicamos un número aleatrio por la habilidad de disparo que tiene el 
	 * jugador.
	 */
	public int habilidadDisparo() {
		int z = hab_disparo * (1 + (int)(Math.random()*4));
		return z;
	}
	
	/*
	 * Pre: ---
	 * Post: En este método multiplicamos un número aleatrio por la habilidad de portero que tiene el 
	 * jugador.
	 */
	public int habilidadPorteria() {
		int z = hab_portero * (1 + (int)(Math.random()*4));
		return z;
	}
}
