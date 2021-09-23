package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IBloqueoRoomieDao;
import pe.edu.upc.entity.BloqueoRoomie;
import pe.edu.upc.service.IBloqueoRoomieService;

@Named
@RequestScoped
public class BloqueoRoomieServiceImpl implements IBloqueoRoomieService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IBloqueoRoomieDao objDao;
	
	@Override
	public void insertar(BloqueoRoomie bloqueoRoomie) {
		objDao.insertar(bloqueoRoomie);
	}
	
	@Override
	public List<BloqueoRoomie> listar() {
		return objDao.listar();
	}
	
	@Override
	public BloqueoRoomie mostrar(int idBloqueoRoomie) {
		return objDao.mostrar(idBloqueoRoomie);
	}
	
	@Override
	public void eliminar(int idBloqueoRoomie) {
		objDao.eliminar(idBloqueoRoomie);
	}
	
}
