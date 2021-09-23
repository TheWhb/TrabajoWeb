package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Regla;

public interface IReglaService {
	public void insertar(Regla regla);
	public List<Regla> listar();
	public Regla mostrar(int idregla);
	public void actualizar(Regla regla);
	public void eliminar(int idregla);
}
