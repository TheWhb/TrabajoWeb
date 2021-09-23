package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ISesionPropietarioDao;
import pe.edu.upc.entity.SesionPropietario;
import pe.edu.upc.service.ISesionPropietarioService;

@Named
@RequestScoped
public class SesionPropietarioServiceImpl implements ISesionPropietarioService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private ISesionPropietarioDao objDao;
	
	@Override
	public void insertar(SesionPropietario sesionPropietario) {
		objDao.insertar(sesionPropietario);
	}
	
	@Override
	public List<SesionPropietario> listar() {
		return objDao.listar();
	}
	
	@Override
	public SesionPropietario mostrar(int idSesionPropietario) {
		return objDao.mostrar(idSesionPropietario);
	}
	
	@Override
	public void actualizar(SesionPropietario sesionPropietario) {
		objDao.actualizar(sesionPropietario);
	}
	
}
