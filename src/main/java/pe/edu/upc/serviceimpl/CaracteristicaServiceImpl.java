package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ICaracteristicaDao;
import pe.edu.upc.entity.Caracteristica;
import pe.edu.upc.service.ICaracteristicaService;

@Named
@RequestScoped
public class CaracteristicaServiceImpl implements ICaracteristicaService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private ICaracteristicaDao objDao;
	
	@Override
	public void insertar(Caracteristica caracteristica) {
		objDao.insertar(caracteristica);
	}
	
	@Override
	public List<Caracteristica> listar() {
		return objDao.listar();
	}
	
	@Override
	public Caracteristica mostrar(int idCaracteristica) {
		return objDao.mostrar(idCaracteristica);
	}
	
	@Override
	public void actualizar(Caracteristica caracteristica) {
		objDao.actualizar(caracteristica);
	}
	
	@Override
	public void eliminar(int idCaracteristica) {
		objDao.eliminar(idCaracteristica);
	}
	
}
