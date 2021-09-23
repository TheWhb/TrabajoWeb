package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ISesionPropietarioDao;
import pe.edu.upc.entity.SesionPropietario;

public class SesionPropietarioDaoImpl implements ISesionPropietarioDao, Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(SesionPropietario sesionPropietario) {
		em.persist(sesionPropietario);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<SesionPropietario> listar() {
		List<SesionPropietario> lista = new ArrayList<SesionPropietario>();
		Query q = em.createQuery("select p from SesionPropietario p");
		lista = (List<SesionPropietario>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public SesionPropietario mostrar(int idSesionPropietario) {
		SesionPropietario propietario = new SesionPropietario();
		propietario = em.getReference(SesionPropietario.class, idSesionPropietario);
		return propietario;
	}
	
	@Transactional
	@Override
	public void actualizar(SesionPropietario sesionPropietario) {
		SesionPropietario sesionpViejo = new SesionPropietario();
		sesionpViejo = em.getReference(SesionPropietario.class, sesionPropietario.getIdSesionPropietario());
		em.remove(sesionpViejo);
		em.persist(sesionPropietario);
	}
}
