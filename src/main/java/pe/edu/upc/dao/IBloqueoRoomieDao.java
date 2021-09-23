package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.BloqueoRoomie;

public interface IBloqueoRoomieDao {
	public void insertar(BloqueoRoomie bloqueoRoomie);
	public List<BloqueoRoomie> listar();
	public BloqueoRoomie mostrar(int idBloqueoRoomie);
	public void eliminar(int idBloqueoRoomie);
}
