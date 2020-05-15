package dam.examened;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VisitanteTest {

	private Cuadro cuadro = new Cuadro("Cuadrazo", "Oleo", 120, 180);
	private Alumno alumno = new Alumno("Picasso", "Juan Pablo", "DAM", "picasso@mail.com", 1917, cuadro);
	private Colegio colegio = new Colegio("Los maestros", "En su calle", "cole@cole.es", "password", "Margarita");

	public VisitanteTest() {
	}

	@BeforeAll
	public static void setUpClass() {
	}

	@AfterAll
	public static void tearDownClass() {
	}

	@BeforeEach
	public void setUp() {
	}

	@AfterEach
	public void tearDown() {
	}

	@Test
	public void testExisteVisitante() {
		Visitante visitanteRegistrado = new Visitante("visitante1@mail.com", "qwerty1234");
		Registro.registrarVisitante(visitanteRegistrado);
		assertEquals(true, Registro.existeVisitante(visitanteRegistrado));

		Visitante visitanteNoRegistrado = new Visitante("visitante2@mail.com", "qwerty4321");
		assertEquals(false, Registro.existeVisitante(visitanteNoRegistrado));
	}

	@Test
	public void testPuntuarCuadro() {
		colegio.inscribeAlumno(alumno, cuadro);
		Visitante visitanteRegistrado = new Visitante("visitante1@mail.com", "qwerty1234");
		Registro.registrarVisitante(visitanteRegistrado);
		
		// Puntuación no válida
		assertEquals(false, visitanteRegistrado.puntuarCuadro(cuadro, 20));

		visitanteRegistrado.puntuarCuadro(cuadro, 3);
		assertEquals(3, Inscripcion.alumnos.get(0).getPuntos());
	}

}
