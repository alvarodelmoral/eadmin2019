package es.fpdual.primero.AdmElec.modelo;

import java.util.Date;

public class DocumentoFactura extends Documento {

	private final String importeFactura;
	
	public DocumentoFactura(int id, String nombre, Usuario usuario, Date fechaCreacion, TipoDocumento tipoDocumento, String importeFactura) {
		super(id, nombre, usuario, fechaCreacion, tipoDocumento.DOCUMENTO_FACTURA);
		this.importeFactura = importeFactura;
		
	}


	public String getImporteFactura() {
		return importeFactura;
	}


	@Override 
	public boolean equals(Object obj) {
		
		if (obj instanceof DocumentoFactura) {
		final DocumentoFactura documentoFactura = (DocumentoFactura) obj;
		return this.id == documentoFactura.getId();
		}
			return false;
			
	}

	@Override
	public int hashCode() {
		return this.id;
	}

}
