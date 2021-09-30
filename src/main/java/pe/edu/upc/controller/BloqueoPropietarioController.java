package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.BloqueoPropietario;
import pe.edu.upc.entity.Roomie;
import pe.edu.upc.entity.Propietario;
import pe.edu.upc.service.IBloqueoPropietarioService;
import pe.edu.upc.service.IRoomieService;
import pe.edu.upc.service.IPropietarioService;

@Named
@RequestScoped
public class BloqueoPropietarioController implements Serializable {

	private static final long serialVersionUID = -1242321324201076862L;
	
	@Inject
	private IBloqueoPropietarioService bpService;
	@Inject
	private IRoomieService rService;
	@Inject
	private IPropietarioService pService;
	private BloqueoPropietario bloqueoPropietario;
	private Roomie roomie;
	private Propietario propietario;
	List<BloqueoPropietario> listaBloqueoPropietario;
	List<Roomie> listaRoomie;
	List<Propietario> listaPropietario;
	
	@PostConstruct
	public void init() {
		this.listaBloqueoPropietario = new ArrayList<BloqueoPropietario>();
		this.listaRoomie = new ArrayList<Roomie>();
		this.listaPropietario = new ArrayList<Propietario>();
		this.bloqueoPropietario = new BloqueoPropietario();
		this.roomie = new Roomie();
		this.propietario = new Propietario();
		this.listarBloqueoPropietario();
		this.listarRoomie();
		this.listarPropietario();
	}
	
	public String nuevoBloqueoPropietario() {
		this.setBloqueoPropietario(new BloqueoPropietario());
		return "bloqueopropietario.xhtml";
	}

	public void insertarBloqueoPropietario() {
		bpService.insertar(bloqueoPropietario);
		this.limpiarBloqueoPropietario();
		this.listarBloqueoPropietario();
	}
	
	public void listarBloqueoPropietario() {
		listaBloqueoPropietario = bpService.listar();
	}
	
	public void listarRoomie() {
		listaRoomie = rService.listar();
	}
	
	public void listarPropietario() {
		listaPropietario = pService.listar();
	}
	
	public void mostrarBloqueoPropietario(int idBloqueoRoomie) {
		bloqueoPropietario = bpService.mostrar(idBloqueoRoomie);
	}

	public void mostrarRoomie(int idRoomie) {
		roomie = rService.mostrar(idRoomie);
	}
	
	public void mostrarPropietario(int idPropietario) {
		propietario = pService.mostrar(idPropietario);
	}
	
	public void eliminarBloqueoPropietario(BloqueoPropietario bloqueoPropietario) {
		bpService.eliminar(bloqueoPropietario.getIdBloqueoPropietario());
	}
	
	public void limpiarBloqueoPropietario() {
		this.init();
	}

	public BloqueoPropietario getBloqueoPropietario() {
		return bloqueoPropietario;
	}

	public void setBloqueoPropietario(BloqueoPropietario bloqueoPropietario) {
		this.bloqueoPropietario = bloqueoPropietario;
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

	public List<BloqueoPropietario> getListaBloqueoPropietario() {
		return listaBloqueoPropietario;
	}

	public void setListaBloqueoPropietario(List<BloqueoPropietario> listaBloqueoPropietario) {
		this.listaBloqueoPropietario = listaBloqueoPropietario;
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
