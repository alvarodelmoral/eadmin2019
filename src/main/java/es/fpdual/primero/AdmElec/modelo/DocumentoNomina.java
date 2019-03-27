package es.fpdual.primero.AdmElec.modelo;

import java.util.Date;

public class DocumentoNomina extends Documento {

	private final String numeroOperacionContable;
	
	public DocumentoNomina(int id, String nombre, Usuario usuario, Date fechaCreacion, TipoDocumento tipoDocumento, String numeroOperacionContable) {
		super(id, nombre, usuario, fechaCreacion, tipoDocumento.DOCUMENTO_NOMINA);
		this.numeroOperacionContable = numeroOperacionContable;
		
	}

	public String getNumeroOperacionContable() {
		return numeroOperacionContable;
	}
	
	@Override 
	public boolean equals(Object obj) {
		
		if (obj instanceof DocumentoNomina) {
		final DocumentoNomina documentoNomina = (DocumentoNomina) obj;
		return this.id == documentoNomina.getId();
		}
			return false;
			
	}

	@Override
	public int hashCode() {
		return this.id;
	}

}
