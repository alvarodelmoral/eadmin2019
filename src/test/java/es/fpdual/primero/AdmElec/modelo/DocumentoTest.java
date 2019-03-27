package es.fpdual.primero.AdmElec.modelo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DocumentoTest {

	@Test
	public void DeberiaDevolverTrueSiLosDocumentosSonIguales() {
		
		//inicialización
		final Documento documento1 = new Documento(20, null, null, null, null);
		final Documento documento2 = new Documento(20, null, null, null, null);

		//ejecución
		final boolean resultado = documento1.equals(documento2);
		
		//comprobación de resultados
		assertTrue(resultado);
	}
	
	@Test
	public void DeberiaDeCalcularHashCode() {
		final Documento documento = new Documento(20, null, null, null, null);

		final int resultado = documento.hashCode();

		assertEquals(resultado, 20);

	}

}
