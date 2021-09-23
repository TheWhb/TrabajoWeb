package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.SesionPropietario;

public interface ISesionPropietarioService {
	public void insertar(SesionPropietario sesionPropietario);
	public List<SesionPropietario> listar();
	public SesionPropietario mostrar(int idSesionPropietario);
	public void actualizar(SesionPropietario sesionPropietario);
}
