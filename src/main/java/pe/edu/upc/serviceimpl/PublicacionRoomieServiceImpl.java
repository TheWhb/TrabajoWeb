package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IPublicacionRoomieDao;
import pe.edu.upc.entity.PublicacionRoomie;
import pe.edu.upc.service.IPublicacionRoomieService;

@Named
@RequestScoped
public class PublicacionRoomieServiceImpl implements IPublicacionRoomieService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IPublicacionRoomieDao objDao;
	
	@Override
	public void insertar(PublicacionRoomie publicacionRoomie) {
		objDao.insertar(publicacionRoomie);
	}
	
	@Override
	public List<PublicacionRoomie> listar() {
		return objDao.listar();
	}
	
	@Override
	public PublicacionRoomie mostrar(int idPublicacionRoomie) {
		return objDao.mostrar(idPublicacionRoomie);
	}
	
	@Override
	public void actualizar(PublicacionRoomie publicacionRoomie) {
		objDao.actualizar(publicacionRoomie);
	}
	
	@Override
	public void eliminar(int idPublicacionRoomie) {
		objDao.eliminar(idPublicacionRoomie);
	}
	
}
