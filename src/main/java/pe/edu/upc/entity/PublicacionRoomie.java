package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="PublicacionRoomie")
public class PublicacionRoomie implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPublicacionRoomie;
		
	private boolean CompartidoPR;
	
	@Column(name="PresentacionPR", nullable=false, length=500)
	private String PresentacionPR;
	
	@OneToOne
	@JoinColumn(name="idRoomie", nullable=false)
	private Roomie roomiePR;

	public PublicacionRoomie() {
		super();
	}

	public PublicacionRoomie(int idPublicacionRoomie, boolean compartidoPR, String presentacionPR, Roomie roomiePR) {
		super();
		this.idPublicacionRoomie = idPublicacionRoomie;
		CompartidoPR = compartidoPR;
		PresentacionPR = presentacionPR;
		this.roomiePR = roomiePR;
	}

	public int getIdPublicacionRoomie() {
		return idPublicacionRoomie;
	}

	public void setIdPublicacionRoomie(int idPublicacionRoomie) {
		this.idPublicacionRoomie = idPublicacionRoomie;
	}

	public boolean getCompartidoPR() {
		return CompartidoPR;
	}

	public void setCompartidoPR(boolean compartidoPR) {
		CompartidoPR = compartidoPR;
	}

	public String getPresentacionPR() {
		return PresentacionPR;
	}

	public void setPresentacionPR(String presentacionPR) {
		PresentacionPR = presentacionPR;
	}

	public Roomie getRoomiePR() {
		return roomiePR;
	}

	public void setRoomiePR(Roomie roomiePR) {
		this.roomiePR = roomiePR;
	}
	
}
