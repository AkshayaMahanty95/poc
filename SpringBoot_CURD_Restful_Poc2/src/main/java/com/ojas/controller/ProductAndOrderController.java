package com.ojas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ojas.entity.Message;
import com.ojas.entity.Orders;
import com.ojas.entity.Product;
import com.ojas.service.ProductAndOrderService;

@RestController
@RequestMapping("/rest")
public class ProductAndOrderController {
	@Autowired
	private ProductAndOrderService service;

	// ****************************product***************************************
	// add single product
	@PostMapping("/product")
	public Product addProduct(@RequestBody Product product) {
		return service.createProduct(product);
	}

	// geting all product
	@GetMapping("/product/list")
	public List<Product> findAllProduct() {
		return service.getProducts();
	}

	// getting existing product by id
	@GetMapping("/product/{product_id}")
	public Product findProductById(@PathVariable int id) { // @pathVariable or @requestParameter
		return service.getProductById(id);
	}

	// ********************************Order*************************************************

	// add single product
	@PostMapping("/order")
	public Orders addOrder(@RequestBody Orders order) {
		return service.createOrder(order);
	}

	// geting all product
	@GetMapping("/order/list")
	public List<Orders> findAllOrder() {
		return service.getOrders();
	}

	// getting existing product by id
	@GetMapping("/orders/{oid}")
	public Orders findOrderById(@PathVariable int oid) { // @pathVariable or @requestParameter
		return service.getOrderById(oid);
	}
	//place order
	@GetMapping("/order/{id}/{quantity}")
	public Message placeOrder(@PathVariable Integer id,@PathVariable Integer quantity) {
		Message msg = getMsgObj();
		try {
		Orders order = new Orders();
		int code = service.placeOrder(id, quantity, order);
		if(code == 0) {
			msg.setNumber(0);
			msg.setMessage("your Order successfully stored");
		}
		else if(code == 1) {
			msg.setNumber(1);
			msg.setMessage("Your order not stored");
		}
		return msg;
		}catch(Exception e) {
			return msg;
		}
	}
	
	
	//update product
	@GetMapping("/update/{id}/{quantity}")
	public Message updateOrder(@PathVariable Integer id, @PathVariable Integer quantity) {

	//public Message updateOrder(@RequestParam("id") Integer id, @RequestParam("quantity") Integer quantity) {
		Message msg = getMsgObj();
		try {
			int code = service.updateOrder(id, quantity);
			if(code == 0) {
				msg.setNumber(0);
				msg.setMessage("Updates Succesfully");
			}
			else if(code == 1) {
				msg.setNumber(1);
				msg.setMessage("Update Not possible because you enter invalid orderid");
			}
			return msg;
		} catch (Exception e) {
			return msg;
		}
	}

	

	public static Message getMsgObj() {
		return new Message();
	}

	// pagenation
	@GetMapping("/productpage")
	public Iterable<Product> getProductPage() {
		return service.pagenation();
	}
}
