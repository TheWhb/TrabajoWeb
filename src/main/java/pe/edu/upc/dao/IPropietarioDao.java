package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.Propietario;

public interface IPropietarioDao {
	public void insertar(Propietario propietario);
	public List<Propietario> listar();
	public Propietario mostrar(int idPropietario);
	public void actualizar(Propietario propietario);
}
