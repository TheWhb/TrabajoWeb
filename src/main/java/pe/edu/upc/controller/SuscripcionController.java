package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Suscripcion;
import pe.edu.upc.service.ISuscripcionService;

@Named
@RequestScoped
public class SuscripcionController implements Serializable {

	private static final long serialVersionUID = -6186585572086714609L;
	
	@Inject
	private ISuscripcionService sService;
	private Suscripcion suscripcion;
	List<Suscripcion> listaSuscripcion;
	
	@PostConstruct
	public void init() {
		this.listaSuscripcion = new ArrayList<Suscripcion>();
		this.suscripcion = new Suscripcion();
		this.listarSuscripcion();
	}
	
	public String nuevoSuscripcion() {
		this.setSuscripcion(new Suscripcion());
		return "suscripcion.xhtml";
	}
	
	public String modificarSuscripcion() {
		return "suscripcion.xhtml";
	}

	public void insertarSuscripcion() {
		sService.insertar(suscripcion);
		this.limpiarSuscripcion();
		this.listarSuscripcion();
	}
	
	public void listarSuscripcion() {
		listaSuscripcion = sService.listar();
	}
	
	public void mostrarSuscripcion(int idSuscripcion) {
		suscripcion = sService.mostrar(idSuscripcion);
	}
	
	public void actualizarSuscripcion() {
		sService.actualizar(suscripcion);
	}
	
	public void limpiarSuscripcion() {
		this.init();
	}
	
	public void eliminar(Suscripcion suscripcion) {
		sService.eliminar(suscripcion.getIdSuscripcion());
		this.listarSuscripcion();
	}
	
	public Suscripcion getSuscripcion() {
		return suscripcion;
	}

	public void setSuscripcion(Suscripcion suscripcion) {
		this.suscripcion = suscripcion;
	}

	public List<Suscripcion> getListaSuscripcion() {
		return listaSuscripcion;
	}

	public void setListaSuscripcion(List<Suscripcion> listaSuscripcion) {
		this.listaSuscripcion = listaSuscripcion;
	}
	
}
