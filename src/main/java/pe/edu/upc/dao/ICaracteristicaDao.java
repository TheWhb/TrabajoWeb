package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Caracteristica;

public interface ICaracteristicaDao {
	public void insertar(Caracteristica caracteristica);
	public List<Caracteristica> listar();
	public Caracteristica mostrar(int idcaracteristica);
	public void actualizar(Caracteristica caracteristica);
	public void eliminar(int idcaracteristica);
}
