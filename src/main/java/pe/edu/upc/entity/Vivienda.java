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
@Table(name="Vivienda")
public class Vivienda implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idVivienda;
	
	@Column(name="NombreV", nullable=false, length=20)
	private String NombreV;
	
	@Column(name="DireccionV", nullable=false, length=200)
	private String DireccionV;
	
	private int NCuartos;
	
	private int NBanios;
	
	private int NPisos;
	
	private int NPersonas;
	
	@ManyToOne
	@JoinColumn(name="idPropietario", nullable=false)
	private Propietario propietarioV;

	public Vivienda() {
		super();
	}

	public Vivienda(int idVivienda, String nombreV, String direccionV, int nCuartos, int nBanios, int nPisos,
			int nPersonas, Propietario propietarioV) {
		super();
		this.idVivienda = idVivienda;
		NombreV = nombreV;
		DireccionV = direccionV;
		NCuartos = nCuartos;
		NBanios = nBanios;
		NPisos = nPisos;
		NPersonas = nPersonas;
		this.propietarioV = propietarioV;
	}

	public int getIdVivienda() {
		return idVivienda;
	}

	public void setIdVivienda(int idVivienda) {
		this.idVivienda = idVivienda;
	}

	public String getNombreV() {
		return NombreV;
	}

	public void setNombreV(String nombreV) {
		NombreV = nombreV;
	}

	public String getDireccionV() {
		return DireccionV;
	}

	public void setDireccionV(String direccionV) {
		DireccionV = direccionV;
	}

	public int getNCuartos() {
		return NCuartos;
	}

	public void setNCuartos(int nCuartos) {
		NCuartos = nCuartos;
	}

	public int getNBanios() {
		return NBanios;
	}

	public void setNBanios(int nBanios) {
		NBanios = nBanios;
	}

	public int getNPisos() {
		return NPisos;
	}

	public void setNPisos(int nPisos) {
		NPisos = nPisos;
	}

	public int getNPersonas() {
		return NPersonas;
	}

	public void setNPersonas(int nPersonas) {
		NPersonas = nPersonas;
	}

	public Propietario getPropietarioV() {
		return propietarioV;
	}

	public void setPropietarioV(Propietario propietarioV) {
		this.propietarioV = propietarioV;
	}
	
	

}
