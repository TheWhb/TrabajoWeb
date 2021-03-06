package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

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
	
	@Column(name="ContraseniaP", nullable=false, length=15)
	private String ContraseniaP;
	
	@Column(name="NacionalidadP", nullable=false, length=20)
	private String NacionalidadP;
	
	@Column(name="PresentacionP", nullable=false, length=500)
	private String PresentacionP;

	public Propietario() {
		super();
	}

	public Propietario(int idPropietario, String nombreP, String apellidoP, int dNIP, String usernameP, int edadP,
			Date fNacimientoP, String generoP, int nroCelularP, String emailP, String contraseniaP,
			String nacionalidadP, String presentacionP) {
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
		ContraseniaP = contraseniaP;
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

	public String getContraseniaP() {
		return ContraseniaP;
	}

	public void setContraseniaP(String contraseniaP) {
		ContraseniaP = contraseniaP;
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

	@Override
	public int hashCode() {
		return Objects.hash(ApellidoP, ContraseniaP, DNIP, EdadP, EmailP, FNacimientoP, GeneroP, NacionalidadP,
				NombreP, NroCelularP, PresentacionP, UsernameP, idPropietario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Propietario other = (Propietario) obj;
		return Objects.equals(ApellidoP, other.ApellidoP) && Objects.equals(ContraseniaP, other.ContraseniaP)
				&& DNIP == other.DNIP && EdadP == other.EdadP && Objects.equals(EmailP, other.EmailP)
				&& Objects.equals(FNacimientoP, other.FNacimientoP) && Objects.equals(GeneroP, other.GeneroP)
				&& Objects.equals(NacionalidadP, other.NacionalidadP) && Objects.equals(NombreP, other.NombreP)
				&& NroCelularP == other.NroCelularP && Objects.equals(PresentacionP, other.PresentacionP)
				&& Objects.equals(UsernameP, other.UsernameP) && idPropietario == other.idPropietario;
	}
	
}
