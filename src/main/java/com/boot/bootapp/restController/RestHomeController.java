package com.boot.bootapp.restController;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.boot.bootapp.models.HomeModel;
import com.boot.bootapp.service.HomeService;

@RestController
public class RestHomeController {
	@Autowired
	private HomeService homeservice;
	@GetMapping("/users")
	public Collection<HomeModel> AllUserInfo() {
		return homeservice.AllUser();
	}
	
	@GetMapping("/a-user/{id}")
	public HomeModel A_User(@PathVariable Long id ) {
		return homeservice.findOne(id);
	}
	
	
}
