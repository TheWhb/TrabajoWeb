package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.SesionRoomie;

public interface ISesionRoomieService {
	public void insertar(SesionRoomie sesionRoomie);
	public List<SesionRoomie> listar();
	public SesionRoomie mostrar(int idSesionRoomie);
	public void actualizar(SesionRoomie sesionRoomie);
}
