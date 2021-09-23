package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.BloqueoPropietario;

public interface IBloqueoPropietarioDao {
	public void insertar(BloqueoPropietario bloqueoPropietario);
	public List<BloqueoPropietario> listar();
	public BloqueoPropietario mostrar(int idBloqueoPropietario);
	public void eliminar(int idBloqueoPropietario);
}
