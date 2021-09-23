package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Propietario;
import pe.edu.upc.entity.Vivienda;
import pe.edu.upc.service.IPropietarioService;
import pe.edu.upc.service.IViviendaService;

@Named
@RequestScoped
public class ViviendaController implements Serializable {

	private static final long serialVersionUID = -6186585572086714609L;
	
	@Inject
	private IPropietarioService pService;
	private IViviendaService vService;
	private Propietario propietario;
	private Vivienda vivienda;
	List<Propietario> listaPropietario;
	List<Vivienda> listaVivienda;
	
	@PostConstruct
	public void init() {
		this.listaPropietario = new ArrayList<Propietario>();
		this.listaVivienda = new ArrayList<Vivienda>();
		this.propietario = new Propietario();
		this.vivienda = new Vivienda();
		this.listarPropietario();
		this.listarVivienda();
	}
	
	public String nuevoVivienda() {
		this.setVivienda(new Vivienda());
		return "vivienda.xhtml";
	}
	
	public String modificarVivienda() {
		return "vivienda.xhtml";
	}

	public void insertarRoomie() {
		vService.insertar(vivienda);
		this.limpiarVivienda();
		this.listarVivienda();
	}
	
	public void listarPropietario() {
		listaVivienda = vService.listar();
	}
	
	public void listarVivienda() {
		listaPropietario = pService.listar();
	}
	
	public void mostrarPropietario(int idPropietario) {
		propietario = pService.mostrar(idPropietario);
	}
	
	public void mostrarVivienda(int idVivienda) {
		vivienda = vService.mostrar(idVivienda);
	}
	
	public void actualizarVivienda() {
		vService.actualizar(vivienda);
	}
	
	public void limpiarVivienda() {
		this.init();
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	public Vivienda getVivienda() {
		return vivienda;
	}

	public void setVivienda(Vivienda vivienda) {
		this.vivienda = vivienda;
	}

	public List<Propietario> getListaPropietario() {
		return listaPropietario;
	}

	public void setListaPropietario(List<Propietario> listaPropietario) {
		this.listaPropietario = listaPropietario;
	}

	public List<Vivienda> getListaVivienda() {
		return listaVivienda;
	}

	public void setListaVivienda(List<Vivienda> listaVivienda) {
		this.listaVivienda = listaVivienda;
	}
	
}
