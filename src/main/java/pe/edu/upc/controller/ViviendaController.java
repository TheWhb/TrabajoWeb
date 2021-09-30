package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Vivienda;
import pe.edu.upc.entity.Propietario;
import pe.edu.upc.service.IViviendaService;
import pe.edu.upc.service.IPropietarioService;

import pe.edu.upc.util.Message;


@Named
@RequestScoped
public class ViviendaController implements Serializable {

	private static final long serialVersionUID = -6186585572086714609L;

	@Inject
	private IViviendaService vService;
	@Inject
	private IPropietarioService pService;
	private Vivienda vivienda;
	private Propietario propietario;
	List<Vivienda> listaVivienda;
	List<Propietario> listaPropietario;

	@PostConstruct
	public void init() {
		this.listaVivienda = new ArrayList<Vivienda>();
		this.listaPropietario = new ArrayList<Propietario>();
		this.vivienda = new Vivienda();
		this.propietario = new Propietario();
		this.listarVivienda();
		this.listarPropietario();
	}

	public String nuevoVivienda() {
		this.setVivienda(new Vivienda());
		return "vivienda.xhtml";
	}

	public String modificarVivienda() {
		return "vivienda.xhtml";
	}

	public void insertarVivienda() {
		vService.insertar(vivienda);
		this.limpiarVivienda();
		this.listarVivienda();
	}

	public void listarVivienda() {
		listaVivienda = vService.listar();
	}

	public void listarPropietario() {
		listaPropietario = pService.listar();
	}

	public String mostrarVivienda(int idVivienda) {
		String view = "";
		try {
			vivienda = vService.mostrar(idVivienda);
			
		} catch (Exception e) {
			Message.messageError("Error  en vivienda: " + e.getMessage());
		}
		return view;
	}

	public void mostrarPropietario(int idPropietario) {
		propietario = pService.mostrar(idPropietario);
	}

	public void actualizarVivienda() {
		vService.actualizar(vivienda);
	}

	public void eliminarVivienda(Vivienda vivienda) {
		vService.eliminar(vivienda.getIdVivienda());
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
