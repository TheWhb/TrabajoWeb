package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Regla")
public class Regla implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRegla;
	
	@ManyToOne
	@JoinColumn(name="idVivienda", nullable=false)
	private Vivienda viviendaR;
	
	@ManyToOne
	@JoinColumn(name="idCaracteristica", nullable=false)
	private Caracteristica caracteristicaR;

	public Regla() {
		super();
	}

	public Regla(int idRegla, Vivienda viviendaR, Caracteristica caracteristicaR) {
		super();
		this.idRegla = idRegla;
		this.viviendaR = viviendaR;
		this.caracteristicaR = caracteristicaR;
	}

	public int getIdRegla() {
		return idRegla;
	}

	public void setIdRegla(int idRegla) {
		this.idRegla = idRegla;
	}

	public Vivienda getViviendaR() {
		return viviendaR;
	}

	public void setViviendaR(Vivienda viviendaR) {
		this.viviendaR = viviendaR;
	}

	public Caracteristica getCaracteristicaR() {
		return caracteristicaR;
	}

	public void setCaracteristicaR(Caracteristica caracteristicaR) {
		this.caracteristicaR = caracteristicaR;
	}
	
}
