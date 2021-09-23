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
@Table(name="PlanSuscripcionR")
public class PlanSuscripcionR implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPlanSuscripcionR;
	
	private boolean RenovablePSR;
	
	@ManyToOne
	@JoinColumn(name="idRoomie", nullable=false)
	private Roomie roomiePSR;
	
	@ManyToOne
	@JoinColumn(name="idSuscripcion", nullable=false)
	private Suscripcion suscripcionPSR;

	public PlanSuscripcionR() {
		super();
	}

	public PlanSuscripcionR(int idPlanSuscripcionR, boolean renovablePSR, Roomie roomiePSR,
			Suscripcion suscripcionPSR) {
		super();
		this.idPlanSuscripcionR = idPlanSuscripcionR;
		RenovablePSR = renovablePSR;
		this.roomiePSR = roomiePSR;
		this.suscripcionPSR = suscripcionPSR;
	}

	public int getIdPlanSuscripcionR() {
		return idPlanSuscripcionR;
	}

	public void setIdPlanSuscripcionR(int idPlanSuscripcionR) {
		this.idPlanSuscripcionR = idPlanSuscripcionR;
	}

	public boolean isRenovablePSR() {
		return RenovablePSR;
	}

	public void setRenovablePSR(boolean renovablePSR) {
		RenovablePSR = renovablePSR;
	}

	public Roomie getRoomiePSR() {
		return roomiePSR;
	}

	public void setRoomiePSR(Roomie roomiePSR) {
		this.roomiePSR = roomiePSR;
	}

	public Suscripcion getSuscripcionPSR() {
		return suscripcionPSR;
	}

	public void setSuscripcionPSR(Suscripcion suscripcionPSR) {
		this.suscripcionPSR = suscripcionPSR;
	}
	
}
