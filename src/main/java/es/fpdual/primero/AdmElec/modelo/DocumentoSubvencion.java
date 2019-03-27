package es.fpdual.primero.AdmElec.modelo;

import java.util.Date;

public class DocumentoSubvencion extends Documento {

	private final String numeroOperacionContable;
	
	public DocumentoSubvencion(int id, String nombre, Usuario usuario, Date fechaCreacion, TipoDocumento tipoDocumento, String numeroOperacionContable) {
		super(id, nombre, usuario, fechaCreacion, tipoDocumento.DOCUMENTO_SUBVENCION);
		this.numeroOperacionContable = numeroOperacionContable;
		
	}

	public String getNumeroOperacionContable() {
		return numeroOperacionContable;
	}
	
	@Override 
	public boolean equals(Object obj) {
		
		if (obj instanceof DocumentoSubvencion) {
		final DocumentoSubvencion documentoSubvencion = (DocumentoSubvencion) obj;
		return this.id == documentoSubvencion.getId();
		}
			return false;
			
	}

	@Override
	public int hashCode() {
		return this.id;
	}

}
