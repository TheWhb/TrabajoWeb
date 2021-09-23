package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Propietario;
import pe.edu.upc.service.IPropietarioService;

@Named
@RequestScoped
public class PropietarioController implements Serializable {

	private static final long serialVersionUID = -6186585572086714609L;
	
	@Inject
	private IPropietarioService pService;
	private Propietario propietario;
	List<Propietario> listaPropietario;
	
	@PostConstruct
	public void init() {
		this.listaPropietario = new ArrayList<Propietario>();
		this.propietario = new Propietario();
		this.listarPropietario();
	}
	
	public String nuevoPropietario() {
		this.setPropietario(new Propietario());
		return "propietario.xhtml";
	}
	
	public String modificarPropietario() {
		return "propietario.xhtml";
	}

	public void insertarPropietario() {
		pService.insertar(propietario);
		this.limpiarPropietario();
		this.listarPropietario();
	}
	
	public void listarPropietario() {
		listaPropietario = pService.listar();
	}
	
	public void mostrarPropietario(int idPropietario) {
		propietario = pService.mostrar(idPropietario);
	}
	
	public void actualizarPropietario() {
		pService.actualizar(propietario);
	}
	
	public void limpiarPropietario() {
		this.init();
	}
	
	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	public List<Propietario> getListaPropietario() {
		return listaPropietario;
	}

	public void setListaPropietario(List<Propietario> listaPropietario) {
		this.listaPropietario = listaPropietario;
	}
	
}
