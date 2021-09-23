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
@Table(name="PublicacionVivienda")
public class PublicacionVivienda implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPublicacionVivienda;
	
	private boolean CompartidoPV;
	
	@Column(name="PresentacionPV", nullable=false, length=500)
	private String PresentacionPV;
	
	@OneToOne
	@JoinColumn(name="idVivienda", nullable=false)
	private Vivienda viviendaPV;

	public PublicacionVivienda() {
		super();
	}

	public PublicacionVivienda(int idPublicacionVivienda, boolean compartidoPV, String presentacionPV,
			Vivienda viviendaPV) {
		super();
		this.idPublicacionVivienda = idPublicacionVivienda;
		CompartidoPV = compartidoPV;
		PresentacionPV = presentacionPV;
		this.viviendaPV = viviendaPV;
	}

	public int getIdPublicacionVivienda() {
		return idPublicacionVivienda;
	}

	public void setIdPublicacionVivienda(int idPublicacionVivienda) {
		this.idPublicacionVivienda = idPublicacionVivienda;
	}

	public boolean getCompartidoPV() {
		return CompartidoPV;
	}

	public void setCompartidoPV(boolean compartidoPV) {
		CompartidoPV = compartidoPV;
	}

	public String getPresentacionPV() {
		return PresentacionPV;
	}

	public void setPresentacionPV(String presentacionPV) {
		PresentacionPV = presentacionPV;
	}

	public Vivienda getViviendaPV() {
		return viviendaPV;
	}

	public void setViviendaPV(Vivienda viviendaPV) {
		this.viviendaPV = viviendaPV;
	}
	
}
