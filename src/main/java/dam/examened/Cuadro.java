/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam.examened;

/**
 *
 * @author rulo
 */
public class Cuadro {
	
	private String nombre;
	private String tecnica;
	private int alto;
	private int ancho;

	public Cuadro(String nombre, String tecnica, int alto, int ancho) {
		this.nombre = nombre;
		this.tecnica = tecnica;
		this.alto = alto;
		this.ancho = ancho;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTecnica() {
		return tecnica;
	}

	public void setTecnica(String tecnica) {
		this.tecnica = tecnica;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	
}
