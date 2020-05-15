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
public class Visitante {
	
	private String email;
	private String password;

	public Visitante(String email, String password) {
		this.email = email;
		this.password = password;
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
	
	public boolean puntuarCuadro(Cuadro cuadro, int puntos) {
		boolean valida = false;
		
		if (puntos > 1 && puntos < 6 && Registro.existeVisitante(this)) {
			Inscripcion.puntuarCuadro(cuadro, puntos);
			valida = true;
		}
		return valida;
	}
	
}
