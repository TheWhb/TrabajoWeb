package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.PublicacionRoomie;

public interface IPublicacionRoomieDao {
	public void insertar(PublicacionRoomie publicacionRoomie);
	public List<PublicacionRoomie> listar();
	public PublicacionRoomie mostrar(int idPublicacionRoomie);
	public void actualizar(PublicacionRoomie publicacionRoomie);
	public void eliminar(int idPublicacionRoomie);
}
