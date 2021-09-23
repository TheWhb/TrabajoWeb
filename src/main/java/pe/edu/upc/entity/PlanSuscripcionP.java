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
@Table(name="PlanSuscripcionP")
public class PlanSuscripcionP implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPlanSuscripcionP;
	
	private boolean RenovablePSP;
	
	@ManyToOne
	@JoinColumn(name="idPropietario", nullable=false)
	private Propietario propietarioPSP;
	
	@ManyToOne
	@JoinColumn(name="idSuscripcion", nullable=false)
	private Suscripcion suscripcionPSP;

	public PlanSuscripcionP() {
		super();
	}

	public PlanSuscripcionP(int idPlanSuscripcionP, boolean renovablePSP, Propietario propietarioPSP,
			Suscripcion suscripcionPSP) {
		super();
		this.idPlanSuscripcionP = idPlanSuscripcionP;
		RenovablePSP = renovablePSP;
		this.propietarioPSP = propietarioPSP;
		this.suscripcionPSP = suscripcionPSP;
	}

	public int getIdPlanSuscripcionP() {
		return idPlanSuscripcionP;
	}

	public void setIdPlanSuscripcionP(int idPlanSuscripcionP) {
		this.idPlanSuscripcionP = idPlanSuscripcionP;
	}

	public boolean isRenovablePSP() {
		return RenovablePSP;
	}

	public void setRenovablePSP(boolean renovablePSP) {
		RenovablePSP = renovablePSP;
	}

	public Propietario getPropietarioPSP() {
		return propietarioPSP;
	}

	public void setPropietarioPSP(Propietario propietarioPSP) {
		this.propietarioPSP = propietarioPSP;
	}

	public Suscripcion getSuscripcionPSP() {
		return suscripcionPSP;
	}

	public void setSuscripcionPSP(Suscripcion suscripcionPSP) {
		this.suscripcionPSP = suscripcionPSP;
	}
	
}
