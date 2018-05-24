package example.org.indoor.dao;

import example.org.indoor.entity.BaseEntity;

import java.util.List;

public interface GenericDAO<T extends BaseEntity<K>, K> {
    K create(T entity);
    T find(K id);
    void update(T entity);
    void delete(K id);
    List<T> readAll();
    Integer execute(String query);
}
