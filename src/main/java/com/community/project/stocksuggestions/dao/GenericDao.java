package com.community.project.stocksuggestions.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class GenericDao<ENTITY, PK> {
  @PersistenceContext
  protected EntityManager
      entityManager; // this or we implement CRUD DAO but we have more control with this
  private Class<ENTITY> clazz;

  protected GenericDao(Class<ENTITY> clazz) {
    this.clazz = clazz;
  }

  public ENTITY findOne(Long id) {
    return entityManager.find(clazz, id);
  }

  public List<ENTITY> findAll() {
    return entityManager.createQuery("from " + clazz.getName()).getResultList();
  }

  public void save(ENTITY entity) {
    entityManager.persist(entity);
  }

  public void update(ENTITY entity) {
    entityManager.merge(entity);
  }

  public void delete(ENTITY entity) {
    entityManager.remove(entity);
  }

  public void deleteById(Long entityId) {
    ENTITY entity = findOne(entityId);
    delete(entity);
  }
}
