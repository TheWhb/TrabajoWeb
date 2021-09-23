package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IReglaDao;
import pe.edu.upc.entity.Regla;
import pe.edu.upc.service.IReglaService;

@Named
@RequestScoped
public class ReglaServiceImpl implements IReglaService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IReglaDao objDao;
	
	@Override
	public void insertar(Regla regla) {
		objDao.insertar(regla);
	}
	
	@Override
	public List<Regla> listar() {
		return objDao.listar();
	}
	
	@Override
	public Regla mostrar(int idRegla) {
		return objDao.mostrar(idRegla);
	}
	
	@Override
	public void actualizar(Regla regla) {
		objDao.actualizar(regla);
	}
	
	@Override
	public void eliminar(int idRegla) {
		objDao.eliminar(idRegla);
	}
	
}
