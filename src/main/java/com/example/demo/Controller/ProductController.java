package com.example.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.Models.Product;

@Controller
public class ProductController {

	@GetMapping("/Product")
	public String getProduct(Model model)
	{
		Product product=new Product(1,"Icecream",(float )50);
		model.addAttribute("product",product);
		return "product";
		
	}
	
}
