package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IPlanSuscripcionPDao;
import pe.edu.upc.entity.PlanSuscripcionP;

public class PlanSuscripcionPDaoImpl implements IPlanSuscripcionPDao, Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(PlanSuscripcionP planSuscripcionP) {
		em.persist(planSuscripcionP);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<PlanSuscripcionP> listar() {
		List<PlanSuscripcionP> lista = new ArrayList<PlanSuscripcionP>();
		Query q = em.createQuery("select s from PlanSuscripcionP s");
		lista = (List<PlanSuscripcionP>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public PlanSuscripcionP mostrar(int idPlanSuscripcionP) {
		PlanSuscripcionP planSuscripcionP = new PlanSuscripcionP();
		planSuscripcionP = em.getReference(PlanSuscripcionP.class, idPlanSuscripcionP);
		return planSuscripcionP;
	}
	
	@Transactional
	@Override
	public void actualizar(PlanSuscripcionP planSuscripcionP) {
		PlanSuscripcionP planSuscripcionPViejo = new PlanSuscripcionP();
		planSuscripcionPViejo = em.getReference(PlanSuscripcionP.class, planSuscripcionP.getIdPlanSuscripcionP());
		em.remove(planSuscripcionPViejo);
		em.persist(planSuscripcionP);
	}
	
	@Transactional
	@Override
	public void eliminar(int idPlanSuscripcionP) {
		PlanSuscripcionP planSuscripcionP = new PlanSuscripcionP();
		planSuscripcionP = em.getReference(PlanSuscripcionP.class, idPlanSuscripcionP);
		em.remove(planSuscripcionP);
	}	
}
