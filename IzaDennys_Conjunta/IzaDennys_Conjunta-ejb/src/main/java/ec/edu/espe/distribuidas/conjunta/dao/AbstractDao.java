/*
 * ESPE - DCC - APLICACIONES DISTRIBUIDAS
 * Sistema: ticketsca-ejb
 * 
 * Creado: 22/11/2019 - 2:56:04
 * 
 * Los contenidos de este archivo son propiedad privada y estan protegidos por la licencia BSD.
 * 
 * 
 * Se puede utilizar, reproducir o copiar el contenido de este archivo.
 */
package ec.edu.espe.distribuidas.conjunta.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 *
 * @author Dennys
 */
public abstract class AbstractDao<T> {

    private Class<T> entityClass;

    @PersistenceContext(unitName = "JPU_Ticketsca")
    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    public AbstractDao(Class<T> entityClass) {
        this.entityClass = entityClass;
    }

    public void create(T entity) {
        this.em.persist(entity);
    }

    public void edit(T entity) {
        this.em.merge(entity);
    }

    public void remove(T entity) {
        this.em.remove(this.em.merge(entity));
    }

    public T find(Object id) {
        return this.em.find(this.entityClass, id);
    }

    public List<T> findAll() {
        javax.persistence.criteria.CriteriaQuery cq = this.em.getCriteriaBuilder().createQuery();
        cq.select(cq.from(this.entityClass));
        return this.em.createQuery(cq).getResultList();
    }


    public List<T> finder(String query, Object[] parameters) {
        Query q = this.em.createQuery(query, this.entityClass);

        for (int i = 0; i < parameters.length; i++) {
            q.setParameter(i + 1, parameters[i]);
        }

        return q.getResultList();
    }
}