package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ISuscripcionDao;
import pe.edu.upc.entity.Suscripcion;

public class SuscripcionDaoImpl implements ISuscripcionDao, Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Suscripcion suscripcion) {
		em.persist(suscripcion);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Suscripcion> listar() {
		List<Suscripcion> lista = new ArrayList<Suscripcion>();
		Query q = em.createQuery("select s from Suscripcion s");
		lista = (List<Suscripcion>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public Suscripcion mostrar(int idSuscripcion) {
		Suscripcion suscripcion = new Suscripcion();
		suscripcion = em.getReference(Suscripcion.class, idSuscripcion);
		return suscripcion;
	}
	
	@Transactional
	@Override
	public void actualizar(Suscripcion suscripcion) {
		Suscripcion suscripcionViejo = new Suscripcion();
		suscripcionViejo = em.getReference(Suscripcion.class, suscripcion.getIdSuscripcion());
		em.remove(suscripcionViejo);
		em.persist(suscripcion);
	}
	
	@Transactional
	@Override
	public void eliminar(int idSuscripcion) {
		Suscripcion suscripcion = new Suscripcion();
		suscripcion = em.getReference(Suscripcion.class, idSuscripcion);
		em.remove(suscripcion);
	}	
}
