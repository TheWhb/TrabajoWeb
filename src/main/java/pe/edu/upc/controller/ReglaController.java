package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Regla;
import pe.edu.upc.entity.Vivienda;
import pe.edu.upc.entity.Caracteristica;
import pe.edu.upc.service.IReglaService;
import pe.edu.upc.service.IViviendaService;
import pe.edu.upc.service.ICaracteristicaService;

@Named
@RequestScoped
public class ReglaController implements Serializable {

	private static final long serialVersionUID = -1242321324201076862L;
	
	@Inject
	private IReglaService rService;
	private IViviendaService vService;
	private ICaracteristicaService cService;
	private Regla regla;
	private Vivienda vivienda;
	private Caracteristica caracteristica;
	List<Regla> listaRegla;
	List<Vivienda> listaVivienda;
	List<Caracteristica> listaCaracteristica;
	
	@PostConstruct
	public void init() {
		this.listaRegla = new ArrayList<Regla>();
		this.listaVivienda = new ArrayList<Vivienda>();
		this.listaCaracteristica = new ArrayList<Caracteristica>();
		this.regla = new Regla();
		this.vivienda = new Vivienda();
		this.caracteristica = new Caracteristica();
		this.listarRegla();
		this.listarVivienda();
		this.listarCaracteristica();
	}
	
	public String nuevoRegla() {
		this.setRegla(new Regla());
		return "regla.xhtml";
	}

	public void insertarRegla() {
		rService.insertar(regla);
		this.limpiarRegla();
		this.listarRegla();
	}
	
	public void listarRegla() {
		listaRegla = rService.listar();
	}
	
	public void listarVivienda() {
		listaVivienda = vService.listar();
	}
	
	public void listarCaracteristica() {
		listaCaracteristica = cService.listar();
	}
	
	public void mostrarRegla(int idRegla) {
		regla = rService.mostrar(idRegla);
	}

	public void mostrarVivienda(int idVivienda) {
		vivienda = vService.mostrar(idVivienda);
	}
	
	public void mostrarCaracteristica(int idCaracteristica) {
		caracteristica = cService.mostrar(idCaracteristica);
	}
	
	public void actualizarRegla() {
		rService.actualizar(regla);
	}
	
	public void eliminarRegla(Regla regla) {
		rService.eliminar(regla.getIdRegla());
	}
	
	public void limpiarRegla() {
		this.init();
	}

	public Regla getRegla() {
		return regla;
	}

	public void setRegla(Regla regla) {
		this.regla = regla;
	}

	public Vivienda getVivienda() {
		return vivienda;
	}

	public void setVivienda(Vivienda vivienda) {
		this.vivienda = vivienda;
	}

	public Caracteristica getCaracteristica() {
		return caracteristica;
	}

	public void setCaracteristica(Caracteristica caracteristica) {
		this.caracteristica = caracteristica;
	}

	public List<Regla> getListaRegla() {
		return listaRegla;
	}

	public void setListaRegla(List<Regla> listaRegla) {
		this.listaRegla = listaRegla;
	}

	public List<Vivienda> getListaVivienda() {
		return listaVivienda;
	}

	public void setListaVivienda(List<Vivienda> listaVivienda) {
		this.listaVivienda = listaVivienda;
	}

	public List<Caracteristica> getListaCaracteristica() {
		return listaCaracteristica;
	}

	public void setListaCaracteristica(List<Caracteristica> listaCaracteristica) {
		this.listaCaracteristica = listaCaracteristica;
	}

}
