package es.fpdual.primero.AdmElec.modelo;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

public class ExpedienteTest {

	@Test
	public void DeberiaDevolverTrueSiLosExpedientesSonIguales() {
		
		//inicialización
		final Expediente expediente1 = new Expediente(20, null, null, null, null, null);
		final Expediente expediente2 = new Expediente(20, null, null, null, null, null);

		//ejecución
		final boolean resultado = expediente1.equals(expediente2);
		
		//comprobación de resultados
		assertTrue(resultado);
		
	}
	
	@Test
	public void DeberiaDeCalcularHashCode() {
		final Expediente expediente = new Expediente(20, null, null, null, null, null);

		final int resultado = expediente.hashCode();

		assertEquals(resultado, 20);

	}
	
	@Test
	public void DeberiaConstruirUnExpedienteConDocumentos() {
		final Usuario usuario = new Usuario(1, "Juan", "Alcalde");
		Date fecha = new Date();
		
		//inicialización
		final DocumentoContable documentoContable = 
				new DocumentoContable(2, "asda", usuario, fecha, TipoDocumento.DOCUMENTO_FACTURA, "345587970873234234");
		
		final Documento documento =
				new DocumentoContable(55, "ssggh", usuario, fecha, TipoDocumento.DOCUMENTO_CONTABLE, "65656753735765366Y35");
		
		final Documento documentoNuevo =
				new DocumentoContable(55, "nuevo documento", usuario, fecha, TipoDocumento.DOCUMENTO_PADRON, "456763754867845722");
		
		final List<Documento> documentos =
				new ArrayList<Documento>();
		documentos.add(documentoContable);
		documentos.add(documento);
		documentos.add(documentoNuevo);
		
		for(Documento documentoActual: documentos) {
			if (esDocumentoContable(documentoActual)) {
				System.out.println(documentoActual);

			}

		}	
   
		documentos.stream().
		filter(this::esDocumentoContable).
		forEach(System.out::println);
		
		final List<Documento> documentosContables = 
				documentos.stream().filter(this::esDocumentoContable).collect(Collectors.toList());
		
		documentos.stream().
		map(documentoActual -> documentoActual.getNombre()).forEach(longitud -> System.out.println(longitud));
		
		documentos.stream().map(Documento::getNombre).map(String::length).forEach(System.out::println);
		
		for(Documento documentoActual: documentos) {
			
			System.out.println(documentoActual.getNombre().length());

			}

		
		//ejecución
		final Expediente expediente =
				new Expediente(1, "expediente 1", usuario, new Date(), TipoExpediente.EXPEDIENTE_LICENCIA_OBRAS, documentos); 
		
		//comprobación de resultados
		assertEquals(documentos, expediente.getDocumentos());
		assertTrue(expediente.getDocumentos().contains(documentoContable));
		
	}
	
	public boolean esDocumentoContable(Documento documento) {
		return documento.getTipoDocumento().equals(TipoDocumento.DOCUMENTO_CONTABLE);
	}
}
