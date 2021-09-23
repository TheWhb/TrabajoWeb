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
@Table(name="SesionPropietario")
public class SesionPropietario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idSesionPropietario;
	
	@Column(name="ContraseniaSP", nullable=false, length=15)
	private String ContraseniaSP;
	
	@Column(name="EmailSP", nullable=false, length=40)
	private String EmailSP;
	
	@OneToOne
	@JoinColumn(name="idPropietario", nullable=false)
	private Propietario propietarioSP;

	public SesionPropietario() {
		super();
	}	

	public SesionPropietario(int idSesionPropietario, String contraseniaSP, String emailSP, Propietario propietarioSP) {
		super();
		this.idSesionPropietario = idSesionPropietario;
		ContraseniaSP = contraseniaSP;
		EmailSP = emailSP;
		this.propietarioSP = propietarioSP;
	}

	public int getIdSesionPropietario() {
		return idSesionPropietario;
	}

	public void setIdSesionPropietario(int idSesionPropietario) {
		this.idSesionPropietario = idSesionPropietario;
	}

	public String getContraseniaSP() {
		return ContraseniaSP;
	}

	public void setContraseniaSP(String contraseniaSP) {
		ContraseniaSP = contraseniaSP;
	}

	public String getEmailSP() {
		return EmailSP;
	}

	public void setEmailSP(String emailSP) {
		EmailSP = emailSP;
	}

	public Propietario getPropietarioSP() {
		return propietarioSP;
	}

	public void setPropietarioSP(Propietario propietarioSP) {
		this.propietarioSP = propietarioSP;
	}
	
}
