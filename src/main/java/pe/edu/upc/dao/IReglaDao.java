package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Regla;

public interface IReglaDao {
	public void insertar(Regla regla);
	public List<Regla> listar();
	public Regla mostrar(int idregla);
	public void actualizar(Regla regla);
	public void eliminar(int idregla);
}
