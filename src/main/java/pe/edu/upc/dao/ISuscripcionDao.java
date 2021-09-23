package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Suscripcion;

public interface ISuscripcionDao {
	public void insertar(Suscripcion suscripcion);
	public List<Suscripcion> listar();
	public Suscripcion mostrar(int idSuscripcion);
	public void actualizar(Suscripcion suscripcion);
	public void eliminar(int idSuscripcion);
}
