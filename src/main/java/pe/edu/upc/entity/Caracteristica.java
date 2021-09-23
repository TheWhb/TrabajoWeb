package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Caracteristica")
public class Caracteristica implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCaracteristica;
	
	@Column(name="NombreC", nullable=false, length=20)
	private String NombreC;

	public Caracteristica() {
		super();
	}

	public Caracteristica(int idCaracteristica, String nombreC) {
		super();
		this.idCaracteristica = idCaracteristica;
		NombreC = nombreC;
	}

	public int getIdCaracteristica() {
		return idCaracteristica;
	}

	public void setIdCaracteristica(int idCaracteristica) {
		this.idCaracteristica = idCaracteristica;
	}

	public String getNombreC() {
		return NombreC;
	}

	public void setNombreC(String nombreC) {
		NombreC = nombreC;
	}
	
	
}
