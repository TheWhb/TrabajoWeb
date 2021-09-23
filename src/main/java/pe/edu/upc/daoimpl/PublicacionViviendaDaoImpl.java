package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IPublicacionViviendaDao;
import pe.edu.upc.entity.PublicacionVivienda;

public class PublicacionViviendaDaoImpl implements IPublicacionViviendaDao, Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;
	
	@Transactional
	@Override
	public void insertar(PublicacionVivienda publicacionVivienda) {
		em.persist(publicacionVivienda);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<PublicacionVivienda> listar() {
		List<PublicacionVivienda> lista = new ArrayList<PublicacionVivienda>();
		Query q = em.createQuery("select p from PublicacionVivienda p");
		lista = (List<PublicacionVivienda>) q.getResultList();
		return lista;
	}
	
	@Transactional
	@Override
	public PublicacionVivienda mostrar(int idPublicacionVivienda) {
		PublicacionVivienda publicacionVivienda = new PublicacionVivienda();
		publicacionVivienda = em.getReference(PublicacionVivienda.class, idPublicacionVivienda);
		return publicacionVivienda;
	}
	
	@Transactional
	@Override
	public void actualizar(PublicacionVivienda publicacionVivienda) {
		PublicacionVivienda PviviendaViejo = new PublicacionVivienda();
		PviviendaViejo = em.getReference(PublicacionVivienda.class, publicacionVivienda.getIdPublicacionVivienda());
		em.remove(PviviendaViejo);
		em.persist(publicacionVivienda);
	}
	
	@Transactional
	@Override
	public void eliminar(int idPublicacionVivienda) {
		PublicacionVivienda pvivienda = new PublicacionVivienda();
		pvivienda = em.getReference(PublicacionVivienda.class, idPublicacionVivienda);
		em.remove(pvivienda);
	}	
}
