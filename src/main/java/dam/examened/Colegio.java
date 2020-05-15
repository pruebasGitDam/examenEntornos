/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam.examened;

import java.util.ArrayList;

/**
 *
 * @author rulo
 */
public class Colegio {
	
	private String nombre;
	private String direccion;
	private String email;
	private String password;
	private String contacto;
	
	public Colegio(String nombre, String direccion, String email, String password, String contacto) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.email = email;
		this.password = password;
		this.contacto = contacto;
	}
	
	public void inscribeAlumno(Alumno alumno, Cuadro cuadro) {
		if (!Inscripcion.existeAlumno(alumno)) {
			Inscripcion.inscribeAlumno(alumno, cuadro);
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}
	
}
