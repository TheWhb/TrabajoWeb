package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Roomie")
public class Roomie implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRoomie;
	
	@Column(name="NombreR", nullable=false, length=20)
	private String NombreR;
	
	@Column(name="ApellidoR", nullable=false, length=20)
	private String ApellidoR;
	
	private int DNIR;
	
	@Column(name="UsernameR", nullable=false, length=20)
	private String UsernameR;
	
	private int EdadR;
	
	private Date FNacimientoR;
	
	@Column(name="GeneroR", nullable=false, length=20)
	private String GeneroR;
	
	private int NroCelularR;
	
	@Column(name="EmailR", nullable=false, length=40)
	private String EmailR;
	
	@Column(name="NacionalidadR", nullable=false, length=20)
	private String NacionalidadR;
	
	@Column(name="PresentacionR", nullable=false, length=500)
	private String PresentacionR;
	
	@ManyToOne
	@JoinColumn(name="idVivienda", nullable=true)
	private Vivienda viviendaR;

	public Roomie() {
		super();
	}

	public Roomie(int idRoomie, String nombreR, String apellidoR, int dNIR, String usernameR, int edadR,
			Date fNacimientoR, String generoR, int nroCelularR, String emailR, String nacionalidadR,
			String presentacionR, Vivienda viviendaR) {
		super();
		this.idRoomie = idRoomie;
		NombreR = nombreR;
		ApellidoR = apellidoR;
		DNIR = dNIR;
		UsernameR = usernameR;
		EdadR = edadR;
		FNacimientoR = fNacimientoR;
		GeneroR = generoR;
		NroCelularR = nroCelularR;
		EmailR = emailR;
		NacionalidadR = nacionalidadR;
		PresentacionR = presentacionR;
		this.viviendaR = viviendaR;
	}

	public int getIdRoomie() {
		return idRoomie;
	}

	public void setIdRoomie(int idRoomie) {
		this.idRoomie = idRoomie;
	}

	public String getNombreR() {
		return NombreR;
	}

	public void setNombreR(String nombreR) {
		NombreR = nombreR;
	}

	public String getApellidoR() {
		return ApellidoR;
	}

	public void setApellidoR(String apellidoR) {
		ApellidoR = apellidoR;
	}

	public int getDNIR() {
		return DNIR;
	}

	public void setDNIR(int dNIR) {
		DNIR = dNIR;
	}

	public String getUsernameR() {
		return UsernameR;
	}

	public void setUsernameR(String usernameR) {
		UsernameR = usernameR;
	}

	public int getEdadR() {
		return EdadR;
	}

	public void setEdadR(int edadR) {
		EdadR = edadR;
	}

	public Date getFNacimientoR() {
		return FNacimientoR;
	}

	public void setFNacimientoR(Date fNacimientoR) {
		FNacimientoR = fNacimientoR;
	}

	public String getGeneroR() {
		return GeneroR;
	}

	public void setGeneroR(String generoR) {
		GeneroR = generoR;
	}

	public int getNroCelularR() {
		return NroCelularR;
	}

	public void setNroCelularR(int nroCelularR) {
		NroCelularR = nroCelularR;
	}

	public String getEmailR() {
		return EmailR;
	}

	public void setEmailR(String emailR) {
		EmailR = emailR;
	}

	public String getNacionalidadR() {
		return NacionalidadR;
	}

	public void setNacionalidadR(String nacionalidadR) {
		NacionalidadR = nacionalidadR;
	}

	public String getPresentacionR() {
		return PresentacionR;
	}

	public void setPresentacionR(String presentacionR) {
		PresentacionR = presentacionR;
	}

	public Vivienda getViviendaR() {
		return viviendaR;
	}

	public void setViviendaR(Vivienda viviendaR) {
		this.viviendaR = viviendaR;
	}
	
	//Public boolean 
	
}
