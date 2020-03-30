package com.boot.bootapp.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.boot.bootapp.models.HomeModel;
@Repository
public interface HomeRepo extends CrudRepository<HomeModel,Long> {

}
