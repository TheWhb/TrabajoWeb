package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Roomie;
import pe.edu.upc.entity.Vivienda;
import pe.edu.upc.service.IRoomieService;
import pe.edu.upc.service.IViviendaService;

@Named
@RequestScoped
public class RoomieController implements Serializable {

	private static final long serialVersionUID = -6186585572086714609L;
	
	@Inject
	private IRoomieService rService;
	private IViviendaService vService;
	private Roomie roomie;
	private Vivienda vivienda;
	List<Roomie> listaRoomie;
	List<Vivienda> listaVivienda;
	
	@PostConstruct
	public void init() {
		this.listaRoomie = new ArrayList<Roomie>();
		this.listaVivienda = new ArrayList<Vivienda>();
		this.roomie = new Roomie();
		this.vivienda = new Vivienda();
		roomie.setViviendaR(null);
		this.listarRoomie();
		this.listarVivienda();
	}
	
	public String nuevoRoomie() {
		this.setRoomie(new Roomie());
		return "roomie.xhtml";
	}
	
	public String modificarRoomie() {
		return "roomie.xhtml";
	}

	public void insertarRoomie() {
		rService.insertar(roomie);
		this.limpiarRoomie();
		this.listarRoomie();
	}
	
	public void listarRoomie() {
		listaRoomie = rService.listar();
	}
	
	public void listarVivienda() {
		listaVivienda = vService.listar();
	}
	
	public void mostrarRoomie(int idRoomie) {
		roomie = rService.mostrar(idRoomie);
	}
	
	public void mostrarVivienda(int idVivienda) {
		vivienda = vService.mostrar(idVivienda);
	}
	
	public void actualizarRoomie() {
		rService.actualizar(roomie);
	}
	
	public void limpiarRoomie() {
		this.init();
	}

	public Roomie getRoomie() {
		return roomie;
	}

	public void setRoomie(Roomie roomie) {
		this.roomie = roomie;
	}

	public Vivienda getVivienda() {
		return vivienda;
	}

	public void setVivienda(Vivienda vivienda) {
		this.vivienda = vivienda;
	}

	public List<Roomie> getListaRoomie() {
		return listaRoomie;
	}

	public void setListaRoomie(List<Roomie> listaRoomie) {
		this.listaRoomie = listaRoomie;
	}

	public List<Vivienda> getListaVivienda() {
		return listaVivienda;
	}

	public void setListaVivienda(List<Vivienda> listaVivienda) {
		this.listaVivienda = listaVivienda;
	}
	
}
