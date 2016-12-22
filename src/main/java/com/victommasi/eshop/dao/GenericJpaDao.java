package com.victommasi.eshop.dao;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public abstract class GenericJpaDao<T, Type extends Serializable> implements GenericDao<T, Type> {

	@PersistenceContext
	EntityManager manager;
	
	private Class<T> persistedClass;
	
	
	protected GenericJpaDao() {
		
	}

	protected GenericJpaDao(Class<T> persistedClass) {
		this.persistedClass = persistedClass;
	}
	

	@Override
	public List<T> findAll() {
		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<T> query = builder.createQuery(persistedClass);
		Root<T> t = query.from(persistedClass);
		query.select(t);
		TypedQuery<T> q = manager.createQuery(query);
		return  q.getResultList();
	}

	@Override
	public T findOne(Type id) {
		return this.manager.find(persistedClass, id);
	}

	@Override
	@Transactional
	public void save(T entity) {
		this.manager.persist(entity);
	}

	@Override
	@Transactional
	public void delete(Type id) {
		this.manager.remove(findOne(id));
	}

	@Override
	@Transactional
	public void update(T entity) {
		this.manager.merge(entity);	
	}
}
