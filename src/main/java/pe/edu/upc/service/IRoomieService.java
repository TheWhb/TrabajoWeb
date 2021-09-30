package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Roomie;
import pe.edu.upc.entity.Vivienda;

public interface IRoomieService {
	public void insertar(Roomie roomie);
	public List<Roomie> listar();
	public Roomie mostrar(int idRoomie);
	public void actualizar(Roomie roomie);
	public List<Roomie> findByNameRoomie(Roomie r);
	public void actualizarVivienda(Roomie roomie, Vivienda idRoomie);
}
