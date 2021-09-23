package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.PlanSuscripcionP;
import pe.edu.upc.entity.Suscripcion;
import pe.edu.upc.entity.Propietario;
import pe.edu.upc.service.IPlanSuscripcionPService;
import pe.edu.upc.service.ISuscripcionService;
import pe.edu.upc.service.IPropietarioService;

@Named
@RequestScoped
public class PlanSuscripcionPController implements Serializable {

	private static final long serialVersionUID = -1242321324201076862L;
	
	@Inject
	private IPlanSuscripcionPService pspService;
	private IPropietarioService pService;
	private ISuscripcionService sService;
	private PlanSuscripcionP planSuscripcionP;
	private Propietario propietario;
	private Suscripcion suscripcion;
	List<PlanSuscripcionP> listaPlanSuscripcionP;
	List<Propietario> listaPropietario;
	List<Suscripcion> listaSuscripcion;
	
	@PostConstruct
	public void init() {
		this.listaPlanSuscripcionP = new ArrayList<PlanSuscripcionP>();
		this.listaPropietario = new ArrayList<Propietario>();
		this.listaSuscripcion = new ArrayList<Suscripcion>();
		this.planSuscripcionP = new PlanSuscripcionP();
		this.propietario = new Propietario();
		this.suscripcion = new Suscripcion();
		this.listarPlanSuscripcionP();
		this.listarPropietario();
		this.listarSuscripcion();
	}
	
	public String nuevoPlanSuscripcionR() {
		this.setPlanSuscripcionP(new PlanSuscripcionP());
		return "plansuscripcionp.xhtml";
	}

	public void insertarPlanSuscripcionP() {
		pspService.insertar(planSuscripcionP);
		this.limpiarPlanSuscripcionP();
		this.listarPlanSuscripcionP();
	}
	
	public void listarPlanSuscripcionP() {
		listaPlanSuscripcionP = pspService.listar();
	}
	
	public void listarPropietario() {
		listaPropietario = pService.listar();
	}
	
	public void listarSuscripcion() {
		listaSuscripcion = sService.listar();
	}
	
	public void mostrarPlanSuscripcionP(int idPlanSuscripcionP) {
		planSuscripcionP = pspService.mostrar(idPlanSuscripcionP);
	}

	public void mostrarPropietario(int idPropietario) {
		propietario = pService.mostrar(idPropietario);
	}
	
	public void mostrarSuscripcion(int idSuscripcion) {
		suscripcion = sService.mostrar(idSuscripcion);
	}
	
	public void actualizarPlanSuscripcionP() {
		pspService.actualizar(planSuscripcionP);
	}
	
	public void eliminarPlanSuscripcionP(PlanSuscripcionP planSuscripcionP) {
		pspService.eliminar(planSuscripcionP.getIdPlanSuscripcionP());
	}
	
	public void limpiarPlanSuscripcionP() {
		this.init();
	}

	public PlanSuscripcionP getPlanSuscripcionP() {
		return planSuscripcionP;
	}

	public void setPlanSuscripcionP(PlanSuscripcionP planSuscripcionP) {
		this.planSuscripcionP = planSuscripcionP;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	public Suscripcion getSuscripcion() {
		return suscripcion;
	}

	public void setSuscripcion(Suscripcion suscripcion) {
		this.suscripcion = suscripcion;
	}

	public List<PlanSuscripcionP> getListaPlanSuscripcionP() {
		return listaPlanSuscripcionP;
	}

	public void setListaPlanSuscripcionP(List<PlanSuscripcionP> listaPlanSuscripcionP) {
		this.listaPlanSuscripcionP = listaPlanSuscripcionP;
	}

	public List<Propietario> getListaPropietario() {
		return listaPropietario;
	}

	public void setListaPropietario(List<Propietario> listaPropietario) {
		this.listaPropietario = listaPropietario;
	}

	public List<Suscripcion> getListaSuscripcion() {
		return listaSuscripcion;
	}

	public void setListaSuscripcion(List<Suscripcion> listaSuscripcion) {
		this.listaSuscripcion = listaSuscripcion;
	}

}
