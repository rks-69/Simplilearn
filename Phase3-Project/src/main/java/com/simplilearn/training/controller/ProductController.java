package com.simplilearn.training.controller;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.simplilearn.training.model.Product;
import com.simplilearn.training.model.User;
import com.simplilearn.training.service.ProductService;
import com.simplilearn.training.service.UserService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/index")
	public ModelAndView index(Model model) {
		ModelAndView mav=new ModelAndView("index");
		return mav;
	}
	
	@GetMapping("/admin/login")
	public ModelAndView adminLogin(Model model) {
		ModelAndView mav=new ModelAndView("admin-login");
		return mav;
	}
	
	@GetMapping("/register")
	public ModelAndView registerUser(Model model) {
		ModelAndView mav=new ModelAndView("register");
		User user=new User();
		mav.addObject("user", user);
		return mav;
	}
	
	@PostMapping("/saveUser")
	public ModelAndView saveUser(@ModelAttribute("user") User user) {
		ModelAndView mav=new ModelAndView("user-page");
		mav.addObject("product", retrieveAllProducts());
		userService.saveUser(user);
		return mav;
	}
	
	
	@GetMapping(path="/products", produces = "application/json")
	public List<Product> retrieveAllProducts(){
		return productService.getProducts();
	}
	
	@GetMapping(path="/users", produces = "application/json")
	public List<User> retrieveAllUsers(){
		return userService.getUsers();
	}
	
	@GetMapping("/admin/userslist")
	public ModelAndView listUsers(Model model) {
		ModelAndView mav=new ModelAndView("list-user");
		mav.addObject("user", retrieveAllUsers());
		return mav;
	}
	
	@GetMapping("/admin/reports")
	public ModelAndView reports(Model m) {
		ModelAndView mav = new ModelAndView("list-report");
		return mav;
	}
	
	@GetMapping("/admin/list")
	public ModelAndView listProducts(Model model) {
		ModelAndView mav=new ModelAndView("list-product");
		mav.addObject("product", retrieveAllProducts());
		return mav;
	}
	@GetMapping("/admin/addProduct")
	public ModelAndView addProduct(Model model) {
		ModelAndView mav=new ModelAndView("add-product");
		Product product=new Product();
		mav.addObject("product", product);
		return mav;
	}
	
	@PostMapping("/admin/saveProduct")
	public ModelAndView saveProduct(@ModelAttribute("product") Product product) {
		ModelAndView mav=new ModelAndView("redirect:/admin/list");
		productService.saveProduct(product);
		return mav;
	}
	
	@GetMapping("/admin/product/{id}")
	public EntityModel<Product> retrieveProduct(@PathVariable Integer id){
		Product product = productService.getProduct(id);
		EntityModel<Product> resource=EntityModel.of(product);
		WebMvcLinkBuilder linkTo=linkTo(methodOn(this.getClass()).retrieveAllProducts());
		resource.add(linkTo.withRel("all-products"));
		return resource;
	}
	
	@GetMapping("/admin/updateProduct")
	public ModelAndView showUpdate(@RequestParam("productId") Integer id, Model m) {
		Product product=retrieveProduct(id).getContent();
		m.addAttribute("product", product);
		return new ModelAndView("add-product");
	}
	
	@DeleteMapping("/admin/deleteProduct/{id}")
	public ModelAndView deleteProduct(@PathVariable Integer id) {
		ModelAndView mav=new ModelAndView("list-product");
		productService.deleteProduct(id);
		return mav;
	}
	
		
	}
