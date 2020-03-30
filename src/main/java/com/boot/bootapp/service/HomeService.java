package com.boot.bootapp.service;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.boot.bootapp.dao.HomeRepo;
import com.boot.bootapp.models.HomeModel;

@Service
public class HomeService {
	@Autowired
	private HomeRepo homerepo;

	public Collection<HomeModel> AllUser() {

		return (Collection<HomeModel>) homerepo.findAll();
	}

	public HomeModel findOne(Long id) {
		return homerepo.findById(id).get();
	}

	public void Update(HomeModel hm) {
		homerepo.save(hm);
	}

	public void delete(Long id) {
		homerepo.deleteById(id);
	}
	
	public void save(HomeModel hm) {
		homerepo.save(hm);
	}

}
