package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IPublicacionViviendaDao;
import pe.edu.upc.entity.PublicacionVivienda;
import pe.edu.upc.service.IPublicacionViviendaService;

@Named
@RequestScoped
public class PublicacionViviendaServiceImpl implements IPublicacionViviendaService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IPublicacionViviendaDao objDao;
	
	@Override
	public void insertar(PublicacionVivienda publicacionVivienda) {
		objDao.insertar(publicacionVivienda);
	}
	
	@Override
	public List<PublicacionVivienda> listar() {
		return objDao.listar();
	}
	
	@Override
	public PublicacionVivienda mostrar(int idPublicacionVivienda) {
		return objDao.mostrar(idPublicacionVivienda);
	}
	
	@Override
	public void actualizar(PublicacionVivienda publicacionVivienda) {
		objDao.actualizar(publicacionVivienda);
	}
	
	@Override
	public void eliminar(int idPublicacionVivienda) {
		objDao.eliminar(idPublicacionVivienda);
	}
	
}
