package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IRoomieDao;
import pe.edu.upc.entity.Roomie;
import pe.edu.upc.service.IRoomieService;

@Named
@RequestScoped
public class RoomieServiceImpl implements IRoomieService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IRoomieDao objDao;
	
	@Override
	public void insertar(Roomie roomie) {
		objDao.insertar(roomie);
	}
	
	@Override
	public List<Roomie> listar() {
		return objDao.listar();
	}
	
	@Override
	public Roomie mostrar(int idRoomie) {
		return objDao.mostrar(idRoomie);
	}
	
	@Override
	public void actualizar(Roomie roomie) {
		objDao.actualizar(roomie);
	}
	
}
