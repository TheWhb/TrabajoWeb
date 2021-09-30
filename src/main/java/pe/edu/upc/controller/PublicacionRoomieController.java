package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.PublicacionRoomie;
import pe.edu.upc.entity.Roomie;
import pe.edu.upc.service.IPublicacionRoomieService;
import pe.edu.upc.service.IRoomieService;

@Named
@RequestScoped
public class PublicacionRoomieController implements Serializable {

	private static final long serialVersionUID = -6186585572086714609L;
	
	@Inject
	private IPublicacionRoomieService prService;
	@Inject
	private IRoomieService rService;
	private PublicacionRoomie publicacionRoomie;
	private Roomie roomie;
	List<PublicacionRoomie> listaPublicacionRoomie;
	List<Roomie> listaRoomie;
	
	@PostConstruct
	public void init() {
		this.listaPublicacionRoomie = new ArrayList<PublicacionRoomie>();
		this.listaRoomie = new ArrayList<Roomie>();
		this.publicacionRoomie = new PublicacionRoomie();
		this.roomie = new Roomie();
		this.listarPublicacionRoomie();
		this.listarRoomie();
	}
	
	public String nuevoPublicacionRoomie() {
		this.setPublicacionRoomie(new PublicacionRoomie());
		return "publicacionroomie.xhtml";
	}

	public void insertarPublicacionRoomie() {
		prService.insertar(publicacionRoomie);
		this.limpiarPublicacionRoomie();
		this.listarPublicacionRoomie();
	}
	
	public void listarPublicacionRoomie() {
		listaPublicacionRoomie = prService.listar();
	}
	
	public void listarRoomie() {
		listaRoomie = rService.listar();
	}
	
	public void mostrarPublicacionRoomie(int idPublicacionRoomie) {
		publicacionRoomie = prService.mostrar(idPublicacionRoomie);
	}
	
	public void mostrarRoomie(int idRoomie) {
		roomie = rService.mostrar(idRoomie);
	}	
	
	public void actualizarPublicacionRoomie() {
		prService.actualizar(publicacionRoomie);
	}
	
	public void eliminarPublicacionRoomie(PublicacionRoomie publicacionRoomie) {
		prService.eliminar(publicacionRoomie.getIdPublicacionRoomie());
	}
	
	public void limpiarPublicacionRoomie() {
		this.init();
	}

	public PublicacionRoomie getPublicacionRoomie() {
		return publicacionRoomie;
	}

	public void setPublicacionRoomie(PublicacionRoomie publicacionRoomie) {
		this.publicacionRoomie = publicacionRoomie;
	}

	public Roomie getRoomie() {
		return roomie;
	}

	public void setRoomie(Roomie roomie) {
		this.roomie = roomie;
	}

	public List<PublicacionRoomie> getListaPublicacionRoomie() {
		return listaPublicacionRoomie;
	}

	public void setListaPublicacionRoomie(List<PublicacionRoomie> listaPublicacionRoomie) {
		this.listaPublicacionRoomie = listaPublicacionRoomie;
	}

	public List<Roomie> getListaRoomie() {
		return listaRoomie;
	}

	public void setListaRoomie(List<Roomie> listaRoomie) {
		this.listaRoomie = listaRoomie;
	}
	
}
