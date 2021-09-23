package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Suscripcion")
public class Suscripcion implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSuscripcion;
	
	@Column(name="TipoSuscripcion", nullable=false, length=20)
	private String TipoSuscripcion;
	
	private int CostoS;

	public Suscripcion() {
		super();
	}

	public Suscripcion(int idSuscripcion, String tipoSuscripcion, int costoS) {
		super();
		this.idSuscripcion = idSuscripcion;
		TipoSuscripcion = tipoSuscripcion;
		CostoS = costoS;
	}

	public int getIdSuscripcion() {
		return idSuscripcion;
	}

	public void setIdSuscripcion(int idSuscripcion) {
		this.idSuscripcion = idSuscripcion;
	}

	public String getTipoSuscripcion() {
		return TipoSuscripcion;
	}

	public void setTipoSuscripcion(String tipoSuscripcion) {
		TipoSuscripcion = tipoSuscripcion;
	}

	public int getCostoS() {
		return CostoS;
	}

	public void setCostoS(int costoS) {
		CostoS = costoS;
	}
	
}
