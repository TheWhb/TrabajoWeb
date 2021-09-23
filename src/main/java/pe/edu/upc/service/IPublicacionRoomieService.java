package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.PublicacionRoomie;

public interface IPublicacionRoomieService {
	public void insertar(PublicacionRoomie publicacionRoomie);
	public List<PublicacionRoomie> listar();
	public PublicacionRoomie mostrar(int idPublicacionRoomie);
	public void actualizar(PublicacionRoomie publicacionRoomie);
	public void eliminar(int idPublicacionRoomie);
}
