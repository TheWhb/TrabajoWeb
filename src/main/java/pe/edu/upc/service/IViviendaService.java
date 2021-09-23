package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.Vivienda;

public interface IViviendaService {
	public void insertar(Vivienda vivienda);
	public List<Vivienda> listar();
	public Vivienda mostrar(int idVivienda);
	public void actualizar(Vivienda vivienda);
	public void eliminar(int idVivienda);
}
