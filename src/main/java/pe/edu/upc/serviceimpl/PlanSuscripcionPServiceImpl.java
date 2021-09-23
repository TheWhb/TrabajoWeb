package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IPlanSuscripcionPDao;
import pe.edu.upc.entity.PlanSuscripcionP;
import pe.edu.upc.service.IPlanSuscripcionPService;

@Named
@RequestScoped
public class PlanSuscripcionPServiceImpl implements IPlanSuscripcionPService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IPlanSuscripcionPDao objDao;
	
	@Override
	public void insertar(PlanSuscripcionP planSuscripcionP) {
		objDao.insertar(planSuscripcionP);
	}
	
	@Override
	public List<PlanSuscripcionP> listar() {
		return objDao.listar();
	}
	
	@Override
	public PlanSuscripcionP mostrar(int idPlanSuscripcionP) {
		return objDao.mostrar(idPlanSuscripcionP);
	}
	
	@Override
	public void actualizar(PlanSuscripcionP planSuscripcionP) {
		objDao.actualizar(planSuscripcionP);
	}
	
	@Override
	public void eliminar(int idPlanSuscripcionP) {
		objDao.eliminar(idPlanSuscripcionP);
	}
	
}
