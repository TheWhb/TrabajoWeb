package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IRoomieDao;
import pe.edu.upc.entity.Roomie;
import pe.edu.upc.entity.Vivienda;

public class RoomieDaoImpl implements IRoomieDao, Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(Roomie roomie) {
		em.persist(roomie);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Roomie> listar() {
		List<Roomie> lista = new ArrayList<Roomie>();
		Query q = em.createQuery("select r from Roomie r");
		lista = (List<Roomie>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public Roomie mostrar(int idRoomie) {
		Roomie roomie = new Roomie();
		roomie = em.getReference(Roomie.class, idRoomie);
		return roomie;
	}
	
	@Transactional
	@Override
	public void actualizar(Roomie roomie) {
		Roomie roomieViejo = new Roomie();
		roomieViejo = em.getReference(Roomie.class, roomie.getIdRoomie());
		em.remove(roomieViejo);
		em.persist(roomie);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Roomie> findByNameRoomie(Roomie r) {
		List<Roomie> lista = new ArrayList<Roomie>();
		Query q = em.createQuery("select r from Roomie r where r.emailR like ?1");
		q.setParameter(1, r.getEmailR());
		lista = (List<Roomie>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public void actualizarVivienda(Roomie roomie, Vivienda idRoomie) {
		Roomie roomieViejo = new Roomie();
		roomieViejo = em.getReference(Roomie.class, roomie.getIdRoomie());
		roomieViejo.setViviendaR(idRoomie);
		em.remove(roomieViejo);
		em.persist(roomie);
	}
}
