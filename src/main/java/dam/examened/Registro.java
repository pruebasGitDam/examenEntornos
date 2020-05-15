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
public class Registro {
	
	private static ArrayList<Colegio> colegios = new ArrayList<>();
	private static ArrayList<Visitante> visitantes = new ArrayList<>();
	
	public Registro() {}
	
	public static void registrarColegio(Colegio colegio) {
		if (!existeColegio(colegio)) {
			colegios.add(colegio);
		}
	}
	
	public static void registrarVisitante(Visitante visitante) {
		if (!existeVisitante(visitante)) {
			visitantes.add(visitante);
		}
	}
	
	public static boolean existeColegio(Colegio colegio) {
		boolean existe = false;
		
		for (int i = 0; i < colegios.size(); i++) {
			if (colegio.getNombre().equals(colegios.get(i).getNombre()) &&
					colegio.getEmail().equals(colegios.get(i).getEmail())) {
				existe = true;
			}
		}
		
		return existe;
	}
	
	public static boolean existeVisitante(Visitante visitante) {
		boolean existe = false;
		
		for (int i = 0; i < visitantes.size(); i++) {
			if (visitante.getEmail().equals(visitantes.get(i).getEmail()) &&
					visitante.getPassword().equals(visitantes.get(i).getPassword())) {
				existe = true;
			}
		}
		
		return existe;
	}
	
	public static ArrayList<Colegio> getColegios() {
		return colegios;
	}
	
	public static ArrayList<Visitante> getVisitantes() {
		return visitantes;
	}
	
}
