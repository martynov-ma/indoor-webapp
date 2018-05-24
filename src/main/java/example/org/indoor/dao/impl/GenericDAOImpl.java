package example.org.indoor.dao.impl;

import example.org.indoor.entity.BaseEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

public class GenericDAOImpl<T extends BaseEntity<K>, K> {

    private Class<T> entityClass;

    @PersistenceContext
    protected EntityManager entityManager;

    public GenericDAOImpl() {
        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        entityClass = (Class) pt.getActualTypeArguments()[0];
    }

    public K create(T entity) {
        entityManager.persist(entity);
        return entity.getId();
    }

    public T find(K id) {
        return entityManager.find(entityClass, id);
    }

    public void update(T entity) {
        entityManager.merge(entity);
    }

    public void delete(K id) {
        entityManager.remove(entityManager.find(entityClass, id));
    }

    public List<T> readAll() {
        return entityManager.createQuery("FROM " + entityClass.getSimpleName()).getResultList();
    }

    public Integer execute(String query) {
        return entityManager.createNativeQuery(query).executeUpdate();
    }
}
