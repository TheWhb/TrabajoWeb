package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.SesionRoomie;

public interface ISesionRoomieDao {
	public void insertar(SesionRoomie sesionRoomie);
	public List<SesionRoomie> listar();
	public SesionRoomie mostrar(int idSesionRoomie);
	public void actualizar(SesionRoomie sesionRoomie);
}
