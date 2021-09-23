package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.BloqueoPropietario;

public interface IBloqueoPropietarioService {
	public void insertar(BloqueoPropietario bloqueoPropietario);
	public List<BloqueoPropietario> listar();
	public BloqueoPropietario mostrar(int idBloqueoPropietario);
	public void eliminar(int idBloqueoPropietario);
}
