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
@Table(name="BloqueoRoomie")
public class BloqueoRoomie implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idBloqueoRoomie;
	
	@Column(name="RazonBR", nullable=false, length=20)
	private String RazonBR;
	
	@Column(name="ComentarioBR", nullable=false, length=500)
	private String ComentarioBR;
	
	@ManyToOne
	@JoinColumn(name="idRoomie", nullable=false)
	private Roomie roomieBR;

	@ManyToOne
	@JoinColumn(name="idPropietario", nullable=false)
	private Propietario propietarioBR;

	public BloqueoRoomie() {
		super();
	}

	public BloqueoRoomie(int idBloqueoRoomie, String razonBR, String comentarioBR, Roomie roomieBR,
			Propietario propietarioBR) {
		super();
		this.idBloqueoRoomie = idBloqueoRoomie;
		RazonBR = razonBR;
		ComentarioBR = comentarioBR;
		this.roomieBR = roomieBR;
		this.propietarioBR = propietarioBR;
	}

	public int getIdBloqueoRoomie() {
		return idBloqueoRoomie;
	}

	public void setIdBloqueoRoomie(int idBloqueoRoomie) {
		this.idBloqueoRoomie = idBloqueoRoomie;
	}

	public String getRazonBR() {
		return RazonBR;
	}

	public void setRazonBR(String razonBR) {
		RazonBR = razonBR;
	}

	public String getComentarioBR() {
		return ComentarioBR;
	}

	public void setComentarioBR(String comentarioBR) {
		ComentarioBR = comentarioBR;
	}

	public Roomie getRoomieBR() {
		return roomieBR;
	}

	public void setRoomieBR(Roomie roomieBR) {
		this.roomieBR = roomieBR;
	}

	public Propietario getPropietarioBR() {
		return propietarioBR;
	}

	public void setPropietarioBR(Propietario propietarioBR) {
		this.propietarioBR = propietarioBR;
	}
	
}
