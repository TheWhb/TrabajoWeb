package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IViviendaDao;
import pe.edu.upc.entity.Vivienda;
import pe.edu.upc.service.IViviendaService;

@Named
@RequestScoped
public class ViviendaServiceImpl implements IViviendaService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IViviendaDao objDao;
	
	@Override
	public void insertar(Vivienda vivienda) {
		objDao.insertar(vivienda);
	}
	
	@Override
	public List<Vivienda> listar() {
		return objDao.listar();
	}
	
	@Override
	public Vivienda mostrar(int idVivienda) {
		return objDao.mostrar(idVivienda);
	}
	
	@Override
	public void actualizar(Vivienda vivienda) {
		objDao.actualizar(vivienda);
	}
	
	@Override
	public void eliminar(int idVivienda) {
		objDao.eliminar(idVivienda);
	}
	
}
