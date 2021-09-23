package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IReglaDao;
import pe.edu.upc.entity.Regla;

public class ReglaDaoImpl implements IReglaDao, Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Regla regla) {
		em.persist(regla);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Regla> listar() {
		List<Regla> lista = new ArrayList<Regla>();
		Query q = em.createQuery("select p from Regla p");
		lista = (List<Regla>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public Regla mostrar(int idregla) {
		Regla propietario = new Regla();
		propietario = em.getReference(Regla.class, idregla);
		return propietario;
	}
	
	@Transactional
	@Override
	public void actualizar(Regla regla) {
		Regla reglaViejo = new Regla();
		reglaViejo = em.getReference(Regla.class, regla.getIdRegla());
		em.remove(reglaViejo);
		em.persist(regla);
	}
	
	@Transactional
	@Override
	public void eliminar(int idregla) {
		Regla vivienda = new Regla();
		vivienda = em.getReference(Regla.class, idregla);
		em.remove(vivienda);
	}	
}
