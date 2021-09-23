package pe.edu.upc.service;

import java.util.List;

import pe.edu.upc.entity.PlanSuscripcionR;

public interface IPlanSuscripcionRService {
	public void insertar(PlanSuscripcionR planSuscripcionR);
	public List<PlanSuscripcionR> listar();
	public PlanSuscripcionR mostrar(int idPlanSuscripcionR);
	public void actualizar(PlanSuscripcionR planSuscripcionR);
	public void eliminar(int idPlanSuscripcionR);
}
