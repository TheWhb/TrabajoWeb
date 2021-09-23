package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ICaracteristicaDao;
import pe.edu.upc.entity.Caracteristica;

public class CaracteristicaDaoImpl implements ICaracteristicaDao, Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Caracteristica caracteristica) {
		em.persist(caracteristica);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Caracteristica> listar() {
		List<Caracteristica> lista = new ArrayList<Caracteristica>();
		Query q = em.createQuery("select p from Caracteristica p");
		lista = (List<Caracteristica>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public Caracteristica mostrar(int idcaracteristica) {
		Caracteristica propietario = new Caracteristica();
		propietario = em.getReference(Caracteristica.class, idcaracteristica);
		return propietario;
	}
	
	@Transactional
	@Override
	public void actualizar(Caracteristica caracteristica) {
		Caracteristica caracteristicaViejo = new Caracteristica();
		caracteristicaViejo = em.getReference(Caracteristica.class, caracteristica.getIdCaracteristica());
		em.remove(caracteristicaViejo);
		em.persist(caracteristica);
	}
	
	@Transactional
	@Override
	public void eliminar(int idcaracteristica) {
		Caracteristica caracteristica = new Caracteristica();
		caracteristica = em.getReference(Caracteristica.class, idcaracteristica);
		em.remove(caracteristica);
	}	
}
