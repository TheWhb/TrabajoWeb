package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IPropietarioDao;
import pe.edu.upc.entity.Propietario;
import pe.edu.upc.service.IPropietarioService;

@Named
@RequestScoped
public class PropietarioServiceImpl implements IPropietarioService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IPropietarioDao objDao;
	
	@Override
	public void insertar(Propietario propietario) {
		objDao.insertar(propietario);
	}
	
	@Override
	public List<Propietario> listar() {
		return objDao.listar();
	}
	
	@Override
	public Propietario mostrar(int idPropietario) {
		return objDao.mostrar(idPropietario);
	}
	
	@Override
	public void actualizar(Propietario propietario) {
		objDao.actualizar(propietario);
	}
	
}
