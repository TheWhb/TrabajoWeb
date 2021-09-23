package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.SesionPropietario;
import pe.edu.upc.entity.Propietario;
import pe.edu.upc.service.ISesionPropietarioService;
import pe.edu.upc.service.IPropietarioService;

@Named
@RequestScoped
public class SesionPropietarioController implements Serializable {

	private static final long serialVersionUID = -1242321324201076862L;
	
	@Inject
	private ISesionPropietarioService spService;
	private IPropietarioService pService;
	private SesionPropietario sesionPropietario;
	private Propietario propietario;
	List<SesionPropietario> listaSesionPropietario;
	List<Propietario> listaPropietario;
	
	@PostConstruct
	public void init() {
		this.listaSesionPropietario = new ArrayList<SesionPropietario>();
		this.listaPropietario = new ArrayList<Propietario>();
		this.sesionPropietario = new SesionPropietario();
		this.propietario = new Propietario();
		this.listarSesionPropietario();
		this.listarPropietario();
	}
	
	public String nuevoSesionPropietario() {
		this.setSesionPropietario(new SesionPropietario());
		return "sesionpropietario.xhtml";
	}
	
	public String modificarSesionPropietario() {
		return "sesionpropietario.xhtml";
	}

	public void insertarSesionPropietario() {
		spService.insertar(sesionPropietario);
		this.limpiarSesionPropietario();
		this.listarSesionPropietario();
	}
	
	public void listarSesionPropietario() {
		listaSesionPropietario = spService.listar();
	}
	
	public void listarPropietario() {
		listaPropietario = pService.listar();
	}
	
	public void mostrarSesionPropietario(int idSesionPropietario) {
		sesionPropietario = spService.mostrar(idSesionPropietario);
	}

	public void mostrarPropietario(int idPropietario) {
		propietario = pService.mostrar(idPropietario);
	}
	
	public void actualizarSesionPropietario() {
		spService.actualizar(sesionPropietario);
	}
	
	public void limpiarSesionPropietario() {
		this.init();
	}

	public SesionPropietario getSesionPropietario() {
		return sesionPropietario;
	}

	public void setSesionPropietario(SesionPropietario sesionPropietario) {
		this.sesionPropietario = sesionPropietario;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	public List<SesionPropietario> getListaSesionPropietario() {
		return listaSesionPropietario;
	}

	public void setListaSesionPropietario(List<SesionPropietario> listaSesionPropietario) {
		this.listaSesionPropietario = listaSesionPropietario;
	}

	public List<Propietario> getListaPropietario() {
		return listaPropietario;
	}

	public void setListaPropietario(List<Propietario> listaPropietario) {
		this.listaPropietario = listaPropietario;
	}
	
}
