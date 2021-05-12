package com.ojas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.ojas.dao.OrderDao;
import com.ojas.dao.ProductDao;
import com.ojas.entity.Orders;
import com.ojas.entity.Product;

@Service
public class ProductAndOrderService {

	@Autowired
	private ProductDao productdao;
	@Autowired
	private OrderDao orderdao;

	// ************************* product *****************************

	// save single product
	public Product createProduct(Product product) {
		return productdao.save(product);
	}

	// get single product object from database
	public Product getProductById(int id) {
		return productdao.findById(id).orElse(null);
	}

	// get all product object from database
	public List<Product> getProducts() {
		return productdao.findAll();
	}

	// ************************* Order *****************************

	// save single Order
	public Orders createOrder(Orders order) {
		return orderdao.save(order);
	}

	// get single order object from database
	public Orders getOrderById(int orderid) {
		return orderdao.findById(orderid).orElse(null);
	}

	// get all Order object from database
	public List<Orders> getOrders() {
		return orderdao.findAll();
	}
	
	// same order
	public int placeOrder(Integer id, Integer quantity,Orders order ) {
	
		int result =1;
		Product product = productdao.findById(id).orElse(new Product());
		if(product == null) {
			return result; 
		}
		order.setQuantity(quantity);
		order.setProduct(product);
		orderdao.save(order);
		return result = 0;
	}
	
	//update order
	
	public int updateOrder(Integer id, Integer quantity) {
		int result = 1;
		Orders order = orderdao.findById(id).orElse(new Orders());
		if(order.getOrderid() == 0) {
			return result;
		}
		
		order.setQuantity(quantity);
		orderdao.save(order); 
		result = 0;
		
		return result;
	}
	
	
	

	// ************************* pagenation *****************************
	// pagenation
	public Iterable<Product> pagenation() {
		return productdao.findAll(PageRequest.of(1, 2));

	}

}
