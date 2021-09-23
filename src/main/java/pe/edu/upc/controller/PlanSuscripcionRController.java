package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.PlanSuscripcionR;
import pe.edu.upc.entity.Suscripcion;
import pe.edu.upc.entity.Roomie;
import pe.edu.upc.service.IPlanSuscripcionRService;
import pe.edu.upc.service.ISuscripcionService;
import pe.edu.upc.service.IRoomieService;

@Named
@RequestScoped
public class PlanSuscripcionRController implements Serializable {

	private static final long serialVersionUID = -1242321324201076862L;
	
	@Inject
	private IPlanSuscripcionRService psrService;
	private IRoomieService rService;
	private ISuscripcionService sService;
	private PlanSuscripcionR planSuscripcionR;
	private Roomie roomie;
	private Suscripcion suscripcion;
	List<PlanSuscripcionR> listaPlanSuscripcionR;
	List<Roomie> listaRoomie;
	List<Suscripcion> listaSuscripcion;
	
	@PostConstruct
	public void init() {
		this.listaPlanSuscripcionR = new ArrayList<PlanSuscripcionR>();
		this.listaRoomie = new ArrayList<Roomie>();
		this.listaSuscripcion = new ArrayList<Suscripcion>();
		this.planSuscripcionR = new PlanSuscripcionR();
		this.roomie = new Roomie();
		this.suscripcion = new Suscripcion();
		this.listarPlanSuscripcionR();
		this.listarRoomie();
		this.listarSuscripcion();
	}
	
	public String nuevoPlanSuscripcionR() {
		this.setPlanSuscripcionR(new PlanSuscripcionR());
		return "plansuscripcionr.xhtml";
	}

	public void insertarPlanSuscripcionR() {
		psrService.insertar(planSuscripcionR);
		this.limpiarPlanSuscripcionR();
		this.listarPlanSuscripcionR();
	}
	
	public void listarPlanSuscripcionR() {
		listaPlanSuscripcionR = psrService.listar();
	}
	
	public void listarRoomie() {
		listaRoomie = rService.listar();
	}
	
	public void listarSuscripcion() {
		listaSuscripcion = sService.listar();
	}
	
	public void mostrarPlanSuscripcionR(int idPlanSuscripcionR) {
		planSuscripcionR = psrService.mostrar(idPlanSuscripcionR);
	}

	public void mostrarRoomie(int idRoomie) {
		roomie = rService.mostrar(idRoomie);
	}
	
	public void mostrarSuscripcion(int idSuscripcion) {
		suscripcion = sService.mostrar(idSuscripcion);
	}
	
	public void actualizarPlanSuscripcionR() {
		psrService.actualizar(planSuscripcionR);
	}
	
	public void eliminarPlanSuscripcionR(PlanSuscripcionR planSuscripcionR) {
		psrService.eliminar(planSuscripcionR.getIdPlanSuscripcionR());
	}
	
	public void limpiarPlanSuscripcionR() {
		this.init();
	}

	public PlanSuscripcionR getPlanSuscripcionR() {
		return planSuscripcionR;
	}

	public void setPlanSuscripcionR(PlanSuscripcionR planSuscripcionR) {
		this.planSuscripcionR = planSuscripcionR;
	}

	public Roomie getRoomie() {
		return roomie;
	}

	public void setRoomie(Roomie roomie) {
		this.roomie = roomie;
	}

	public Suscripcion getSuscripcion() {
		return suscripcion;
	}

	public void setSuscripcion(Suscripcion suscripcion) {
		this.suscripcion = suscripcion;
	}

	public List<PlanSuscripcionR> getListaPlanSuscripcionR() {
		return listaPlanSuscripcionR;
	}

	public void setListaPlanSuscripcionR(List<PlanSuscripcionR> listaPlanSuscripcionR) {
		this.listaPlanSuscripcionR = listaPlanSuscripcionR;
	}

	public List<Roomie> getListaRoomie() {
		return listaRoomie;
	}

	public void setListaRoomie(List<Roomie> listaRoomie) {
		this.listaRoomie = listaRoomie;
	}

	public List<Suscripcion> getListaSuscripcion() {
		return listaSuscripcion;
	}

	public void setListaSuscripcion(List<Suscripcion> listaSuscripcion) {
		this.listaSuscripcion = listaSuscripcion;
	}

}
