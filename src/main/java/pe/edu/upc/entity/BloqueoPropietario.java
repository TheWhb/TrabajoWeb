package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="BloqueoPropietario")
public class BloqueoPropietario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idBloqueoPropietario;
	
	@Column(name="RazonBP", nullable=false, length=20)
	private String RazonBP;
	
	@Column(name="ComentarioBP", nullable=false, length=500)
	private String ComentarioBP;
	
	@ManyToOne
	@JoinColumn(name="idPropietario", nullable=false)
	private Propietario propietarioBP;

	@ManyToOne
	@JoinColumn(name="idRoomie", nullable=false)
	private Roomie roomieBP;

	public BloqueoPropietario() {
		super();
	}

	public BloqueoPropietario(int idBloqueoPropietario, String razonBP, String comentarioBP, Propietario propietarioBP,
			Roomie roomieBP) {
		super();
		this.idBloqueoPropietario = idBloqueoPropietario;
		RazonBP = razonBP;
		ComentarioBP = comentarioBP;
		this.propietarioBP = propietarioBP;
		this.roomieBP = roomieBP;
	}

	public int getIdBloqueoPropietario() {
		return idBloqueoPropietario;
	}

	public void setIdBloqueoPropietario(int idBloqueoPropietario) {
		this.idBloqueoPropietario = idBloqueoPropietario;
	}

	public String getRazonBP() {
		return RazonBP;
	}

	public void setRazonBP(String razonBP) {
		RazonBP = razonBP;
	}

	public String getComentarioBP() {
		return ComentarioBP;
	}

	public void setComentarioBP(String comentarioBP) {
		ComentarioBP = comentarioBP;
	}

	public Propietario getPropietarioBP() {
		return propietarioBP;
	}

	public void setPropietarioBP(Propietario propietarioBP) {
		this.propietarioBP = propietarioBP;
	}

	public Roomie getRoomieBP() {
		return roomieBP;
	}

	public void setRoomieBP(Roomie roomieBP) {
		this.roomieBP = roomieBP;
	}
	
}
