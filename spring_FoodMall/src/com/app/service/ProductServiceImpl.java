package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IProductDao;
import com.app.pojos.Product;

@Service
@Transactional
public class ProductServiceImpl implements IProductService {
     //dependency : dao i/f
	@Autowired
	private IProductDao dao;
	
	@Override
	public List<Product> getAllProducts() {
		return dao.getAllProducts();
	}

	@Override
	public Product getById(int id) {
		return dao.getById(id);
	}

}
