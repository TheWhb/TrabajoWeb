package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.SesionPropietario;

public interface ISesionPropietarioDao {
	public void insertar(SesionPropietario sesionPropietario);
	public List<SesionPropietario> listar();
	public SesionPropietario mostrar(int idSesionPropietario);
	public void actualizar(SesionPropietario sesionPropietario);
}
