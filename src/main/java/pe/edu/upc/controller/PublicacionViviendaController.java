package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.PublicacionVivienda;
import pe.edu.upc.entity.Vivienda;
import pe.edu.upc.service.IPublicacionViviendaService;
import pe.edu.upc.service.IViviendaService;

@Named
@RequestScoped
public class PublicacionViviendaController implements Serializable {

	private static final long serialVersionUID = -6186585572086714609L;
	
	@Inject
	private IPublicacionViviendaService pvService;
	@Inject
	private IViviendaService vService;
	private PublicacionVivienda publicacionVivienda;
	private Vivienda vivienda;
	List<PublicacionVivienda> listaPublicacionVivienda;
	List<Vivienda> listaVivienda;
	
	@PostConstruct
	public void init() {
		this.listaPublicacionVivienda = new ArrayList<PublicacionVivienda>();
		this.listaVivienda = new ArrayList<Vivienda>();
		this.publicacionVivienda = new PublicacionVivienda();
		this.vivienda = new Vivienda();
		this.listarPublicacionVivienda();
		this.listarVivienda();
	}
	
	public String nuevoPublicacionVivienda() {
		this.setPublicacionVivienda(new PublicacionVivienda());
		return "publicacionvivienda.xhtml";
	}

	public void insertarPublicacionVivienda() {
		pvService.insertar(publicacionVivienda);
		this.limpiarPublicacionVivienda();
		this.listarPublicacionVivienda();
	}
	
	public void listarPublicacionVivienda() {
		listaPublicacionVivienda = pvService.listar();
	}
	
	public void listarVivienda() {
		listaVivienda = vService.listar();
	}
	
	public void mostrarPublicacionVivienda(int idPublicacionVivienda) {
		publicacionVivienda = pvService.mostrar(idPublicacionVivienda);
	}
	
	public void mostrarVivienda(int idVivienda) {
		vivienda = vService.mostrar(idVivienda);
	}	
	
	public void actualizarPublicacionVivienda() {
		pvService.actualizar(publicacionVivienda);
	}
	
	public void eliminarPublicacionVivienda(PublicacionVivienda publicacionVivienda) {
		pvService.eliminar(publicacionVivienda.getIdPublicacionVivienda());
	}
	
	public void limpiarPublicacionVivienda() {
		this.init();
	}

	public PublicacionVivienda getPublicacionVivienda() {
		return publicacionVivienda;
	}

	public void setPublicacionVivienda(PublicacionVivienda publicacionVivienda) {
		this.publicacionVivienda = publicacionVivienda;
	}

	public Vivienda getVivienda() {
		return vivienda;
	}

	public void setVivienda(Vivienda vivienda) {
		this.vivienda = vivienda;
	}

	public List<PublicacionVivienda> getListaPublicacionVivienda() {
		return listaPublicacionVivienda;
	}

	public void setListaPublicacionVivienda(List<PublicacionVivienda> listaPublicacionVivienda) {
		this.listaPublicacionVivienda = listaPublicacionVivienda;
	}

	public List<Vivienda> getListaVivienda() {
		return listaVivienda;
	}

	public void setListaVivienda(List<Vivienda> listaVivienda) {
		this.listaVivienda = listaVivienda;
	}
	
}
