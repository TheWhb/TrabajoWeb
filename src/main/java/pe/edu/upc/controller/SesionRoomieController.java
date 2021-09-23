package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.SesionRoomie;
import pe.edu.upc.entity.Roomie;
import pe.edu.upc.service.ISesionRoomieService;
import pe.edu.upc.service.IRoomieService;

@Named
@RequestScoped
public class SesionRoomieController implements Serializable {

	private static final long serialVersionUID = -1242321324201076862L;
	
	@Inject
	private ISesionRoomieService srService;
	private IRoomieService rService;
	private SesionRoomie sesionRoomie;
	private Roomie roomie;
	List<SesionRoomie> listaSesionRoomie;
	List<Roomie> listaRoomie;
	
	@PostConstruct
	public void init() {
		this.listaSesionRoomie = new ArrayList<SesionRoomie>();
		this.listaRoomie = new ArrayList<Roomie>();
		this.sesionRoomie = new SesionRoomie();
		this.roomie = new Roomie();
		this.listarSesionRoomie();
		this.listarRoomie();
	}
	
	public String nuevoSesionRoomie() {
		this.setSesionRoomie(new SesionRoomie());
		return "sesionroomie.xhtml";
	}
	
	public String modificarSesionRoomie() {
		return "sesionroomie.xhtml";
	}

	public void insertarSesionRoomie() {
		srService.insertar(sesionRoomie);
		this.limpiarSesionRoomie();
		this.listarSesionRoomie();
	}
	
	public void listarSesionRoomie() {
		listaSesionRoomie = srService.listar();
	}
	
	public void listarRoomie() {
		listaRoomie = rService.listar();
	}
	
	public void mostrarSesionRoomie(int idSesionRoomie) {
		sesionRoomie = srService.mostrar(idSesionRoomie);
	}

	public void mostrarRoomie(int idRoomie) {
		roomie = rService.mostrar(idRoomie);
	}
	
	public void actualizarSesionRoomie() {
		srService.actualizar(sesionRoomie);
	}
	
	public void limpiarSesionRoomie() {
		this.init();
	}

	public SesionRoomie getSesionRoomie() {
		return sesionRoomie;
	}

	public void setSesionRoomie(SesionRoomie sesionRoomie) {
		this.sesionRoomie = sesionRoomie;
	}

	public Roomie getRoomie() {
		return roomie;
	}

	public void setRoomie(Roomie roomie) {
		this.roomie = roomie;
	}

	public List<SesionRoomie> getListaSesionRoomie() {
		return listaSesionRoomie;
	}

	public void setListaSesionRoomie(List<SesionRoomie> listaSesionRoomie) {
		this.listaSesionRoomie = listaSesionRoomie;
	}

	public List<Roomie> getListaRoomie() {
		return listaRoomie;
	}

	public void setListaRoomie(List<Roomie> listaRoomie) {
		this.listaRoomie = listaRoomie;
	}
	
}
