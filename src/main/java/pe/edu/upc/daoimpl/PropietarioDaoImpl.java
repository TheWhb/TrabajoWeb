package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IPropietarioDao;
import pe.edu.upc.entity.Propietario;

public class PropietarioDaoImpl implements IPropietarioDao, Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Propietario propietario) {
		em.persist(propietario);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Propietario> listar() {
		List<Propietario> lista = new ArrayList<Propietario>();
		Query q = em.createQuery("select p from Propietario p");
		lista = (List<Propietario>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public Propietario mostrar(int idPropietario) {
		Propietario propietario = new Propietario();
		propietario = em.getReference(Propietario.class, idPropietario);
		return propietario;
	}
	
	@Transactional
	@Override
	public void actualizar(Propietario propietario) {
		Propietario propietarioViejo = new Propietario();
		propietarioViejo = em.getReference(Propietario.class, propietario.getIdPropietario());
		em.remove(propietarioViejo);
		em.persist(propietario);
	}
}
