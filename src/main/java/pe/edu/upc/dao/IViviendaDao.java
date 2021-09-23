package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Vivienda;

public interface IViviendaDao {
	public void insertar(Vivienda vivienda);
	public List<Vivienda> listar();
	public Vivienda mostrar(int idVivienda);
	public void actualizar(Vivienda vivienda);
	public void eliminar(int idVivienda);
}
