package pe.edu.upc.dao;

import java.util.List;

import pe.edu.upc.entity.PlanSuscripcionP;

public interface IPlanSuscripcionPDao {
	public void insertar(PlanSuscripcionP planSuscripcionP);
	public List<PlanSuscripcionP> listar();
	public PlanSuscripcionP mostrar(int idPlanSuscripcionP);
	public void actualizar(PlanSuscripcionP planSuscripcionP);
	public void eliminar(int idPlanSuscripcionP);
}
