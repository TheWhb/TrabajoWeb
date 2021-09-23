package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.ISesionRoomieDao;
import pe.edu.upc.entity.SesionRoomie;

public class SesionRoomieDaoImpl implements ISesionRoomieDao, Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(SesionRoomie sesionRoomie) {
		em.persist(sesionRoomie);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<SesionRoomie> listar() {
		List<SesionRoomie> lista = new ArrayList<SesionRoomie>();
		Query q = em.createQuery("select r from SesionRoomie r");
		lista = (List<SesionRoomie>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public SesionRoomie mostrar(int idSesionRoomie) {
		SesionRoomie roomie = new SesionRoomie();
		roomie = em.getReference(SesionRoomie.class, idSesionRoomie);
		return roomie;
	}
	
	@Transactional
	@Override
	public void actualizar(SesionRoomie sesionRoomie) {
		SesionRoomie sesionrViejo = new SesionRoomie();
		sesionrViejo = em.getReference(SesionRoomie.class, sesionRoomie.getIdSesionRoomie());
		em.remove(sesionrViejo);
		em.persist(sesionRoomie);
	}
}
