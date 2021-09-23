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
@Table(name="SesionRoomie")
public class SesionRoomie implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSesionRoomie;
	
	@Column(name="ContraseñaSR", nullable=false, length=15)
	private String ContraseñaSR;
	
	@Column(name="EmailSR", nullable=false, length=40)
	private String EmailSR;
	
	@OneToOne
	@JoinColumn(name="idRoomie", nullable=false)
	private Roomie roomieSR;

	public SesionRoomie() {
		super();
	}

	public SesionRoomie(int idSesionRoomie, String contraseñaSR, String emailSR, Roomie roomieSR) {
		super();
		this.idSesionRoomie = idSesionRoomie;
		ContraseñaSR = contraseñaSR;
		EmailSR = emailSR;
		this.roomieSR = roomieSR;
	}

	public int getIdSesionRoomie() {
		return idSesionRoomie;
	}

	public void setIdSesionRoomie(int idSesionRoomie) {
		this.idSesionRoomie = idSesionRoomie;
	}

	public String getContraseñaSR() {
		return ContraseñaSR;
	}

	public void setContraseñaSR(String contraseñaSR) {
		ContraseñaSR = contraseñaSR;
	}

	public String getEmailSR() {
		return EmailSR;
	}

	public void setEmailSR(String emailSR) {
		EmailSR = emailSR;
	}

	public Roomie getRoomieSR() {
		return roomieSR;
	}

	public void setRoomieSR(Roomie roomieSR) {
		this.roomieSR = roomieSR;
	}	

	
	
}
