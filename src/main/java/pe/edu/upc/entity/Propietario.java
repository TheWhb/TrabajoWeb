package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Propietario")
public class Propietario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPropietario;
	
	@Column(name="NombreP", nullable=false, length=20)
	private String NombreP;
	
	@Column(name="ApellidoP", nullable=false, length=20)
	private String ApellidoP;
	
	private int DNIP;
	
	@Column(name="UsernameP", nullable=false, length=20)
	private String UsernameP;
	
	private int EdadP;
	
	private Date FNacimientoP;
	
	@Column(name="GeneroP", nullable=false, length=20)
	private String GeneroP;
	
	private int NroCelularP;
	
	@Column(name="EmailP", nullable=false, length=40)
	private String EmailP;
	
	@Column(name="NacionalidadP", nullable=false, length=20)
	private String NacionalidadP;
	
	@Column(name="PresentacionP", nullable=false, length=500)
	private String PresentacionP;

	public Propietario() {
		super();
	}

	public Propietario(int idPropietario, String nombreP, String apellidoP, int dNIP, String usernameP, int edadP,
			Date fNacimientoP, String generoP, int nroCelularP, String emailP, String nacionalidadP,
			String presentacionP) {
		super();
		this.idPropietario = idPropietario;
		NombreP = nombreP;
		ApellidoP = apellidoP;
		DNIP = dNIP;
		UsernameP = usernameP;
		EdadP = edadP;
		FNacimientoP = fNacimientoP;
		GeneroP = generoP;
		NroCelularP = nroCelularP;
		EmailP = emailP;
		NacionalidadP = nacionalidadP;
		PresentacionP = presentacionP;
	}

	public int getIdPropietario() {
		return idPropietario;
	}

	public void setIdPropietario(int idPropietario) {
		this.idPropietario = idPropietario;
	}

	public String getNombreP() {
		return NombreP;
	}

	public void setNombreP(String nombreP) {
		NombreP = nombreP;
	}

	public String getApellidoP() {
		return ApellidoP;
	}

	public void setApellidoP(String apellidoP) {
		ApellidoP = apellidoP;
	}

	public int getDNIP() {
		return DNIP;
	}

	public void setDNIP(int dNIP) {
		DNIP = dNIP;
	}

	public String getUsernameP() {
		return UsernameP;
	}

	public void setUsernameP(String usernameP) {
		UsernameP = usernameP;
	}

	public int getEdadP() {
		return EdadP;
	}

	public void setEdadP(int edadP) {
		EdadP = edadP;
	}

	public Date getFNacimientoP() {
		return FNacimientoP;
	}

	public void setFNacimientoP(Date fNacimientoP) {
		FNacimientoP = fNacimientoP;
	}

	public String getGeneroP() {
		return GeneroP;
	}

	public void setGeneroP(String generoP) {
		GeneroP = generoP;
	}

	public int getNroCelularP() {
		return NroCelularP;
	}

	public void setNroCelularP(int nroCelularP) {
		NroCelularP = nroCelularP;
	}

	public String getEmailP() {
		return EmailP;
	}

	public void setEmailP(String emailP) {
		EmailP = emailP;
	}

	public String getNacionalidadP() {
		return NacionalidadP;
	}

	public void setNacionalidadP(String nacionalidadP) {
		NacionalidadP = nacionalidadP;
	}

	public String getPresentacionP() {
		return PresentacionP;
	}

	public void setPresentacionP(String presentacionP) {
		PresentacionP = presentacionP;
	}
	
	//Public boolean 
	
}
