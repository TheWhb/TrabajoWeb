package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.ISesionRoomieDao;
import pe.edu.upc.entity.SesionRoomie;
import pe.edu.upc.service.ISesionRoomieService;

@Named
@RequestScoped
public class SesionRoomieServiceImpl implements ISesionRoomieService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private ISesionRoomieDao objDao;
	
	@Override
	public void insertar(SesionRoomie sesionRoomie) {
		objDao.insertar(sesionRoomie);
	}
	
	@Override
	public List<SesionRoomie> listar() {
		return objDao.listar();
	}
	
	@Override
	public SesionRoomie mostrar(int idSesionRoomie) {
		return objDao.mostrar(idSesionRoomie);
	}
	
	@Override
	public void actualizar(SesionRoomie sesionRoomie) {
		objDao.actualizar(sesionRoomie);
	}
	
}
