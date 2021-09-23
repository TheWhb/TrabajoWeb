package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IBloqueoPropietarioDao;
import pe.edu.upc.entity.BloqueoPropietario;
import pe.edu.upc.service.IBloqueoPropietarioService;

@Named
@RequestScoped
public class BloqueoPropietarioServiceImpl implements IBloqueoPropietarioService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IBloqueoPropietarioDao objDao;
	
	@Override
	public void insertar(BloqueoPropietario bloqueoPropietario) {
		objDao.insertar(bloqueoPropietario);
	}
	
	@Override
	public List<BloqueoPropietario> listar() {
		return objDao.listar();
	}
	
	@Override
	public BloqueoPropietario mostrar(int idBloqueoPropietario) {
		return objDao.mostrar(idBloqueoPropietario);
	}
	
	@Override
	public void eliminar(int idBloqueoPropietario) {
		objDao.eliminar(idBloqueoPropietario);
	}
	
}
