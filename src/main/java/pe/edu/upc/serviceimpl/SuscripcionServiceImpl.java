package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ISuscripcionDao;
import pe.edu.upc.entity.Suscripcion;
import pe.edu.upc.service.ISuscripcionService;

@Named
@RequestScoped
public class SuscripcionServiceImpl implements ISuscripcionService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private ISuscripcionDao objDao;
	
	@Override
	public void insertar(Suscripcion suscripcion) {
		objDao.insertar(suscripcion);
	}
	
	@Override
	public List<Suscripcion> listar() {
		return objDao.listar();
	}
	
	@Override
	public Suscripcion mostrar(int idSuscripcion) {
		return objDao.mostrar(idSuscripcion);
	}
	
	@Override
	public void actualizar(Suscripcion suscripcion) {
		objDao.actualizar(suscripcion);
	}
	
	@Override
	public void eliminar(int idSuscripcion) {
		objDao.eliminar(idSuscripcion);
	}
	
}
