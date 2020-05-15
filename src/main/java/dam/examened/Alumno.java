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
public class Alumno {
	
	private String nombre;
	private String apellidos;
	private String curso;
	private String email;
	private int fechaNac;
	private int puntos;
	
	private Cuadro cuadro;

	public Alumno(String nombre, String apellidos, String curso, String email, int fechaNac, Cuadro cuadro) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.curso = curso;
		this.email = email;
		this.fechaNac = fechaNac;
		this.cuadro = cuadro;
		puntos = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(int fechaNac) {
		this.fechaNac = fechaNac;
	}

	public Cuadro getCuadro() {
		return cuadro;
	}

	public void setCuadro(Cuadro cuadro) {
		this.cuadro = cuadro;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos += puntos;
	}
	
	
	
}
