package com.boot.bootapp.controller;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import com.boot.bootapp.models.HomeModel;
import com.boot.bootapp.service.HomeService;

@Controller
public class HomeController {

	@GetMapping("/")
	public String index() {
		return "jsp/index";
	}

	@GetMapping("/about")
	public String about() {
		return "jsp/about";
	}

	@Autowired
	private HomeService hs;

	@GetMapping("/user")
	public String User(HttpServletRequest req) {
		req.setAttribute("users", hs.AllUser());
		return "jsp/user";
	}

	@GetMapping("/edit-a-user/{id}")
	public String EditUser(HttpServletRequest req, @PathVariable Long id) {
		req.setAttribute("user", hs.findOne(id));
		return "jsp/edit_user";
	}

	@PostMapping("/update")
	public RedirectView UpdateUser(@ModelAttribute HomeModel hm) {
		hs.Update(hm);
		return new RedirectView("/user");
	}

	@GetMapping("/delete-user/{id}")
	public RedirectView deleteUser(@PathVariable Long id) {
		hs.delete(id);
		return new RedirectView("/user");
	}
	
	@PostMapping("/save-user")
	public RedirectView saveUser(@ModelAttribute HomeModel hm) {
		hs.save(hm);
		return new RedirectView("/user");
	}

}
