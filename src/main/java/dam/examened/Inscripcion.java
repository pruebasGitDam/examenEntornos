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
public class Inscripcion {
	
	public static ArrayList<Alumno> alumnos = new ArrayList<>();
	private static ArrayList<Cuadro> cuadros = new ArrayList<>();
	
	public Inscripcion() {}
	
	public static void inscribeAlumno(Alumno alumno, Cuadro cuadro) {
		if (!existeAlumno(alumno) && !existeCuadro(cuadro)) {
			alumnos.add(alumno);
			cuadros.add(cuadro);
		}
	}
	
	public static boolean existeAlumno(Alumno alumno) {
		boolean existe = false;
		
		for (int i = 0; i < alumnos.size(); i++) {
			if (alumno.getNombre().equals(alumnos.get(i).getNombre()) &&
					alumno.getApellidos().equals(alumnos.get(i).getApellidos())) {
				existe = true;
			}
		}
		
		return existe;
	}
	
	public static boolean existeCuadro(Cuadro cuadro) {
		boolean existe = false;
		
		for (int i = 0; i < cuadros.size(); i++) {
			if (cuadro.getNombre().equals(cuadros.get(i).getNombre())) {
				existe = true;
			}
		}
		
		return existe;
	}

	public static void puntuarCuadro(Cuadro cuadro, int puntos) {
		if (existeCuadro(cuadro)) {
			for (int i = 0; i < cuadros.size(); i++) {
				if (cuadro.getNombre().equals(cuadros.get(i).getNombre())) {
					alumnos.get(i).setPuntos(i);
				}
			}
		}
	}
	
}
