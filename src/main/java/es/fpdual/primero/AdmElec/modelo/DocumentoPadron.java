package es.fpdual.primero.AdmElec.modelo;

import java.util.Date;

public class DocumentoPadron extends Documento {

	private final String numeroOperacionContable;
	
	public DocumentoPadron(int id, String nombre, Usuario usuario, Date fechaCreacion, TipoDocumento tipoDocumento, String numeroOperacionContable) {
		super(id, nombre, usuario, fechaCreacion, tipoDocumento.DOCUMENTO_PADRON);
		this.numeroOperacionContable = numeroOperacionContable;
		
	}

	public String getNumeroOperacionContable() {
		return numeroOperacionContable;
	}
	
	@Override 
	public boolean equals(Object obj) {
		
		if (obj instanceof DocumentoPadron) {
		final DocumentoPadron documentoPadron = (DocumentoPadron) obj;
		return this.id == documentoPadron.getId();
		}
			return false;
			
	}

	@Override
	public int hashCode() {
		return this.id;
	}

}
