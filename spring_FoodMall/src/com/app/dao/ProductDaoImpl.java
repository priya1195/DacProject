package com.app.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Product;

@Repository
public class ProductDaoImpl implements IProductDao {

	@Autowired 
	private SessionFactory factory;

	@Override
	public List<Product> getAllProducts() {
		String jpql = "select p from Product p";
		return factory.getCurrentSession().createQuery(jpql, Product.class).getResultList();
	}

	@Override
	public Product getById(int id) {
		String jpql = "select p from Product p where p.id=:id";
		return factory.getCurrentSession().createQuery(jpql, Product.class).setParameter("id",id).getSingleResult();
	}


}
