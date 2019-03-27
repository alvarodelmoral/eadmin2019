package es.fpdual.primero.AdmElec.modelo;

import java.util.Date;

public class DocumentoContable extends Documento {

	private final String numeroOperacionContable;
	
	public DocumentoContable(int id, String nombre, Usuario usuario, Date fechaCreacion, TipoDocumento tipoDocumento, String numeroOperacionContable) {
		super(id, nombre, usuario, fechaCreacion, tipoDocumento.DOCUMENTO_CONTABLE);
		this.numeroOperacionContable = numeroOperacionContable;
		
	}

	public String getNumeroOperacionContable() {
		return numeroOperacionContable;
	}
	
	@Override 
	public boolean equals(Object obj) {
		
		if (obj instanceof DocumentoContable) {
		final DocumentoContable documentoContable = (DocumentoContable) obj;
		return this.id == documentoContable.getId();
		}
			return false;
			
	}

	@Override
	public int hashCode() {
		return this.id;
	}

}
