package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.main.beans.Products;
import com.main.service.ProductService;

@CrossOrigin("*")
@Controller
public class ProductsController {	
	

	  @RequestMapping(method = RequestMethod.POST, value="/products/fetchAll")
	  @ResponseBody
	  public List<Products> getAllStudents() {
		  ProductService service = new ProductService();
		  
		  List<Products> p = service.getAllProducts();
		  
		  return p;
	  }
	}