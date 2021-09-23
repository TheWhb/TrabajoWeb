package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IPlanSuscripcionRDao;
import pe.edu.upc.entity.PlanSuscripcionR;
import pe.edu.upc.service.IPlanSuscripcionRService;

@Named
@RequestScoped
public class PlanSuscripcionRServiceImpl implements IPlanSuscripcionRService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IPlanSuscripcionRDao objDao;
	
	@Override
	public void insertar(PlanSuscripcionR planSuscripcionR) {
		objDao.insertar(planSuscripcionR);
	}
	
	@Override
	public List<PlanSuscripcionR> listar() {
		return objDao.listar();
	}
	
	@Override
	public PlanSuscripcionR mostrar(int idPlanSuscripcionR) {
		return objDao.mostrar(idPlanSuscripcionR);
	}
	
	@Override
	public void actualizar(PlanSuscripcionR planSuscripcionR) {
		objDao.actualizar(planSuscripcionR);
	}
	
	@Override
	public void eliminar(int idPlanSuscripcionR) {
		objDao.eliminar(idPlanSuscripcionR);
	}
	
}
