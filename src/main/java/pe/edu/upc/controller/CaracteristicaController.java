package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Caracteristica;
import pe.edu.upc.service.ICaracteristicaService;

@Named
@RequestScoped
public class CaracteristicaController implements Serializable {

	private static final long serialVersionUID = -6186585572086714609L;
	
	@Inject
	private ICaracteristicaService cService;
	private Caracteristica caracteristica;
	List<Caracteristica> listaCaracteristica;
	
	@PostConstruct
	public void init() {
		this.listaCaracteristica = new ArrayList<Caracteristica>();
		this.caracteristica = new Caracteristica();
		this.listarCaracteristica();
	}
	
	public String nuevoCaracteristica() {
		this.setCaracteristica(new Caracteristica());
		return "caracteristica.xhtml";
	}
	
	public String modificarCaracteristica() {
		return "caracteristica.xhtml";
	}

	public void insertarCaracteristica() {
		cService.insertar(caracteristica);
		this.limpiarCaracteristica();
		this.listarCaracteristica();
	}
	
	public void listarCaracteristica() {
		listaCaracteristica = cService.listar();
	}
	
	public void mostrarCaracteristica(int idCaracteristica) {
		caracteristica = cService.mostrar(idCaracteristica);
	}
	
	public void actualizarCaracteristica() {
		cService.actualizar(caracteristica);
	}
	
	public void eliminarCaracteristica(Caracteristica caracteristica) {
		cService.eliminar(caracteristica.getIdCaracteristica());
	}
	
	public void limpiarCaracteristica() {
		this.init();
	}

	public Caracteristica getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(Caracteristica caracteristica) {
		this.caracteristica = caracteristica;
	}

	public List<Caracteristica> getListaCaracteristica() {
		return listaCaracteristica;
	}

	public void setListaCaracteristica(List<Caracteristica> listaCaracteristica) {
		this.listaCaracteristica = listaCaracteristica;
	}
	
}
