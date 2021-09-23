package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IPlanSuscripcionRDao;
import pe.edu.upc.entity.PlanSuscripcionR;

public class PlanSuscripcionRDaoImpl implements IPlanSuscripcionRDao, Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(PlanSuscripcionR planSuscripcionR) {
		em.persist(planSuscripcionR);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<PlanSuscripcionR> listar() {
		List<PlanSuscripcionR> lista = new ArrayList<PlanSuscripcionR>();
		Query q = em.createQuery("select s from PlanSuscripcionR s");
		lista = (List<PlanSuscripcionR>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public PlanSuscripcionR mostrar(int idPlanSuscripcionR) {
		PlanSuscripcionR planSuscripcionR = new PlanSuscripcionR();
		planSuscripcionR = em.getReference(PlanSuscripcionR.class, idPlanSuscripcionR);
		return planSuscripcionR;
	}
	
	@Transactional
	@Override
	public void actualizar(PlanSuscripcionR planSuscripcionR) {
		PlanSuscripcionR planSuscripcionRViejo = new PlanSuscripcionR();
		planSuscripcionRViejo = em.getReference(PlanSuscripcionR.class, planSuscripcionR.getIdPlanSuscripcionR());
		em.remove(planSuscripcionRViejo);
		em.persist(planSuscripcionR);
	}
	
	@Transactional
	@Override
	public void eliminar(int idPlanSuscripcionR) {
		PlanSuscripcionR planSuscripcionR = new PlanSuscripcionR();
		planSuscripcionR = em.getReference(PlanSuscripcionR.class, idPlanSuscripcionR);
		em.remove(planSuscripcionR);
	}	
}
