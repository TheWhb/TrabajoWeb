package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.PublicacionVivienda;

public interface IPublicacionViviendaService {
	public void insertar(PublicacionVivienda publicacionVivienda);
	public List<PublicacionVivienda> listar();
	public PublicacionVivienda mostrar(int idPublicacionVivienda);
	public void actualizar(PublicacionVivienda publicacionVivienda);
	public void eliminar(int idPublicacionVivienda);
}
