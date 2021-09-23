package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.PublicacionVivienda;

public interface IPublicacionViviendaDao {
	public void insertar(PublicacionVivienda publicacionVivienda);
	public List<PublicacionVivienda> listar();
	public PublicacionVivienda mostrar(int idPublicacionVivienda);
	public void actualizar(PublicacionVivienda publicacionVivienda);
	public void eliminar(int idPublicacionVivienda);
}
