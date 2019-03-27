package es.fpdual.primero.AdmElec.modelo;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Expediente extends AdministracionElectronicaBase {

	private final TipoExpediente tipoExpediente;
	private final List<Documento> documentos;
	
	public Expediente(int id, String nombre, Usuario usuario, Date fechaCreacion, TipoExpediente tipoExpediente, List<Documento> documentos) {
		this.id = id;
		this.nombre = nombre;
		this.usuario = usuario;
		this.fechaCreacion = fechaCreacion;
		this.tipoExpediente = tipoExpediente;
		this.documentos = documentos;
	}

	public TipoExpediente getTipoExpediente() {
		return tipoExpediente;
	}

	
	public List<Documento> getDocumentos() {
		return this.documentos;
	}

	@Override
	public boolean equals(Object obj) {
		
		if (obj instanceof Expediente) {
		final Expediente expediente = (Expediente) obj;
		return this.id == expediente.getId();
		} 
			return false;
			
	}
	
	public List<Integer> obtenerLongitudNombresDocumentos() {
		return documentos.stream().
				map(Documento::getNombre).
				map(String::length).
				collect(Collectors.toList());
	}

	@Override
	public int hashCode() {
		return this.id;
	}
	
}