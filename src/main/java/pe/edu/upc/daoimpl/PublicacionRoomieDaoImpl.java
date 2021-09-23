package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IPublicacionRoomieDao;
import pe.edu.upc.entity.PublicacionRoomie;

public class PublicacionRoomieDaoImpl implements IPublicacionRoomieDao, Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(PublicacionRoomie publicacionRoomie) {
		em.persist(publicacionRoomie);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<PublicacionRoomie> listar() {
		List<PublicacionRoomie> lista = new ArrayList<PublicacionRoomie>();
		Query q = em.createQuery("select r from PublicacionRoomie r");
		lista = (List<PublicacionRoomie>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public PublicacionRoomie mostrar(int idPublicacionRoomie) {
		PublicacionRoomie publicacionRoomie = new PublicacionRoomie();
		publicacionRoomie = em.getReference(PublicacionRoomie.class, idPublicacionRoomie);
		return publicacionRoomie;
	}
	
	@Transactional
	@Override
	public void actualizar(PublicacionRoomie publicacionRoomie) {
		PublicacionRoomie ProomieViejo = new PublicacionRoomie();
		ProomieViejo = em.getReference(PublicacionRoomie.class, publicacionRoomie.getIdPublicacionRoomie());
		em.remove(ProomieViejo);
		em.persist(publicacionRoomie);
	}
	
	@Transactional
	@Override
	public void eliminar(int idPublicacionRoomie) {
		PublicacionRoomie proomie = new PublicacionRoomie();
		proomie = em.getReference(PublicacionRoomie.class, idPublicacionRoomie);
		em.remove(proomie);
	}	
}
