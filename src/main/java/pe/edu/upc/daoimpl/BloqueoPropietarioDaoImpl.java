package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IBloqueoPropietarioDao;
import pe.edu.upc.entity.BloqueoPropietario;

public class BloqueoPropietarioDaoImpl implements IBloqueoPropietarioDao, Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(BloqueoPropietario bloqueoPropietario) {
		em.persist(bloqueoPropietario);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<BloqueoPropietario> listar() {
		List<BloqueoPropietario> lista = new ArrayList<BloqueoPropietario>();
		Query q = em.createQuery("select p from BloqueoPropietario p");
		lista = (List<BloqueoPropietario>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public BloqueoPropietario mostrar(int idBloqueoPropietario) {
		BloqueoPropietario bloqueoPropietario = new BloqueoPropietario();
		bloqueoPropietario = em.getReference(BloqueoPropietario.class, idBloqueoPropietario);
		return bloqueoPropietario;
	}
	
	@Transactional
	@Override
	public void eliminar(int idBloqueoPropietario) {
		BloqueoPropietario bloqueoPropietario = new BloqueoPropietario();
		bloqueoPropietario = em.getReference(BloqueoPropietario.class, idBloqueoPropietario);
		em.remove(bloqueoPropietario);
	}	
}
