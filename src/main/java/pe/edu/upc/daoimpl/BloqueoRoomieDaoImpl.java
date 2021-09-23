package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IBloqueoRoomieDao;
import pe.edu.upc.entity.BloqueoRoomie;

public class BloqueoRoomieDaoImpl implements IBloqueoRoomieDao, Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(BloqueoRoomie bloqueoRoomie) {
		em.persist(bloqueoRoomie);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<BloqueoRoomie> listar() {
		List<BloqueoRoomie> lista = new ArrayList<BloqueoRoomie>();
		Query q = em.createQuery("select r from BloqueoRoomie r");
		lista = (List<BloqueoRoomie>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public BloqueoRoomie mostrar(int idBloqueoRoomie) {
		BloqueoRoomie bloqueoRoomie = new BloqueoRoomie();
		bloqueoRoomie = em.getReference(BloqueoRoomie.class, idBloqueoRoomie);
		return bloqueoRoomie;
	}
	
	@Transactional
	@Override
	public void eliminar(int idBloqueoRoomie) {
		BloqueoRoomie bloqueoRoomie = new BloqueoRoomie();
		bloqueoRoomie = em.getReference(BloqueoRoomie.class, idBloqueoRoomie);
		em.remove(bloqueoRoomie);
	}	
}
