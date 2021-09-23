package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IViviendaDao;
import pe.edu.upc.entity.Vivienda;

public class ViviendaDaoImpl implements IViviendaDao, Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Vivienda vivienda) {
		em.persist(vivienda);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Vivienda> listar() {
		List<Vivienda> lista = new ArrayList<Vivienda>();
		Query q = em.createQuery("select p from Vivienda p");
		lista = (List<Vivienda>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public Vivienda mostrar(int idVivienda) {
		Vivienda vivienda = new Vivienda();
		vivienda = em.getReference(Vivienda.class, idVivienda);
		return vivienda;
	}
	
	@Transactional
	@Override
	public void actualizar(Vivienda vivienda) {
		Vivienda viviendaViejo = new Vivienda();
		viviendaViejo = em.getReference(Vivienda.class, vivienda.getIdVivienda());
		em.remove(viviendaViejo);
		em.persist(vivienda);
	}
	
	@Transactional
	@Override
	public void eliminar(int idVivienda) {
		Vivienda vivienda = new Vivienda();
		vivienda = em.getReference(Vivienda.class, idVivienda);
		em.remove(vivienda);
	}	
}
