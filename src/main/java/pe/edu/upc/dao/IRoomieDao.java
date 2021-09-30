package pe.edu.upc.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import pe.edu.upc.entity.Roomie;
import pe.edu.upc.entity.Vivienda;

public interface IRoomieDao {
	public void insertar(Roomie roomie);
	public List<Roomie> listar();
	public Roomie mostrar(int idRoomie);
	public void actualizar(Roomie roomie);
	public List<Roomie> findByNameRoomie(Roomie r);
	public void actualizarVivienda(Roomie roomie, Vivienda idRoomie);
}
