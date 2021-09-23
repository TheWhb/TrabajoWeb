package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Roomie;

public interface IRoomieService {
	public void insertar(Roomie roomie);
	public List<Roomie> listar();
	public Roomie mostrar(int idRoomie);
	public void actualizar(Roomie roomie);
}
