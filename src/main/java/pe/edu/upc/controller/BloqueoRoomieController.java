package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.BloqueoRoomie;
import pe.edu.upc.entity.Roomie;
import pe.edu.upc.entity.Propietario;
import pe.edu.upc.service.IBloqueoRoomieService;
import pe.edu.upc.service.IRoomieService;
import pe.edu.upc.service.IPropietarioService;

@Named
@RequestScoped
public class BloqueoRoomieController implements Serializable {

	private static final long serialVersionUID = -1242321324201076862L;
	
	@Inject
	private IBloqueoRoomieService brService;
	private IRoomieService rService;
	private IPropietarioService pService;
	private BloqueoRoomie bloqueoRoomie;
	private Roomie roomie;
	private Propietario propietario;
	List<BloqueoRoomie> listaBloqueoRoomie;
	List<Roomie> listaRoomie;
	List<Propietario> listaPropietario;
	
	@PostConstruct
	public void init() {
		this.listaBloqueoRoomie = new ArrayList<BloqueoRoomie>();
		this.listaRoomie = new ArrayList<Roomie>();
		this.listaPropietario = new ArrayList<Propietario>();
		this.bloqueoRoomie = new BloqueoRoomie();
		this.roomie = new Roomie();
		this.propietario = new Propietario();
		this.listarBloqueoRoomie();
		this.listarRoomie();
		this.listarPropietario();
	}
	
	public String nuevoBloqueoRoomie() {
		this.setBloqueoRoomie(new BloqueoRoomie());
		return "bloqueoroomie.xhtml";
	}

	public void insertarBloqueoRoomie() {
		brService.insertar(bloqueoRoomie);
		this.limpiarBloqueoRoomie();
		this.listarBloqueoRoomie();
	}
	
	public void listarBloqueoRoomie() {
		listaBloqueoRoomie = brService.listar();
	}
	
	public void listarRoomie() {
		listaRoomie = rService.listar();
	}
	
	public void listarPropietario() {
		listaPropietario = pService.listar();
	}
	
	public void mostrarBloqueoRoomie(int idBloqueoRoomie) {
		bloqueoRoomie = brService.mostrar(idBloqueoRoomie);
	}

	public void mostrarRoomie(int idRoomie) {
		roomie = rService.mostrar(idRoomie);
	}
	
	public void mostrarPropietario(int idPropietario) {
		propietario = pService.mostrar(idPropietario);
	}
	
	public void eliminarBloqueoRoomie(BloqueoRoomie bloqueoRoomie ) {
		brService.eliminar(bloqueoRoomie.getIdBloqueoRoomie());
	}
	
	public void limpiarBloqueoRoomie() {
		this.init();
	}

	public BloqueoRoomie getBloqueoRoomie() {
		return bloqueoRoomie;
	}

	public void setBloqueoRoomie(BloqueoRoomie bloqueoRoomie) {
		this.bloqueoRoomie = bloqueoRoomie;
	}

	public Roomie getRoomie() {
		return roomie;
	}

	public void setRoomie(Roomie roomie) {
		this.roomie = roomie;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	public List<BloqueoRoomie> getListaBloqueoRoomie() {
		return listaBloqueoRoomie;
	}

	public void setListaBloqueoRoomie(List<BloqueoRoomie> listaBloqueoRoomie) {
		this.listaBloqueoRoomie = listaBloqueoRoomie;
	}

	public List<Roomie> getListaRoomie() {
		return listaRoomie;
	}

	public void setListaRoomie(List<Roomie> listaRoomie) {
		this.listaRoomie = listaRoomie;
	}

	public List<Propietario> getListaPropietario() {
		return listaPropietario;
	}

	public void setListaPropietario(List<Propietario> listaPropietario) {
		this.listaPropietario = listaPropietario;
	}

}
